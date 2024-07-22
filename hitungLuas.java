import java.util.Scanner;

public class hitungLuas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Rumus luas segitiga: 1/2 * alas * tinggi
        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}
