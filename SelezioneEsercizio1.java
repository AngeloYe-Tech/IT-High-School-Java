import java.util.Scanner;
public class SelezioneEsercizio1{
    public static void main(String[] args){
        String piattoPrincipale, bevanda, nomePiatto = "", nomeBevanda = "";
        double prezzoPiatto = 0, prezzoBevanda = 0, prezzoTotale = 0, scontoApplicato = 0.0, prezzoFinale;
        boolean piattoValido = false, bevandaAcquistata = false;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("benvenuto al fast food.");
        System.out.println("Questo è il menu:");
        System.out.println("a. Piatti principali:");
        System.out.println("H - Hamburger - 6 euro");
        System.out.println("P - Nuggets di pollo - 5 euro");
        System.out.println("W - Wrap - 7 euro");
        System.out.println("b. Bevamde:");
        System.out.println("A - Acqua - 1 euro");
        System.out.println("C - Cola - 2 euro");
        System.out.println("S - Succo - 2.5 euro");
        
        System.out.println("Che cosa scegli da mangiare ?");
        piattoPrincipale = scanner.nextLine().toUpperCase();
        
        switch(piattoPrincipale){
            case "H":
                nomePiatto = "Hamburger";
                prezzoPiatto = 6.0;
                piattoValido = true;
                break;
            case "P":
                nomePiatto = "Nuggets di pollo";
                prezzoPiatto = 5.0;
                piattoValido = true;
                break;
            case "W":
                nomePiatto = "Wrap";
                prezzoPiatto = 7.0;
                piattoValido = true;
            case "N":
                nomePiatto = "Nessun piatto";
                prezzoPiatto = 0.0;
                piattoValido = false;
            default:
                System.out.println("Errore, attenzione il nome piatto non valido");
        }
        System.out.println("Inserisci la bevanda che vuoi:");
        bevanda = scanner.nextLine().toUpperCase();
        
        switch(bevanda){
            case "A":
                nomeBevanda = "Acqua";
                prezzoBevanda = 1.0;
                bevandaAcquistata = true;
                break;
            case "C":
                nomeBevanda = "Cola";
                prezzoBevanda = 2.0;
                bevandaAcquistata = true;
                break;
            case "S":
                nomeBevanda = "Succo";
                prezzoBevanda = 2.5;
                bevandaAcquistata = true;
                break;
            case "N":
                nomeBevanda = "Nessun bevanda";
                prezzoBevanda = 0.0;
                bevandaAcquistata = false;
                break;
            default:
                System.out.println("non c'è nessun bevanda");
                break;
        }
        prezzoTotale = prezzoPiatto + prezzoBevanda;
        
        if(bevandaAcquistata){
            scontoApplicato = prezzoTotale * 0.25;
            System.out.println("hai ottenuto un sconto di 25%");
        }else{
            scontoApplicato = 0.0;
            System.out.println("non hai ottenuto nessun sconto");
        }
        prezzoFinale = prezzoTotale - scontoApplicato;
        
        System.out.println("il costo del tuo pasto è di" + prezzoTotale);
    }
}