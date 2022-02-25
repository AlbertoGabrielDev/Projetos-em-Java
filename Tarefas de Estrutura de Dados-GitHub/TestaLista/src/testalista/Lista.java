
package testalista;

public class Lista {

    private int maxTam, ultimo;
    private Contato[] vetor;

    public Lista() {
        maxTam = ultimo = 0;
        vetor = null;
    }

    public int getMaxTam() {
        return maxTam;
    }

    public boolean setMaxTam(int aux) {
        if (aux < 2) {
            return false;
        }
        maxTam = aux;
        ultimo = 0;
        vetor = new Contato[maxTam];
        return true;
    }

    public boolean listaVazia() {
        return ultimo == 0;
    }

    public boolean listaCheia() {
        return ultimo == maxTam;
    }

    public boolean insereOrdenado(Contato aux) {
        if (listaCheia()) {
            return false;
        }
// laço de busca
        int pos = 0;
        while (pos < ultimo && aux.getCpf() > vetor[pos].getCpf()) {
            pos++;
        }
        if (pos == ultimo) { // insere final
            vetor[ultimo] = aux;
            ultimo++;
            return true;
        }
// insere no meio -> deslocamento para abrir a célula em pos
        for (int i = ultimo; i > pos; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[pos] = aux;
        ultimo++;
        return true;
    }

    public Contato pesquisa(Contato aux) {
        if (listaVazia()) {
            return null;
        }
// laço de busca
        int i = 0;
        while (i < ultimo && aux.getCpf() != vetor[i].getCpf()) {
            i++;
        }
// não encontrado
        if (i == ultimo) {
            return null;
        }
// encontrado (i < ultimo)
        Contato ret = new Contato(vetor[i].getNome(), vetor[i].getEndereco(), vetor[i].getCpf());
        return ret;
    }

    public Contato retira(Contato aux) {
        if (listaVazia()) {
            return null;
        }
// laço de busca
        int i = 0;
        while (i < ultimo && aux.getCpf() != vetor[i].getCpf()) {
            i++;
        }
// não encontrado
        if (i == ultimo) {
            return null;
        }
// encontrado (i < ultimo)
        Contato ret = vetor[i];
        ultimo--;
        for (int j = i; j < ultimo; j++) {
            vetor[j] = vetor[j + 1];
        }
        vetor[ultimo] = null;
        return ret;
    }

    public String getLista() {
        if (listaVazia()) {
            return "Lista vazia!\n";
        }
        String aux = "";
        for (int i = 0; i < ultimo; i++) {
            aux = aux + vetor[i].getContato() + "\n";
        }
        return aux;
    }
}
