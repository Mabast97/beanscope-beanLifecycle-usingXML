package com.luv2code.TestAgainMaven;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLyfeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println("Before context.close()");
        context.close();
        System.out.println("After context.close()");
    }
}
