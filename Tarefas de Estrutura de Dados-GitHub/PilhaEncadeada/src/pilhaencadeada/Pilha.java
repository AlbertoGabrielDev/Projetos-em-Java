
package pilhaencadeada;


public class Pilha {

    private class No {

        private Livro dados;
        private No prox;

        public No(Livro l) {
            dados = l;
            prox = null;
        }
    }
    private No topo;
    private int qde;

    public Pilha() {
        topo = null;
        qde = 0;
    }

    public int getQde() {
        return qde;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void push(Livro aux) {
        No novo = new No(aux);
        novo.prox = topo;
        topo = novo;
        qde++;
    }

    public Livro pop() {
        if (vazia()) {
            return null;
        }
        No aux = topo;
        topo = aux.prox;
        aux.prox = null;
        qde--;
        Livro ret = aux.dados;
        aux.dados = null;
        return ret;
    }
}
