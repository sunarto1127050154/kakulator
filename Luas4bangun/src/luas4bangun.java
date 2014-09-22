/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author acer_v5
 */
public class luas4bangun {
    public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);  
int pilihan=9;  
do { 
System.out.println("\n\n");
System.out.println("============= Menu ================");
System.out.println("1. hitung Luas Persegi Panjang");  
System.out.println("2. hitung Luas Persegi");
System.out.println("3. hitung luas segitiga");
System.out.println("0. Keluar");  
System.out.println("===================================");
System.out.print("Masukan Pilihan : ");  
pilihan = masukan.nextInt();  
switch (pilihan){  
case 1: luasPersegiPanjang();break;  
case 2: luasPersegi();break;  
case 3: LuasSegitiga();break;
    
}  
  
} while (pilihan != 0);  
}  
private static void luasPersegiPanjang() {  
Scanner masukan = new Scanner(System.in);  
float luas;  
System.out.print("Masukan nilai panjang :");  
float panjang = masukan.nextFloat();  
System.out.print("Masukan nilai lebar :");  
float lebar = masukan.nextFloat();  
luas = panjang * lebar;  
System.out.println("Luas Persegi Panjang :" + luas);  
}  

private static void luasPersegi() {  
Scanner masukan = new Scanner(System.in);  
float sisi,luas;  
System.out.print("Masukan sisi :");  
sisi = masukan.nextFloat();  
luas = sisi * sisi;
  
System.out.println("Luas Persegi :" + luas);  
    }  

private static void LuasSegitiga() {  
Scanner masukan = new Scanner(System.in);  
float luas;  
System.out.print("Masukan alas :");  
float alas = masukan.nextFloat();
System.out.print("Masukan tinggi :");
float tinggi = masukan.nextFloat();
luas = alas/2 * tinggi;
  
System.out.println("Luas Segi Tiga :" + luas);  
    }
}


