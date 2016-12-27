package com.zou.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Created by Administrator on 2016/12/27.
 */
@Configuration//Spring来加载该类配置  @Profile("swagger")
@EnableSwagger2//启用Swagger2
public class Swagger2 {
    private final Logger log = LoggerFactory.getLogger(Swagger2.class);
    @Bean
    public Docket createRestApi(){//通过createRestApi函数创建Docket的Bean
        log.info("Starting Swagger");
        StopWatch watch = new StopWatch();
        watch.start();
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("Spring_Boot_Zou_GitHib")
                .description("测试GitHib")
                .termsOfServiceUrl("www.baidu.com")
                .contact("ZouDaYi")
                .version("1.0")
                .build();
        watch.stop();
        log.info("Started Swagger in {} ms", watch.getTotalTimeMillis());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zou.web"))
                .paths(PathSelectors.any())
                .build();
    }


}
