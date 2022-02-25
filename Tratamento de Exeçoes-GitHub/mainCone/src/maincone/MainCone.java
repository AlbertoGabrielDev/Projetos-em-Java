package maincone;

import java.util.Scanner;

public class MainCone {

    static Scanner leia = new Scanner(System.in);

    static void obtemCone(Cone obj) throws Exception {
        double r, a;
        try {
            System.out.println("Digite a altura e o raio do cone: \n");
            r = leia.nextDouble();
            a = leia.nextDouble();
            obj.setRaio(r);
            obj.setAltura(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new Exception("Raio e altura do cone não definidos.");
        }
    }

    public static void main(String[] args) {
        int op;
        Cone obj = null;
        try {
            obj = new Cone(2.0, 2.0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        do {
            try {
                obtemCone(obj);
                System.out.println("Raio = " + obj.getRaio());
                System.out.println("Altura = " + obj.getAltura());
                System.out.println("Area Lateral = " + obj.areaLateral());
                System.out.println("Area Total = " + obj.areaTotal());
                System.out.println("Volume = " + obj.volume());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Digite 0 para encerrar ou outro inteiro para continuar.");
            op = leia.nextInt();
        } while (op != 0);
    }

}
