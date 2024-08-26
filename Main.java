import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nomes = leiaNomes();
        double[] precoCusto = leiaCusto(nomes);
        int[] quantidadeInicialEstoque = leiaQuantidade(nomes);
        String opcoes = leiaOpcoes();
        System.out.println("Opção escolhida: " + opcoes);

        switch (opcoes) {
            case "1":
                String nomeProduto = pergunteProdutos(nomes);

                break;
            case "2":
                System.out.println("Opção 2 selecionada");
                break;
            case "3":
                System.out.println("Opção 2 selecionada");
                break;
            case "4":
                System.out.println("Opção 2 selecionada");
                break;
            case "5":
                System.out.println("Opção 2 selecionada");
                break;

        }

    }

    public static String[] leiaNomes() {

        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("digite o nome do produto " + (1 + i) + " ");
            nomes[i] = input.nextLine();

        }
        return nomes;
    }

    public static double[] leiaCusto(String[] nomes) {

        double[] precoCusto = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("digite o preço de custo do produto: " + nomes[i]);
            precoCusto[i] = Double.parseDouble(input.nextLine());
        }
        return precoCusto;

    }

    public static int[] leiaQuantidade(String[] nomes) {
        int[] quantidadeInicialEstoque = new int[nomes.length];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("qual a quantidade incial do p roduto: " + nomes[i]);
            quantidadeInicialEstoque[i] = Integer.parseInt(input.nextLine());
        }
        return quantidadeInicialEstoque;
    }

    public static String leiaOpcoes() {
        System.out.println(
                "digite 1 para 'Venda de produto', 2 para 'Reposição de estoque', 3 para 'Relatório de Estoque', 4 para 'Relatório de vendas' ou 5 para Sair.");
        return input.nextLine();
    }

    public static String pergunteProdutos(String[] nomes) {
        boolean encontrado;
        String nomeProduto = " ";

        do {
            System.out.println("digite o nome do produto a ser vendido: ");
            String produto = input.nextLine();
            encontrado = false;

            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equalsIgnoreCase(produto)) {
                    encontrado = true;
                    nomeProduto = nomes[i];
                    break;

                }
            }
            if (!encontrado) {
                System.out.println("produto não encontrado na lista, tente novamente");
            }

        } while (!encontrado);

        return nomeProduto;
    }
}
