import java.util.*;
public class PrimeOrder{
	public static void prime(int arr[],int n){
		ArrayList<Integer>p=new ArrayList<>();
		ArrayList<Integer>np=new ArrayList<>();
		int arr1[]=new int[n];

		for(int i=0;i<n;i++){
			int j,m=0,flag=0;
			m=n/2;
			if(arr[i]==0||arr[i]==1){
				np.add(arr[i]);
			}
			else{
				for(j=2;j<=m;j++){
					if(arr[i]%j==0){
						np.add(arr[i]);
						//flag=1;
						break;
					}
					else if(arr[i]%j==1){
						p.add(arr[i]);
						break;
					}
				}

			}
			/*if(flag==0){
				p.add(arr[i]);
			}*/

		}
		System.out.print(p);
		System.out.print(np);
		/*p.toArray(arr1);
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]);
		}*/
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		prime(arr,n);
	}
}