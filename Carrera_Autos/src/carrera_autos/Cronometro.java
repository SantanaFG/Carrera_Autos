/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_autos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Edisson Leon
 */
public class Cronometro extends Thread {

    JLabel cron;

    public Cronometro(JLabel tiempo) {
        this.cron = tiempo;
    }

    public void run() {
        int x = 0;
        try {
            do {
                Thread.sleep(1000);
                ejecutarcronometro(x);
                x++;
            } while (Pista_de_Carreras.inicio);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ejecutarcronometro(int x) {
        
        Pista_de_Carreras.segundo++;
        if (Pista_de_Carreras.segundo > 59) {
            Pista_de_Carreras.segundo = 0;
            Pista_de_Carreras.minutos++;
        }
        if (Pista_de_Carreras.minutos > 59) {
            Pista_de_Carreras.minutos = 0;
            Pista_de_Carreras.hora++;
        }
        
        String txtse = "", txtmin = "", txthora = "";
        if (Pista_de_Carreras.segundo < 10) {
            txtse = "0" + Pista_de_Carreras.segundo;
        } else {
            txtse = "" + Pista_de_Carreras.segundo;
        }
        if (Pista_de_Carreras.minutos < 10) {
            txtmin = "0" + Pista_de_Carreras.minutos;
        } else {
            txtmin = "" + Pista_de_Carreras.minutos;
        }
        if (Pista_de_Carreras.hora < 10) {
            txthora = "0" + Pista_de_Carreras.hora;
        } else {
            txthora = "" + Pista_de_Carreras.hora;
        }
        String reloj = txthora + ":" + txtmin + ":" + txtse + "";
        cron.setText(reloj);
        System.out.println(x + " - " + Thread.currentThread().getName());
    }
}
