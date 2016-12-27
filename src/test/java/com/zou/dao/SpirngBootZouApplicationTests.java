package com.zou.dao;

import com.zou.bean.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpirngBootZouApplicationTests {

	@Autowired
	private TestBean testBean;
	@Test
	public void sendSimpleMail() throws Exception {
//

		System.out.println(testBean.getTempInt()+testBean.getTempLong()+testBean.getTempStrng());
	}

}
