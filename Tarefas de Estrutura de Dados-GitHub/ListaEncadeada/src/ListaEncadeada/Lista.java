package ListaEncadeada;

public class Lista {

    private class No {

        private itemCompra dados;
        private No proximo;
        
        No(itemCompra aux) {
            dados = aux;
            proximo = null;
        }
    }
    private No primeiro, fim;
    private int qde;
    private int tamanho; 

    public boolean setTam(int aux) {
        if (aux < 2) {
          return false;
        }
        tamanho = aux;
        fim = null;
        return true;
    }
    void Lista() {
        primeiro = fim = null;
        qde = 0;
    }

    public int getQde() {
        return qde;
    }

    public String getLista(String lista) {
        return lista;
    }

    public boolean listaVazia() {
        return primeiro == null;
    }

    public void inserirInicio(itemCompra aux) {
        No novo = new No(aux);
        novo.proximo = primeiro;
        primeiro = novo;
        qde++;
    }

    public No search(itemCompra aux) {
        for (No n = primeiro; n != null; n = n.proximo) {
            if (n.dados == aux) {
                return n;
            }
        }
        return null;
       

    

}

public itemCompra retirar(itemCompra aux) {
        if (listaVazia()) {
            return null;
        }
        No obj = primeiro;
        primeiro = obj.proximo;
        itemCompra aux = obj.dados;
        qde--;
        return aux;
    }
}
