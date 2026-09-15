/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4;
/**
 *
 * @author kenji
 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi objek Pekerja
        Pekerja pekerja = new Pekerja("Kenji", 20, "Developer", 8000000);

        // Menampilkan informasi awal menggunakan toString()
        System.out.println("=== DATA PEKERJA AWAL ===");
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan setter
        pekerja.setNama("Kenji Adisusilo");
        System.out.println("\n=== DATA SETELAH UBAH NAMA (SETTER) ===");
        System.out.println(pekerja.toString());

        // Pengujian akses langsung atribut dari objek pekerja
        System.out.println("\n=== UJI AKSES LANGSUNG ATRIBUT ===");
        // System.out.println(pekerja.nama); // ERROR: nama bersifat private
        // System.out.println(pekerja.gaji); // ERROR: gaji bersifat private
        
        System.out.println("Usia (Protected)  : " + pekerja.usia);
        System.out.println("Pekerjaan (Public): " + pekerja.pekerjaan);
    }
}
