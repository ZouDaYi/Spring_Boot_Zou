package com.zou.bean.mogo;

import org.springframework.data.annotation.Id;

/**
 * Created by Administrator on 2016/12/28.
 */
public class MongoDB {

    @Id
    private Long id;
    private String username;
    private Integer age;
    public MongoDB(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
