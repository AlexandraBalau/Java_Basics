public class For {
    public static void main(String[] args) {
        //for = loop, structura/ciclu repetitiv
        //de unde incepem?
        //pana unde mergem?
        //pasul de parcurgere
        //problema: printam 101 dalmatieni
        for (int i = 1; i <= 101; i++ ){
            System.out.println("Dalmatianul cu nr " + i);
        }
        //ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 4, 7, 5}; //numere[0] = 3
        //System.out.println(numere); //nu functioneaza
        for (int i = 0; i < numere.length; i++){
            System.out.println("elementul cu index " + i + " si valoarea " + numere[i]);
        }

        //for each - parcurge toate elementele din array si ajunge direct la valoare
        for (int numar: numere){ //numere: [3, 4, 7, 5] numar: 3 etc.
            System.out.println("Numarul este: " + numar); //numar: 3 etc
        }

        //parcurgem array de culori
        String[] culori =  {"alb", "rosu", "galben"};
        for (String culoare: culori){
            System.out.println("Culoarea actuala este " + culoare);
        }

        //suma numerelor din array
        int suma = 0;
        for (int numar: numere) {// prima oara e 3
            suma = suma + numar; //3 + 4
        }
    }
}
