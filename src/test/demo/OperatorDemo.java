package test.demo;
/*
自增自减运算符
 */
public class OperatorDemo {
    public static void main(String[] args){
        // 定义变量
        int i = 10;
        System.out.println("i:"+i);
        // 单独使用
//        i++;
//        System.out.println("i:"+i);
        // 参入操作使用
//        int j = i++; // 先将i 赋值给了 j; 然后 i 再自增 加加
        int j = ++i; //  i 先自增 加加 ；再将自增后i 赋值给了 j
        System.out.println("**********");
        System.out.println(j);
        System.out.println(i);
        /*
        关系运算符
         */
        System.out.println("*****关系运算符*****");
        // 定义变量
        int a = 10;
        int b = 20;
        int c = 30;
        // ==
        System.out.println(a==b);
        System.out.println(a<=b);
        System.out.println(c!=b);
        System.out.println(c=b); // 把b的值赋值给c ，输出c

        /*
        逻辑运算符
         */
        int i0 = 10;
        int j0 = 20;
        int k0 = 30;
        // 逻辑&运算符
        System.out.println((i0>j0) & (j0<30));
        System.out.println((i0<j0) & (j0<30));
        // 逻辑^运算符 [只有两者不同则为True，相同则相反]
        System.out.println((i0>j0) ^ (j0<30));
        System.out.println((i0<j0) ^ (j0<30));

        System.out.println("——————————————————————");

        /*
        短路运算符
         */

    }
}
