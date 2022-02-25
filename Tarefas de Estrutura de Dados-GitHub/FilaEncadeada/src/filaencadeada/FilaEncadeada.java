
package filaencadeada;

import java.util.Scanner;
public class FilaEncadeada {

   private static Scanner ler= new Scanner(System.in);
   
   private static Cliente cl(){
    ler.skip("//R");
       System.out.println("Digite seu nome:");
       String n= ler.nextLine();
       System.out.println("Digite seu CPF:");
       String c= ler.nextLine();
       System.out.println("Digite seu telefone");
       String f= ler.nextLine();
       Cliente cliente= new Cliente(n,c,f);
       return cliente;    
   }
    
    public static void main(String[] args) {
       Fila fila= new Fila();
       int op= 0;
       Cliente cliente= null;      
       do{
           System.out.println("Informe:");
           System.out.println("1- Enfileirar");
           System.out.println("2- Desemfileirar");
           System.out.println("3- Encerrar");
           op= ler.nextInt();
           switch (op) {
               case 1:
                   cliente=cl();
                   fila.enfileirar(cliente);
                   System.out.println("Fila:" + fila.getTamanho());
                   cliente=null;
                   break;                   
               case 2: 
                   cliente= fila.desenfileirar();
                   if(cliente==null) System.out.println("Fila vazia");
                   else System.out.println(cliente.getCliente());
                   break;
                   
               case 3:    
                   System.out.println("Encerrado");                  
                   break;
               default:
                   System.out.println("Opçao invalida!");
           }
           
           
           
       
       }while(op!=3);
       
       
       
    }
    
}
