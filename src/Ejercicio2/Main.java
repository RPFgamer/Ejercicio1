package Ejercicio2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        EstadoPartida partida = new EstadoPartida(100,2);
        try {
            guardarPartida(partida);
            EstadoPartida pGuardada = recuperarPartida();
            System.out.println(pGuardada.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void guardarPartida(EstadoPartida partida) throws IOException {
        File file = new File("partida.bck");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(partida.getVidaRestante()));
        bw.newLine();
        bw.write(String.valueOf(partida.getPantallaActual()));
        bw.close();
        fw.close();
    }

    static EstadoPartida recuperarPartida() throws IOException {
        File file = new File("partida.bck");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int vidasRestantes = Integer.parseInt(br.readLine());
        int pantallaActual = Integer.parseInt(br.readLine());
        br.close();
        fr.close();
        return new EstadoPartida(vidasRestantes, pantallaActual);
    }
}