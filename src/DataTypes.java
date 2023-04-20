public class DataTypes {
    public static void main(String[] args) {
        //cele mai folosite 4 tipuri de date

        //String = sir de caractere delimitate de ""
        String marca = "Dacia";
        String model = "1310";
        System.out.println(marca.toUpperCase());
        System.out.println(marca.length() );

        String a = "3";
        String b = "4";
        System.out.println(a+b); //concatenare de stringuri = 34

        //integer = numar intreg, (int)
        int an_fabricatie = 1987;

        //double = numar zecimal (ii este alocata o zona de memorie mai mare)
        double pret = 2300.50; //virgula se inlocuieste cu punct

        //boolean = adevarat sau fals
        boolean inmatriculata = false;

        //char = un singur caracter #, $, 2, d
        char nota = 'A';
    }
}
