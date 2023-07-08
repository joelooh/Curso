// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int contador = 10;

        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 1;
            
            do {
                System.out.println(contador);
                contador = contador - 1;
            } while (contador > 10);
        }
    }
}
