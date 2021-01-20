package com.oop;
//主函数
//一个项目应该只存一个main方法
public class Application {
    public static void main(String[] args) {
        Student xiaoming=new Student();
        xiaoming.name="小明";
        xiaoming .age=14;
        System.out.println(xiaoming.name+xiaoming.age);
    }
}
