import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double speed, time, distance;

        System.out.println("===============================================");
        System.out.println("Tekan 1 untuk mencari kecepatan (m/s)");
        System.out.println("Tekan 2 untuk mencari waktu (s)");
        System.out.println("Tekan 3 untuk mencari jarak (m)");
        System.out.println("===============================================");
        
        System.out.print("Masukan pilihan : ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Anda ingin mencari Kecepatan");
                System.out.println("===============================================");
                System.out.print("Masukkan jarak (meter) : ");
                distance = scanner.nextDouble();
                System.out.print("Masukkan waktu (sekon) : ");
                time = scanner.nextDouble();
                speed = distance / time;
                System.out.println("Hasilnya " + speed + " m/s");
                break;
            case 2:
                System.out.println("Anda ingin mencari Waktu");
                System.out.println("===============================================");
                System.out.print("Masukkan jarak (meter) : ");
                distance = scanner.nextDouble();
                System.out.print("Masukkan kecepatan (m/s) : ");
                speed = scanner.nextDouble();
                time = distance / speed;
                System.out.println("Hasilnya " + time + " sekon");
                break;
            case 3:
                System.out.println("Anda ingin mencari Jarak");
                System.out.println("===============================================");
                System.out.print("Masukkan kecepatan (m/s) : ");
                speed = scanner.nextDouble();
                System.out.print("Masukkan waktu (sekon) : ");
                time = scanner.nextDouble();
                distance = speed * time;
                System.out.println("Hasilnya " + distance + " meter");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        System.out.println("===============================================");
        scanner.close();
    }
}
