
package filaencadeada;


public class Cliente {
    private String nome;
    private String cpf;
    private String fone;
    
    public String getCliente(){
    return (nome + "\n" + cpf + "\n" + fone + "\n");    
}
    public Cliente(String n, String c, String f ){
        this.nome= n;
        this.cpf= c;
        this.fone= f;
    }
    
}
