import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Flow Control - if else, !!!directionarea codului in functie de conditii!!!
        //evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("pornim radio");
        boolean piesaFaina = true;//invat calculatorul daca piesa e faina sau nu
        //daca imi place piesa, dau mai tare
        if (piesaFaina == true){
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        }
        System.out.println("oprim radio");

        //if else - numar par/impar
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("nr par");
        } else {
            System.out.println("nr impar");
        }

        //numar pozitiv
        if (nr > 0) {
            System.out.println("nr pozitiv");
        } else {
            System.out.println("nr nu este pozitiv");
        }

        //if, else if (elif), else
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu ora:");
//        int ora = sc.nextInt();
//        if (ora < 0){
//            System.out.println("ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("neata");
//        } else if (ora <= 18) {
//            System.out.println("ziua buna");
//        } else if (ora <= 21) {
//            System.out.println("'nseara'");
//        } else if (ora <= 24) {
//            System.out.println("noapte buna");
//        } else {
//            System.out.println("ora invalida");
//        }

        //flow control - switch (nu exista in Python), se foloseste cand stim valorile posibile
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea){
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("meniu ro");
                break;
            case 2:
                System.out.println("meniu en");
                break;
            default:
                System.out.println("optiune invalida");
        }


    } //inchide functia main
} //inchide clasa
