//import java.util.Scanner;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
////    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        // 注意 hasNext 和 hasNextLine 的区别
////        String s = in.nextLine();
////        int cn=0;
////        for (int i = 0; i < s.length(); i++) {
////            char c = s.charAt(i);
////            if( c>='A' && c<='Z'){
////                cn++;
////            }
////        }
////        System.out.println(cn);
////    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        TreeSet<Book> set=new TreeSet<>( (a,b) ->a.price-b.price);
//        for (int i = 0; i < n; i++) {
//            String next = in.next();
//            int num = in.nextInt();
//            set.add( new Book(next,num));
//        }
//        for(Book book:set){
//            System.out.println(book.name);
//        }
//    }
//}
//
//class Book {
//    String name;
//    int price;
//
//    public Book() {
//    }
//
//    public Book(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//}