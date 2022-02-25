
package ListaEncadeada;


public class itemCompra {
    private String descricao;
    private int quantidade;
    private Double preco;
    public itemCompra(String d, int qde, Double pc){
        descricao = d;
        quantidade = qde;
        preco = pc;

    }

    public String getDescricao() {
        return descricao;
    }
    public String getItemCompra(){
        String aux = descricao + "\n" +quantidade+ "\n"+preco+ "\n";
        return aux;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        if (quantidade<0) return false; {
            return true;
        }
        
    }

    public double setPreco(Double preco) {
        this.preco = preco;
        return preco;
    }
    
    
    
}
