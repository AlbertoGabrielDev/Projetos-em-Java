package base;

import java.util.Scanner;

public class Base {

    static Scanner leia = new Scanner(System.in);

    static Contato criarContato() {
        String n, e;
        long c;
        System.out.println("CPF: ");
        c = leia.nextLong();
        leia.skip("\\R");
        System.out.println("Nome: ");
        n = leia.nextLine();
        System.out.println("Endereço: ");
        e = leia.nextLine();
        Contato aux = new Contato(n, e, c);
        return aux;
    }
  public static void main(String[] args) {
        int op;
        Contato aux = null;
        Pilha pilha = new Pilha();
        do {
            System.out.println("Tamanho da pilha: ");
            op = leia.nextInt();
        } while (!pilha.setMaxTam(op));
        do {
            System.out.println("Digite:");
            System.out.println("1 - Empilhar.");
            System.out.println("2 - Desempilhar.");
            System.out.println("3 - Encerrar");
            op = leia.nextInt();
            switch (op) {
                case 1: 
                    aux = criarContato();
                    if (pilha.push(aux)) {
                        System.out.println("Sucesso.");
                    } else {
                        System.out.println("Erro: pilha cheia.");
                    }
                    aux = null;
                    break;
                case 2: 
                    aux = pilha.pop();
                    if (aux == null) {
                        System.out.println("Pilha vazia.");
                    } else {
                        System.out.println("Nome: " + aux.getNome());
                        System.out.println("Endereço: " + aux.getEndereco());
                        System.out.println("CPF: " + aux.getCpf());
                    }
                    aux = null;
                    break;
                case 3:
                    System.out.println("Finalizadi.");
            }
        } while (op != 3);

    }
}
