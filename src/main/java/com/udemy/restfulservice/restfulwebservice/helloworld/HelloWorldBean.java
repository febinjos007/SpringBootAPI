package com.udemy.restfulservice.restfulwebservice.helloworld;

public class HelloWorldBean {

    private String hello_world;

    public HelloWorldBean(String hello_world) {
        this.hello_world = hello_world;
    }

    public String getHello_world() {
        return hello_world;
    }

    public void setHello_world(String hello_world) {
        this.hello_world = hello_world;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "hello_world='" + hello_world + '\'' +
                '}';
    }
}
