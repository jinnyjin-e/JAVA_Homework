import java.util.Scanner;

class HW22{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int n,n2,a,b;
		String c="양수";
		
		System.out.print("정수: ");
		n = ms.nextInt();
		a=n>>31;
		n2=n;
		if((a&1)==1){
			n2=n*(-1);
			c="음수";
		}
		b=n2>>2;
		System.out.printf("%d는 %s입니다. 이수의 절댓값은 %d입니다.\n",n,c,n2);
		System.out.printf("\t절댓값을 4로 나눈 몫은%d이고\n",b);
		System.out.printf("\t\t나머지는 %d",n2&3);
		
		
	}
	
}