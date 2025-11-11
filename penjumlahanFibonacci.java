import java.util.Scanner;

public class penjumlahanFibonacci {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciRekursif(int hitung) {
  
        if (hitung <= 0) {
            return 0;
        } else {
            return fibonacciRekursif(hitung - 1) + fibonacci(hitung - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Soal 1: Penjumlahan Deret Fibonacci (Rekursif) ---");
        System.out.print("Input Jumlah deret fibonacci : ");
        
        int n = scanner.nextInt();

        System.out.print("Deret Fibonacci : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n - 1) {
                System.out.print(" + ");
            }
        }

        int hasil = fibonacciRekursif(n);
        System.out.println(" = " + hasil);
        
        scanner.close();
    }
}
