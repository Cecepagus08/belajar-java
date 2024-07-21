

import java.util.Scanner;

public class kategoriNilai{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("masukkan angka : ");
    double angka = input.nextDouble();
    
    if( angka >= 80 && angka <= 100){
      
      System.out.println("predikat A");
    }else if( angka >= 70 && angka <= 80){
      
      System.out.println("predikat B");
    }else if(angka >= 60 && angka <= 70){
      
      System.out.println("predikat c");
    }else if(angka >= 50 && angka <= 60){
      System.out.println("predikat D");
      
    }else{
      
      System.out.println("predikat E");
    }
  }
}