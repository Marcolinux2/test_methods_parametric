import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class EsempioChiamataDinamica {
    public static void main(String[] args) {
        try {
            // Specifica il nome della classe e il nome del metodo
            String nomeClasse = "Marco";
            String nomeMetodo = "secondoMetodo";

            // Carica la classe utilizzando il nome
            Class<?> classe = Class.forName(nomeClasse);

            // Crea un'istanza della classe
            Object istanza = classe.newInstance();

            // Ottieni il metodo dalla classe utilizzando il nome
            Method metodo = classe.getMethod(nomeMetodo);
            System.out.println(metodo.toString());

            // Chiamare il metodo sull'istanza dell'oggetto
            metodo.invoke(istanza);
            
            // Ottieni il costruttore
            Constructor<MiaClasse> costruttore = MiaClasse.class.getDeclaredConstructor();
            
            // Rendi il costruttore accessibile (se è privato)
            costruttore.setAccessible(true);
            
            // Creazione di un'istanza utilizzando il costruttore
            MiaClasse miaIstanza = costruttore.newInstance();
            
            
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | NoSuchMethodException |
                SecurityException | IllegalArgumentException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Marco {
    public void primoMetodo() {
        System.out.println("Marco - Primo metodo è stato chiamato!");
    }

    public void secondoMetodo() {
        System.out.println("Marco - Secondo metodo è stato chiamato!");
    }

    public void terzoMetodo() {
        System.out.println("Marco - Terzo metodo è stato chiamato!");
    }
}

class Mario {
    public void primoMetodo() {
        System.out.println("Mario - Primo metodo è stato chiamato!");
    }

    public void secondoMetodo() {
        System.out.println("Mario - Secondo metodo è stato chiamato!");
    }

    public void terzoMetodo() {
        System.out.println("Mario - Terzo metodo è stato chiamato!");
    }
}
