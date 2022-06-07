import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void Fib(int n){
		 for (int i = 1; i <= n; ++i){
	            System.out.print(fib(i)+" ");
	        }
    }
     public static int fib(int n){
        //base cases
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;            
        }
        else{
            return fib(n-2)+ fib(n-1);
        }
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter n");
		System.out.println("Input: n = " + n);
		System.out.print("Fibonaci series of " + n + " numbers is : ");
        Fib(n);
	}
}
