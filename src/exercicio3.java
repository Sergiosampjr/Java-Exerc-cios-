import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int maior = 0;
        int menor = 0;
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.format("Digite o nome da %d pessoa:\n", i);
            String nome = teclado.nextLine();
            System.out.format("Digite a idade da %d pessoa:\n", i);
            cont = cont + 1;
            int idade = teclado.nextInt();
            if (idade>1) {
                maior = idade;
                {
                    menor = idade;
                    System.out.println("");
            }
        }
    }
}
}