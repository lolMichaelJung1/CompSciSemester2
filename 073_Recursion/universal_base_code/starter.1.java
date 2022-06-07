import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	 public static int fibBeta(int n){
        //base cases
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;            
        }
        else{
            return fibBeta(n-2)+ fibBeta(n-1);
        }
    }
    public void fib(){
        System.out.println(" ");
    };
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter n");
		System.out.println("Input: n=" + n);
		System.out.println("Fibonacci series of " + n + " numbers is " +fibBeta(n));

		
	}
}
