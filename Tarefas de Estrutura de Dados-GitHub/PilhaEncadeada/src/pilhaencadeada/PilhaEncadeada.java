package pilhaencadeada;

import java.util.Scanner;

public class PilhaEncadeada {

    private static Scanner leia = new Scanner(System.in);

    private static Livro obtemLivro() {
        leia.skip("\\R");
        System.out.println("Título do livro: ");
        String l = leia.nextLine();
        System.out.println("Autor do livro: ");
        String a = leia.nextLine();
        System.out.println("Editora do livro: ");
        String e = leia.nextLine();
        Livro aux = new Livro(l, a, e);
        return aux;
    }

    public static void main(String[] args) {
        Pilha obj = new Pilha();
        Livro aux = null;
        int op = 0;
        do {
            System.out.println("Digite:");
            System.out.println("1: para empilhar um livro.");
            System.out.println("2: para desempilhar um livro.");
            System.out.println("3: para encerrar.");
            op = leia.nextInt();
            switch (op) {
                case 1: // empilhar
                    aux = obtemLivro();
                    obj.push(aux);
                    aux = null;
                    break;
                case 2: // desempilhar
                    aux = obj.pop();
                    if (aux == null) {
                        System.out.println("Pilha vazia.");
                    } else {
                        System.out.println(aux.getLivro());
                    }
                    aux = null;
                    break;
                case 3: // encerrar
                    System.out.println("Programa encerrando.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 3);
    }
}


