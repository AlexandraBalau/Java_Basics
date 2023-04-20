public class Variables {
    public static void main(String[] args) {
        // variabila = zona din memoria unui calculator care tine date
        //declarare si initializare
        String marcaMasina = "Volvo"; //statement
        String modelMasina = "XC 60";

        //strongly typed = trebuie sa specificam tipul variabilelor

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Am cumparat o masina modelul: " + modelMasina);

        //suprascrierea
        modelMasina = "XC 60 facelift"; //doar la declarare aratam tipul variabilei (String, int, etc)

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Am cumparat o masina modelul: " + modelMasina);

        //declarare
        String proprietar;
        //initializare
        proprietar = "Alexandra";
        System.out.println(proprietar);

        //declarare
        String nume;
        String prenume;
        int varsta;
        //initializare
        prenume = "Alexandra";
        nume = "Balau";
        varsta = 34;
        //concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta);

    }
}
