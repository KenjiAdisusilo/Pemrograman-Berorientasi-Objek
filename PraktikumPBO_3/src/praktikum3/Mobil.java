/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author kenji
 */
public class Mobil {
    // Penerapan Encapsulation dengan modifier private
    private String merk;
    private String model;
    private int tahun;
    private String warna; // Atribut tambahan 

    // Constructor lengkap untuk menginisialisasi keempat atribut
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // Getter & Setter Merk
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter & Setter Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter & Setter Tahun [44]
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Getter & Setter Warna (Method untuk mengubah warna mobil)
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method perilaku menyalakan mesin
    public void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " [" + getModel() + "] menyala!");
    }

    // Method untuk menampilkan informasi lengkap mobil
    public void displayInfo() {
        System.out.println("===== INFORMASI MOBIL =====");
        System.out.println("Merk  : " + getMerk());
        System.out.println("Model : " + getModel());
        System.out.println("Tahun : " + getTahun());
        System.out.println("Warna : " + getWarna());
        System.out.println("===========================");
    }
}    
