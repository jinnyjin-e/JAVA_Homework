import java.util.Scanner;

class HW41{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,b=0;
		int sum=0;
		
		while(true){
		System.out.printf("1보다 큰 정수 입력");
		a = ms.nextInt();
		if(a<1) System.out.printf("[입력오류]");
		else break;
		}
		
		for(int i=1;i<=a;i++){
			if(i%2==1){
			System.out.printf("%d² - ",i);
			b=i*i;
			}
			if(i%2==0){
			System.out.printf("%d² + ",i);
			b=-i*i;
			}
			
			sum+=b;
		}
		System.out.printf("\b\b ");
		System.out.printf("= %d",sum);
	}
}