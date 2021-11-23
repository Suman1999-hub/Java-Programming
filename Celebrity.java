import java.io.*;
import java.util.*;

public class Celebrity {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer>list=new Stack<Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            list.push(i);
        }
        while(list.size()>=2){
            int i=list.pop();
            int j=list.pop();
            if(arr[i][j]==1){
                //if i knows j-->i is not a Celebrity
                list.push(j);
            }
            else{
                //if i dont knows j-->j is not a Celebrity
                list.push(i);
            }
        }
        int pot=list.pop();
        for(int i=0;i<n;i++){
            if(i!=pot){
                if(arr[i][pot]==0 || arr[pot][i]==1){
                    System.out.print("none");
                    return;
                }
            }
        }
        System.out.print(pot);

    }

}