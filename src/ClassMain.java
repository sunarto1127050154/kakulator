/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applikasi;
/**
 *
 * @author acer_v5
 */
public class ClassMain {
    public void hitung(double operator, double angka1,double angka2)
    {
        double hasil;
        if(operator=='+')
        {
            hasil=angka1+angka2;
            System.out.println("hasil ="+hasil);
        }
        else if(operator=='-')
        {
            hasil=angka1-angka2;
            System.out.println("hasil ="+hasil);
        }
        else if(operator=='*')
        {
            hasil=angka1*angka2;
            System.out.println("hasil ="+hasil);
        }
        else if(operator=='/')
        {
            hasil=angka1/angka2;
            System.out.println("hasil ="+hasil);
        }
        else 
            System.out.println("maaf data tidak ada");
    }
}
        
    

