package testacone02;

import java.util.Scanner;

public class TestaCone02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int op = 0;
        do {
            System.out.println("1- Executar");
            System.out.println("2- Encerrar");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    Cone02 aux = new Cone02();
                    System.out.println("Digite o valor do raio: ");
                    aux.setRaio(ler.nextInt());
                    System.out.println("Digite o valor da altura: ");
                    aux.setAltura(ler.nextInt());
                    aux.calculo();
                    aux.areal();
                    aux.areat();
                    aux.volume();
                    if (aux.getRaio() < 0 || aux.getAltura() < 0) {
                        System.out.println("Impossivel calcular");
                    } else {
                        System.out.printf("O valor do calculo e: %.2f \n", aux.getCalculo());
                        System.out.printf("O valor da area lateral e : %.2f \n", aux.getAreal());
                        System.out.printf("O valor da area total e : %.2f \n", aux.getAreat());
                        System.out.printf("O valor do volume e : %.2f \n", aux.getVolume());
                    }
                    break;
          case 2:
               System.out.println("Programa encerrado");
               break;
               
                default:
                    System.out.println("Opçao invalida!");
            }
            
            }while (op!=2);
    }
    

    }


