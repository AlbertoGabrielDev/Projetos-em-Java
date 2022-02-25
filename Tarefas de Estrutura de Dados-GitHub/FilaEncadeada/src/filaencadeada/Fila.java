package filaencadeada;

public class Fila {

    private class No {

        private Cliente dados;
        private No anterior;

        public No(Cliente aux) {
            dados = aux;
            anterior = null;

        }

    }

    public Fila() {
        inicio = fim;
        fim = null;
        tamanho = 0;
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void enfileirar(Cliente aux) {
        No node = new No(aux);
        if (vazia()) {
            inicio = fim;
            fim = node;
        } else {
            fim.anterior = node;
            fim = node;
        }
        tamanho++;
    }

    public Cliente desenfileirar() {
        if (vazia()) {
            return null;
        }
        No obj = inicio;
        inicio = obj.anterior;
        Cliente aux = obj.dados;
        tamanho--;
        return aux;
    }

}
