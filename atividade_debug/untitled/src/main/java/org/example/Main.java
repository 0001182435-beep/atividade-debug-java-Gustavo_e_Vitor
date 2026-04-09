
public class Main {

    public static void main(String[] args) {

        String nomeProduto = "Arroz";
        double preco = 25.0;
        int quantidade = 5;

        double total = calcularTotal(preco, quantidade);

        // ERRO LÓGICO: condição errada (deveria ser > 100)
        if (total >= 100) {
            double desconto = total * 0.10;
            total = total + desconto; // ERRO: soma em vez de subtrair
        }

        // ERRO LÓGICO: altera o total sem necessidade
        total = total + 20;

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Total da compra: R$ " + total);

        // ERRO LÓGICO: alteração indevida da quantidade
        quantidade = atualizarQuantidade(quantidade);

        System.out.println("Quantidade final: " + quantidade);
    }

    public static double calcularTotal(double preco, int quantidade) {
        // ERRO LÓGICO: cálculo incorreto
        double total = preco * quantidade + 10;
        return total;
    }

    public static int atualizarQuantidade(int qtd) {
        // ERRO LÓGICO: reduz quantidade sem motivo
        return qtd - 1;
    }
}