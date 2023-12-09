// Definisci un'interfaccia funzionale con un solo metodo astratto
@FunctionalInterface
interface MetodoDaChiamare {
    void chiamare();
}

@FunctionalInterface
interface MetodoDaChiamare2 {
    void chiamare2();
}

@FunctionalInterface
interface VerificaIndice {
    void indexExist();
}

@FunctionalInterface
interface CreaIndice {
    void createIndex();
}

@FunctionalInterface
interface EliminaIndice {
    void dropIndex();
}

public class EsempioInterfacceFunzionali {

    public static void main(String[] args) {
        // Crea un'istanza della tua classe
        MiaClasse miaIstanza = new MiaClasse();

        // Chiama il metodo passando un'istanza dell'interfaccia funzionale
        chiamareMetodo(miaIstanza::metodoDaChiamare);
 
        // Chiama il metodo passando un'istanza dell'interfaccia funzionale
        chiamareMetodo2(miaIstanza::metodoDaChiamare2);
 
    }

    // Metodo che accetta un'istanza dell'interfaccia funzionale come parametro e la chiama
    public static void chiamareMetodo(MetodoDaChiamare metodo) {
        // Chiama il metodo astratto dell'interfaccia funzionale
        metodo.chiamare();
    }

    // Metodo che accetta un'istanza dell'interfaccia funzionale come parametro e la chiama
    public static void chiamareMetodo2(MetodoDaChiamare2 metodo) {
        // Chiama il metodo astratto dell'interfaccia funzionale
        metodo.chiamare2();
    }
    
    
}

class MiaClasse {
    public void metodoDaChiamare() {
        System.out.println("Il metodo è stato chiamato!");
    }

    public void metodoDaChiamare2() {
        System.out.println("Il metodo è stato chiamato!");
    }

}
