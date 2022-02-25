package TestaTriangulo02;

public class Triangulo02 {

    private int A, B, C;
    private double area, sp;
    private int triangulo2, triangulo3;

    Triangulo02() {
        int a = A;
        int b = B;
        int c = C;
    }

    public void triangulo2() {
        if (A != B && B != C && A != C) {
            System.out.println("O triangulo e: Escaleno");
        } else if (A == B && B == C && A == C) {
            System.out.println("O triangulo e: Equilátero");
        } else {
            System.out.println("O triangulo e: Isósceles");
        }

    }

    public void triangulo3() {
        if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("O triangulo angulo e: Acutângulo");
        } else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("O triangulo angulo e: Obtusângulo");
        } else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
            System.out.println("O triangulo angulo e: Retângulo");
        }
    }

    public double sp() {
        this.sp = ((A + B + C)/2);
        return sp;
    }

    public double area() {
        this.area =(Math.sqrt(this.sp * (this.sp - A) * (this.sp - B) * (this.sp - C)));
        return area;
    }

    public double getArea() {
        return area;
    }

    public double getSp() {
        return sp;
    }

    public int getTriangulo2() {
        return triangulo2;
    }

    public int getTriangulo3() {
        return triangulo3;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }
}
