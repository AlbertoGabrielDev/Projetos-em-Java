
package tarefa0002;

import java.util.Scanner;


public class Tarefa0002 {

    
    public static void main(String[] args) {
      menu();
      
    }
    public static void menu(){
        Scanner ler  = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("MENU");
        System.out.println("1 - Executar programa");
        System.out.println("2 - Encerrar programa");
        opcao = ler.nextInt();
        switch (opcao) {
            //opção para execução do programa
            case 1:
                executarProgama();
                break;
            // opção para finalização do programa    
            case 2:
                System.out.println("Programa encerrado!");
                break;
                
            default:
                System.out.println("Opção inexistente! ");
                menu();
        }
    }
     static void executarProgama() {
         Scanner ler  = new Scanner(System.in);
        System.out.println("Digite os tamanho dos vetores A e B");
            int da=ler.nextInt();
            int db= ler.nextInt();
            double vet1[]= new double[da];
            double vet2[]= new double[db];
            System.out.println("O tamanho do vetor A e:" + da);
            System.out.println("O tamanho do vetor B e:" + db);
            if (da==db) {
                int dc;
                dc=da+db;
                System.out.println("O tamanho do vetor C e:" + dc);
                
        System.out.println("");
        System.out.println("*************************************");
        menu();
    }
    }
}
