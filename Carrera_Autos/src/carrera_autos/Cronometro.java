/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_autos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Cronometro extends Thread {

    JLabel tiempo;
    static boolean iterar;
    static boolean corre = false;
    int x = 0;

    public Cronometro(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {

        while (iterar) {
            try {
                Thread.sleep(100);
                ejecutar(x);
                x++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void ejecutar(int x) {

        Pista_de_Carreras.segundo++;

        if (Pista_de_Carreras.segundo > 59) {
            Pista_de_Carreras.segundo = 0;
            Pista_de_Carreras.minutos++;
        }

        String seg, min;

        if (Pista_de_Carreras.segundo < 10) {
            seg = "0" + Pista_de_Carreras.segundo;
        } else {
            seg = "" + Pista_de_Carreras.segundo;
        }

        if (Pista_de_Carreras.minutos < 10) {
            min = "0" + Pista_de_Carreras.minutos;
        } else {
            min = "" + Pista_de_Carreras.minutos;
        }
        String crono = min + ": " + seg;

        tiempo.setText(crono);
    }

    public void iniciar() {
        if (corre == false) {
            Cronometro.iterar = true;
            corre = true;
            new Thread(this).start();
        }
    }

    public void parar() {
        iterar = false;
        corre = false;
    }

    public void reiniciar() {
        x = 0;
        Pista_de_Carreras.segundo = 0;
        Pista_de_Carreras.minutos = 0;
    }
}