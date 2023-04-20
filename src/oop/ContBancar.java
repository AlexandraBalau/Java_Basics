package oop;

public class ContBancar {
    //"program files" = definim logica unui cont bancar

    //OOP = Object Oriented Programming
    //POO = programare orientata pe obiecte
    //piloni ai OOP:
    //INHERITANCE
    //POLIMORPHISM
    //ENCAPSULATION
    //ABSTRACTIZATION

    //o clasa = este definitia unui concept
    //clasa = reteta de paste carbonara/ADN-ul uman
    //ex clasa Car

    //un obiect = instanta unei clase
    //obiect = pastele carbonara/un om
    //ex: 10 obiecte de tip Car

    //fields = proprietati = atribute
    //variabilele, paste/ou/bacon
    //ex: culoare, marca, model, consum, pret, esteOprita

    //metode = actiuni ce pot fi facute de obiecte
    //functii
    //ex: accelereaza(), deschideUsa(). vinde(), vopsire()

    //proprietatile/fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 0000; //prin "private" putem ascunde anumite atribute
    int incercariActivare = 0;

    //constructor = are rolul de a impune date de start
    //ca si * din formulare, required fields

    public ContBancar(String titularCont, String iban) { //variabile temporare, "this" le permanentizeaza
        this.titularCont = titularCont;
        this.iban = iban;
    }
    //metodele = actiunile clasei
    public void interogareSold(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Nr de incercari gresite " + this.incercariActivare);
        System.out.println("-------------------------------------------------");
    }

    public void activareCont(int pinUtilizator) {
        //modifica activ in true doar daca pinul este corect
        System.out.println("Buna " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("PIN corect. Card activat cu succes");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercariActivare++; //incrementeaza +1
        }
    }
    public void alimentareCont(double sumaDepusa) { //sumaDepusa este o variabila temporara, o vom folosi doar pentru metoda asta
        //la ce aveam in cont this.sod, se mai adauga si suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu success suma de " + sumaDepusa + ". Aveti in cont suma de " + this.sold);
    }

    public void debitareCont(double suma_cheltuita){
        System.out.println("Buna " + this.titularCont);
        //pot sa cheltuiesc doar ce am, daca suma cheltuita <= sold
        if (suma_cheltuita <= this.sold){
            //dispar banii din cont
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }
}
