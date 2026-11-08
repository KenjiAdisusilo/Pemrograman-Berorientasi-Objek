/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

public class Main {
    public static void main(String[] args){
        // Membuat objek dari kelas Elektronik dan Makanan
        Pembayaran elektronik = new Elektronik();
        Pembayaran makanan = new Makanan();

        // nominal harga dari masing-masing produk
        double hargaLaptop = 5000000;  // Rp 5.000.000
        double hargaSnack = 20000;     // Rp 20.000

        // Memanggil metode hitungPajak() dan menampilkan hasilnya ke layar
        double pajakElektronik = elektronik.hitungpajak(hargaLaptop);
        double pajakMakanan = makanan.hitungpajak(hargaSnack);
        
        // Harga produk setelah pajak
        double afterpajak = hargaLaptop + pajakElektronik;
        double afterpajak2 = hargaSnack + pajakMakanan;
        
        

        System.out.println("=== SISTEM HITUNG PAJAK TOKO ===");
        System.out.println("Pajak Elektronik (Harga Rp " + hargaLaptop + ") : Rp " + pajakElektronik);
        System.out.println("Pajak Makanan    (Harga Rp " + hargaSnack + ")  : Rp " + pajakMakanan);
        System.out.println("=== HARGA PRODUK DENGAN PAJAK === ");
        System.out.println("Harga Laptop dengan Pajak : " + afterpajak);
        System.out.println("Harga Snack dengan Pajak : " + afterpajak2);
    }
    
}