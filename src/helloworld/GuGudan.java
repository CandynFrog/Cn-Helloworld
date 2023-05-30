package helloworld;
import java.util.Scanner;

public class GuGudan {
	public static int[] calculate(int times) {
		 int[] result = new int[9];

	        for (int i = 0; i < result.length; i++) {
	        	result[i]=times*(i+1);
	        }

	        return result;
	    }

	    public static void print(int[] result) {
	        for(int i = 0; i < result.length; i++) {
	        	 System.out.println(result[i]);
	        }
	    }
//	   	    public static void main(String[] args) {
//	   	        for (int j = 2; j < 10; j++) {
//	            int[] result = calculate(j);
//	            		print(result);
//	   	    }
//} 	    
}
//     public static void main(String[] args) {
//    	 
    	 // 2단
//             for(int b=1; b<10;b++)
//    		 System.out.println(2*b);
//    	 
    	 // 3단
//            int c=3;
//             for(int d=1; d<10;d++)
//	         System.out.println(c*d);
//             
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
//             
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
//    	 
    	 //6단
//    	 int g=1;
//    	 while (g<10) {
//    	 System.out.println(6*g);
//		 g=g+1;
//    	 }
// 	 
    	 //7단
//    	 for(int h=1; h<10; h++) {
//    	 System.out.println(7*h);
//    	 }
//    	 
    	 //8단
//    	 for(int i=1; i<10; i++) 
//    		 System.out.println(8*i);
//    	 
    	 //9단
// 		int j=1;
//    	 while(j<10) {
//    		System.out.println(9*j);
//    		 j=j+1;
//    	 }
//
//    	 System.out.println("구구단 중 출력할 단은? : ");
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();
//		 for(int e=1; e<10;e++)
//		 System.out.println(number*e);
//    	 
//    	        System.out.println("구구단 중 출력할 단은? : ");
//    	        Scanner scanner = new Scanner(System.in);
//    	        int number = scanner.nextInt();
//    	        System.out.println("number : " + number);
//    	        int z = number;
//    	        int x = 1; 
//    	        if (number < 2) {
//    	           System.out.println("error");
//    	        } else if (number > 9) {
//     	           System.out.println("error");
//    	        } else {
//       	        while(x<10) {
//    	        	System.out.println(x*z);
//    	        	x = x+1;
//    	        }
//    	        }
//    	        
//    		        System.out.println("구구단 중 출력할 단은? : ");
//    		        Scanner scanner = new Scanner(System.in);
//    		        int number = scanner.nextInt();
//    		        System.out.println("number : " + number);
//    		        if (number < 2) {
//    		            System.out.println("error");
//    		        } else if (number > 9) {
//    		            System.out.println("error");
//    		        } else {
//        		        for(int y=1; y<10; y++)
//        		        	System.out.println(number*y);
//    		        }
//    	 
//         int[] result = new int[9];
//         for(int i=0; i < result.length; i++) {
//            	result[i]=2*(i+1);
//         }
//         
//         for(int i=0; i < result.length; i++) {
//             System.out.println(result[i]);
//           }
//          
//       for(int a=2; a<10;a++)
//    	   for(int b=1; b<10;b++)
//		 System.out.println(a*b);
//    	 
//    	 int b=2;
//       			 while(b<10)
//       			 {
//       				 for(int a=1; a<10; a++)
//    				System.out.println(a*b);
//    				b = b+1;
//    			 }
//    	       			 }
//    	             }