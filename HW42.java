import java.util.Scanner;

class HW42{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int a,b=0,c=0;
		double aver;
		while(true){
			System.out.printf("����: ");
			a = ms.nextInt();
			
			if(a==1111) break;
			if(a%2==1){
				if(a%7!=0){
				b+=a;
				c+=1;
				}
			}
			
		}
		if(c==0)System.out.printf("������ �����ϴ� Ȧ���� ����..");
		else{
			aver = (double)b/c;
			System.out.printf("������ �����ϴ� %d Ȧ���� ����� %.2f",c,aver);
		}
	}
}