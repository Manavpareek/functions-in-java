package functions;

import java.util.Scanner;

public class factorial {
    public static void calculatefactorial(int n) {
        int factorial=1;
        if(n<0){
            
            System.out.println("invalid number");
            return;
        }
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        
        System.out.println(factorial);
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculatefactorial(n);
        
    }
}
