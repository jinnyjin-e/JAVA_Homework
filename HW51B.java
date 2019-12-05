class HW51B{
	public static void main(String [] args){
		Scanner ms = new Scanner(System.in);
		int l;
		
		if(args.length!=1){
			System.out.printf("[입려오류]");
			return;
		}
	
		l=args[0].length();
		for(int i =l-1;i>=0;i--) System.out.print(args[0].charAt(i));
		
	
	}
}