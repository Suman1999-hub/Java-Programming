import java.util.*;
public class PerfectCube{
	static void perfect(int n,int sum){
		int d=(int)Math.cbrt(n);
		int sum1=0;
		if(d*d*d==n && d*d*d==sum){

			System.out.print("YES");	
		}
		else{
			sum1=sum-(d*d*d);
			System.out.print(sum1);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		perfect(n,sum);

	}
} 