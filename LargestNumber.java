import java.util.*;
public class LargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String large="";
        //ternary operator
        large=(a>b&&a>c)?"A is largest":(b>a&&b>c)?"B is largest":(c>a&&c>b)?"C is Larger":"all are equal";
        System.out.println(large);
        sc.close();
    }
}