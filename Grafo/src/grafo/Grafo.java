package grafo;

import java.util.ArrayList;

public class Grafo {
	private int n; // número de vértices

	private ArrayList<ArrayList<Integer>> grafo; // lista de lista de vérices que representam o grafo

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

	public boolean isGrafoEuler() { // verificação se o grau do grafo é par
		if (n == 0 || grafo == null) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (this.grafo.get(i).size() % 2 != 0) { //se o tamanho de determinada lista de vértices for impar o grafo não é euleriano
				return false;
			}

		}
		return true;
	}

	public boolean isGrafoConexo() { // verifica se o grafo é conexo.
		if (n == 0 || grafo == null) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (this.grafo.get(i).size() < 2) { //se não for conexo não pode ser euleriano
				return false;
			}

		}
		return true;
	}

}
