/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applikasi;
import applikasi.ClassMain;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author acer_v5
 */
public class kakulator {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        DataInputStream masuk=new DataInputStream(System.in);
        float bilA, bilB, Hasil;
        char operator;
        
        System.out.print("masukan operator (+,-,*,/) : ");
        operator=(char) masuk.read();
        System.out.print("masukan bilA : ");
        bilA=input.nextFloat();
        System.out.print("masukan bilB : ");
        bilB=input.nextFloat();
        ClassMain hitung=new ClassMain();
        
        hitung.hitung(operator,bilA,bilB);
    }
    }

