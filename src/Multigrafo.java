import java.util.*;
//aqui é a classe multigrafo, onde  gente cria o método adicionarAresta, o hashmap, e o imprimirGrafo
public class Multigrafo {
      private Map<String, List<Aresta>> adjacencias = new HashMap<>();
   
    public void adicionarVertice(String nome) {
        adjacencias.putIfAbsent(nome, new ArrayList<>());
    }

    public void adicionarAresta(String v1, String v2, String nome) {
        Aresta a = new Aresta(nome, v1, v2);
        adjacencias.get(v1).add(a);
        adjacencias.get(v2).add(a);
    }

  public void imprimirGrafo() {
    System.out.println("=== LISTA DE ADJACÊNCIA ===\n");

    
    int maxLen = adjacencias.keySet().stream()
            .mapToInt(String::length)
            .max()
            .orElse(10);

    for (String vertice : new TreeSet<>(adjacencias.keySet())) { 
        List<Aresta> lista = adjacencias.get(vertice);

        System.out.printf("%-" + (maxLen + 2) + "s -> ", vertice);

        if (lista.isEmpty()) {
            System.out.println("(sem conexões)");
        } else {
            List<String> conexoes = new ArrayList<>();
            for (Aresta a : lista) {
                String outro = a.v1.equals(vertice) ? a.v2 : a.v1;
                conexoes.add(outro + "(" + a.nome + ")");
            }
            System.out.println(String.join(", ", conexoes));
        }
    }
}




}
