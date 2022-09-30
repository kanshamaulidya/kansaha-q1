/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_quiz1;

/**
 *
 * @author HP
 */
public class PegawaiTest {
    public static void main(String[] args){
        pegawai p = new pegawai();
        
        p.setNama("Aku");
        p.setNip("a111b");
        p.setJmlJamKerja(6);
        p.cetakPenghasilan();
        System.out.println("Total gaji      : " + p.getJmlJamKerja());
        System.out.println();
        
        p.setNama("Kansha");
        p.setNip("a123b");
        p.setJmlJamKerja(7);
        p.cetakPenghasilan();
        System.out.println("Total gaji      : " + p.getJmlJamKerja());
        System.out.println();
        
        p.setNama("Maulidya");
        p.setNip("a321b");
        p.setJmlJamKerja(8);
        p.cetakPenghasilan();
        System.out.println("Total gaji      : " + p.getJmlJamKerja());
        System.out.println();
        
        p.setNama("Shyfa");
        p.setNip("a213c");
        p.setJmlJamKerja(9);
        p.cetakPenghasilan();
        System.out.println("Total gaji      : " + p.getJmlJamKerja());
        System.out.println();
    }
}
