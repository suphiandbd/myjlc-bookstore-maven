package com.jlcindia.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
public static void main(String[] args) {
System.out.println("Starting Boot Application");
  System.out.println("Updating Boot Application 16");
 
  SpringApplication.run(MyBootApplication.class, args);
}
}
