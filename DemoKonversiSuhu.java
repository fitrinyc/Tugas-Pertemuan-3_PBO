/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author lenovo
 */
public class DemoKonversiSuhu {
    private KonversiSuhu konversi = new KonversiSuhu();
    private KonversiSuhu2 konversi2 = new KonversiSuhu2();

    private void suhu(double suhuCelsius, double suhuFahrenheit2) {
        double suhuFahrenheit = konversi.celciusToFahrenheit(suhuCelsius);
        double suhuReamur = konversi.celciusToReamur(suhuCelsius);
        double suhuReamur2 = konversi2.fahrenheitToReamur(suhuFahrenheit2);

        System.out.println(suhuCelsius + " Celsius = " + suhuFahrenheit + " Fahrenheit");
        System.out.println(suhuCelsius + " Celsius = " + suhuReamur + " Reamur");
        System.out.println(suhuFahrenheit2 + " Fahrenheit = " + suhuReamur2 + " Reamur");
    }

    public static void main(String[] args) {
        DemoKonversiSuhu demo = new DemoKonversiSuhu();
        double suhuCelsius = 40.0;
        double suhuFahrenheit2 = 52.0;

        demo.suhu(suhuCelsius, suhuFahrenheit2);
    }
}








