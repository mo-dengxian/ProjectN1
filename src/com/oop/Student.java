package com.oop;

public class Student {
    String name;
    int age;

    //构造函数
    //不带参数构造函数
    //有快捷键：alt+insert
    //格式：this.变量名=形参
    //创建对象内存分析：

    public Student(){
        name="小明";
        age=15;
    }
    public Student(String name,int age){
        name=name;
        age=age;
    }
    public void study(){
        System.out.println(this.name+"在学习");
    }
}
