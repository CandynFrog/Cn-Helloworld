package helloworld;
import java.util.Scanner;

public class GuGudan {
     public static void main(String[] args) {
    	 
    	 // 2단
//             for(int b=1; b<10;b++)
//    		 System.out.println(2*b);
    	 
    	 // 3단
//            int c=3;
//             for(int d=1; d<10;d++)
//	         System.out.println(c*d);
             
             //4단
//             int result = 4*1;
//             System.out.println(result);
//                          result = 4*2;
//             System.out.println(result);
//                          result = 4*3;
//             System.out.println(result);
//             result = 4*4;
//             System.out.println(result);
//             result = 4*5;
//             System.out.println(result);
//             result = 4*6;
//             System.out.println(result);
//             result = 4*7;
//             System.out.println(result);
//             result = 4*8;
//             System.out.println(result);
//             result = 4*9;
//             System.out.println(result);
             
             //5단
//             System.out.println(5*1);
//             System.out.println(5*2);
//             System.out.println(5*3);
//             System.out.println(5*4);
//             System.out.println(5*5);
//             System.out.println(5*6);
//             System.out.println(5*7);
//             System.out.println(5*8);
//             System.out.println(5*9);
    	 
    	 //6단
//    	 int g=1;
//    	 while (g<10) {
//    	 System.out.println(6*g);
//		 g=g+1;
//    	 }
 	 
    	 //7단
//    	 for(int h=1; h<10; h++) {
//    	 System.out.println(7*h);
//    	 }
    	 
    	 //8단
//    	 for(int i=1; i<10; i++) 
//    		 System.out.println(8*i);
    	 
    	 //9단
// 		int j=1;
//    	 while(j<10) {
//    		System.out.println(9*j);
//    		 j=j+1;
//    	 }
    	 
             System.out.println("구구단 중 출력할 단은? : ");
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
		 for(int e=1; e<10;e++)
		 System.out.println(number*e);
             }
}
