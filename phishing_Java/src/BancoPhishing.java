import java.util.HashMap;
import java.util.Map;

public class BancoPhishing{
    private Map<String, Integer> palavras = new HashMap<>();

    public BancoPhishing(){
        //mediação de riscos
        adicionar("urgente", 3);
        adicionar("senha", 3);
        adicionar("clique aqui", 3);
        adicionar("clique no link", 3);
        adicionar("confirme seus dados", 3);
        adicionar("verifique sua conta", 3);
        adicionar("conta bloqueada", 3);
        adicionar("acesso suspenso", 3);
        adicionar("numero do cartao", 3);
        adicionar("cartao de credito", 3);
        adicionar("dados pessoais", 3);
        adicionar("voce ganhou", 3);
        adicionar("ganhe dinheiro", 3);
        adicionar("resgate agora", 3);
        adicionar("problema na conta", 3);
        adicionar("verifique", 3);
        adicionar("confirme", 2);
        adicionar("atualize", 2);
        adicionar("login", 2);
        adicionar("token", 2);
        adicionar("codigo", 2);
        adicionar("alerta", 2);
        adicionar("pix", 2);
        adicionar("transferencia", 2);
        adicionar("premio", 2);
        adicionar("resgate", 2);
        adicionar("acesso", 2);
        adicionar("conta", 2);
        adicionar("seguranca", 2);
        adicionar("dados", 1);
        adicionar("informacoes", 1);
        adicionar("usuario", 1);
        adicionar("sistema", 1);
        adicionar("verificacao", 1);
        adicionar("atividade", 1);
        adicionar("mensagem", 1);
        adicionar("notificacao", 1);
    }

    private void adicionar(String termo, int peso){
        palavras.put(NormalizarTexto.normalizar(termo), peso);
    }

    public void analisar(String textoOriginal){
        String texto = NormalizarTexto.normalizar(textoOriginal);

        int total = 0;

        System.out.println("==== Relatório ====");
        for(String termo : palavras.keySet()){
            int count = contar(texto, termo);

            if(count > 0){
                int pontos = count * palavras.get(termo);
                total += pontos;

                System.out.printf("%-25s | %2d ocorrências | %3d pontos%n", termo, count, pontos);
            }
        }

        System.out.println("\nTotal de Pontos: " + total);

        if(total > 15)
            System.out.println("Alto risco de phishing");
        else if(total > 5)
            System.out.println("possível phishing");
        else
            System.out.println("baixo risco de phishing");
    }

    private int contar(String texto, String termo) {
        int count = 0;
        int index = 0;

        while ((index = texto.indexOf(termo, index)) != -1) {
            count++;
            index += termo.length();
        }

        return count;
    }
}