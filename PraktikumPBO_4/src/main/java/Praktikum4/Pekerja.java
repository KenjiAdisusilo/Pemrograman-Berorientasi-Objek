/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;
/**
 *
 * @author kenji
 */
public class Pekerja extends Manusia {
    private double gaji;

    // Constructor menggunakan super untuk memanggil constructor induk
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString() untuk menampilkan informasi lengkap pekerja
    @Override
    public String toString() {
        return "Nama      : " + getNama() +
               "\nUsia      : " + usia + " tahun" +
               "\nPekerjaan : " + pekerjaan +
               "\nGaji      : Rp " + gaji;
    }
}
