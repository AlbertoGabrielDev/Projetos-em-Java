package TestaTriangulo02;

import java.util.Scanner;

public class TestaTriangulo02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("1- Executar programa");
            System.out.println("2- Encerrar!");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Triangulo02 aux = new Triangulo02();
                    System.out.println("Digite o valor dos lados:");
                    aux.setA(ler.nextInt());
                    aux.setB(ler.nextInt());
                    aux.setC(ler.nextInt());  
                    if (aux.getA() < 0 && aux.getB() < 0 && aux.getC() < 0) {
                        System.out.println("Erro");
                    } else {
                    aux.triangulo2();
                    aux.triangulo3();
                    aux.sp();
                    aux.area();
                        System.out.printf("O SP e %.2f \n: " , aux.getSp());
                        System.out.printf("O calculo da area e: %.3f \n", aux.getArea());
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
