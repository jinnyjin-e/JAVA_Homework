import java.util.Scanner;

class HW63{
	public static void main(String [] args){
		member m1 = new member();
		member m2 = new member();
		member m3 = new member("�浿ȫ",32);
		member m4 = new member();
		System.out.printf("�� ��ȣȸ�� ��� ���� %d�� �Դϴ�.",member.cnt);
		
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
		System.out.printf("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����\n");
	}
	member(){
		
		System.out.printf("����Ʈ ������ ���� ��ȣȸ ��� ����\n");
		cnt++;
	}
}