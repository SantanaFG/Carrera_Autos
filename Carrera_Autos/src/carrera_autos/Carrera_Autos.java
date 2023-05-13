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
public class Carrera_Autos extends Thread{
    private JLabel icono;
    private Pista_de_Carreras auto;

    public Carrera_Autos(JLabel icono, Pista_de_Carreras auto) {
        this.icono = icono;
        this.auto = auto;
    }

    @Override
    public void run() {
        int rayo = 0;
        int ramon = 0;
        int storm = 0;
        int francesco = 0;
        while(true){
            try{
                sleep((int)(Math.random() * 1000));
                rayo = auto.getRayoMacqueen().getLocation().x;
                ramon= auto.getRamon().getLocation().x;
                storm = auto.getStorm().getLocation().x;
                francesco = auto.getFrancesco().getLocation().x;
                if (rayo < auto.getMeta().getLocation().x-120 && ramon < auto.getMeta().getLocation().x-120 && storm < auto.getMeta().getLocation().x-120 && francesco < auto.getMeta().getLocation().x-120) {
                    icono.setLocation(icono.getLocation().x + 10, icono.getLocation().y);
                    auto.repaint();
                }else{
                    break;
                }
                
            }catch(Exception e){
                System.out.println("");
            }
            if (icono.getLocation().x >= auto.getMeta().getLocation().x-120) {
                if (rayo > ramon && rayo > storm && rayo > francesco) {
                    JOptionPane.showMessageDialog(null,"Gano Rayo");
                }else if (ramon > rayo && ramon > storm && ramon > francesco) {
                    JOptionPane.showMessageDialog(null,"Gano Ramon");
                }else if (storm > rayo && storm > ramon && storm > francesco) {
                    JOptionPane.showMessageDialog(null,"Gano Storm");
                }else if (francesco > rayo && francesco > ramon && francesco > storm) {
                    JOptionPane.showMessageDialog(null,"Gano Francesco");
                }else{
                    JOptionPane.showMessageDialog(null,"Empate");
                }
            }
        }        
    }
    
    
        
}
