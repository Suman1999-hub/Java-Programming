//A product array puzzle
import java.util.*;
public class MultipleArr{
	static void multiply(int arr[],int n){
		int prod=1;
		
		for(int i=0;i<n;i++){
			prod*=arr[i];

		}
		for(int i=0;i<n;i++){
			System.out.print((int)prod* Math.pow(arr[i], -1)+" ");
		}
	}
	/*static void multiply(int arr[],int n){
		int i,temp=1;
		int prod[]=new int[n];
		for(int j=0;j<n;j++){
			prod[j]=1;
		}
		for(i=0;i<n;i++){
			prod[i]=temp;
			temp*=arr[i];
		}
		temp=1;
		for(i=n-1;i>=0;i--){
			prod[i]*=temp;
			temp*=arr[i];
		}
		for(i=0;i<n;i++){
			System.out.print(prod[i]+" ");
		}
	}*/
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		multiply(arr,n);
	}
}



/*
input-n=5
	arr[]={10,3,5,6,2}
output- 180,600,360,300,900

prod[]                         temp 
-------------------------------------
1
*/