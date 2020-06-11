package grafo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Grafo grafo = new Grafo();
		ArrayList adjc = new ArrayList(); // adjec�ncias
		
		System.out.println("Quantos v�rtices tem o grafo?");
		int n = ler.nextInt();
		grafo.setN(n);
		
		for (int i=1; i<= n ;i++) {
			ArrayList<Integer> arestas = new ArrayList<Integer>(); //arestas
			
			System.out.println("O v�rtice "+ i +" est� ligado a que outros v�rtices?");
			System.out.println("Insira os dados no formato v1,v2, ... vn, ex: 1,2,3,4");
			
			while (ler.hasNextInt()) {
				int v = ler.nextInt();
				arestas.add(v);
				
			}
			adjc.add(arestas);
		}
		
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
