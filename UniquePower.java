import java.util.*;
public class UniquePower{
	public static int power(int n){
		int pow=1,ans=0;
		while(n>=0){
			
			if((n & 1)==0){
				ans+=pow;
				pow=pow*5;
			}
			n>>=1;
		}
		return ans;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(power(n));
		
	}
}