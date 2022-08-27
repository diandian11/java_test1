package test.demo;

public class JavaDemo {
    public static void main(String args[]){
        String x = "hello";
        System.out.println(x+(6+6)); // 数据范围小的自动转化为数据大的类型
//      在使用字符串的时候可以使用转义字符'\'
        System.out.println("hello \t \"");

        // 数字运算符
        int num = 30;
        num +=1;
        num++; // 数字自增、 数字自减
        System.out.println(num);

        // 自增和自减的两种方式
//        int x0 = 10;
//        int y = 20;
//        int result = ++ x0 - y --;
//        System.out.println("计算的结果是："+ result);
//        System.out.println("x = " + x0);
//        System.out.println("y = " +y);
        //为了增加可读性，对上面程序进行改写
        int x0 = 10;
        int y = 20;
        ++x0;
        int result = x0 - y;
        y--;
        System.out.println("计算的结果是："+ result);
        System.out.println("x = " + x0);
        System.out.println("y = " +y);
        //  关系运算符 :三目运算符 ？
        int max = x0 > y ? x0 : y;
        System.out.println("最大值是" + max);
        int z = 90;
        // 三目运算符嵌套使用
        int max0 = x0 > y ? (x0 > z ? x0:z) : (y > z ? y: z);
        System.out.println(max0);

        // git 初始
    }
}

// cheng

