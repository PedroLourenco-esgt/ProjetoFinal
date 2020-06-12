package grafo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		Grafo grafo = new Grafo();
		ArrayList adjc = new ArrayList(); // adjec�ncias - vai corresponder a uma lista de v�rtices que representa o grafo

		System.out.println("Introduza o seu grafo como descrito no ficheiro README.md");
		String input = ler.nextLine();
		
		boolean dentro = false; // inicializa��o 
		ArrayList<Integer> vertices = new ArrayList<Integer>(); //
		for(int i = 1; i < input.length()-1; i++) {
			if(input.charAt(i) == '[') { //verifica se est� dentro de uma lista de v�rtices
				dentro = true;
				vertices = new ArrayList<Integer>();
			}
			if (dentro) {
				if(Character.isDigit(input.charAt(i))) { 
					vertices.add(Integer.parseInt(String.valueOf(input.charAt(i))));//Convers�o de char para inteiro
				}
				else if(input.charAt(i) == ']') { //verifica se j� chegou ao fim da lista
					adjc.add(vertices); //adi��o da lista que avali�mos ao grafo
					dentro = false; 
				}
			}
		}
		
		grafo.setN(adjc.size());//n�mero de v�rtices do grafo 
		grafo.setGrafo(adjc);

		if (grafo.isGrafoConexo()) { 
			if(grafo.isGrafoEuler()) {
				System.out.println("O grafo introduzido � euleriano");

			}else {
				System.out.println("O grafo introduzido n�o � euleriano");
			}

		}else {
		System.out.println("O grafo introduzido n�o � euleriano");
		}
		ler.close();
	}

}