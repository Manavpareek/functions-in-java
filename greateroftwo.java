package functions;

import java.util.Scanner;

public class greateroftwo {
    public static void compare(int a,int b) {
        if(a>b){
            System.out.println("a is graeater");
        }else{
            System.out.println("b is greater");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        compare(a, b);
        
        
    }
}
