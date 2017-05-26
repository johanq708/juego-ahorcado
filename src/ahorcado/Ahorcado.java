/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import javax.swing.*;
/**
 *
 * @author johit
 */
public class Ahorcado extends JFrame {

    public Ahorcado() {
        add(new JAhorcado());
    }

    public static void main(String[] args) {
        Ahorcado frame = new Ahorcado();
        frame.setTitle("Ahorcado");
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
