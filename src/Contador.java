import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int param1 = terminal.nextInt();
        terminal.nextLine();

        System.out.println("Digite o segundo parâmetro");
        int param2 = terminal.nextInt();
        terminal.nextLine();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        }

    }

    public static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if (param1 < param2) {
            for (int interacoes = 0; interacoes <= param2 - param1; interacoes++) {
                System.out.println("Imprimindo o número " + interacoes);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}