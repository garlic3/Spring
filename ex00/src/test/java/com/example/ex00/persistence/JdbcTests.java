package com.example.ex00.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class JdbcTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testConnection() {
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@bluedot_high?TNS_ADMIN=/Users/minmin/springFramework_sms/resource/Wallet_bluedot", 
				"admin", "gaon1201gaon1201D"))
				{log.info(connection);
		}catch(Exception e) {
			// JUnit의 메소드로서, 무조건 실패로 처리한 뒤 실행을 중지
			fail(e.getMessage());
		}
	}

}
