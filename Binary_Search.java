import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr1=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        //input 
        System.out.println(Arrays.toString(arr1));
        int target=sc.nextInt();
        int res=m1(arr1, target);
        System.out.println(res);
        sc.close();
    }
    public static int m1(int[] arr1,int target){
        int low=0,mid,high=arr1.length;
        while(low<=high){
            mid=(low+high)/2;
            if(arr1[mid]==target){
                return mid;
            }else if(arr1[mid]<target){
                low=mid+1;
            }else if(arr1[mid]>target){
                high=mid-1;
            }
        }
        return -1;

    }   
}
