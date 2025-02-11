package multiplicacion;

import java.io.*;

public class TablaMultiplicar {

    public static void main(String[] args) throws IOException {

        int numero, i;
        BufferedReader obtenerNumero = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Indica la tabla de multiplicar: ");
        numero = Integer.parseInt(obtenerNumero.readLine());

        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i + "\n");
        }
    }
}
