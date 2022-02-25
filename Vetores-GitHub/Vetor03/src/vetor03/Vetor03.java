package vetor03;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("1- Executar");
            System.out.println("2- Encerrar");
            op = ler.nextInt();

            switch (op) {
                case 1:
                    base();
                   
                    break;
                case 2:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (op != 2);

    }

    public static void base() {
        Scanner ler = new Scanner(System.in);
        

        System.out.print("Insira o tamanho do Vetor A: ");
        int tamanhoVetorA = ler.nextInt();

        System.out.print("Insira o tamanho do Vetor B: ");
        int tamanhoVetorB = ler.nextInt();

        int[] vetorA = new int[tamanhoVetorA];
        int[] vetorB = new int[tamanhoVetorB];

        for (int contador = 0; contador < tamanhoVetorA; contador++) {
            System.out.print("Digite os números do Vetor A: ");
            vetorA[contador] = ler.nextInt();
        }
        for (int contador = 0; contador < tamanhoVetorB; contador++) {
            System.out.print("Digite os números do Vetor B: ");
            vetorB[contador] = ler.nextInt();
        }
        int[] vetorC = uniao(vetorA, vetorB);
        int[] vetorD = intersecao(vetorA, vetorB);

        System.out.println("Valores de A");
        System.out.println(Arrays.toString(vetorA));

        System.out.println("Valores de B");
        System.out.println(Arrays.toString(vetorB));

        System.out.println("União entre vetor A e vetor B é =");
        System.out.println(Arrays.toString(vetorC));

        System.out.println("A interseção dos valores é =");
        
        System.out.println(Arrays.toString(vetorD));
        
    }

    private static int[] intersecao(int[] vetorA, int[] vetorB) {
        int[] vetorAux = new int[vetorA.length + vetorB.length];
        int k = 0;

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[i] == vetorB[j]) {
                    vetorAux[k++] = vetorA[i];
                }
            }
        }
        int[] vetorD = new int[k];
        for (int i = 0; i < k; i++) {
            vetorD[i] = vetorAux[i];
        }

        return vetorD;
    }

    private static int[] uniao(int[] vetorA, int[] vetorB) {
        int vetorC[] = new int[vetorA.length + vetorB.length];
        int contK = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[contK++] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (!existe(vetorB[i], vetorC, contK)) {
                vetorC[contK++] = vetorB[i];
            }
        }
        vetorC = Arrays.copyOf(vetorC, contK);
        return vetorC;
    }

    private static boolean existe(int x, int[] vetorC, int k) {
        for (int i = 0; i < k; i++) {
            if (vetorC[i] == x) {
                return true;
            }
        }
        return false;
    }

}
