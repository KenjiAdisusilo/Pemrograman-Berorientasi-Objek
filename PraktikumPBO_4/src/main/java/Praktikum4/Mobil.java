/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author kenji
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu; // Atribut khusus kelas Mobil

    // Constructor Subclass
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        // Memanggil constructor dari kelas induk (Kendaraan)
        super(nama, kecepatanMaks, jenisMesin); 
        this.jumlahPintu = jumlahPintu;
    }

    // Method khusus untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // 'getNama()' dipanggil karena 'nama' bersifat private di kelas induk
        System.out.println("Nama Kendaraan    : " + getNama());
        
        // 'kecepatanMaks' bisa dipanggil langsung karena bersifat protected
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        
        // 'jenisMesin' bisa dipanggil langsung karena bersifat public
        System.out.println("Jenis Mesin       : " + jenisMesin);
        
        // Atribut privat milik kelas Mobil sendiri
        System.out.println("Jumlah Pintu      : " + jumlahPintu);
    }
}
