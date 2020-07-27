package com.daonguyen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Beans.xml");
        Project project = (Project) context.getBean("project");
        project.codingProject();
    }
}
