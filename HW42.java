import java.util.Scanner;

class HW42{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,b=0,c=0;
		double aver;
		while(true){
			System.out.printf("정수: ");
			a = ms.nextInt();
			
			if(a==1111) break;
			if(a%2==1){
				if(a%7!=0){
				b+=a;
				c+=1;
				}
			}
			
		}
		if(c==0)System.out.printf("조건을 만족하는 홀수가 없음..");
		else{
			aver = (double)b/c;
			System.out.printf("조건을 만족하는 %d 홀수의 평균은 %.2f",c,aver);
		}
	}
}