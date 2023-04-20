public class Array {
    public static void main(String[] args) {
        //declarare si initializare cand stim valorile

        String[] elevi = {"Gigi", "Costel", "Mari", "Elena", "Ada"};
        int[] numere = {1, 33, 5, 36, 55, 777};

        //contine mai multe elemente de acelasi tip
        //accesam elementele prin index, care incepe de la 0
        //are o dimensiune fixa, nu vom mai putea adauga elemente decat daca eliminam un alt element
        //are proprietatea length care ne da dimensiunea array-ului

        System.out.println(elevi[2]); //verificam elementul de la indexul din []
        elevi[2] = "Sebi"; //suprascriem un element din array de la indexul din []
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        //putem sa ne jucam cu valorile din array
        System.out.println(elevi[0] + " " + elevi[1] + " " + elevi[4]); //concatenare de stringuri
        System.out.println(elevi.length + 5);

        //sa printam tot timpul ultimul element, indiferent de marimea array-ului
        System.out.println(elevi[elevi.length-1]); //metoda dinamica

        //cum se declara un array fara initializare
        int[] note = new int[5]; //0, 0, 0, 0, 0
        System.out.println(note[1]);
        note [0] = 10;
        note [1] = 9;

    }
}
