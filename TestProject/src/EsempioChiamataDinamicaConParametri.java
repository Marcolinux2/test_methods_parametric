import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class EsempioChiamataDinamicaConParametri {

    public static void main(String[] args) {
        try {
            // Specifica il nome della classe, il nome del metodo e gli eventuali parametri
            String nomeClasse = "MarcoLino";
            String nomeMetodo = "secondoMetodo";

            // Carica la classe utilizzando il nome
            Class<?> classe = Class.forName(nomeClasse);

            // Ottieni il costruttore senza argomenti
            Constructor<?> costruttore = classe.getConstructor();

            // Crea un'istanza della classe utilizzando il costruttore
            Object istanza = costruttore.newInstance();

            // Ottieni il metodo dalla classe utilizzando il nome
            Method metodo = classe.getMethod(nomeMetodo, String.class, int.class);

            // Passa gli argomenti al metodo e chiamalo sull'istanza dell'oggetto
            boolean result = (boolean) metodo.invoke(istanza, "Esempio", 123);
            System.out.println(result);
        } catch (ClassNotFoundException | NoSuchMethodException |
                SecurityException | IllegalAccessException |
                IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MarcoLino {
    public MarcoLino() {
        // Costruttore senza argomenti
    }

    public boolean primoMetodo(String nome, int numero) {
        System.out.println("Marco - Primo metodo è stato chiamato con parametri: " + nome + ", " + numero);
        return true;
    }

    public boolean secondoMetodo(String nome, int numero) {
        System.out.println("Marco - Secondo metodo è stato chiamato con parametri: " + nome + ", " + numero);
        return false;
    }

    public boolean terzoMetodo(String nome, int numero) {
        System.out.println("Marco - Terzo metodo è stato chiamato con parametri: " + nome + ", " + numero);
        return true;
    }
}
