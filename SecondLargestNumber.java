import java.util.*;
public class SecondlargestNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int firstlargest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>firstlargest){
            firstlargest=secondlargest;
            firstlargest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=firstlargest){
            secondlargest=arr[i];
        }
    }
    System.out.println(secondlargest);
    
}
}
