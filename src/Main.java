class Main {
    //essa é a classe main, ondea a gente cria as arestas e vértices
     public static void main(String[] args) {
        Multigrafo g = new Multigrafo();

        // Legenda
        String[] nomes = {
            "Campanário", "Canhema", "Casa Grande", "Centro", "Eldorado",
            "Inamar", "Piraporinha", "Serraria", "Taboão", "Vila Conceição", "Vila Nogueira"
        };

        // Adiciona vértices
        for (String nome : nomes)
            g.adicionarVertice(nome);
        

        //adiciona arestas (linhas de ônibus)
        g.adicionarAresta("Campanário", "Centro", "26DP" );
        g.adicionarAresta("Campanário", "Centro", "25DP");
        g.adicionarAresta("Campanário", "Taboão", "26DP");
        g.adicionarAresta("Campanário", "Taboão", "25DP");

        g.adicionarAresta("Canhema", "Piraporinha", "25DP");
        g.adicionarAresta("Canhema", "Piraporinha", "26DP");
        g.adicionarAresta("Canhema", "Taboão", "26DP");
        g.adicionarAresta("Canhema", "Taboão", "25DP");

        g.adicionarAresta("Casa Grande", "Piraporinha", "20DP");
        g.adicionarAresta("Casa Grande", "Serraria", "20DP");
        g.adicionarAresta("Casa Grande", "Vila Conceição", "21DP");
        g.adicionarAresta("Casa Grande", "Vila Conceição", "22DP");
        g.adicionarAresta("Casa Grande", "Vila Nogueira", "21DP");
        g.adicionarAresta("Casa Grande", "Vila Nogueira", "22DP");

        g.adicionarAresta("Centro", "Serraria", "23DP");
        g.adicionarAresta("Centro", "Vila Conceição", "20DP");
        g.adicionarAresta("Centro", "Vila Conceição", "21DP");
        g.adicionarAresta("Centro", "Vila Conceição", "22DP");
        g.adicionarAresta("Centro", "Vila Conceição", "24DP");

        // Eldorado (5) → —
        // Inamar (6) → —

        g.adicionarAresta("Piraporinha", "Vila Conceição", "24DP");
        g.adicionarAresta("Piraporinha", "Vila Nogueira", "21DP");
        g.adicionarAresta("Piraporinha", "Vila Nogueira", "22DP");
        g.adicionarAresta("Piraporinha", "Vila Nogueira", "23DP");

        g.adicionarAresta("Serraria", "Vila Conceição", "20DP");
        g.adicionarAresta("Serraria", "Vila Conceição", "23DP");

        g.adicionarAresta("Vila Conceição", "Vila Nogueira", "23DP");


        // Imprimir
        g.imprimirGrafo();
    }
}
