package br.lawtrel.Carro;
import java.util.Scanner;

/*custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.*/
public class carro {
    public static void main(String[] args) {
        double precoCarro, precoFinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Preco de Fabrica do carro: ");
        precoCarro = sc.nextDouble();
        precoFinal = precoCarro + precoCarro*0.28 + precoCarro*0.45;
        System.out.println("O Preco final é: " + precoFinal);

    }
}
