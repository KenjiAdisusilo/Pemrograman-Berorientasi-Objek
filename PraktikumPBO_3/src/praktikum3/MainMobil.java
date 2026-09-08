/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 * Main Class untuk menjalankan program Mobil
 * @author Kenji Muhammad Adisusilo
 */
public class MainMobil {
    public static void main(String[] args) {
        // 1. Menciptakan dua objek dari class Mobil 
        Mobil mobilKenji = new Mobil("Toyota", "GR Yaris", 2023, "Putih");
        Mobil mobilKeluarga = new Mobil("Honda", "Civic Type R", 2024, "Merah");

        // 2. Menampilkan informasi awal kedua mobil
        System.out.println("--- Informasi Awal Objek Mobil ---");
        mobilKenji.displayInfo();
        mobilKeluarga.displayInfo();

        System.out.println();

        // 3. Menyalakan mesin setiap mobil menggunakan method startEngine() 
        System.out.println("--- Menguji Sistem Starter Mesin ---");
        mobilKenji.startEngine();
        mobilKeluarga.startEngine();

        System.out.println();

        // 4. Melakukan modifikasi warna mobil menggunakan setter warna
        System.out.println("--- Melakukan Modifikasi / Repaint Warna Mobil ---");
        System.out.println("-> Mengubah warna Toyota GR Yaris menjadi Hitam Metalik...");
        mobilKenji.setWarna("Hitam Metalik"); // Mengubah warna mobil pertama

        System.out.println("-> Mengubah warna Honda Civic Type R menjadi Kuning Spoon...");
        mobilKeluarga.setWarna("Kuning Spoon"); // Mengubah warna mobil kedua 

        System.out.println();

        // 5. Menampilkan kembali informasi mobil setelah diubah warnanya 
        System.out.println("--- Informasi Mobil Setelah Repaint ---");
        mobilKenji.displayInfo();
        mobilKeluarga.displayInfo();
    }
}
