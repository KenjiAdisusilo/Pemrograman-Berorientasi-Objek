/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author kenji
 */
public class Makanan implements Pembayaran{
    @Override
    public double hitungpajak(double harga) {
        return harga * 0.05;
    }
    
}
