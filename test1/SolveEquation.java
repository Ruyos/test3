package test1;

import java.util.Scanner;
public class SolveEquation {
    public static void main(String[] args){
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a,b,c:");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        double x1,x2;
        x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        if(b*b-4*a*c<0){
            System.out.println("No real roots");
            return;
        }
        if(b*b-4*a*c==0){
            x1=x2=-b/(2*a);
            System.out.println("x1=x2="+x1);
            return;
        }
        if(b*b-4*a*c>0){
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
