import java.util.Scanner;

class HW22{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int n,n2,a,b;
		String c="���";
		
		System.out.print("����: ");
		n = ms.nextInt();
		a=n>>31;
		n2=n;
		if((a&1)==1){
			n2=n*(-1);
			c="����";
		}
		b=n2>>2;
		System.out.printf("%d�� %s�Դϴ�. �̼��� ������ %d�Դϴ�.\n",n,c,n2);
		System.out.printf("\t������ 4�� ���� ����%d�̰�\n",b);
		System.out.printf("\t\t�������� %d",n2&3);
		
		
	}
	
}