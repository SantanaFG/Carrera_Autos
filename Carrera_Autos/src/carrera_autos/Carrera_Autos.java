/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera_autos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Carrera_Autos extends Thread {

    private JLabel icono;
    Pista_de_Carreras auto;
    private boolean ite;

    public Carrera_Autos(JLabel icono, Pista_de_Carreras auto) {
        this.icono = icono;
        this.auto = auto;
    }

    @Override
    public void run() {
        int peach = 0;
        int yoshi = 0;
        int mario = 0;
        int kong = 0;
        int numeroAleatorio;
        
        while (ite) {
            try {
                numeroAleatorio = numAleatorio(1, 10);
                sleep(100);
                peach = auto.getPeach().getLocation().x;

                yoshi = auto.getYoshi().getLocation().x;
                mario = auto.getMario().getLocation().x;
                kong = auto.getDK().getLocation().x;
                if (peach < auto.getMeta().getLocation().x - 120 && yoshi < auto.getMeta().getLocation().x - 120 && mario < auto.getMeta().getLocation().x - 120 && kong < auto.getMeta().getLocation().x - 120) {
                    icono.setLocation(icono.getLocation().x + numeroAleatorio, icono.getLocation().y);
                    auto.repaint();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("");
            }
            if (icono.getLocation().x >= auto.getMeta().getLocation().x - 120) {
                if (peach > yoshi && peach > mario && peach > kong) {
                    JOptionPane.showMessageDialog(null, "Gano Peach");
                } else if (yoshi > peach && yoshi > mario && yoshi > kong) {
                    JOptionPane.showMessageDialog(null, "Gano Yoshi");
                } else if (mario > peach && mario > yoshi && mario > kong) {
                    JOptionPane.showMessageDialog(null, "Gano MArio");
                } else if (kong > peach && kong > yoshi && kong > mario) {
                    JOptionPane.showMessageDialog(null, "Gano Don King Kong");
                } else {
                    JOptionPane.showMessageDialog(null, "Empate");
                }
            }
        }
    }

    public static int numAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) - (minimo));
        return num;
    }
    public void ini(){
    ite=true;
    new Thread(this).start();
    }  
}
