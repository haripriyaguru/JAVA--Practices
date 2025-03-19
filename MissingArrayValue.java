import java.util.*;
public class MissingArrayValue{
    public static int missingvalue(int n,int arr[]){
        int m=0;
       for(int i=1;i<=n+1;i++){
           if(i!=arr[m]){
               return i;
           } 
           m++;
       }
       return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();   // 1 2 3 5 6
        int arr[]=new int[n];  
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       //missingvalue(n,arr);
       int result=missingvalue(n,arr);
       System.out.print(result);
       
    }
}
