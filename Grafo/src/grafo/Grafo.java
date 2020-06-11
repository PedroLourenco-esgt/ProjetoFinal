package grafo;

import java.util.ArrayList;

public class Grafo {
	private int n; // número de vértices

	private ArrayList<ArrayList<Integer>> grafo; // constituição do grafo

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

	public boolean isGrafoEuler() { // verificação se o grau do grafo é par.
		if (n == 0 || grafo == null) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if (this.grafo.get(i).size() % 2 != 0) {
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
			if (this.grafo.get(i).size() < 2) {
				return false;
			}

		}
		return true;
	}

}
