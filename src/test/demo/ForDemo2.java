package test.demo;

/***
 * 99乘法表
 */
public class ForDemo2 {
    public static void main(String args[]){
        for (int x =1; x<10;x++){
            for (int y=1; y<10;y++){
                if (x<=y) {
                    System.out.print(x + "*" + y + "=" + x * y + "  "); //不换行
                }
            }
            System.out.println();
        }
    }
}
