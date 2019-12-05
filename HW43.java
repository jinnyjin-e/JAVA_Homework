import java.util.Scanner;

class HW43{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int line;
		
		System.out.printf("¶óÀÎ ¼ö");
		line = ms.nextInt();
		
		for(int i=1;i<=line;i++){
			for(int j=1;j<=line-i;j++) System.out.printf(" ");
			for(int j=i-1;j>=0;j--) System.out.print(j);
			for(int j=1;j<=i-1;j++) System.out.print(j);
		System.out.println();
		}
		
		
	}
}