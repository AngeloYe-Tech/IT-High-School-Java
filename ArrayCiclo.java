import java.util.Scanner;

public class ArrayCiclo {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        String []nome = new String [100];
        int scelta = 0, punta = 0;
        int []fiale = new int [100];
        int []costoMonete = new int [100];
        int []pericolosita = new int [100];

        do {
            System.out.println("--------MENU--------");
            System.out.println("1) Distilla Nuova Pozione");
            System.out.println("2) Rimuovi Pozione");
            System.out.println("3) Consulta il Grimorio");
            System.out.println("4) Divinazione (Cerca)");
            System.out.println("5) Valuta il Tesoro");
            System.out.println("6) Trasmutazione (Modifica)");
            System.out.println("7) Esprimento Fallito (Reser)");
            System.out.println("8) Pozione più instabile");
            System.out.println("9) Modifica Scorte");
            System.out.println("10) Chiudi il Grimorio");
            System.out.println("\n");
            System.out.print("Inserisci la tua scelta: ");
            if(scanner.hasNextInt()) {
                scelta = scanner.nextInt();
                switch (scelta) {
                    case 1:
                        System.out.println("1- Distilla Nuova Pozione");
                        System.out.println("Inserisci il nome della pozione: ");
                        nome[punta] = scanner.next();
                        System.out.println("Inserisci il fiale: ");
                        fiale[punta] = scanner.nextInt();
                        System.out.println("Inserisci il costo della moneta: ");
                        costoMonete[punta] = scanner.nextInt();
                        while (pericolosita[punta] < 1 || pericolosita[punta] > 5) {
                            System.out.println("il livello del pericolosità deve essere da 1 a 5");
                            pericolosita[punta] = scanner.nextInt();
                        }
                        break;
                    case 2:
                        int eliminare = 0;
                        System.out.println("2- Rimuovi Pozione");
                        System.out.print("Inserisci la pozione che vuoi inserire: ");
                        eliminare = scanner.nextInt();
                        nome[eliminare] = "";
                        fiale[eliminare] = 0;
                        costoMonete[eliminare] = 0;
                        pericolosita[eliminare] = 0;
                        break;
                    case 3:
                        System.out.println("nome: " + nome[punta] + "\n" + "fiale: " + fiale[punta] + "\n" + "costo del monete: " + costoMonete[punta] + "\n" + "livello del pericolosità: " + pericolosita[punta]);
                        break;
                    case 4:
                        String cerca = "";
                        System.out.println("4- Divinazione (cerca)");
                        System.out.print("Inserisci utente che vuoi cercare: ");
                        cerca = scanner.next();
                        if(nome[punta].equalsIgnoreCase(cerca)){
                            System.out.println("Il nome è stato trovato");
                            System.out.println(nome[punta] + " | " + fiale[punta] + " | " + pericolosita[punta]);
                        }else{
                            System.out.println(" Il nome è stato trovato");
                        }
                        break;
                    case 5:
                        int costoTesoro = 0;
                        String rispostaBreve = "";
                        System.out.println("Valuta il tesoro");
                        System.out.println(nome[punta]);
                        System.out.println(fiale[punta]);
                        System.out.println(costoMonete[punta]);

                        costoTesoro = fiale[punta] * costoMonete[punta];
                        System.out.print("Vuoi il tesoro ?: ");
                        rispostaBreve = scanner.next();
                        if(rispostaBreve.equalsIgnoreCase("si'")||rispostaBreve.equalsIgnoreCase("no")){
                            if(rispostaBreve.equalsIgnoreCase("si'")){
                                System.out.println("Il costo totale del tesoro e' " + costoTesoro);
                            }else if(rispostaBreve.equalsIgnoreCase("no")){
                                System.out.println("ok niente");
                            }
                        }else{
                            System.out.println("La risposta deve essere solo si o no");
                        }
                        break;
                    case 6:
                        String modifica = "";
                        int nuovoCosto = 0;
                        System.out.println("Trasutazione");
                        System.out.print("Inserisci il nome del pozione che vuoi modificare il costo: ");
                        modifica = scanner.next();
                        if(modifica.equalsIgnoreCase(nome[punta])){
                            System.out.print("Inserisci il nuovo prezzo: ");
                            nuovoCosto = scanner.nextInt();
                            costoMonete[punta] = nuovoCosto ;
                            System.out.println("il nuovo prezzo è " + costoMonete[punta]);
                        }else{
                            System.out.println("Non c'è il pozione chiama così");
                        }
                        break;
                    case 7:
                        System.out.println("Esperimento Fallito (Reset)");
                        nome[punta] = " ";
                        fiale[punta] = 0;
                        costoMonete[punta] = 0;
                        pericolosita[punta] = 0;

                        System.out.println("nome del pozione : " + nome[punta]);
                        System.out.println("fiale del pozione : " + fiale[punta]);
                        System.out.println("costo del pozione : " + costoMonete[punta]);
                        System.out.println("pericolosita' del pozione : " + pericolosita[punta]);
                        break;
                    case 8:
                        System.out.println("Pozione Piu' Instabile");

                        break;
                    case 9:
                        System.out.println("Mofidica Scorte");
                        String risposta = "", nomeCerca = "";
                        int quantitaAggiunta = 0, quantitaDiminuita = 0;
                        System.out.println("Inserisci il nome del pozione che vuoi aggiungere/diminuire la quantita': ");
                        nomeCerca = scanner.next();
                        if(nomeCerca.equals(nome[punta])) {
                            System.out.println("Inserisci la tua risposta (aggiungere o diminuire): ");
                            risposta = scanner.next();
                            if (risposta.equalsIgnoreCase("aggiungere") || risposta.equalsIgnoreCase("a") || risposta.equalsIgnoreCase("+")) {
                                System.out.println("Inserisci il numero del quantità che vuoi aggiungere: ");
                                quantitaAggiunta = scanner.nextInt();
                                fiale[punta] += quantitaAggiunta;
                            } else if (risposta.equalsIgnoreCase("diminuire") || risposta.equalsIgnoreCase("d") || risposta.equalsIgnoreCase("-")) {
                                System.out.println("Inserisci il numero del quantità che vuoi diminuire: ");
                                quantitaDiminuita = scanner.nextInt();
                                fiale[punta] -= quantitaDiminuita;
                            } else {
                                System.out.println("Non esiste questo simbolo");
                            }
                        }
                        System.out.println(" fiale (quantità) : " + fiale[punta]);
                        break;
                    case 10:
                        System.out.println("Chiudi il Grimorio (Esci)");
                        break;
                }
            }

        }while(scelta != 10);
    }
}