/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 * Main Class yang diperbarui
 * @author Kenji Muhammad Adisusilo
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek kucing dengan constructor [42]
        Hewan kucing = new Hewan("Mimi", 3);

        // Menampilkan info lengkap menggunakan method info() [42]
        kucing.info();
        kucing.suara();

        System.out.println(); // Pembatas baris

        // Membuat objek anjing untuk menguji method berlari() [43]
        Hewan anjing = new Hewan("Rambo", 4);
        anjing.info();
        anjing.berlari();
    }
}
    
    