package com.jlcindia.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApplication {
public static void main(String[] args) {
System.out.println("Starting Boot Application");
System.out.println("Updated 1 By SufyanKhan Today");
  System.out.println("Updated 2 By SufyanKhan Today");
  System.out.println("Updated 3 for CI pipeline");
  SpringApplication.run(MyBootApplication.class, args);
}
}
