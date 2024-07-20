
import java.util.Scanner;

public class ganjilGenap{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   System.out.print("masukkan angka: ");
   double angka = input.nextDouble();
   
   if( angka % 2 == 0){
   System.out.println("angka " +angka+ " adalah angka genap ");
     
   }else{
     
   System.out.println("angka " +angka+ " adalah angka ganjil ");
   }
  }
  
}