package com.he.xunhuan;

import java.util.Scanner;

/*
用Scanner类来获取用户的输入
基本语法：
  Scanner s=new Scanner(System.in);
  通过Scanner类的next()与nextLine()方法
  来获取f输入的字符串，在读取之前一般需要使用hasNext()与hasNextLine()
  方法来判断是否还有输入的数据；
  两种接收对象方法的区别
  next():
  1、一定要读取到有效字符后才可以结束输入
  2、对输入有效字符之前遇到的空白，next（）方法会自动将其去掉
  3、只有输入有效字符后才将器后面输入的空白作为分隔符或者结束如
  4、next不能得到带有空格的字符串
  nextLine():
  1、以Enter为结束符，nextLine()方法返回的是输入回车之前所有的字符
  2、可以获得空白
 */
public class Scan {
    public static void main(String[] args) {
        //创建一个扫描器对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("使用next方式接收");

        //判断用户有没有输入字符串
        if(scanner.hasNext()){
            String str=scanner.next();
            System.out.println("输入的内容为："+str);
        }

        //用完属于IO流的类scanner后要关掉
        scanner.close();




    }
}
