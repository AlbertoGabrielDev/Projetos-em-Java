package testacone02;

public class Cone02 {

    private int raio, altura;
    private double calculo;
    private double areat, areal, volume;

    Cone02() {
        int r= this.raio;
        int a= this.altura;
        
    }
    public double calculo(){
        this.calculo= (float) Math.sqrt((altura*altura)+(raio*raio));
     return calculo;   
    }
    public double areal(){
        this.areal= (float) (3.14*raio*calculo);
        return this.areal;
    }
    public double areat(){
        this.areat=(float) (3.14*raio*getCalculo()+raio);
        return areat;
    }
         public double volume(){
             this.volume=(float) ((1.0/3.0)*3.14*raio*raio*altura);
             return volume;
         }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getCalculo() {
        return calculo;
    }

    public double getAreat() {
        return areat;
    }

    public double getAreal() {
        return areal;
    }

    public double getVolume() {
        return volume;
    }

}
