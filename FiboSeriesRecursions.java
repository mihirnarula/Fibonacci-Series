// displaying n elements of the Fibonacci series till
package fibo.series.recursions;
import java.util.*;
public class FiboSeriesRecursions {

    int fibonacci(int num){
        if(num==1){
            return 0;
        }
        else if (num == 2){
            return 1;
        }
        else if(num>2){
            return(fibonacci(num-1)+fibonacci(num-2));
        }
        else
            return -1;

    }

    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        int num;
        System.out.println("Enter number of terms to display: ");
         num = scan.nextInt();
         FiboSeriesRecursions ob = new FiboSeriesRecursions ();
        int temp =0;
        for(int i =1;i<=num;++i){
            temp = ob.fibonacci(i);
            System.out.println(temp);

        }

    }
    
}
