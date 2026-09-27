package praktikum6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanStruk() {
        System.out.println("========== STRUK KERANJANG BELANJA ==========");
        for (Produk p : listProduk) {
            System.out.println("Nama Produk  : " + p.getNama());
            System.out.println("Harga Awal   : Rp " + p.getHarga());
            System.out.println("Diskon       : Rp " + p.hitungDiskon());
            System.out.println("Harga Akhir  : Rp " + p.getHargaSetelahDiskon());
            System.out.println("-------------------------------------------");
        }
        System.out.println("TOTAL BAYAR  : Rp " + hitungTotalHargaSetelahDiskon());
        System.out.println("===========================================");
    }
}

