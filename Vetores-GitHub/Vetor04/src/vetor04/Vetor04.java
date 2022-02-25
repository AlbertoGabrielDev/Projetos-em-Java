
package vetor04;

import java.util.Scanner;

public class Vetor04 {

   
    public static void main(String[] args) {
         Casa c = new Casa();
        Scanner ler = new Scanner (System.in);

        int mesa = -1; 
        int lugares;
       
            int op=0;
        do{
            System.out.println("1- Executar");
            System.out.println("2- Encerrar");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    try{  
                        
                System.out.print("Digite a mesa que deseja reservar: ");
                mesa = ler.nextInt();
                if(mesa == 0){
                    System.out.println("Programa finalizado");
                    continue;
                }while(mesa!=0)
                System.out.print("Digite a quantidade de lugares que deseja reservar:");
                lugares = ler.nextInt();
                if(c.fazerReserva(mesa, lugares)){
                    System.out.println("Mesa "+mesa+" com "+lugares+" lugares reservados.");
                }
                else{
                    System.out.println( "Não foi possível realizar a reserva.");
                }
            }catch(NumberFormatException nfex) {
                System.out.println(" números para reservar os lugares.");
            }
                    break;
                case 2:
                    System.out.println("Encerrado!");
                    break;
                default:
                    System.out.println("Opcao invalida");
                            break;
            }
            
        }while(op != 2);
    }
}
class Mesa{

    private boolean[] lugares;
    public Mesa(){
        lugares = new boolean[6];
    }
    public void setOcupado(int l){
        if (!lugares[l]) {
            lugares[l] = true;
        }
    }
    public int Length(){
        return lugares.length;
    }
    public int numeroDeReservas(){
        int aux = 0;
        for (int i = 0; i < lugares.length; i++) {
            if (lugares[i]) {
                aux++;
            }
        }
        return aux;
    }
    public boolean isFull(){
        int aux = 0;
        for (int i = 0; i < lugares.length; i++){
            if (lugares[i]) {
                aux++;
            }
        }
        if (aux == lugares.length){
            return true;
        }
        return false;
    }
    public boolean getOcupacao(int l){
        return lugares[l];
    }
    @Override
    public String toString(){
        String form = "";
        for (int i = 0; i < lugares.length; i++) {
            form += "Lugar " + (i + 1) + ": " + ((lugares[i]) ? "ocupado" : "livre") + "\n";
        }
        return form;
    }
}
class Casa {
    private Mesa[] mesas;
    public Casa(){
        mesas = new Mesa[40];
        for(int i = 0; i < mesas.length; i++){
            mesas[i] = new Mesa();
        }
    }
    public boolean fazerReserva(int mesa, int lugares){

        if(mesa <= 0 || mesa > 50)
            return false;
        else if(lugares <= 0 || lugares > 6)
            return false;
        Mesa m = mesas[mesa-1];
        if(m.isFull()){
            return false;
        }
        else{
            int[] aux = new int[m.Length()];
            for(int i = 0; i < aux.length; i++){
                aux[i] = -1;
            }
            int aux2 = 0;
            for(int i = 0; i < m.Length(); i++){
                if(aux2 == lugares){
                    break;
                }
                else{
                    if(!m.getOcupacao(i)){
                        aux[i] = i;
                        aux2++;
                    }
                }
            }
            if(lugares == aux2){
                for(int i = 0; i < aux.length; i++) {
                    if(aux[i] != -1)
                    {
                        m.setOcupado(aux[i]);
                    }
                }
                return true;
            }
            return false;
        }
    }
    @Override
    public String toString() {
        String form = "";

        for(int i = 0; i < mesas.length; i++) {
            form += "Mesa "+(i+1)+":"+"\n";
            form += mesas[i].toString();
        }
        return form;
    }
    
}
