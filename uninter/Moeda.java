package uninter;
//super classe abstrata 
public abstract class Moeda {

	double valor;

	public Moeda() {}

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	//método get do valor	
	public double getValor() {
		return valor;
	}
	//método abstrato converter
	abstract double converter();
	//método abstrato info
	abstract void info();
	//método abstrato para listar os objetos corretamente
	public abstract String toString();			
}
