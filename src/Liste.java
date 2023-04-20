import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //declaram o lista goala
        List <String> fructe = new ArrayList<>();
        //au o dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elementele
        System.out.println(fructe.get(0));

        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        //este lista goala?
        System.out.println(fructe.isEmpty());

        // scoatem un element
        fructe.remove("mar");

        //aflam dimensiunea listei
        System.out.println(fructe.size());

        //listam elementele prin metoda complexa sau simpla ca in Python
        System.out.println(Arrays.toString(fructe.toArray()));
        System.out.println(fructe);

        //eliminam toate elementele din lista
        fructe.clear();

        if (!fructe.isEmpty()){ //! = schimba sensul (daca NU este goala)
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu vom avea ce manca");
        }

        //declaram o lista dinamica/cu size dinamic
        String[] flowers = {"lalea", "zambila", "mac"}; //pornim de la un array
        List<String> flowersList = new ArrayList<>(Arrays.asList(flowers)); //array-ul il transformam intr-o lista
        flowersList.add("Rose"); //adaugi/stergi
        System.out.println(Arrays.toString(flowersList.toArray()));
        System.out.println(flowersList);


        //declaram o lista imutabila si o initializam cu valori
        List<String> fructe2 = Arrays.asList(new String[]{"banana", "mar", "portocala"});
        List<Integer> numere = Arrays.asList(new Integer[]{1, 2, 3});
        //numere.add(99); //eroare - nu mai putem adauga elemente
        System.out.println(Arrays.toString(numere.toArray()));
        System.out.println(numere);

        //aflam unde este macul
        int mac_index = flowersList.indexOf("mac");
        //stergem ce este in acea pozitie (index)
        flowersList.remove(mac_index);

        //stergem in functie de element/valoare
        flowersList.remove("lalea");

        //putem sa afisam si in varianta complexa si in varianta simpla ca in Python
        System.out.println(Arrays.toString(flowersList.toArray()));
        System.out.println(flowersList);
    }
}
