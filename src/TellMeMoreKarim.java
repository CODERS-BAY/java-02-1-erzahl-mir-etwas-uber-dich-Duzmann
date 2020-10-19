


/* # Java

## Logische und Zuweisungsoperatoren

### Aufgabe 2.1 - Erzähl mir etwas über dich!

Schreibe ein Programm, dass ähnlich zu dem Programm aus Aufgabe 1 einige Daten vom Benutzer liest.
Stelle dazu auf der Konsole folgende Fragen und lies die jeweiligen Antworten im korrekten Datentyp ein,
speichere sie in einer Variable und gib sie nach Beantwortung aller Fragen wieder aus.

* Wie ist dein Vorname?
* Wie ist dein Nachname?
* Wie alt bist du?
* Bist du verheiratet? (true/false)
* Wie groß bist du in Metern?

Um von der Konsole Benuzter Eingaben zu lesen verwendest du am besten den [Scanner]
(https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html):
```
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine(); // returniert den eingegebenen Text als String, mit Enter wird der Text gesendet
```

Bonus: Lass Vor- und Nachnamen in einer Zeile mit einem Leerzeichen getrennt eingeben aber
speichere sie getrennt in zwei Variablen ab.

Bonus 2: Frag nach dem Geburtsdatum. Da der Scanner keine `nextDate()` Funktion hast wirst du etwas brauchen
um ein Datum aus dem String zu parsen. Sieh dir dafür die [offizielle SimpleDateFormat Dokumentation]
(https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html) an.

------------------------------------------------------------------------
*/


import java.util.Scanner;

public class TellMeMoreKarim {
    public static void main(String[] args) {


        //Variablen

        String VornameOptional = "";
        String NachnameOptional = "";
        String Vorname;
        String Nachname;

        int Alter;
        Boolean Verheiratet = false;
        Boolean VorNachname = false;
        Scanner eingabe = new Scanner(System.in);

        //Formular


        System.out.println("- - - - - - - - - - - - - - -\n");

        System.out.print("Wie ist dein Vorname?\n--> ");
        String Eingabe01 = eingabe.next();
        System.out.print("Wie ist dein Nachname?\n--> ");
        String Eingabe02 = eingabe.next();
        System.out.print("Wie alt bist du?\n--> ");
        String Eingabe03 = eingabe.next();
        String Eingabe04 = " ";
        do {
            System.out.print("Bist du verheiratet (Y/N)? \n--> ");
            Eingabe04 = eingabe.next();
        }
        while (!Eingabe04.equals("Y") && !Eingabe04.equals("N"));
        if (Eingabe04.equals("Y")) {
            Verheiratet = true;
        }


        // Ausgabe

        System.out.println("\n\n- - - - - - - - - - - - - - -\n\n");
        System.out.println("Vorname: " + Eingabe01);
        System.out.println("Nachname: " + Eingabe02);
        System.out.println("Alter: " + Eingabe03);
        System.out.println("Verheiratet: " + Verheiratet);

        System.out.println("- - - - - - - - - - - - - - -\n\n");

        //Optional1: Vor- und Nachnamen in einer Zeile mit einem Leerzeichen getrennt

        System.out.print("Wie lautet dein vollständiger Name?\n--> ");
        eingabe.nextLine();
        String Eingabe05 = eingabe.nextLine();
        // String[] s = Eingabe05.split(" ");

        for (int i = 0; i < Eingabe05.length(); i++) {

            if (VorNachname == false) {


                do {

                    VornameOptional = VornameOptional + Eingabe05.charAt(i);
                    i++;
                }
                while (i < (Eingabe05.length() - 1) && Eingabe05.charAt(i) != ' ' && VorNachname == false);
            }
            VorNachname = true;
            if (i < (Eingabe05.length() - 1) && Eingabe05.charAt(i) != ' ' && VorNachname == true) {
                NachnameOptional = NachnameOptional + Eingabe05.charAt(i);
            }
        }


        eingabe.close();

        // Ausgabe Optional1

        System.out.println("\n\n- - - - - - - - - - - - - - -\n\n");
        System.out.println("Vorname: " + VornameOptional);
        System.out.println("Nachname: " + NachnameOptional);
        System.out.println("Alter: " + Eingabe03);
        System.out.println("Vorname: " + Verheiratet);

        System.out.println("- - - - - - - - - - - - - - -\n\n");


        // Optional2: Datumseingabe


    }
}




