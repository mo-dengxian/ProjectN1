public class Demo002 {
    /*变量作用域
        1、类变量
        2、实例变量
        3、局部变量
     */
    static int allClicks=0;//类变量，需要加关键词
    String str="hello world!";//实例变量，写在类中间
    public void method(){
        int i=0;//局部变量，在方法里面
    }
}
