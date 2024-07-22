import java.util.Scanner;

public class HitungLuasTrapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM JAVA HITUNG LUAS TRAPESIUM")
        System.out.println("==================================")

        
        System.out.print("Masukkan panjang alas atas trapesium: ");
        double alasAtas = input.nextDouble();

    
        System.out.print("Masukkan panjang alas bawah trapesium: ");
        double alasBawah = input.nextDouble();

    
        System.out.print("Masukkan tinggi trapesium: ");
        double tinggi = input.nextDouble();
        
        double luas = 0.5 * (alasAtas + alasBawah) * tinggi;


        System.out.println("Luas trapesium adalah: " + luas);

      
        input.close();
    }
}
