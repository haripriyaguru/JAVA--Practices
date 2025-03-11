import java.util.*;
public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set<Integer> Array=new LinkedHashSet<>();
        for(int num : arr){
            Array.add(num);
        }
        System.out.println("The unique element are"+Array);
    }
}
