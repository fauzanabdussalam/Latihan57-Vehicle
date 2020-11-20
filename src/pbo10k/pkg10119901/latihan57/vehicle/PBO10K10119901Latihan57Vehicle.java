/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan57.vehicle;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menampilkan Data Vehicle / Kendaraan
 *
 */
public class PBO10K10119901Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setBrand("Trek Bike");
        b.setModel("7.4FX");
        b.setGearCount(23);
        System.out.println("Brand \t\t : " + b.getBrand());
        System.out.println("Model \t\t : " + b.getModel());
        System.out.println("Jumlah Gear \t : " + b.getGearCount());
        
        System.out.println();
        
        Skateboard s = new Skateboard();
        s.setBrand("Ally Skate");
        s.setModel("Rocket");
        s.setBoardLength(54.5);
        System.out.println("Brand \t\t : " + s.getBrand());
        System.out.println("Model \t\t : " + s.getModel());
        System.out.println("Panjangnya Board : " + s.getBoardLength());
    }
    
}
