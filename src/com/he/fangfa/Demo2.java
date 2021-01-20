package com.he.fangfa;

/**
 * 方法的重载
 * 同c++
 * 命令行传参
 *可变参数
 * 支持传递同类型的可变参数给一个方法
 * 在方法的声明中，在指定参数类型后加一个省略号（相当于一个可变大小数组）
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {  //注意此处main函数有参数
        Demo2 demo2=new Demo2();
        demo2.test(1,2,4,6,8,7);
    }
    //可变参数
    public static void test(int... i){
        int j;
        for(j=0;j<i.length;j++)
        {
            System.out.println(i[j]);
        }
    }

}
