/*
Operatori:

aritmetici: +. -, *, /, % (modulo = restul impartirii 10%3 = 1)
de comparare: <, >, ==, !=, >=, <=
logici: && (si), || (sau), !
 */

public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare si initializare
        int b = 5;
        a = b; //suprascriere
        System.out.println(a + b); //5+5
        System.out.println(a != b); //a diferit de b?
        System.out.println(a == b); //a este egal cu b?
        System.out.println(7>b && 8>b); //7>5 si 8>5?
        System.out.println(7>b || 3>b); //7>5 sau 3>5?  daca una din conditii este true => true
        System.out.println(7>b && (2>b || 3>b)); //true && false => false
        System.out.println(7>b || (2>b || 3>b)); //true || false => true
    }
}
