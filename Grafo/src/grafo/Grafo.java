package grafo;

import java.util.ArrayList;

public class Grafo {
	private int n; // n�mero de v�rtices

	private ArrayList<ArrayList<Integer>> grafo; // lista de lista de v�rices que representam o grafo

	public Grafo() {

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public ArrayList<ArrayList<Integer>> getGrafo() {
		return grafo;
	}

	public void setGrafo(ArrayList<ArrayList<Integer>> grafo) {
		this.grafo = grafo;
	}

	public boolean isGrafoEuler() { // verifica��o se o grau do grafo � par
		if (n == 0 || grafo == null) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (this.grafo.get(i).size() % 2 != 0) { //se o tamanho de determinada lista de v�rtices for impar o grafo n�o � euleriano
				return false;
			}

		}
		return true;
	}

	public boolean isGrafoConexo() { // verifica se o grafo � conexo.
		if (n == 0 || grafo == null) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (this.grafo.get(i).size() < 2) { //se n�o for conexo n�o pode ser euleriano
				return false;
			}

		}
		return true;
	}

}
