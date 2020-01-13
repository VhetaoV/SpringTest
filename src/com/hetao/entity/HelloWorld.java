package com.hetao.entity;

/**
 * @description:
 * @author: hetao
 * @create: 2020-01-13 17:12
 **/
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void sqyHello(){
        System.out.println("setName开始");
        System.out.println("hello "+ name);
        System.out.println("setName结束");
    }
}
