package praktikum6;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Penerapan Polimorfisme: Objek Buku, Elektronik, dan Pakaian
        // dimasukkan ke dalam referensi bertipe kelas induk Produk
        Produk buku1 = new Buku("Pemrograman Java PBO", 100000);
        Produk laptop = new Elektronik("Laptop ASUS Vivobook", 8000000);
        Produk kemeja = new Pakaian("Kemeja Batik", 200000);

        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(kemeja);

        // Menampilkan struk dan total belanja setelah dipotong diskon masing-masing
        keranjang.tampilkanStruk();
    }
}

