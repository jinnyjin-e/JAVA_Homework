class HW52A{
	public static void main(String [] args){
		
		int l=args.length, c=0;
		
		if(args.length==0){
			System.out.printf("[사용법]");
			return;
		}
		
		for(int i=0;i<l;i++){
			int a = Integer.parseInt(args[i]);
			if(a%2==0) System.out.print(a+" ");
		}
		System.out.println();
		//문제B
		String tmp;
		for(int i=0;i<l-1;i++){
			for(int j=i+1;j<l;j++){
				if(Integer.parseInt(args[i])>Integer.parseInt(args[j])){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
			}
			
		}
		for(int i=0;i<l;i++) System.out.print(Integer.parseInt(args[i])+" ");
		
	}
}