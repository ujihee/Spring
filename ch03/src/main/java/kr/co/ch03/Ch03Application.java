package kr.co.ch03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch03Application {

    public static void main(String[] args) {

        SpringApplication.run(Ch03Application.class, args);

        System.out.println("Hello Spring Boot!");
    }

}

/*
localhost8080실행하면 Whitelabel Error Page가 뜨는데 console창에
[Tomcat].[localhost].[/] : Initializing Spring DispatcherServlet 'dispatcherServlet'
tomcat이 내장되있다는 소리
dispatcherServlet(매우중요)
최초 서블릿을 시도하면 초기화가 됨
 */