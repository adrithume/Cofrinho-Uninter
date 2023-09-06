package uninter;
//classe herdada de Moeda
public class Euro extends Moeda{

	public Euro() {}	

	public Euro(double valor) {
		super(valor);
	}

	@Override
	double converter() {
		return valor * 5.24;
	}

	@Override
	void info() {
		System.out.println("Valor convertido de Euro para Real: " + this.converter());		
	}

	@Override
	public String toString() {
		return "Euro: " + this.converter();
	}
}
