/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera_autos;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Carrera_Autos extends Thread {

    static ArrayList<Autopodio> ordenLlegada;
    private String nombre;
    private JLabel etiqueta;
    private Pista_de_Carreras auto;
    private boolean iteracion;
    private boolean iteracion2;
    Cronometro n = new Cronometro(Pista_de_Carreras.tiempo);
    Autopodio a1 = new Autopodio();

    public Carrera_Autos(JLabel etiqueta, Pista_de_Carreras auto, ArrayList ordenLlegada, String nombre) {
        this.etiqueta = etiqueta;
        this.auto = auto;
        this.ordenLlegada = ordenLlegada;
        this.nombre = nombre;

    }

    public boolean isIteracion() {
        return iteracion;
    }

    public void setIteracion(boolean iterar) {
        this.iteracion = iterar;
    }

    public Carrera_Autos() {
    }

    public static ArrayList<Autopodio> getOrdenLlegada() {
        return ordenLlegada;
    }

    public static void setOrdenLlegada(ArrayList<Autopodio> ordenLlegada) {
        Carrera_Autos.ordenLlegada = ordenLlegada;
    }

    @Override
    public void run() {

        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;
        double posX = etiqueta.getLocation().getX();
        double posY = etiqueta.getLocation().getY();
        while (iteracion && posX < 800) {

            try {
                sleep((int) (Math.random() * 40));
                auto1 = auto.getPeach().getLocation().x;
                auto2 = auto.getYoshi().getLocation().x;
                auto3 = auto.getMario().getLocation().x;
                auto4 = auto.getDkong().getLocation().x;

                double velocidad = 0.5 + (3.5 - 0.5) * Math.random();
                posX = posX + velocidad;
                etiqueta.setLocation((int) (posX), (int) (posY));
                etiqueta.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(Carrera_Autos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (iteracion2 == true) {

            synchronized (ordenLlegada) {
                a1.setNombre(nombre);
                a1.setTiempo(Pista_de_Carreras.tiempo.getText());
                ordenLlegada.add(a1);
            }

            if (ordenLlegada.size() == 4) {
                n.parar();
                Podiomariokart nc = new Podiomariokart();

                nc.setVisible(true);
                auto.getPeach().setLocation(85, 110);
                auto.getYoshi().setLocation(85, 210);
                auto.getMario().setLocation(85, 310);
                auto.getDkong().setLocation(85, 410);
                auto.parar();;
                auto.setVisible(false);
                n.reiniciar();
                Pista_de_Carreras.inicio = false;
            }
        }
    }

    public void Inicio() {
        iteracion = true;
        iteracion2 = true;
        new Thread(this).start();

    }

    public void Proceso() {
        iteracion = false;
        iteracion2 = false;
        Pista_de_Carreras.inicio = true;
        Pista_de_Carreras.proceso = false;
    }

    public void renaudar() {
        iteracion = true;
        iteracion2 = true;
        new Thread(this).start();

    }
}
