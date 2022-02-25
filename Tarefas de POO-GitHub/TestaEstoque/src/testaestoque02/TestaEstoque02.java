package testaestoque02;

import java.util.Scanner;

public class TestaEstoque02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Estoque02 aux = new Estoque02();
        int op = 0;
        int elementoA=1;
        String elementoB="";
        int elementoC=1;
        int elementoD=1;
        do {
            System.out.println("1- Para executar");
            System.out.println("2- Para encerrar");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    try{
                    System.out.println("Insira o codigo do produto:");
                    elementoA= ler.nextInt();
                    System.out.println("Descreva o produto desejavel:");
                    elementoB=ler.nextLine();
                    System.out.println("Insira a quantidade:");
                    elementoC=ler.nextInt();
                    System.out.println("Informe o preço do produto:");
                    elementoD= ler.nextInt();
                    System.out.println("----------------------------");
                    System.out.println("Item: " + aux.toString());
                        if (elementoA<=0|| elementoC<=0|| elementoD<=0 ) {
                            aux.setProdNum(elementoA); 
                            aux.setProdNum(elementoC);
                            aux.setProdNum(elementoD);
                            throw new Exception("Erro");
                        }                      
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                       
                    }
                    
                    break;
                case 2:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opçao invalida!");
                    break;
            }

        } while (op != 2);

    }

}
