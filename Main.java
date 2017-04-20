package convertir;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.io.*;

public class Main{
    public static void main(String Arg[ ]) throws IOException{
        convertir numero;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String res;
        System.out.print(" Ingrese un numero de 0-9999 para poder que osopolar pueda convertir please : ");
        num = Integer.parseInt(in.readLine( ));
        numero = new convertir(num);
        res = numero.convertirLetras(num);
        System.out.print(res);
        System.out.println("\n");
    }
}
