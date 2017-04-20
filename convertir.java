// Alexander Rodriguez 3-720-2206
// Buenas profe soy osopolar29 me a costado hacer lo que es javafx osea el grafico
// pero para que usted vea que yo no me dejo le dejo el codigo realizado por osopolar29


package convertir;

public class convertir {
    private int flag;
    public int numero;
    public String importe_parcial;
    public String num;
    public String num_letra;
    public String num_letras;
    public String num_letram;
    public String num_letradm;

    public convertir(){
        numero = 0;
        flag=0;
    }
    public convertir(int n){
        numero = n;
        flag=0;
    }


    private String unidad(int numero){

        switch (numero){
            case 9:
                num = "nueve";
                break;
            case 8:
                num = "ocho";
                break;
            case 7:
                num = "siete";
                break;
            case 6:
                num = "seis";
                break;
            case 5:
                num = "cinco";
                break;
            case 4:
                num = "cuatro";
                break;
            case 3:
                num = "tres";
                break;
            case 2:
                num = "dos";
                break;
            case 1:
                if (flag == 0)
                    num = "uno";
                else
                    num = "un";
                break;
            case 0:
                num = "";
                break;
        }
        return num;
    }

    private String decena(int numero){

        if (numero >= 90 && numero <= 99)
        {
            num_letra = "noventa ";
            if (numero > 90)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 90));
        }
        else if (numero >= 80 && numero <= 89)
        {
            num_letra = "ochenta ";
            if (numero > 80)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 80));
        }
        else if (numero >= 70 && numero <= 79)
        {
            num_letra = "setenta ";
            if (numero > 70)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 70));
        }
        else if (numero >= 60 && numero <= 69)
        {
            num_letra = "sesenta ";
            if (numero > 60)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 60));
        }
        else if (numero >= 50 && numero <= 59)
        {
            num_letra = "cincuenta ";
            if (numero > 50)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 50));
        }
        else if (numero >= 40 && numero <= 49)
        {
            num_letra = "cuarenta ";
            if (numero > 40)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 40));
        }
        else if (numero >= 30 && numero <= 39)
        {
            num_letra = "treinta ";
            if (numero > 30)
                num_letra = num_letra.concat("y ").concat(unidad(numero - 30));
        }
        else if (numero >= 20 && numero <= 29)
        {
            if (numero == 20)
                num_letra = "veinte ";
            else
                num_letra = "veinti".concat(unidad(numero - 20));
        }
        else if (numero >= 10 && numero <= 19)
        {
            switch (numero){
                case 10:

                    num_letra = "diez ";
                    break;

                case 11:

                    num_letra = "once ";
                    break;

                case 12:

                    num_letra = "doce ";
                    break;

                case 13:

                    num_letra = "trece ";
                    break;

                case 14:

                    num_letra = "catorce ";
                    break;

                case 15:

                    num_letra = "quince ";
                    break;

                case 16:

                    num_letra = "dieciseis ";
                    break;

                case 17:

                    num_letra = "diecisiete ";
                    break;

                case 18:

                    num_letra = "dieciocho ";
                    break;

                case 19:

                    num_letra = "diecinueve ";
                    break;

            }
        }
        else
            num_letra = unidad(numero);

        return num_letra;
    }

    private String centena(int numero){
        if (numero >= 100)
        {
            if (numero >= 900 && numero <= 999)
            {
                num_letra = "novecientos ";
                if (numero > 900)
                    num_letra = num_letra.concat(decena(numero - 900));
            }
            else if (numero >= 800 && numero <= 899)
            {
                num_letra = "ochocientos ";
                if (numero > 800)
                    num_letra = num_letra.concat(decena(numero - 800));
            }
            else if (numero >= 700 && numero <= 799)
            {
                num_letra = "setecientos ";
                if (numero > 700)
                    num_letra = num_letra.concat(decena(numero - 700));
            }
            else if (numero >= 600 && numero <= 699)
            {
                num_letra = "seiscientos ";
                if (numero > 600)
                    num_letra = num_letra.concat(decena(numero - 600));
            }
            else if (numero >= 500 && numero <= 599)
            {
                num_letra = "quinientos ";
                if (numero > 500)
                    num_letra = num_letra.concat(decena(numero - 500));
            }
            else if (numero >= 400 && numero <= 499)
            {
                num_letra = "cuatrocientos ";
                if (numero > 400)
                    num_letra = num_letra.concat(decena(numero - 400));
            }
            else if (numero >= 300 && numero <= 399)
            {
                num_letra = "trescientos ";
                if (numero > 300)
                    num_letra = num_letra.concat(decena(numero - 300));
            }
            else if (numero >= 200 && numero <= 299)
            {
                num_letra = "doscientos ";
                if (numero > 200)
                    num_letra = num_letra.concat(decena(numero - 200));
            }
            else if (numero >= 100 && numero <= 199)
            {
                if (numero == 100)
                    num_letra = "cien ";
                else
                    num_letra = "ciento ".concat(decena(numero - 100));
            }
        }
        else
            num_letra = decena(numero);

        return num_letra;
    }

    private String miles(int numero){
        if (numero >= 1000 && numero <2000){
            num_letram = ("mil ").concat(centena(numero%1000));
        }
        if (numero >= 2000 && numero <10000){
            flag=1;
            num_letram = unidad(numero/1000).concat(" mil ").concat(centena(numero%1000));
        }
        if (numero < 1000)
            num_letram = centena(numero);

        return num_letram;
    }

    private String decmiles(int numero){
        if (numero == 9999)
            num_letradm = "nueve mil novesientos noventa y nueve";
        if (numero >= 9000 && numero <10000){
            flag=1;
            num_letradm = decena(numero/1000).concat("mil ").concat(centena(numero%1000));
        }
        if (numero < 10000)
            num_letradm = miles(numero);

        return num_letradm;
    }

    public String convertirLetras(int numero){
        num_letras = decmiles(numero);
        return num_letras;
    }
}
