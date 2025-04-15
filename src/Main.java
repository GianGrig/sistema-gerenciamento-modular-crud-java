import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> epi = new ArrayList<>();
    static ArrayList<String> funcionario = new ArrayList<>();
    static ArrayList<String> emprestimo = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== Sistema Gerenciamento ===");
            System.out.println("1. Módulo de EPIs.");
            System.out.println("2. Módulo de Funcionários.");
            System.out.println("3. Módulo de Empréstimos.");
            System.out.println("0. Sair.");
            System.out.print("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> executarModulos("EPIs", epi);
                break;
                case 2 -> executarModulos("Funcionários", funcionario);
                break;
                case 3 -> executarModulos("Empréstimos", emprestimo);
                break;
                case 0 -> System.out.println("Saindo...");
                break;
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void executarModulos(String nomeModulo, ArrayList<String> lista) {
        int opcao;

        do {
            System.out.println("1. Cadastrar.");
            System.out.println("2. Listar.");
            System.out.println("3. Atualizar.");
            System.out.println("4. Remover.");
            System.out.println("0. Sair.");
            System.out.print("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrar(nomeModulo, lista);
                break;
                case 2 -> listar(nomeModulo, lista);
                break;
                case 3 -> atualizar(nomeModulo, lista);
                break;
                case 4 -> remover(nomeModulo, lista);
                break;
                case 0 -> System.out.println("Retornando ao menu principal...");
                break;
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void cadastrar(String nomeModulo, ArrayList<String> lista) {
        scanner.nextLine();
        Scanner entrada;

        switch ()
    }
}