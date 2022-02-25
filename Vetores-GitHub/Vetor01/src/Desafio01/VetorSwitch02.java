package Desafio01;

import java.util.Scanner;

public class VetorSwitch02 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        System.out.println("MENU");
        System.out.println("1 - Executar programa");
        System.out.println("2 - Encerrar programa");
        opcao = ler.nextInt();

        switch (opcao) {
          
            case 1:
                executarProgama();
                break;
            
            case 2:
                System.out.println("Programa encerrado!");
                break;

            default:
                System.out.println("Opção inexistente! ");
                menu();
        }

    }

    public static void executarProgama() {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores A e B:");
        System.out.print("A: ");
        int da = ler.nextInt();
        System.out.print("B: ");
        int db = ler.nextInt();
        double[] A = new double[da];
        double[] B = new double[db];
        int dc = da;
        double[] C = new double[dc];
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < da; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = ler.nextDouble();
        }
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < db; i++) {
            System.out.printf("B[%d] = ", i);
            B[i] = ler.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < db; i++) {
            soma = soma + B[i];
        }
        for (int i = 0; i < dc; i++) { 
            C[i] = A[i] * soma;
        }
        System.out.print("A = {\t");
        for (int i = 0; i < da; i++) { 
            System.out.printf("%f\t", A[i]);
        }
        System.out.println("}\n");
        System.out.print("B = {\t");
        for (int i = 0; i < db; i++) { 
            System.out.printf("%f\t", B[i]);
        }
        System.out.println("}\n");
        System.out.print("C = {\t");
        for (int i = 0; i < dc; i++) { 
            System.out.printf("%f\t", C[i]);
        }
        System.out.println("");
        System.out.println("*************************************");
        menu();
    }

}
