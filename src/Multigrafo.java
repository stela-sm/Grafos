import java.util.*;
public class Multigrafo {

    // Cada vértice guarda uma lista de arestas que saem dele
    private Map<String, List<Aresta>> adjacencias = new HashMap<>();

    public void adicionarVertice(String nome) {
        adjacencias.putIfAbsent(nome, new ArrayList<>());
    }

    // Adiciona uma aresta entre dois vértices
    public void adicionarAresta(String v1, String v2, String nome) {
        Aresta a = new Aresta(nome, v1, v2);
        adjacencias.get(v1).add(a); 
        adjacencias.get(v2).add(a);
    }

    // Imprime o grafo de forma simples
    public void imprimirGrafo() {
        System.out.println("=== LISTA DE ADJACÊNCIA ===");
        
        for (String vertice : adjacencias.keySet()) {
            System.out.print(vertice + " -> "); // mostra o vértice
            List<Aresta> lista = adjacencias.get(vertice);

                List<String> conexoes = new ArrayList<>();
                for (Aresta a : lista) {
                    String outro = a.v1.equals(vertice) ? a.v2 : a.v1;
                    conexoes.add(outro + "(" + a.nome + ")");
                }
                System.out.println(String.join(", ", conexoes));
            }
        }
    }




