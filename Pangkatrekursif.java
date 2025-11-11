import java.util.Scanner;

public class Pangkatrekursif {

    public static long pangkatRekursif(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        return (long) base * pangkatRekursif(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Soal 2: Pangkat (Rekursif) ---");
        
        System.out.print("Input Bilangan: ");
        int basis = scanner.nextInt();
        
        System.out.print("Input Pangkat: ");
        int pangkat = scanner.nextInt();

        long hasil = pangkatRekursif(basis, pangkat);

        System.out.println("Hasil " + basis + " pangkat " + pangkat + " = " + hasil);
        
        scanner.close();
    }
}