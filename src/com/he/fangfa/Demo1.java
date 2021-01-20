package com.he.fangfa;

public class Demo1 {
    //main方法
    //方法设计原则
    //一个方法只完成一个功能
    public static void main(String[] args) {
    int sum=add(1,2);
    System.out.println(sum);
    }
    //加法方法
    public static int add(int a,int b){
        return a+b;
    }

}
