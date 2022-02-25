package testaestoque02;

public class Estoque02 {

    private String descricao;
    private int prodNum;
    private int qde;
    private double preco;

    
    
    public String getDescricao() {
        
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getProdNum() {
        return prodNum;
    }

    public void setProdNum(int prodNum) {
        this.prodNum = prodNum;
    }

    public int getQde() {
        return qde;
    }

    public void setQde(int qde) {
        this.qde = qde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Estoque{" + "Descrição=" + descricao + ", Codigo do produto=" + prodNum + ", Quantidade=" + qde + ", Preço=" + preco + '}';
    }

}
