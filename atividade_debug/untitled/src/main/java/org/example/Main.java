package org.example;

import java.util.Scanner;

import static org.example.Mercado.calcularTotal;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        System.out.print("Digite o valor mínimo para desconto: ");
        double descontoMinimo = sc.nextDouble();

        double total = calcularTotal(preco, quantidade);
        if (total > descontoMinimo) {
            double desconto = total * 0.10;
            total = total - desconto;
            System.out.println("\nProduto: " + nomeProduto);
            System.out.println("Total da compra: R$ " + total);
            System.out.println("Quantidade final: " + quantidade);
        }
        else{
            System.out.println("\nProduto: " + nomeProduto);
            System.out.println("Total da compra: R$ " + total);
            System.out.println("Quantidade final: " + quantidade);
        }
        sc.close();
    }
}