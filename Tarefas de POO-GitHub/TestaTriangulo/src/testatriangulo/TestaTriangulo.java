package testatriangulo;

import java.util.Scanner;

public class TestaTriangulo {

    static Scanner leia = new Scanner(System.in);

    static void obtemTriangulo(Triangulo aux) throws Exception {
        System.out.println("Digite os 3 lados do triangulo.");
        double a = leia.nextDouble();
        double b = leia.nextDouble();
        double c = leia.nextDouble();
        try {
            aux.setTriangulo(a, b, c);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Triangulo obj = null;
        try {
            obj = new Triangulo(2.0, 2.0, 2.0);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        int op = 0;
        do {
            try {
                obtemTriangulo(obj);
                System.out.println("O triangulo com lados: " + obj.getL1() + ", " + obj.getL2() + " e " + obj.getL3());
                System.out.println(obj.tipo());
                System.out.println("Tem área = " + obj.area());
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
            }
            System.out.println("Digite 0 para encerrar ou outro inteiro para continuar.");
            op = leia.nextInt();
        } while (op != 0);
    }

}
