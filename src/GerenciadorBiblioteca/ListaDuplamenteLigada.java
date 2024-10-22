package GerenciadorBiblioteca;

public class ListaDuplamenteLigada {
    private No inicio;
    private No fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarNoInicio(Livro livro) {
        No novoNo = new No(livro);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void adicionarNoFim(Livro livro) {
        No novoNo = new No(livro);
        if (fim == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public Livro removerDoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return null;
        }
        Livro livro = inicio.livro;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        return livro;
    }

    public Livro removerDoFim() {
        if (fim == null) {
            System.out.println("Lista vazia");
            return null;
        }
        Livro livro = fim.livro;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        return livro;
    }

    public Livro pesquisarPorId(int id) {
        No atual = inicio;
        while (atual != null) {
            if (atual.livro.id == id) {
                return atual.livro;
            }
            atual = atual.proximo;
        }
        System.out.println("ID do livro " + id + " não encontrado");
        return null;
    }

    public void imprimirOrdemOriginal() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }

    public void imprimirOrdemReversa(){
        No atual = fim;
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.anterior;
        }
    }
}


