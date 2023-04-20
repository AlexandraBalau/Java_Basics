package oop;


public class ContBancarPrincipal {
    public static void main(String[] args) {
        //"desktop-ul" unde ne folosim de logica din "Program Files"

        //initializam obiecte de tip ContBancar
        //instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("AB", "R0001");
        ContBancar cont2 = new ContBancar("BB", "R0002");
//        System.out.println(cont1.titularCont);
//        System.out.println(cont1.iban);
//        System.out.println(cont1.sold);
//        System.out.println(cont1.activ);
//        System.out.println(cont2.titularCont);
//        System.out.println(cont2.iban);
//        System.out.println(cont2.sold);
//        System.out.println(cont2.activ); //nu mai avem nevoie de aceste metode, ne-am eficientizat munca

        //apelam metoda descrieCont
//        cont1.descriereCont();
//        cont2.descriereCont();

        //activam conturile
        cont1.activareCont(0000);
        cont2.activareCont(7777);
        cont2.activareCont(5656);
        cont2.activareCont(0000);

        //alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //negative testing/cheltuim mai mult decat avem
        cont1.debitareCont(500); //nu, 300.5 => pass

        //positive testing/cu suma exacta
        cont1.debitareCont(300.5); //da, 0 => pass

        //positive de 2x
        cont2.debitareCont(100);
        cont2.debitareCont(200);

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
