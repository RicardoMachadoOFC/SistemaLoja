import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    private static String[] nomes = leiaNomes();
    private static double[] precoCusto = leiaCusto(nomes);
    private static int[] quantidadeEstoque = leiaQuantidade(nomes);
    private static double totalVendas = 0.0;

    public static void main(String[] args) {
        String opcao;

        do {
            opcao = leiaOpcoes();
            switch (opcao) {
                case "1":
                    realizarVenda();
                    break;
                case "2":
                    reposicaoEstoque();
                    break;
                case "3":
                    relatorioEstoque();
                    break;
                case "4":
                    relatorioVendas();
                    break;
                case "5":
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("5"));
    }

    public static String[] leiaNomes() {
        String[] nomes = new String[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }
        return nomes;
    }

    public static double[] leiaCusto(String[] nomes) {
        double[] precoCusto = new double[10];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o preço de custo do produto " + nomes[i] + ": ");
            precoCusto[i] = Double.parseDouble(input.nextLine());
        }
        return precoCusto;
    }

    public static int[] leiaQuantidade(String[] nomes) {
        int[] quantidadeEstoque = new int[nomes.length];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Qual a quantidade inicial do produto " + nomes[i] + ": ");
            quantidadeEstoque[i] = Integer.parseInt(input.nextLine());
        }
        return quantidadeEstoque;
    }

    public static String leiaOpcoes() {
        System.out.println("\nDigite 1 para 'Venda de produto', 2 para 'Reposição de estoque', 3 para 'Relatório de Estoque', 4 para 'Relatório de vendas' ou 5 para Sair.");
        return input.nextLine();
    }

    public static void realizarVenda() {
        String nomeProduto = pergunteProdutos();
        int index = encontrarIndex(nomeProduto);
        if (index != -1) {
            System.out.println("Quantidade em estoque do produto " + nomes[index] + ": " + quantidadeEstoque[index]);
            double precoVenda = precoCusto[index] * 1.5;
            System.out.println("Preço de venda: R$" + precoVenda);

            int quantidadeVendida;
            do {
                System.out.print("Digite a quantidade vendida: ");
                quantidadeVendida = Integer.parseInt(input.nextLine());
                if (quantidadeVendida > quantidadeEstoque[index]) {
                    System.out.println("Quantidade vendida maior que a disponível no estoque. Tente novamente.");
                }
            } while (quantidadeVendida > quantidadeEstoque[index]);

            double valorVenda = quantidadeVendida * precoVenda;
            System.out.print("Deseja pagar à vista (s/n)? ");
            boolean aVista = input.nextLine().equalsIgnoreCase("s");
            if (aVista) {
                valorVenda *= 0.9;
            }

            System.out.println("Finalização da venda:");
            System.out.println("Nome do produto: " + nomes[index]);
            System.out.println("Quantidade vendida: " + quantidadeVendida);
            System.out.println("Valor pago: R$" + valorVenda);

            quantidadeEstoque[index] -= quantidadeVendida;
            totalVendas += valorVenda;
        }
    }

    public static void reposicaoEstoque() {
        String nomeProduto = pergunteProdutos();
        int index = encontrarIndex(nomeProduto);
        if (index != -1) {
            System.out.println("Quantidade atual em estoque do produto " + nomes[index] + ": " + quantidadeEstoque[index]);
            System.out.print("Digite a quantidade a ser reposta: ");
            int quantidadeReposicao = Integer.parseInt(input.nextLine());
            quantidadeEstoque[index] += quantidadeReposicao;

            System.out.println("Finalização da reposição:");
            System.out.println("Nome do produto: " + nomes[index]);
            System.out.println("Nova quantidade em estoque: " + quantidadeEstoque[index]);
        }
    }

    public static void relatorioEstoque() {
        System.out.println("Relatório de estoque:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i] + ", Preço de Custo: R$" + precoCusto[i] + ", Quantidade: " + quantidadeEstoque[i]);
        }
    }

    public static void relatorioVendas() {
        System.out.println("Relatório de vendas:");
        System.out.println("Nome do produto | Quantidade | Valor da venda");
        System.out.println("------------------------------------------------");

        System.out.println("Total de vendas: R$" + totalVendas);
    }

    public static void sair() {
        System.out.println("Saindo...");
        System.out.println("Valor total das vendas: R$" + totalVendas);
    }

    public static String pergunteProdutos() {
        boolean encontrado;
        String nomeProduto;

        do {
            System.out.print("Digite o nome do produto: ");
            nomeProduto = input.nextLine();
            encontrado = encontrarIndex(nomeProduto) != -1;
            if (!encontrado) {
                System.out.println("Produto não encontrado. Tente novamente.");
            }
        } while (!encontrado);

        return nomeProduto;
    }

    public static int encontrarIndex(String nomeProduto) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProduto)) {
                return i;
            }
        }
        return -1;
    }
}
