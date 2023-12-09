import java.lang.reflect.Method;

public class EsempioRiflessione {

    public static void main(String[] args) {
        Papero mioPapero = new Papero();

        chiamareMetodi(mioPapero, "primoMetodo");
        chiamareMetodi(mioPapero, "secondoMetodo");
        chiamareMetodi(mioPapero, "terzoMetodo");
        
    }

    public static void chiamareMetodi(Object oggetto, String nomeMetodo) {
        try {
            Class<?> classe = oggetto.getClass();
            Method metodo = classe.getMethod(nomeMetodo);
            metodo.invoke(oggetto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Papero {
    public void primoMetodo() {
        System.out.println("Il primo metodo è stato chiamato!");
    }

    public void secondoMetodo() {
        System.out.println("Il secondo metodo è stato chiamato!");
    }

    public void terzoMetodo() {
        System.out.println("Il terzo metodo è stato chiamato!");
    }
}
