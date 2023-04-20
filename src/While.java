public class While {
    public static void main(String[] args) {
        //while=loop, ciclu repetitiv
        // o zona de cod care se repeta atat timp cat o conditie e true

        //problema: masina merge cat timp inca are benzina
        int litri_benzina = 10;
        while (litri_benzina > 0){
            //acceleram
            System.out.println("Vruum vruuum");
            //scadem benzina
            litri_benzina = litri_benzina - 1;
            //aprindem martorul din bord cand avem <=  3 litri
            if (litri_benzina <= 3){
                System.out.println("Se aprinde becul rosu");
            }
        }
        System.out.println("Masina se opreste. Nu mai avem benzina");
    }
}
