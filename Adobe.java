import java.util.*;
public class Adobe{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<n-1;i++){
			if(arr[i]==arr[i+1]){
				list.add(arr[i]);
			}
			else{
				continue;
			}
		}
		System.out.print(list);
	}
}