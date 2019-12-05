import java.util.Scanner;

class HW61{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		String A, B;
		StringManipulate ABC = new StringManipulate();
		
		
		System.out.print("���� 1: ");
		A = ms.nextLine();
		System.out.print("���� 2: ");
		B = ms.nextLine();
		
		
		System.out.println("����: "+ABC.concat(A,B));
		System.out.println("�빮��: "+ABC.toUpper(A));
		System.out.println("�빮��: "+ABC.toUpper(B));
		System.out.println("������?: "+ABC.equals(A,B));
	}
}

class StringManipulate{
	
	
	String concat(String s1, String s2){
		return s1+s2;
	}
	
	String toUpper(String s){
		
		String st="";
		
		for(int i = 0; i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				st += (char)(s.charAt(i)-('a'-'A'));
			else st += (char)s.charAt(i);
		}
			
		return st;
	}
	
	
	boolean equals(String s1, String s2){
		
		if(s1.length()!=s2.length()) return false;
		
		for(int i = 0; i< s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)) return false;
			
		}
		return true;
	}
	
}