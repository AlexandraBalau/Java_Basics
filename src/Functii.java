public class Functii {
    //functie = logica delimitata care poate fi refolosita
    //nu putem folosi spatii in nume
    //nu putem defini o alta functie in alta functie (nu pot instala firefox in chrome)

    //o functie simpla care ne printeaza ceva pe ecran
    //nu ne da niciun raspuns (nu are return)
    //nu are parametri

    public static void printGreeting(){ //public = putem accesa functia din orice clasa, static = nu e programare bazata pe obiect, void = nu returneaza nimic
        System.out.println("Buna ziua! Bine ati venit!");
    }

    //o functie care saluta clientul in functie de numele lui
    //nu ne da niciun raspuns (nu are return)
    //are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua! " + nume + " " + prenume);
    }

    //o functie care calculeaza media 3 numere
    //ne da un raspuns (suma numerelor; va avea return)
    //are nevoie de parametri
    //ce tip de date va avea raspunsul? (3 + 6) / 2 = 4.5 double

    public static double mediaNr(double a, double b, double c){
        double media = (a + b + c) / 3;
        return media;
    }

    //o functie care ne returneaza valoarea lui pi
    //ne da un raspuns (va avea return)
    //are nevoie de parametri? nu
    //ce tip de date va avea raspunsul? raspunsul va fi souble

    public static double piValue(){ //nu am pus parametri
        //constanta = o variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    //o functie care ne returneaza aria unui dreptunghi
    public static int ariaDreptunghi(int a, int b){
        int aria = (a * b);
        return aria;
    }

    //o functie care ne returneaza aria cercului
    public static double ariaCercului(double r){
        final double PI = 3.14;
        double aria = PI * r * r;
        return aria;
    }

    public static void main(String[] args) { //aici apelam functiile
        //intra clientul 1
        printGreeting(); //se apeleaza functia

        //intra clientul 2
        printGreeting(); //CTRL + Click pe functie ==> ne duce la corpul ei

        //apelam o functie cu parametri, oferind argumente
        printGreetingByName("Balau", "Alexandra");
        printGreetingByName("Balau", "Bogdan");

        System.out.println(mediaNr(3, 6, 7));
        double media1 = mediaNr(2423, 4343, 34534);
        double media2 = mediaNr(343, 76, 96);
        double media3 = mediaNr(1, 2, 3);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());

        System.out.println(ariaDreptunghi(3, 5));

        System.out.println(ariaCercului(3));
    }
}
