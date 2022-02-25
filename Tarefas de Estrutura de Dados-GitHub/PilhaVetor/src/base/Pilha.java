package base;

public class Pilha {

    private int topo, maxTam;
    private Contato vetor[];

    public int getMaxTam() {
        return maxTam;
    }

    public boolean setMaxTam(int tam) {
        if (tam < 2) {
            return false;
        }
        topo = 0;
        maxTam = tam;
        vetor = new Contato[maxTam];
        return true;
    }

    public Pilha() {
        maxTam = 2;
        topo = 0;
        vetor = new Contato[2];
    }

    public boolean pilhaCheia() {
        return topo == maxTam;
    }

    public boolean pilhaVazia() {
        return topo == 0;
    }

    public boolean push(Contato aux) {
        if (pilhaCheia()) {
            return false;
        }
        vetor[topo] = aux;
        topo++;
        return true;
    }

    public Contato pop() {
        if (pilhaVazia()) {
            return null;
        }
        topo--;
        Contato aux = vetor[topo];
        vetor[topo] = null;
        return aux;
    }
}
