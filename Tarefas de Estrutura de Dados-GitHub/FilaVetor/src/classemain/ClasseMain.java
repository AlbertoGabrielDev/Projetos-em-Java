package classemain;

import java.util.Scanner;

public class ClasseMain {

    private static Scanner leia = new Scanner(System.in);
 private static Cliente criarCliente() {
        Cliente aux = new Cliente();
        System.out.println("Nome: ");
        leia.skip("\\R");
        String n = leia.nextLine();
        aux.setNome(n);
        int i;
        do {
            System.out.println("Idade: ");
            i = leia.nextInt();
        } while (!aux.setIdade(i));
        return aux;
    }
 private static Fila mostrarFila(Fila orig) {
        Fila aux = new Fila();
        aux.setTam(orig.getTam());
        Cliente cli;
        while (!orig.filaVazia()) {
            cli = orig.desenfileirar();
            System.out.println(cli.getNome() + "\n" + cli.getIdade());
            aux.enfileirar(cli);
        }
        return aux;
    }

    public static void main(String[] args) {
        Fila obj = new Fila();
        int op;
        do {
            System.out.println("Tamanho da fila: ");
            op = leia.nextInt();
        } while (!obj.setTam(op));
        Cliente aux;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Enfileirar");
            System.out.println("2 - Desenfileirar ");
            System.out.println("3 - Pratilheira");
            System.out.println("4 - Encerrar");
            op = leia.nextInt();
            switch (op) {
                case 1:// enfileirar
                    aux = criarCliente();
                    if (obj.enfileirar(aux)) {
                        System.out.println("Feito");
                    } else {
                        System.out.println("Fila cheia!");
                    }
                    aux = null;
                    break;
                case 2: //desenfileirar
                    aux = obj.desenfileirar();
                    if (aux == null) {
                        System.out.println("Fila vazia!");
                    } else {
                        System.out.println("Desenfileirado");
                        System.out.println(aux.getNome() + "\n" + aux.getIdade());
                    }
                    break;
                case 3: // mostrar fila
                    obj = mostrarFila(obj);
                    break;
                case 4: // ecerrar programa
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 4);

    }

}
