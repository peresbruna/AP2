public class GerenciadorPedidos {
    private Fila filaPedidosPendentes;
    private Pilha pilhaPedidosCancelados;

    public GerenciadorPedidos() {
        filaPedidosPendentes = new Fila();
        pilhaPedidosCancelados = new Pilha();
    }

    public void adicionarNovoPedido(int id, String descricao) {
        Pedido pedido = new Pedido(id, descricao);
        filaPedidosPendentes.adicionarProduto(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }

    public void atenderPedido() {
        Pedido pedido = filaPedidosPendentes.removerPedido();
        if (pedido != null) {
            System.out.println("Pedido atendido");
        }
    }

    public void cancelarPedido() {
        Pedido pedido = filaPedidosPendentes.removerPedido();
        if (pedido != null) {
            pilhaPedidosCancelados.adicionarPedido(pedido);
            System.out.println("Pedido cancelado");
        }
    }

    public void restaurarPedido(){
        Pedido pedido = pilhaPedidosCancelados.removerPedido();
        if (pedido != null) {
            filaPedidosPendentes.adicionarProduto(pedido);
            System.out.println("Pedido restaurado");
        }
    }

    public void imprimirPedidosPendentes() {
        System.out.println("Pedidos pendentes");
        filaPedidosPendentes.imprimirPedido();
    }

    public void imprimirPedidosCancelados() {
        System.out.println("Pedidos cancelados");
        pilhaPedidosCancelados.imprimirPedido();
    }
}
