/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

/**
 *
 * @author lenovo
 */
public class Matematika2 extends Matematika {
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            return -1; 
        }
    }

    public void info(int a, int b) {
        System.out.println("Sisa Bagi " + a + " % " + b + " = " + modulus(a, b));
    }
}

