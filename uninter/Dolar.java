package uninter;
//classe herdada de Moeda
public class Dolar extends Moeda{

	public Dolar() {}

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return valor * 4.80;
	}

	@Override
	void info() {
		System.out.println("Valor convertido de Dólar para Real: " + this.converter());		
	}

	@Override
	public String toString() {
		return "Dólar: " + this.converter();
	}
}
