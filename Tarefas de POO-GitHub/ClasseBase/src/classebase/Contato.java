
package classebase;


public class Contato {
   private String nome;
    private String email;
    private String telefone;
    
    //CONSTRUTOR PARA METODO DE BUSCA NA CLASSE AGENDA
    public Contato(String name, String email, String tel){
        this.nome = name;
        this.email = email;
        this.telefone = tel;
    }
    //METODOS GETs E SETs

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //METODO PARA MOSTRAR TODOS OS CONTATOS
    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", email=" + email + ", telefone=" + telefone + '}';
    }
    
    
    
}
