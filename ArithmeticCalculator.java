import java.util.*;
public class ArithmeticCalculator {
    public static void main(String args[]){
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of \na: ");
        a=sc.nextDouble();
        System.out.print("b: ");
        b=sc.nextDouble();
        System.out.println("Enter the choice: ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            case '/':
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            case '*':
                System.out.println(a+" * "+b+" = "+(a*b));
                break;
            case '%':
                System.out.println(a+" % "+b+" = "+(a%b));
                break;   
            case '^':
                System.out.println(a+"^"+b+" = "+(Math.pow(a,b)));
                break;    
            default:System.out.println("Enter a valid choice");
                break;
        }
        
    }
    
}
