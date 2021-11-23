import java.util.*;
public class Rep_Digit{
	static void rep(int n1,int n2)
	{	
		int count=0;
		for(int i=n1;i<=n2;i++){
			HashSet<Integer> set = new HashSet<Integer>();
			int p=i;
			boolean flag = false;
			
			while(p>0){
    				int currDigit = p % 10;
    				
    				if(set.contains(currDigit)){
    				    flag = true;
    				    break;
    			    }
    			    set.add(currDigit);
				p=p/10;
			}
			if(!flag) count++;
			
			
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		rep(n1,n2);
	}
}