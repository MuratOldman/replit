package replitDesk;

import java.util.Scanner;

public class replit155_Methods17FibonacciNumbersVoidMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[]fib=new int[num];
        fib[0]=0;
        fib[1]=1;
        //fib[num]=fib[num-1]+fib[num-2];
        for(int i=2;i<num;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[num-1]);
    }


}
