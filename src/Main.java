import GerenciadorBiblioteca.ListaDuplamenteLigada;
import GerenciadorBiblioteca.Livro;

public class Main {
    public static void main(String[] args) {
    GerenciadorPedidos sistema = new GerenciadorPedidos();

    sistema.adicionarNovoPedido(1, "Pão");
    sistema.adicionarNovoPedido(2, "Manteiga");
    System.out.println();
    sistema.imprimirPedidosPendentes();
    System.out.println();
    sistema.atenderPedido();
    System.out.println();
    sistema.imprimirPedidosPendentes();
    System.out.println();
    sistema.cancelarPedido();
    System.out.println();
    sistema.imprimirPedidosCancelados();
    System.out.println();
    sistema.imprimirPedidosPendentes();
    System.out.println();
    sistema.restaurarPedido();
    System.out.println();
    sistema.imprimirPedidosPendentes();
    System.out.println();
    sistema.imprimirPedidosCancelados();

    System.out.println("-------------------------");
    System.out.println("2. Lista Duplamente Ligada");

    ListaDuplamenteLigada biblioteca = new ListaDuplamenteLigada();

    biblioteca.adicionarNoInicio(new Livro(1, "A culpa é das Estrelas", "John Green"));
    biblioteca.adicionarNoInicio(new Livro(2, "É assim que acaba", "Colleen Hoover"));
    biblioteca.adicionarNoInicio(new Livro(3, "Quem É Você, Alasca?", "John Green"));
    biblioteca.adicionarNoInicio(new Livro(4, "Cidades de Papel", "John Green"));
    System.out.println();
    System.out.println("Lista na ordem original");
    biblioteca.imprimirOrdemOriginal();
    System.out.println();
    System.out.println("Lista na ordem reversa");
    biblioteca.imprimirOrdemReversa();
    System.out.println();
    System.out.println("Removendo o primeiro livro");
    Livro removido = biblioteca.removerDoInicio();
    System.out.println("Removido: " + removido);
    System.out.println();
    System.out.println("Removendo o último livro");
    removido = biblioteca.removerDoFim();
    System.out.println("Removido: " + removido);
    System.out.println();
    System.out.println("Buscando pelo ID 3");
    Livro encontrado = biblioteca.pesquisarPorId(3);
    if (encontrado != null) {
        System.out.println("Encontrado: " + encontrado);
    }
    System.out.println();
    System.out.println("Lista na ordem original após remoções");
    biblioteca.imprimirOrdemOriginal();
    }
}