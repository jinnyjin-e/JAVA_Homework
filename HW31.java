import java.util.Scanner;

class HW31{
	public static void main(String [] args){
		Scanner ms= new Scanner(System.in);
		double a,b,sol=0;
		String yun;
		
		System.out.printf("���� �Է��ϼ���: ");
		a = ms.nextDouble();
		yun = ms.next();
		b = ms.nextDouble();
		
		switch(yun){
			case "+":
			sol = a+b;
			break;
			
			case "-":
			sol = a-b;
			break;
			
			case "*":
			sol = a*b;
			break;
			
			case "/":
			if(b==0){
				System.out.printf("0���� ������ ����");
				return;
				
			}
			sol =a/b;
			break;
			
			case "%":
			if(b==0){
				System.out.printf("0���� ������ ����");
				return;
			}
			sol = a%b;
		}
		
		if(sol==(int)sol) System.out.print((int)sol);
		else System.out.printf("%.2f",sol);
		
	}
	
}