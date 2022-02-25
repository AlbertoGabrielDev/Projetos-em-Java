package ListaEncadeada;

import java.util.Scanner;

public class ListaEncadeada {

    Scanner ler = new Scanner(System.in);

    private itemCompra Compra() {
        ler.skip("//R");
        System.out.println("Descreva o produto:");
        String d = ler.nextLine();
        System.out.println("Digite a quantidade");
        int qde = ler.nextInt();
        System.out.println("Informe o preço");
        double pc = ler.nextDouble();
        itemCompra compra = new itemCompra(d, qde, pc);
        return compra;
    }

    public void main(String[] args) {
        Lista l = new Lista();
        int op = 0;
        itemCompra aux = null;
        do {
            System.out.println("Tamanho da Lista: ");
            op = ler.nextInt();
            
        } while (l.setTam(op));
            
        do {
            System.out.println("1- Inserir");
            System.out.println("2- Retirar");
            System.out.println("3- Buscar");
            System.out.println("4- Encerrar");
            switch (op) {
                case 1:
                    aux = Compra();
                    if(l.inserirInicio(aux)) System.out.println("Sucesso");
                    else System.out.println("Erro");
                    aux=null;
                    break;
                case 2:
                    aux= Compra();
                    aux = l.retirar(aux);
                    if (aux == null) {
                        System.out.println("Vazio");
                    } else {
                        System.out.println("Descricao, Quantidade, Preco:" + aux.getDescricao());
                        
                    }
                    aux=null;
                    break;
                case 3:
                    aux= Compra();
                    aux= l.search(aux);
                    if(aux==null)   System.out.println("Erro. Contato inexistente");
                    else{
                        System.out.println("Descricao, Quantidade, Preco:" + aux.getItemCompra());
                    }
                    break;
                case 4:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opcao inesistente");
                    break;
            }
        } while (op!=4);

    }

}
