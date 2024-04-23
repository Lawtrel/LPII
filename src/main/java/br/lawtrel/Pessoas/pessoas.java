package br.lawtrel.Pessoas;

import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que
calcule e escreva:
a maior e a menor altura do grupo;
média de altura dos homens;
o número de mulheres.
*/
public class pessoas {
    public static void main(String[] args) {
        int sexo, qtdMulheres = 0, qtdHomens = 0;
        float altura, soma = 0, mediaHomens = 0, maior = 0, menor = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
            {
                System.out.println("Homem(1) ou mulher(2)?");
                sexo = sc.nextInt();
                System.out.println("Digite a altura: ");
                altura = sc.nextFloat();
                if (sexo == 1) {
                    qtdHomens++;
                    soma = soma + altura;
                } else if (sexo == 2) {
                    qtdMulheres++;
                } else {
                    System.out.println("Sexo Invalido!");
                }
                if (altura > maior) {
                    maior = altura;
                } else if (altura < menor) {
                    menor = altura;
                }

            }
            mediaHomens = soma / qtdHomens;
            System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
            System.out.println("A média de altura dos homens é " + mediaHomens + " m");
            System.out.println("O número de mulheres é " + qtdMulheres);

            sc.close();
        }
    }