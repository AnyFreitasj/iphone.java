import java.util.InputMismatchException;
import java.util.Scanner;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Reproduzir música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("4. Ligar");
            System.out.println("5. Atender chamada");
            System.out.println("6. Iniciar correio de voz");
            System.out.println("7. Exibir página na internet");
            System.out.println("8. Adicionar nova aba");
            System.out.println("9. Atualizar página");
            System.out.println("10. Sair");
            System.out.print("Opção: ");

            int opcao = -1;
            while (true) {
                try {
                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    scanner.nextLine(); // Consumir a entrada inválida
                    System.out.print("Opção: ");
                }
            }

            switch (opcao) {
                case 1:
                    meuIPhone.tocar();
                    break;
                case 2:
                    meuIPhone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    meuIPhone.selecionarMusica(musica);
                    break;
                case 4:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    meuIPhone.ligar(numero);
                    break;
                case 5:
                    meuIPhone.atender();
                    break;
                case 6:
                    meuIPhone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    meuIPhone.exibirPagina(url);
                    break;
                case 8:
                    meuIPhone.adicionarNovaAba();
                    break;
                case 9:
                    meuIPhone.atualizarPagina();
                    break;
                case 10:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
