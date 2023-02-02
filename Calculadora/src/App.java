import java.io.IOException;

public class App {

    public static void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static void main(String[] args) throws Exception {

        limparTela();

        Divisao divisao = new Divisao(0);
        System.out.println("A divisão dos números a e b: " + divisao.calcular(5, 3));

        Multiplicacao multiplicacao = new Multiplicacao(0);
        System.out.println("A multiplicação dos números a e b: " + multiplicacao.calcular(5, 3));

        Soma soma = new Soma(0);
        System.out.println("A soma dos números a e b: " + soma.calcular(5, 3));

        Subtracao subtracao = new Subtracao(0);
        System.out.println("A subtração dos números a e b: " + subtracao.calcular(5, 3));
    }
}
