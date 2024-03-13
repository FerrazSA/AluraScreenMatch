public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalAvaliacao;
    int duracaoEmMinutos;

    int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        totalAvaliacao++;
    }

    double pegaMedia() {
        return somaDasAvaliacao/totalAvaliacao;
    }
}
