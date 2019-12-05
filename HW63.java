import java.util.Scanner;

class HW63{
	public static void main(String [] args){
		member m1 = new member();
		member m2 = new member();
		member m3 = new member("길동홍",32);
		member m4 = new member();
		System.out.printf("이 동호회의 멤버 수는 %d명 입니다.",member.cnt);
		
	}
}
class member{
	String name;
	int age;
	static int cnt=0;
	
	member(String name, int age){
		this.name = name;
		this.age = age;
		cnt++;
		System.out.printf("이름과 나이가 존재하는 동호회 멤버 생성\n");
	}
	member(){
		
		System.out.printf("디폴트 생성자 통해 동호회 멤버 생성\n");
		cnt++;
	}
}