public class Empresa {
    String nome;
    Produto[] produtos = new Produto[100];
    

    void mostraInfo(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println();
        System.out.println("Informação do produto: ");
        for (Produto produto : this.produtos) {
            if (produto != null)
                produto.mostraInfo();
        }
    }
    void adicionarProduto(Produto produto){
        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] == null){
                produtos[i] = produto;
                System.out.println("Produto adicionado!");
                break;
            }
        }
    }

    boolean comprarProduto(String partNumber){
        for (Produto produto : this.produtos) {
            if(produto != null){
                if(produto.partNumber.equals(partNumber)){
                    return true;
                }
            }
        }
        return false;
    }

}
