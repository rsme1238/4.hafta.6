
package pkg4.hafta.pkg6;

import java.util.Scanner;

public class Hafta6 {

   
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in); 
         
        System.out.println("Enter here the N number= ");
        int n = input.nextInt();
        
         System.out.println("Enter here the R number= ");
        int r = input.nextInt();
        
        int f1 =1,f2 =1,f3 =1;
        
        for(int i=1; i<=n;i++){
        f1= f1 * i;
        
        if(i<=r){
            f2=f2*i;
            }
        
        else if(i<=n-r){
          f3=f3*i;  
        }
        
         int k= f1/ (f2*f3);
            System.out.println(k);
        
        }
    }
    
}
