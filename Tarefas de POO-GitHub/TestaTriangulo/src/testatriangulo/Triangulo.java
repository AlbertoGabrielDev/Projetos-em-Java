
package testatriangulo;


public class Triangulo {
    private double l1;
	private double l2;
	private double l3;
	// método construtor padrão
	public Triangulo() {
		l1 = l2 = l3 = 1.0;
	}
	// método construtor sobrecarregado
	public Triangulo(double a, double b, double c) throws Exception{
		if(a <= 0.0 || b <= 0.0 || c <= 0.0)
			throw new Exception("Valores negativos.\n");
		if(a+b>c && a+c>b && b+c>a) {
			l1 = a;
			l2 = b;
			l3 = c;
		}
		else throw new Exception("Valores não formam um triangulo.\n");
	}
	public void setTriangulo(double a, double b, double c) throws Exception{
		if(a <= 0.0 || b <= 0.0 || c <= 0.0)
			throw new Exception("Valores negativos.\n");
		if(a+b>c && a+c>b && b+c>a) {
			l1 = a;
			l2 = b;
			l3 = c;
		}
		else throw new Exception("Valores não formam um triangulo.\n");
	}
	public double getL1() {
		return l1;
	}
	public double getL2() {
		return l2;
	}
	public double getL3() {
		return l3;
	}
	public double area() {
		double sp = (l1+l2+l3)/2.0;
		double ar = Math.sqrt(sp * (sp-l1) * (sp-l2) * (sp-l3));
		return ar;
	}
	public String tipo() {
		String msg = "";
		// Tipo quanto aos lados
		if(l1==l2 && l2==l3) msg = "Triangulo equilátero.\n";
		else
			if(l1==l2 || l1==l3 || l2==l3) msg = "Triangulo isóceles.\n";
			else msg = "Triangulo escaleno.\n";
		// Tipo quanto aos angulos
		double h=0.0, c1=0.0, c2=0.0;
		// Definindo hipotenusa e catetos
		if(l1>=l2 && l1>=l3) { h = l1; c1 = l2; c2 = l3; }
		if(l2>=l1 && l2>=l3) { h = l2; c1 = l1; c2 = l3; }
		if(l3>=l1 && l3>=l2) { h = l3; c1 = l2; c2 = l1; }
		if(Math.pow(h, 2) == (Math.pow(c1, 2) + Math.pow(c2, 2))) msg = msg + "Triangulo retangulo.\n";
		if(Math.pow(h, 2) < (Math.pow(c1, 2) + Math.pow(c2, 2))) msg = msg + "Triangulo acutangulo.\n";
		if(Math.pow(h, 2) > (Math.pow(c1, 2) + Math.pow(c2, 2))) msg = msg + "Triangulo obtusangulo.\n";
		return msg;
	}
}
