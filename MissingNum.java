import java.util.*;
public class MissingNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,sum1=0;
		int m=n-1;
		while(n>0){
			sum1+=n;
			n--;
		}
		int arr[]=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++){
			sum+=arr[i];

		}
		System.out.print(sum1-sum);
	}
}
