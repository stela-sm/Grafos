//aqui é a classe aresta, onde a gente define o v1 (vértice 1) e v2 (vértice 2), e o nome (no caso são as linhas de ônibus)
class Aresta {
    String nome;
    String v1;
    String v2;

    public Aresta(String nome, String v1, String v2) {
        this.nome = nome;
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return String.format("%s(%s - %s)", nome, v1, v2);
    }
}