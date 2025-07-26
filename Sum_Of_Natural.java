import java.util.*;
public class Sum_Of_Natural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        //sum of natural numbers
        sum=n*(n+1)/2;
        System.out.println(sum);
        sc.close();

    }
}
