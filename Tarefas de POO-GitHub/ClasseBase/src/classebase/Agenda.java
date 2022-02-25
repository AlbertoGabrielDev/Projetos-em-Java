
package classebase;


public class Agenda {
     private int maxTam, ultimo;
    private Contato[] contato;
    /*
        *METODOS DE VALIDAÇÃO
    */
    public Agenda() {
        maxTam = ultimo = 0;
        contato = null;
    }
    /*
        *METODO DE VARIFICAÇÃO - VERIFICA TAMANHO DA LISTA PARA VALIDAÇÃO
    */
    public int getTamAgenda() {
        return maxTam;
    }
    /*
        *METODOS DE VALIDAÇÃO - DETERMINAR TAMANHO DA LISTA DA AGENDA
    */
    public boolean setTamAgenda(int aux) {
        if (aux < 2) {
            return false;
        }
        maxTam = aux;
        ultimo = 0;
        contato = new Contato[maxTam];
        return true;
    }
    /*
        *METODOS DE VALIDAÇÃO - VERIFICA SE LISTA ESTÁ VAZIA
    */
    public boolean listaVazia() {
        return ultimo == 0;
    }
    /*
        *METODOS DE VALIDAÇÃO - VERIFICA SE LISTA ESTÁ CHEIA
    */
    public boolean listaCheia() {
        return ultimo == maxTam;
    }
    /*
        *ADICIONAR CONTATO NA AGENDA
    */
    public boolean setContato(Contato aux) {
        if (listaCheia()) {
            return false;
        }
            contato[ultimo] = aux;
            ultimo++;
            return true;
    }
    /*
        *PESQUISAR DETERMINADO CONTATO NA AGENDA
        *
    */
    public Contato pesquisarContato(Contato aux) {
        if (listaVazia()) {
            return null;
        }
// laço de busca
        int i = 0;
        while (i < ultimo && !aux.getTelefone().equals(contato[i].getTelefone())) {
            i++;
        }
// não encontrado
        if (i == ultimo) {
            return null;
        }
// encontrado (i < ultimo)
        Contato ret = new Contato(contato[i].getNome(), contato[i].getEmail(), contato[i].getTelefone());
        return ret;
    }
    /*
     * EXCLUIR CONTATO NA AGENDA
     */
    public Contato excluirContato(Contato aux) {
        if (listaVazia()) {
            return null;
        }
// laço de busca
        int i = 0;

        while (i < ultimo && !aux.getTelefone().equals(contato[i].getTelefone()) ) {
            i++;
        }
// se não for encontrado
        if (i == ultimo) {
            return null;
        }
// se for encontrado (i < ultimo)
        Contato ret = contato[i];
        ultimo--;
        for (int j = i; j < ultimo; j++) {
            contato[j] = contato[j + 1];
        }
        contato[ultimo] = null;
        return ret;
    }
    /*
        *IMPRESSÃO DE TODOS OS CONTATOS DA LISTA   
        *
    */
    public String getContato() {
        if (listaVazia()) {
            return "Lista vazia!\n";
        }
        String aux = "";
        for (int i = 0; i < ultimo; i++) {
            aux = aux + contato[i].toString() + "\n";
        }
        return aux;
    }
  
    }


