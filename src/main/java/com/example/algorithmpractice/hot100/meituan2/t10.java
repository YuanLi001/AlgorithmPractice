//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int[][] pos=new int[n][2];
//        int max=0;
//        for (int i = 0; i < n; i++) {
//            pos[i][0]=sc.nextInt();
//            pos[i][1]=sc.nextInt();
//        }
//        int i2,j2;
//        for (int i = 1; i <=1000-b; i++) {
//            for (int j = 1; j <=1000-a; j++) {
//                i2=i+a;
//                j2=j+b;
//                int cn=0;
//                for (int k = 0; k < n; k++) {
//                    if( pos[k][0] >=i && pos[k][0]<=i2 && pos[k][1]>=j && pos[k][1]<=j2 ){
//                        cn++;
//                    }
//                }
//                max=Math.max(max,cn);
//            }
//        }
//        System.out.println(max);
//    }
//}