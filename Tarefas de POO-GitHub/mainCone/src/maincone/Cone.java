package maincone;
public class Cone {
    private double raio, altura;
	Cone(){
		raio = 1.0;
		altura = 1.0;
	}
	Cone(double r, double a) throws Exception{ 
		if(r <= 0.0 || a <= 0.0) {
			String msg = "O raio ou a altura fornecidos do cone são <= a zero.";
			throw new Exception(msg);
		}
		raio = r;
		altura = a;
	}
	void setRaio(double r) throws Exception{
		if(r <= 0.0) {
			String msg = "O raio do cone não pode ser zero ou negativo.";
			throw new Exception(msg);
		}
		raio = r;
	}
	void setAltura(double a) throws Exception{
		if(a <= 0.0) {
			String msg = "O altura cone não pode ser zero ou negativo.";
			throw new Exception(msg);
		}
		altura = a;
	}
	double getRaio(){
		return raio;
	}
	double getAltura(){
		return altura;
	}
	private double geratriz() {
		double ger = (Math.sqrt((altura*altura)+(raio*raio)));
		return ger;
	}
	double areaLateral(){
		double al = (3.1459*raio*geratriz());
		return al;
	}
	double areaTotal(){
		double at = (3.1459*raio*(geratriz()+raio));
		return at;
	}
	double volume(){
		double vl = (1.0/3.0*3.1459*raio*raio*altura);
		return vl;
	}
}
