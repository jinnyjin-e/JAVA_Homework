class HW51A{
	public static void main(String [] args){
		int c=0,d=0,l;
		char mo;
		
		if(args.length!=1){
			System.out.printf("[입려오류]");
			return;
		}
	
		l=args[0].length();
		for(int i =l-1;i>=0;i--){
			mo = args[0].charAt(i);
			if(mo=='a'||mo=='e'||mo=='i'||mo=='o'||mo=='u'||mo=='A'||mo=='E'||mo=='I'||mo=='O'||mo=='U') c+=1;
			if(mo>=65||mo<=90||mo>=97||mo<=122) d+=1;
		}
		
		System.out.println("자음갯수: +"+c);
		System.out.println(d-c);
	
	}
}