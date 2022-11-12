package inteliije.autowire;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM_CARDLuhn {
    static int sum(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
           return  sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ATM digit number ");
        int n=sc.nextInt();
        System.out.println("Enter ATM number ");
        int ans=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(i%2==0) x=sum(2* x);
            ans=ans+x;
        }
        System.out.println(ans);
        if(ans%10==0) System.out.println("you card is true");
        else System.out.println("invalid card number ");
    }
}
