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
public class pegawai {
    private String nama, nip;
    private int gajiPokok,jmlJamKerja;
    private int uangMakan;
    private int lembur;
    private double transport;
    
    public String getNip(){
        return nip;
    }
    public void setNip(String newNip){
        nip = newNip;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public int getJmlJamKerja(){
        return jmlJamKerja;
    }
    public void setJmlJamKerja(int newJmlJamKerja){
        gajiPokok = newJmlJamKerja * 2000;
        if(newJmlJamKerja < 7){
            transport = 0;
            uangMakan = 0;
            lembur = 0;
            jmlJamKerja = (int) (newJmlJamKerja * 2000 +transport +uangMakan + lembur);
        }else if(newJmlJamKerja == 7){
            transport = 1.5;
            uangMakan = 0;
            lembur = 0;
            jmlJamKerja = (int) (newJmlJamKerja * 2000 + (2000 * transport));  
        }else if (newJmlJamKerja == 8 ){
            transport = 0;
            uangMakan = 3500;
            lembur = 0;
            jmlJamKerja = (int) (newJmlJamKerja * 2000 +transport +uangMakan + lembur);
        }else if (newJmlJamKerja >= 9 ){
            transport = 0;
            uangMakan = 0;
            lembur = 4000;
            jmlJamKerja = (int) (newJmlJamKerja * 2000 +transport +uangMakan + lembur);
        }else{
            jmlJamKerja = newJmlJamKerja;
        }
    }
    
    public void cetakPenghasilan(){
        System.out.println("====SLIP GAJI PEGAWAI====");
        System.out.println("Nip             : " +nip);
        System.out.println("Nama            : " +nama);
        System.out.println("Gaji Pokok      : " +gajiPokok);
        System.out.println("Lembur          : " +transport);
        System.out.println("Uang Makan      : " +uangMakan);
        System.out.println("Transport Lembur: " +lembur);
        
        
        
    }
}
