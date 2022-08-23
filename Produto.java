public class Produto {
    String nomeProduto;
    double notaP;
    String partNumber;
    int quantidade;

    public Produto(String nomeProduto, double notaP, String partNumber, int quantidade){
        this.nomeProduto = nomeProduto;
        this.notaP = notaP;
        this.partNumber = partNumber;
        this.quantidade = quantidade;
    }

    void mostraInfo(){
        System.out.println("Nome do produto: " + this.nomeProduto);
        System.out.println("Avaliação do produto " + this.notaP);
        System.out.println("Numero de serie " + this.partNumber);
        System.out.println("Quantidade do produto " + this.quantidade);
    }
}
