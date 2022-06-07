import pkg.*;
import java.util.*;

class starter {
	public static void function(int n){
        if(n == 0){
            return;
        }
        else{
            System.out.println(n);
            function(n-1);
            System.out.println(n);
        }
    }
    
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
		    return n * factorial(n-1);
		}
	}    
	
	public static int recurPower(int base, int n){
	if(n == 0){
		return 1;
	}else{
	    return base*recurPower(base, n -1);
	}
	}

    public static void main(String args[]) {
	System.out.println(factorial(3));
	System.out.println(recurPower(5, 2));
	System.out.println(recurPower(3, 4));

	System.out.println(recurPower(10, 4));

	}
}
