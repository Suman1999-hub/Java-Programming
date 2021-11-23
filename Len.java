import java.util.*;
public class Len
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    if(n%2==1){
	        for(int i=0;i<n;i++){
	            System.out.print(arr[i]);
	        }
	    }
	}
}
