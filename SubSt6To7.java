package Array;
import java.util.*;
public class SubSt6To7 {
    static int Sub67(int arr[],int n){      // 1 2 5 6 8 7 9 ind6= 3
        int sum=0;                          // 0 1 2 3 4 5 6
        int ind6=0,ind7=0;
        for(int i=0;i<n;i++){
            if(arr[i]==6){
                ind6=i;
                break;
            }
        }                                       //1 2 6 4 6 7 7  ind6=2 ind7=6
        for(int i=0;i<n;i++){                  // 0 1 2 3 4 5 6
            if(arr[i]==7){
                ind7=i;
            }
        }
        //System.out.println(ind6);
        //System.out.println(ind7);

            if(ind7<ind6){
                for(int i=0;i<n;i++) {
                    sum += arr[i];
                }
            }
            if(ind6<ind7){
                for(int j=0;j<ind6;j++){
                    sum+=arr[j];
                }
                for(int j=ind7+1;j<n;j++){
                    sum+=arr[j];
                }
            }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Sub67(arr,n));
    }
}
