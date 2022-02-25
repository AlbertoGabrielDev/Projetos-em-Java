
package classebase;

import java.util.Scanner;


public class ClasseBase {

   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int op;
        Contato aux = null;
        Agenda agenda = new Agenda();
        do {
            System.out.println("Adicione ate 256 contatos. ");
            op = 256;
        } while (!agenda.setTamAgenda(op));
        do {
            System.out.println("Digite:");
            System.out.println("1 - Inserir um Contato.");
            System.out.println("2 - Remover um Contao.");
            System.out.println("3 - Buscar um Contao.");
            System.out.println("4 - Mostrar Agenda.");
            System.out.println("5 - Encerrar o programa.");
            op = leia.nextInt();
            switch (op) {
                //INSERIR CONTATO NA AGENDA
                case 1: 
                    aux = criarContato();
                    if (agenda.setContato(aux)) {
                        System.out.println("Sucesso!");
                    } else {
                        System.out.println("Erro: Lista cheia.");
                    }
                    aux = null;
                    break;
                //EXCLUIR CONTATO NA AGENDA 
                case 2:
                    aux = criarContato();
                    aux = agenda.excluirContato(aux);
                    if (aux == null) {
                        System.out.println("Erro: contato inexistente.");
                    } else {
                        System.out.println("Nome: " + aux.getNome());
                        System.out.println("e-mail: " + aux.getEmail());
                        System.out.println("Telefone: " + aux.getTelefone());
                    }
                aux = null;
                    break;
                    //BUSCAR CONTATO NA AGENDA
                case 3: 
                    aux = criarContato();
                    aux = agenda.pesquisarContato(aux);
                    if (aux == null) {
                        System.out.println("Erro: contato inexistente.");
                    } else {
                        System.out.println("Nome: " + aux.getNome());
                        System.out.println("e-mail: " + aux.getEmail());
                        System.out.println("Telefone: " + aux.getTelefone());
                    }
                    aux = null;
                    break;
                //EXIBIR AGENDA    
                case 4:
                    System.out.println(agenda.getContato());
                    break;
                    //FINALIZAR PROGRAMA
                case 5:
                    System.out.println("Programa encerrando!");
            }
        } while (op != 5);
    }
    
    //METODO PARA CRIAÇÃO DO CONTATO
    public static Contato criarContato() {
        Scanner leia = new Scanner(System.in);
        String n, e, t;
        System.out.println("INFORME:");
        System.out.print("Nome: ");
        n = leia.nextLine();
        System.out.print("E-mail: ");
        e = leia.nextLine();
        System.out.print("Telefone: ");
        t = leia.nextLine();

        Contato aux = new Contato(n, e, t);
        return aux;
    }
        
    }
    

