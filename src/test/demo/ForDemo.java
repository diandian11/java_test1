package test.demo;

public class ForDemo {
//    public static void main(String args[]) {
//        for (int x = 0;x<10;x++){
//            if (x==3){
//                System.out.println("退出循环");
//                break;
//            }
//            else{
//                System.out.println(x);
//            }
//        }
//        System.out.println("循环运行结束");
//    }
    public static void main(String args[]){
        for (int x = 0;x<10;x++){
            if (x==3){
                System.out.println("退出循环");
                continue;
            }
            else{
                System.out.println(x);
            }
        }
    }
}
