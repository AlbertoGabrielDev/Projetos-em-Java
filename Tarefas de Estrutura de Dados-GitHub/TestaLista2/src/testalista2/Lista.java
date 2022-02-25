package testalista2;

public class Lista {

    private int max, last;
    private Contato list[];

    public Lista() {
        max = last = 0;
        list = null;
    }

    public int getMaxTam() {
        return max;
    }

    public boolean setMaxTam(int aux) {
        if (aux < 2) {
            return false;
        }
        max = aux;
        last = 0;
        list = new Contato[max];
        return true;
    }

    public boolean listaVazia() {
        return last == 0;
    }

    public boolean listaCheia() {
        return last == max;
    }

    public boolean insereFinal(Contato aux) {
        if (listaCheia()) {
            return false;
        }
        int pos = 0;

        if (listaVazia()) {
            list[0] = aux;
            last++;

        } else {
            while (pos < last && aux.getCpf() > list[pos].getCpf()) {
                pos++;

            }
        }
        if (pos == last) {
            list[last] = aux;
            last++;
            return true;
        }

        return true;
    }

    public Contato pesquisa(Contato aux) {
        if (listaVazia()) {
            return null;
        }

        int i = 0;
        while (i < last && aux.getCpf() != list[i].getCpf()) {
            i++;
        }

        if (i == last) {
            return null;
        }

        Contato ret = new Contato(list[i].getNome(), list[i].getEndereco(), list[i].getCpf());
        return ret;
    }

    public Contato retira(Contato aux) {
        if (listaVazia()) {
            return null;
        }

        int i = 0;
        while (i < last && aux.getCpf() != list[i].getCpf()) {
            i++;
        }

        if (i == last) {
            return null;
        }

        Contato ret = list[i];
        last--;
        for (int j = i; j < last; j++) {
            list[j] = list[j + 1];
        }
        list[last] = null;
        return ret;
    }

    public String getLista() {
        if (listaVazia()) {
            return "Lista vazia!\n";
        }
        String aux = "";
        for (int i = 0; i < last; i++) {
            aux = aux + list[i].getContato() + "\n";
        }
        return aux;
    }
}
