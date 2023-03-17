import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        int n,m,i,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        n=s.nextInt();
        m=n-1;
        
        if(n==0 || n==1){
            System.out.println(n+" is not a Prime No.");
        }
        else {
         for(i=2;i<=m;i++){
             if(n%i==0){
                 System.out.println(n+" is not a Prime No.");
                 flag=1;
                 break;
             }
         }
         if(flag==0)
             System.out.println(n+" is a Prime No.");
        }
        
    }
    
}
