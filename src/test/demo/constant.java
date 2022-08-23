package test.demo;
import java.awt.desktop.SystemSleepEvent;

/**
 * 常量的类型
 * 常见的常量：
 *      字符常量
 *      整型常量
 *      小数点常量
 *      null常量
 *
 */
public class constant {
    public static void main(String[] args){
        // 字符串常量
        System.out.println("hello");
        // 整型常量
        System.out.println(88);
        System.out.println(-88);
        // 小数型常量
        System.out.println(77.33);
        // 布尔常量
        System.out.println(true);
//         null常量【null 不支持输出】
//        System.out.println(null);
        int b = 10;
        System.out.println(b);
        // 整数型类型转换
        double a = 100;
        System.out.println(a);
        // 强制类型数据转换 [不建议，会有数据精度丢失]
        int k = (int)88.88;
        System.out.println(k);
        System.out.println(a +k);
        System.out.println(a%k);
        // 整是相除，得到的是整数，要想得到小数，必须有浮点数参入
        System.out.println(a/k);
        int i= 10;
        char c = 'A'; // 'A' 的值是65；'a' 的值是97
        System.out.println(i+c);
        //  byte 类型、short 类型 和char 类型会被提升到int类型;
        // byte,short,char -> int -> long -> float -> double
        int f = i+c;
        System.out.println(f);
        // 字符串拼接操作
        System.out.println("hello"+"666");
//        System.out.print("*********\n");
//        System.out.print(66+"hello");
        /*
        赋值运算符
         */
        int l = 10;
        l+=20;
        System.out.println("l:"+l);
        // 注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        s+=10;
//        s = s + 10; // 此方法不行，
        System.out.println(s);


    }
}
