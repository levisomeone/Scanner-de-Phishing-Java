import java.text.Normalizer;
import java.util.Map;

public class NormalizarTexto{
    private static final Map<Character, Character> LEET_MAP = Map.ofEntries(
            Map.entry('0', 'o'),
            Map.entry('1', 'i'),
            Map.entry('3', 'e'),
            Map.entry('4', 'a'),
            Map.entry('5', 's'),
            Map.entry('7', 't'),
            Map.entry('@', 'a'),
            Map.entry('$', 's'),
            Map.entry('!', 'i')
    );

    public static String normalizar(String texto){
        texto = texto.toLowerCase();

        texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");

        texto = substituirLeet(texto);

        texto = texto.replaceAll("[^a-z0-9 ]", " ");

        texto = texto.replaceAll("\\s+", " ").trim();

        return texto;
    }

    private static String substituirLeet(String texto){
        StringBuilder sb = new StringBuilder();

        for(char c : texto.toCharArray()){
            sb.append(LEET_MAP.getOrDefault(c, c));
        }

        return sb.toString();
    }
}