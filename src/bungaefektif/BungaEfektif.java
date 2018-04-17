/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bungaefektif;

import java.util.Scanner;

/**
 *
 * @author arrai
 */
public class BungaEfektif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BungaEfektif baca = new BungaEfektif();
        Scanner input = new Scanner(System.in);
        
        //input nilai
        System.out.println("Masukan jumlah pinjaman : ");
        long pinjam = input.nextLong();
        System.out.println("Masukan angsuran pokok : ");
        long pokokAngsuran = input.nextLong();
        System.out.println("Masukan suku bunga per tahun : ... % ");
        long I = input.nextLong();
        System.out.println("Berapa kali angsuran : ... kali"); 
        long kali = input.nextLong();
        
        float Sisa;
        
        int i;
        Sisa=pinjam;
        System.out.println("\n==========================================================" +
 "===========================");
 System.out.println("| Angsuran ke- | Saldo Angsuran    |  Pokok Angsuran   |     Bunga    |  Jumlah Angsuran |");
 System.out.println("=====================================================================================");
        float jumlahPAngsuran = 0;
        float jumlahBunga =0 ;
        float jumlahAngsuran=0;
        for(i=1;i<=kali;i++){
            
            if(i<=1){
            float bunga =Sisa*(((float) I/100)/12);}
            else{
            Sisa=Sisa-pokokAngsuran;
            
            }
            float bunga =Sisa*(((float) I/100)/12);
            float Angsuran = (pokokAngsuran)+ bunga;
            
//Sisa = Sisa - (pinjam/kali);
            
            System.out.println("|      "+i+"       |   Rp. "+Sisa+" | "+"   Rp. "+pokokAngsuran+"  | "+"   Rp. "+bunga+"  |"+"   Rp. "+Angsuran+"  |");
            jumlahPAngsuran = pokokAngsuran*kali; 
            jumlahAngsuran = jumlahAngsuran+Angsuran;
            jumlahBunga= jumlahBunga+bunga;
            }
        
         
        System.out.println("|     Jumlah     |                | "+"    Rp. "+jumlahPAngsuran+"   | "+"   Rp. "+jumlahBunga+"  |"+"     "+jumlahAngsuran+"     |");
        
        
    }
    
}
