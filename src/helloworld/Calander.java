package helloworld;

import java.util.Calendar;
import java.util.Scanner;

public class Calander {
	public static void main(String[] args)
	{
		{
			int f = 000000; //날짜 저쟝용 defalt변수
			int m = 1000000; //날짜 확인용 defalt변수
			String g = "defalt"; //일정변수
			int fin = 0; //종료프로그램용 함수
			Scanner sc = new Scanner(System.in); //스캐너 준비
			String PROMPT="cal> "; //프롬프트 설정
			boolean aoo = true; //메인화면 복귀용 반복문 준비
			while(aoo) //메인화면 복귀용 반복문
			{
			System.out.println("+----------------------+");
			System.out.println("| 1. 일정 등록");
			System.out.println("| 2. 일정 검색 ");
			System.out.println("| 3. 달력 보기");
			System.out.println("| 4. 도움말");
			System.out.println("| 5. 종료");
			System.out.println("+----------------------+"); //메인화면
			System.out.print(PROMPT); //프롬프트 문구 출력
			while(!sc.hasNextInt()) //정수 아닐시 반복하게 함
			{
				sc.next(); //입력값 설정x
				System.out.println("제대로 된 숫자를 입력해주세요\n"); //정수 입력해달라고 말하기
				System.out.print(PROMPT); //프롬프트 문구 출력
					}
			int t = sc.nextInt(); //스위치 작동값
			if(t>=1&t<=4)
			{
				switch(t) //작동 스위치
				{
				case 1:
				{ 
					boolean boo = true; //반복문 준비
					while(boo) //반복문 준비(continue와 break에 쓰는 용도)
					{
					System.out.println("일정을 등록할 날짜 6자리를 연월일순서로 띄어쓰기없이 입력하세요");
					System.out.print(PROMPT); //프롬프트 문구 출력
					while(!sc.hasNextInt()) //정수 아닐시 반복하게 함
					{
						sc.next(); //입력값 설정 x
						System.out.println("제대로 된 날짜를 입력해주세요\n"); //날짜 입력해달라고 말하기
						System.out.print(PROMPT); //프롬프트 출력
					}
					f = sc.nextInt();
					if(f<=999999&f>=99999)
					{
					System.out.println("일정을 입력하세요"); //일정 입력 요구
					System.out.print(PROMPT); //프롬프트 문구 출력
					sc.nextLine();
					String n = sc.nextLine();
					g = n;
					break;
					}
					else
					{
						System.out.println("제대로 된 날짜를 입력해주세요\n"); //재응답 요구
						System.out.print(PROMPT); //프롬프트 출력
						continue; //반복
					}
										}
					System.out.println("일정이 등록되었습니다");
					break;
													}
				case 2 :
				{ 
					boolean coo = true; //반복문 준비
					while(coo) //반복문 준비(continue와 break에 쓰는 용도)
					{
					System.out.println("일정을 찾아볼 날짜를 말해주세요");
					System.out.print(PROMPT); //프롬프트 출력
					while(!sc.hasNextInt()) //정수 아닐시 반복하게 함
					{
						sc.next(); //입력값 설정 x
						System.out.println("제대로 된 날짜를 입력해주세요\n"); //날짜 입력해달라고 말하기
						System.out.print(PROMPT); //프롬프트 출력
					}
					m = sc.nextInt();
					if(m==f)
					{
						System.out.println(g); //저장된 일정 출력
						break;
					}
					else
					{
						System.out.println("일정이 등록되지 않았거나 제대로된 날짜가 입력되지 않았습니다\n"); //재응답 요구
						System.out.print(PROMPT); //프롬프트 출력
						break; //반복
					}
					}
					break; 
								}
				case 3:
				{ 
					boolean booTrue = true; //반복문 준비
					Calendar cal = Calendar.getInstance(); //달력 준비
				System.out.println("년도를 입력하세요"); //연도 묻기
				System.out.print(PROMPT); //정해진 프롬프트 문구 출력
			while(!sc.hasNextInt()) //정수 아닐시 반복하게 함
			{
				sc.next(); //입력값 설정 x
				System.out.println("제대로 된 연도를 입력해주세요\n"); //정수 입력해달라고 말하기
				System.out.print(PROMPT); //프롬프트 출력
			}
			int a = sc.nextInt(); //정수 받을시 a값 설정
			while(booTrue) //반복문 준비(continue와 break에 쓰는 용도)
			{
			System.out.println("달력을 보기 원하는 달을 입력하세요"); //원하는 달 묻기
			System.out.print(PROMPT); //프롬프트 문구 출력
			while(!sc.hasNextInt()) //정수가 아닐시 반복하게 함
			{
				sc.next(); //입력값 설정x
				System.out.println("제대로 된 달을 입력해주세요\n"); //정수 입력해달라고 말하기
				System.out.print(PROMPT); //프롬프트 문구 출력
			}
				int b = sc.nextInt(); //정수일시 b에 값 저장
			    if(b<13&b>=1) //b값이 1이상, 13미만인 조건하에 발동
		{
		cal.set(a, b-1, 1); //달력의 년, 월, 일을 각각 a, b-1(월은 -1해야 제대로 나옴), 1일에 맞춤
		int c = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //달력의 마지막날을 c라는 값으로 설정
		int d = cal.get(Calendar.DAY_OF_WEEK); //달력의 하루하루를 d라는 값으로 설정
	    {
	  System.out.println("--------" +a+ "년" +b+ "월-------"); //달력 상단부
	  System.out.println(" 일  월  화  수   목  금  토"); //달력 요일부
	  for(int x=1; x<=c; x++) //x값 반복 출력으로 달력구현 준비
	  {
			if(x==1) { 
				for(int j=1; j<d; j++) {
					System.out.print("    ");
				}
			} //x값이 없는 자리(해당월에 날짜가 없는 자리)는 공백 처리함
			if(x<10) { 
				System.out.print(" ");
			}
			System.out.print(" "+x+" "); //x값(그날 날짜)가 한자리수일경우 띄어쓰기를 한칸 추가함
			if(d%7==0) { 
				System.out.println();
			} 
		    d++; //x값(날짜)를 7일 간격으로 끊어서 출력하도록 함
				  }
	  System.out.printf("%n"); //달력 마지막달과 마지막 단이 겹치지 않게 하기 위한 장치 
	  System.out.printf("-----------------------%n"); //달력의 마지막단
	    }
		break; //반복
		}
			    else //b값(달)이 정수면서 1~12까지의 숫자가 아닐경우
				{
					System.out.println("1~12사이의 숫자를 입력해주세요\n"); //재응답 요구
					System.out.print(PROMPT); //프롬프트 출력
					continue; //반복
			}
				}
			continue;
								}
				case 4 :
				{ 
					boolean doo = true; //메인화면 복귀용 반복문 준비
					while(doo) //메인화면 복귀용 반복문
					{
						System.out.println("-----------------------------------");
					System.out.println("1.일정을 등록했는데 나오지 않아요");
					System.out.println("2.일정을 입력했는데 글자가 깨져서 나와요");
					System.out.println("3.메인화면으로 돌아가기");
					System.out.println("-----------------------------------");
					while(!sc.hasNextInt()) //정수 아닐시 반복하게 함
					{
						sc.next(); //입력값 설정x
						System.out.println("제대로 된 숫자를 입력해주세요\n"); //정수 입력해달라고 말하기
						System.out.print(PROMPT); //프롬프트 문구 출력
							}
					int l = sc.nextInt(); //작동값
					if(l==1) //도움말1 출력
					{
						System.out.println("일정을 등록하지 않았거나");
						System.out.println("여러 일정을 등록해서 발생한 문제일수 있습니다");
						System.out.println("본 프로그램은 한번에 하나의 일정만 저장할수 있음을 알려드립니다");
						continue;
					}
					if(l==2) //도움말2 출력
					{
						System.out.println("한글 또는 영어외 다른 언어로 일정을 등록해 발생한 문제일수 있습니다");
						System.out.println("본 프로그램은 영어로만 일정을 저장할수 있음을 알려드립니다");
						continue;
					}
					if(l==3) //메인화면으로 돌아가기
					{
                        break;
					}
					else
					{
						System.out.println("1~3 사이의 세 숫자중 하나를 입력해주세요"); //제대로 된 버튼 입력요구
						continue;
					}
					}
					break;
								}
		}
			}
			if(t==5)
			{
				System.out.println("프로그램을 종료합니다"); //재응답 요구
					break;	
			}
			else
			{
				System.out.println("1~5사이의 숫자를 입력해주세요\n"); //재응답 요구
				System.out.print(PROMPT); //프롬프트 출력
				
				continue; //반복
			}
	}
			sc.close(); //스캐너종료
	}
}
}
