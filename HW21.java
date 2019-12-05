import java.util.Scanner;

class HW21{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		int n;
		int a,b;
		String s;
		
		System.out.printf("1억 미만의 정수: ");
		n = ms.nextInt();
		
		a=n/10000;
		b=n%10000;
		s=(a==0?"":(a==1?"만 ":a+"만 "));
		System.out.print(s);
		
		a=b/1000;
		b=b%1000;
		s=(a==0?"":(a==1?"천 ":a+"천 "));
		System.out.print(s);
		
		a=b/100;
		b=b%100;
		s=(a==0?"":(a==1?"백 ":a+"백 "));
		System.out.print(s);
		
		a=b/10;
		b=b%10;
		s=(a==0?"":(a==1?"십 ":a+"십 "));
		System.out.print(s);
		
		s=(b==0?"":b+"");
		System.out.print(s);
		
		
		
	}
}