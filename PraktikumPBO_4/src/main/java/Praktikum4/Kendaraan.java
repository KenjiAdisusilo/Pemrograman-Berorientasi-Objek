/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author kenji
 */
public class Kendaraan {
    // Atribut dengan variasi access modifier
    private String nama;           // Hanya bisa diakses di dalam kelas ini
    protected int kecepatanMaks;   // Bisa diakses oleh package yang sama dan subclass
    public String jenisMesin;      // Bisa diakses dari mana saja

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan Setter untuk atribut private 'nama'
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan    : " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin       : " + jenisMesin);
    }
}


