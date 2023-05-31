package helloworld;
import java.nio.channels.ScatteringByteChannel;
import java.util.Calendar;
import java.util.Scanner;

public class ent {
//	public static void main(String[] args)
//	{
//	 System.out.println("더할 숫자를 입력하세요 : ");
//		Scanner scanner = new Scanner(System.in);
//		String inputValue = scanner.nextLine();
//	String[] splitedValue = inputValue.split(",");
//	int first = Integer.parseInt(splitedValue[0]);
//	int second = Integer.parseInt(splitedValue[1]);
//	System.out.println(first+second);
//	}
//	public static void main(String[] args)
//	{
//		System.out.println("더할 숫자 두개를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//        int a, b;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        System.out.printf("%d, %d 두 수의 합은 %d 입니다", a , b, a+b);
//        sc.close();
//	}
//}
	//내가 만든 답
//public static void main(String[] args)
//{
//	Scanner sc = new Scanner(System.in);
//	Calendar cal = Calendar.getInstance();
//	System.out.println("년도를 입력하세요");
//	int a = sc.nextInt();
//	System.out.println("달을 입력하세요");
//	int b = sc.nextInt();
//	cal.set(a, b-1, 1);
//	int c = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//	System.out.printf("%d년 %d월의 마지막 날은 %d일이다", a, b, c);
//	sc.close();
//}
//}
//실제 답
//public static void main(String[] args)
//{
//	Scanner sc=new Scanner(System.in);
//	System.out.println("달을 입력하세요");
//	int month = sc.nextInt();
//	int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxdays[month-1]);
//    sc.close();
//}
//}
//	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//	
//	public int getmaxDaysOfMonth(int month)
//	{
//		return MAX_DAYS[month - 1];
//	}
//	
//public static void main(String[] args)
//{
//	Scanner sc = new Scanner(System.in);
//     Calendar cal = new Calendar();
//    		System.out.println("달을 입력하세요");
//    int month = sc.nextInt();
//    System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
//    sc.close();
//    }
//}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String PROMPT="cal> ";
		boolean booTrue = true;
		Calendar cal = Calendar.getInstance();
			System.out.println("년도를 입력하세요");
			System.out.print(PROMPT);
		while(!sc.hasNextInt())
		{
			sc.next();
			System.out.println("제대로 된 연도를 입력해주세요\n");
			System.out.print(PROMPT);
		}
		int a = sc.nextInt();
		System.out.println("반복 횟수를 입력하세요");
		System.out.print(PROMPT);
		while(!sc.hasNextInt())
		{
			sc.next();
			System.out.println("제대로 된 숫자를 입력해주세요\n");
			System.out.print(PROMPT);
				}
		int w = sc.nextInt();
		for(int p=0; p<w; p++)
		while(booTrue)
		{
		System.out.println("원하는 달을 입력하세요");
		System.out.print(PROMPT);
		while(!sc.hasNextInt())
		{
			sc.next();
			System.out.println("제대로 된 달을 입력해주세요\n");
			System.out.print(PROMPT);
		}
			int b = sc.nextInt();
		    if(b<13&b>1)
	{
	cal.set(a, b-1, 1);
	int c = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
    {
	System.out.printf("%d년 %d월의 마지막 날은 %d일이다\n", a, b, c);
    }
	break;
	}
		    else if(b == -1)
		    {
		    break;
		    }
		    else
			{
				System.out.println("제대로 된 달을 입력해주세요\n");
				System.out.print(PROMPT);
				continue;
		}
			}
		sc.close();
		System.out.println("End");
}
}