# atividade-debug-java-Gustavo_e_Vitor
Teste de código escrito em Java que simula um mercado 

Código deve receber o nome do produto, seu valor, quantidade comprada e valor mínimo para desconto. após isso ele deve verificar se o valor da compra terá direito a desconto, se sim, ele deverá calcular um deconto de 10 porcento em relação a compra.


package org.example;
import java.util.Scanner;
public class Mercado {
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
            if (total < descontoMinimo) {
                double desconto = total * 0.10;
                total = total + desconto;
            }
            total = total + 15;
            System.out.println("\nProduto: " + nomeProduto);
            System.out.println("Total da compra: R$ " + total);
            quantidade = atualizarQuantidade(quantidade);
            System.out.println("Quantidade final: " + quantidade);
            sc.close();
        }
        public static double calcularTotal(double preco, int quantidade) {
            double total = preco * quantidade + 5;
            return total;
        }
        public static int atualizarQuantidade(int qtd) {

            return qtd - 2;
        }
    }
