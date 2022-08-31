package test.demo;

/**
 * 打印三角形
 */
public class PrintTriangle {
    public static void main(String args[]){
        int Line = 6;
        for (int x = 0; x<Line; x++){
            for (int y = 0; y<Line-x; y++){
                System.out.print(" ");
            }
            for (int y =0; y<=x ; y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
