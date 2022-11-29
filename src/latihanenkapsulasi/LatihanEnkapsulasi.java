/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanenkapsulasi;

/**
 *
 * @author muhammad
 */
public class LatihanEnkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nilai N = new nilai();
        N.setNilaiPraktek(100);
        N.setNilaiTiori(86);
        System.out.println("Nilai praktek = " +N.getNP());
        System.out.println("Nilai tiori = " +N.getNT());
        System.out.println("Nilai akhir = " +N.getNa());
    }
    
}
