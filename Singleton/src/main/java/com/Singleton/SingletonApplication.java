package com.Singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		//EagerSingleton Example
//		EagerSingleton obj1 = EagerSingleton.getInstance();
//		System.out.println(obj1.hashCode());
//		EagerSingleton obj2= EagerSingleton.getInstance();
//		System.out.println(obj2.hashCode());

//		LazySingleton obj1 = LazySingleton.getInstance();
// 		System.out.println(obj1.hashCode());
//    	LazySingleton obj2= LazySingleton.getInstance();
//		System.out.println(obj2.hashCode());

		DoubleCheckingLazyLoading obj1 = DoubleCheckingLazyLoading.getInstance();
		System.out.println(obj1.hashCode());
		DoubleCheckingLazyLoading obj2 = DoubleCheckingLazyLoading.getInstance();
		System.out.println(obj2.hashCode());
	}
}
