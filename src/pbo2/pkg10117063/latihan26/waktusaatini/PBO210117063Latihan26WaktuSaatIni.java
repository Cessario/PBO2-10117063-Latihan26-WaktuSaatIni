/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan26.waktusaatini;

/**
 *
 * @author DEADPOOL
 */
import java.util.*;
import java.text.*;
public class PBO210117063Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Date hariSekarang = new Date();
     SimpleDateFormat ft = 
             new SimpleDateFormat("E yyyy.MM.dd ' pada ' hh:mm:ss a zzz");
        System.out.println("Tanggal san Waktu saat ini : " + 
                ft.format(hariSekarang));
    
}
}