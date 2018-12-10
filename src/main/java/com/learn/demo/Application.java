package com.learn.demo;

import com.learn.demo.Basic.OuterClass;
import com.learn.demo.Basic.StaticDerived;
import com.learn.demo.MultiThread.DeadLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		DeadLock.start();

//		OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
//		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
//
//		nestedClass.printMessage();
//		innerClass.printMessage();

		StaticDerived.run();
	}
}
