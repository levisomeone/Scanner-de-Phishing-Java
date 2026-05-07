import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("email1.txt"));
        StringBuilder conteudo = new StringBuilder();

        while (sc.hasNextLine()) {
            conteudo.append(sc.nextLine()).append(" ");
        }

        sc.close();

        BancoPhishing banco = new BancoPhishing();
        banco.analisar(conteudo.toString());
    }
}