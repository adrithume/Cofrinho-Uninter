package uninter;

import java.util.ArrayList;

public class Cofrinho {
	//array de moedas
	private ArrayList<Moeda> listaMoedas = new ArrayList<>();
	//método para adicionar moedas ao cofrinho
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	//método para remover moedas do cofrinho
	public void remover(double valor) {
		for(Moeda m : listaMoedas) {
			if(m.getValor() == valor) {
				listaMoedas.remove(m);
				return;
			}
		}
	}
	//método para listar as moedas
	public void listagemMoedas() {
		for(Moeda m : listaMoedas) {
			System.out.println(m);
		}
	}
	//método para somar total convertido
	public double totalConvertido() {
		double total = 0;
		for(Moeda m : listaMoedas) {
			total += m.converter();
		}
		System.out.println("Total de moedas: "+ total);
		return total;
	}
}
