import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empresa E1 = new Empresa();
        E1.nome = "Empresa";

        boolean flag = true;
        while(flag){
            System.out.println("Bem-vindo ao menu de informações:");
            System.out.println("1 - Adicionar um produto.");
            System.out.println("2 - Mostrar as informações da Empresa e dos produtos.");
            System.out.println("3 - Comprar um produto.");
            System.out.println("4 - Para sair do menu.");
            int op = input.nextInt();
            switch (op){
                case 1:
                    System.out.println("Entre com o nome do produto:");
                    input.nextLine();
                    String nomeProduto = input.nextLine();
                    System.out.println("Entre com a nota");
                    double notaP = input.nextInt();
                    System.out.println("Entre com o numero de serie");
                    input.nextLine();
                    String partNumber = input.nextLine();
                    System.out.println("Entre com a quantidade");
                    int quantidade = input.nextInt();
                    Produto l = new Produto(nomeProduto, notaP, partNumber, quantidade);
                    E1.adicionarProduto(l);
                    break;
                case 2:
                    E1.mostraInfo();
                    break;
                case 3:
                    System.out.println("Entre com o nome do numero de serie do produto: ");
                    input.nextLine();
                    partNumber = input.nextLine();
                    if(E1.comprarProduto(partNumber)){
                        System.out.println("O produto " + partNumber + " foi vendido com sucesso.");
                    }
                    else{
                        System.out.println("O produto não existe");
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }


    }
}
