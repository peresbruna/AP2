public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void adicionarPedido(Pedido pedido) {
        No novoNo = new No(pedido);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public Pedido removerPedido() {
        if (topo == null) {
            System.out.println("Pilha vazia");
            return null;
        }
        Pedido pedido = topo.pedido;
        topo = topo.proximo;
        return pedido;
    }

    public void imprimirPedido() {
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.pedido);
            atual = atual.proximo;
        }
    }
}
