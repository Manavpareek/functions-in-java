package functions;

import java.util.Scanner;

public class circumfarance {
    public static double calculate(double radius) {
         double circum =2 * 3.14 * radius;
         return circum;
         
         
        }
        public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            Double radius=sc.nextDouble();
        double circum=calculate(radius);
        System.out.println(circum);
       

         }
}
