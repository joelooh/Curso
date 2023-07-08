// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado= suma(1,2);
        System.out.println(resultado);

        suma1(10,10);

        operaciones(2,1);
    }
    public static int suma(int a, int b){
        return a + b;
    }

    // Funciones con void que no retornan valores

    public static void suma1(int a, int b){
        int R;
        R = a + b;
        System.out.println(R);
    }

    public  static void operaciones (int a, int b){
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}