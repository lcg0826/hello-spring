package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
	// 스프링애플리케이션을 run 실행하고 밑에 tomcat이란 웹서버를 내장하고있어 자체실행 위 클래스를
	// 세팅에서 gradle통해서 하면 느릴수도 잇는데  intellij로 하면 gradle 을 거치지 않아서 java를 바로 실행 그래서 더 빠름
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
