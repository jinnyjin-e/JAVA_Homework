import java.util.Scanner;

class HW62{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		stdnt myst = new stdnt();
		
		String name;
		int age;
		double grade;
		
		
		System.out.print("이름 : ");
		name = ms.nextLine();
		
		System.out.print("나이 : ");
		age = ms.nextInt();
		
		System.out.print("학점 : ");
		grade = ms.nextDouble();
		
		myst.setname(name);
		myst.setage(age);
		myst.setgrade(grade);
		
		System.out.println("학점을 4.3으로 변경합니다.");
		myst.setgrade(4.3);
		
		System.out.println(myst.toStirng());
			
		
	}
}

class stdnt{
	private String name;
	private int age;
	private double grade;
	
	String getname(){
		return name;
	}
	
	int getage(){
		return age;
	}
	
	double getgrade(){
		return grade;
	}
	
	String setname(String nm){
		name = nm;
		return name;
	}
	int setage(int age){
		if(age>=0 && age <=200) this.age = age;
		else  this.age = 0;
		
		return age;
	}
	double setgrade(double grade){
		if(grade>=0 && grade<=4.3) this.grade = grade;
		else grade = 0;
		return grade;
	}
	
	stdnt(String name, int age, double grade){
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	stdnt(){
		this("홍길동",20,3.0);
	}
	
	String toStirng(){
		return String.format("학생정보\n이름: %s, 나이: %d, 학점: %.1f\n",name,age,grade);
	}
	
}

