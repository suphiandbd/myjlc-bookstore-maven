package com.jlcindia.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
public static void main(String[] args) {
System.out.println("Starting Boot Application");
  System.out.println("Updating Boot Application");
  System.out.println("Updating Boot Application 10");
  System.out.println("Updating Boot Application 11");
   System.out.println("Updating Boot Application 12");
  SpringApplication.run(MyBootApplication.class, args);
}
}
