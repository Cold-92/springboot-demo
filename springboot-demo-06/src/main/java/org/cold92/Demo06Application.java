package org.cold92;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cold92.dao")
public class Demo06Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo06Application.class, args);
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("")
//		UserService service = new UserServiceImpl();
//		User user = new User();
//		user.setName("john");
//		user.setAge(12);
//		service.insertUser(user);
	}

}
