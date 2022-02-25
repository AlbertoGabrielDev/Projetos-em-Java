package testaequacao02;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestaEquacao02 {

    public static void main(String[] args)throws Exception {
        Scanner ler = new Scanner(System.in);
        Equacao02 aux = new Equacao02();
        int op = 0;
        int elementoA = 1;
        do {
            System.out.println("1- Para executar");
            System.out.println("2- Para encerrar");
            op = ler.nextInt();
            switch (op) {
                case 1:                                     
                    try {
                    System.out.println("Digite o valor de A");
                    elementoA = ler.nextInt();
                    System.out.println("Digite o valor de B:");
                    aux.setB(ler.nextInt());
                    System.out.println("Digite o valor de C:");
                    aux.setC(ler.nextInt());
                    if (elementoA <= 0) {
                        aux.setA(elementoA);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    throw new Exception("Elemento invalido");
                }
                aux.delta();
                try {
                    if (aux.getDelta() < 0 || aux.getA() == 0) {
                        throw new Exception("Impossivel calcular");
                    } else {
                        aux.x();
                        aux.x2();
                        System.out.printf("O valor de X e: %.2f \n", aux.getX());
                        System.out.printf("O valor de X2 e: %.2f \n", aux.getX2());
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }               
                break;
                case 2:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (op != 2);

    }

}
