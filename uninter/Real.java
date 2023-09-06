package uninter;
//classe herdada de Moeda
public class Real extends Moeda{

	public Real() {}

	public Real(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return valor;
	}

	@Override
	void info() {
		System.out.println("Não é preciso fazer a conversão desta moeda.");
	}

	@Override
	public String toString() {
		return "Real: " + this.converter();
	}
}
