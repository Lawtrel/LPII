package br.lawtrel.Temp;

import java.util.Scanner;

/*
* Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
* seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
 */
public class temp {
    public static void main(String[] args) {
        double K,Re,Ra,F,C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        C = sc.nextDouble();
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("C: " + C + "\nFahrenheit: " + F + "\nKelvin: " + K + "\nReaumur: " + Re + "\nRankine: " + Ra);
    }
}
