
package classemain;


public class Cliente {
    private String nome;
    private int idade;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome= n;
    }
    public int getIdade(){
        return idade;
    }
    public boolean setIdade(int i){
        if (i<=0)return false; {
            idade= i;
            return true;
        }
        
    }
}
