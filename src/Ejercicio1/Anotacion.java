package Ejercicio1;

import java.io.*;

public class Anotacion {
        /*
        1. Disponemos de un archivo de texto en el que en cada una de sus líneas aparece
        una anotación correspondiente a un cargo o abono en una cuenta bancaria. Se pide
        desarrollar un programa que procese esta información mostrando al finalizar el saldo
        bancario por pantalla, así como el número de cargos y abonos que se han procesado.
        */

    public static void main(String[] args) {
            String ruta = "/Users/romanperailefernandez/IdeaProjects/Ejercicio1/src/Ejercicio1/Cuenta Bancaria";
            File file = new File(ruta);

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String Linea;
            String[] money = new String[2];
            int cont = 0;
            int con2 = 0;
            int balance = 0;
            while ((Linea = br.readLine()) != null){
                System.out.println(Linea);
                money = Linea.split(": ");
                balance += Integer.parseInt(money[1]);
                if (Integer.parseInt(money[1]) >= 0){
                    cont++;
                }else
                    con2++;
            }
            System.out.println("--------------");
            System.out.println("Balance: "+balance);
            System.out.println("Cargos: "+con2);
            System.out.println("Abonos: "+cont);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
