package grafo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		Grafo grafo = new Grafo();
		ArrayList adjc = new ArrayList(); // adjecências - vai corresponder a uma lista de vértices que representa o grafo

		System.out.println("Introduza o seu grafo como descrito no ficheiro README.md");
		String input = ler.nextLine();
		
		boolean dentro = false; // inicialização 
		ArrayList<Integer> vertices = new ArrayList<Integer>(); //
		for(int i = 1; i < input.length()-1; i++) {
			if(input.charAt(i) == '[') { //verifica se está dentro de uma lista de vértices
				dentro = true;
				vertices = new ArrayList<Integer>();
			}
			if (dentro) {
				if(Character.isDigit(input.charAt(i))) { 
					vertices.add(Integer.parseInt(String.valueOf(input.charAt(i))));//Conversão de char para inteiro
				}
				else if(input.charAt(i) == ']') { //verifica se já chegou ao fim da lista
					adjc.add(vertices); //adição da lista que avaliámos ao grafo
					dentro = false; 
				}
			}
		}
		
		grafo.setN(adjc.size());//número de vértices do grafo 
		grafo.setGrafo(adjc);

		if (grafo.isGrafoConexo()) { 
			if(grafo.isGrafoEuler()) {
				System.out.println("O grafo introduzido é euleriano");

			}else {
				System.out.println("O grafo introduzido não é euleriano");
			}

		}else {
		System.out.println("O grafo introduzido não é euleriano");
		}
		ler.close();
	}

}