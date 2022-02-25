
package classemain;


public class Fila {
    private int tam;
    private int fim;
    private Cliente vetor[];
    public Fila(){
        tam= 2;
        fim= 0;
        vetor= new Cliente[2];
    }
public boolean filaVazia(){
    return fim==0;
}  
public boolean filaCheia(){
     return fim== tam;
 }
public int getTam(){
    return tam;
}
public boolean setTam(int t){
    if (t<2) return false;
        fim=0;
        tam= t;
        vetor= new Cliente[tam];
        return true;
        
}
 public boolean enfileirar(Cliente e){
        if (filaCheia()) return false;
            vetor[fim]= e;
           fim++;
        return true;
  }
public Cliente desenfileirar(){
    if(filaVazia()) return null;
    Cliente c= vetor[0];
    fim--;
    for (int i = 0; i < fim; i++) {
        vetor[i]= vetor[i+1];
    }
    vetor[fim]=null;
    return c;
}

}
