import java.util.Scanner;

class HW53{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		String mal, dan;
		int count=0, jul=1, malLnth, danLnth;
		
		System.out.printf("문장: ");
		mal = ms.nextLine();
		System.out.printf("단어: ");
		dan = ms.nextLine();
		
		malLnth = mal.length();
		danLnth = dan.length();
		
		for(int i=0;i<malLnth-danLnth+1;i++){
			if(mal.charAt(i)==' '&&mal.charAt(i+1)!=' ') jul++;
			if(dan.equalsIgnoreCase(mal.substring(i,i+danLnth))){
				count++;
				System.out.printf("%d번째, ",jul);
			}
		}
		if(count!=0) System.out.printf("\b\b 어절에서 \"%s\"가 검색되어, ",dan);
		System.out.printf("총 %d회 검색되었습니다.",count);
		
	}
}