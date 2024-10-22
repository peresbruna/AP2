public class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarProduto(Pedido pedido) {
        No novoNo = new No(pedido);
        if (fim != null) {
            fim.proximo = novoNo;
        }
        fim = novoNo;
        if (inicio == null) {
            inicio = fim;
        }
    }

    public Pedido removerPedido() {
        if (inicio == null) {
            System.out.println("Fila vazia");
            return null;
        }
        Pedido pedido = inicio.pedido;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return pedido;
    }

    public void imprimirPedido() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }

}
