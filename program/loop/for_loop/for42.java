 /* Write a program to display the pattern like  triangle using *** */
import java.util.Scanner;
public class for42{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("enter the number ");
        int n = sc.nextInt();int k=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            
            for(int j=1;j<=k;j++){ 

                System.out.print("* ");
                
            }
            k+=2;
            System.out.println();}
    }       
} 
