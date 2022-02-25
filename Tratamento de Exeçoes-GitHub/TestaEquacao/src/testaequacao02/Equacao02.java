package testaequacao02;
public class Equacao02 {
  private double A; 
   private double B;
   private double C; 
   private double delta,x,x2;

   public double delta(){
       delta=(Math.pow(B,2)-(4*A*C));
       return delta;
    }
        
       public double x(){
          x=(-B+Math.sqrt(delta))/2*A;
          return x;
       }
        public double x2(){
          x2=(-B-Math.sqrt(delta))/2*A;
            return x2;
        }

    public double getDelta() {
        return delta;
    }

    public double getX() {
        return x;
    }

    public double getX2() {
        return x2;
    }
        
        
    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }
    
}
