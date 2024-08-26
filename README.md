# Sistema de Vendas Básico para Loja

## Descrição

Este sistema de vendas básico para loja foi desenvolvido para gerenciar produtos em estoque, processar vendas, e gerar relatórios de estoque e vendas. O programa permite cadastrar produtos, realizar vendas, repor estoque e gerar relatórios detalhados, proporcionando uma solução prática para pequenas e médias empresas.

## Funcionalidades

### Cadastro de Produtos

Ao iniciar o sistema, o usuário deve cadastrar os 10 produtos comercializados pela loja. Para cada produto, é necessário informar:

- **Nome do produto**
- **Preço de custo**

### Menu Principal

Após cadastrar todos os produtos, o programa apresenta um menu com as seguintes opções:

1. **Venda de Produto**
2. **Reposição de Estoque**
3. **Relatório de Estoque**
4. **Relatório de Vendas**
5. **Sair**

O usuário pode escolher uma opção, que será executada imediatamente. O menu é apresentado novamente após a execução da opção, até que o usuário selecione a opção 5 para sair.

### Opção 1 – Venda de Produto

- **Solicitação do Nome do Produto**: O usuário deve digitar o nome do produto a ser vendido. Se o produto não existir, o sistema solicitará a entrada novamente.
- **Exibição de Informações**: O sistema mostra a quantidade em estoque e o preço de venda do produto (preço de custo mais uma margem de lucro de 50%).
- **Quantidade Vendida**: O usuário deve informar a quantidade vendida. Se a quantidade for maior do que a disponível em estoque, o sistema solicitará uma nova entrada.
- **Valor da Venda**: O sistema calcula e exibe o valor total da venda. O usuário pode optar por pagar à vista (com 10% de desconto) ou a prazo.
- **Mensagem de Finalização**: O sistema apresenta uma mensagem com:
  - Nome do produto
  - Quantidade vendida
  - Valor pago

### Opção 2 – Reposição de Estoque

- **Solicitação do Nome do Produto**: O usuário deve informar o nome do produto a ser reposto. Se o produto não existir, o sistema solicitará a entrada novamente.
- **Exibição da Quantidade Atual**: O sistema mostra a quantidade em estoque do produto.
- **Quantidade a Ser Reposta**: O usuário deve informar a quantidade a ser adicionada ao estoque.
- **Mensagem de Finalização**: O sistema apresenta uma mensagem com:
  - Nome do produto
  - Nova quantidade em estoque

### Opção 3 – Relatório de Estoque

- **Exibição de Relatório**: O sistema mostra uma lista com:
  - Nome dos produtos
  - Preço de custo
  - Quantidade em estoque

### Opção 4 – Relatório de Vendas

- **Exibição de Relatório**: O sistema apresenta uma lista das vendas realizadas com:
  - Nome do produto vendido
  - Quantidade vendida
  - Valor da venda

### Opção 5 – Sair

- **Resumo de Vendas**: O sistema exibe o valor total das vendas realizadas.
- **Encerramento**: O programa é encerrado.


## Autor

- [Ricardo Machado]


