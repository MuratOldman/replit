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
        /*
     FibonacciNumbers   0 1 1 2 3 5 8 13 21 34 55 ...
                        0 1 2 3 4 5 6 7  8  9  10
     */
     /*
     neden array kullandik:
     eliimzde int rakamlardan olusan bir seri var. aralarinda matematiksel bir baglanti var. bunlari bir array a koymak isimizi kolaylastiracak. cunku o zaman bunlarin bir adresi olacak.
     sifirinci eleman, 5. eleman , 9. eleman deyince hepimiz ayni seyi anlayacagiz.

      */
        int[]fib=new int[num+1]; // num+1 yazmamizin nedeni , mesela scanner dan 9 girildi. ama bize okutulacak olan sayi aslinda 10.sirada. cunku sira sifirinci elemanla basliyor.
        fib[0]=0;                // eger num+1 yazmazsan hata verecek.
        fib[1]=1;
        //fib[num]=fib[num-1]+fib[num-2];  bu Fibonacci serisini anlamak icin.
        for(int i=2;i<=num;i++){     // neden i=2 den baslattim ; cunku  fib[0] ve fib[1] i zaten basta ben tanimladim.
            fib[i]=fib[i-1]+fib[i-2]; // serinin diger ifadelerini hesaplamak icin bu ifadeyi kullandim.bu zaten fib serisinin tanimi.
        }
        System.out.println(fib[num]);
    }


}
