/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;
public class Hewan {
    public void bersuara() { 
        System.out.println("Hewan bersuara");
    } 
// Metode makan() pertama dengan 1 parameter String 
    public void makan(String makanan) { 
        System.out.println("Hewan makan " + makanan);
    }
// Metode makan() overloaded dengan 2 parameter (String dan int) 
    public void makan(String makanan, int jumlah) { 
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan); 
    } 
}
