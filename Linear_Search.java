import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        //input 
        System.out.println(Arrays.toString(arr1));
        int Search_Element=sc.nextInt();
        System.out.println(m1(arr1, Search_Element));
        sc.close();
    }
    public static int m1(int[] arr1,int Search_Element){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==Search_Element){
                System.out.println("Element found at index :"+i);
                break;
            }
        }
        return -1;
    }
}
