/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author lenovo
 */

public class MatematikaInheritance {
    private Matematika Matematika = new Matematika();
    private Matematika2 Matematika2 = new Matematika2();

    public void panggilAritmatika(int a, int b) {
        System.out.println("Hasil penjumlahan: " + Matematika.tambah(a, b));
        System.out.println("Hasil pengurangan: " + Matematika.kurang(a, b));
        System.out.println("Hasil perkalian: " + Matematika.kali(a, b));
        System.out.println("Hasil pembagian: " + Matematika.bagi(a, b));
        System.out.println("Hasil modulus (Matematika2): " + Matematika2.modulus(a, b));
    }

    public static void main(String[] args) {
        MatematikaInheritance matematikaInheritance = new MatematikaInheritance();
        int a = 40;
        int b = 11;
        matematikaInheritance.panggilAritmatika(a, b);
    }
}