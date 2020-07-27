package com.daonguyen;

public class Project {
    private Developer developer;

    //inject dependency by method parameter
    public void setDeveloper(Developer developer) {
        System.out.println("Set developer for project");
        this.developer = developer;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void codingProject() {
        developer.codingProject();
    }
}
