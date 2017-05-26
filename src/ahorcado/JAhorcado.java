/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Johan Quiñonez
 */
public class JAhorcado extends JPanel implements ActionListener{
    private int k=0;
    private int j=0;
    private int x=0;
    private int y=0;
    private int da=2000;
    private int db=2000;
    private int dc=2000;
    private int de=2000;
    private int di=2000;
    private int dl=2000;
    private int dt=2000;
    private Timer timer;

    public JAhorcado() {
        addMouseListener(new Mouse(this));
        setFocusable(true);
        timer = new Timer(70, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("ahorcado.png");
        Image letras =loadImage("abecedario.jpg");
        Image a = loadImage("a.jpg");
        Image b = loadImage("b.png");
        Image c = loadImage("c.jpg");
        Image e = loadImage("e.jpg");
        Image i = loadImage("i.jpg");
        Image l = loadImage("l.jpg");
        Image t = loadImage("t.jpg");
        g.drawImage(fondo, 0, 50, 200, 250, x*90, y*100, (x*90)+90, (y*100)+100, this);
        g.drawImage(letras, 200, 250, 574, 343, this);
        g.drawImage(b, 200, 50+db, 50, 50, this);
        g.drawImage(i, 250, 50+di, 50, 50, this);
        g.drawImage(c, 300, 50+dc, 50, 50, this);
        g.drawImage(i, 350, 50+di, 50, 50, this);
        g.drawImage(c, 400, 50+dc, 50, 50, this);
        g.drawImage(l, 450, 50+dl, 50, 50, this);
        g.drawImage(e, 500, 50+de, 50, 50, this);
        g.drawImage(t, 550, 50+dt, 50, 50, this);
        g.drawImage(a, 600, 50+da, 50, 50, this);
        for(int j=205;j<650;j+=50){
            g.drawLine(j, 99, j+40, 99);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if((j==4)&&(k==1)){
            JOptionPane.showMessageDialog(this, "ahorcado, perdio el juego");
            timer.stop();
        }
        repaint();
    }

    public Image loadImage(String nombre) {
        ImageIcon ii = new ImageIcon(nombre);
        Image image = ii.getImage();
        return image;
    }

    public Rectangle getA(){
        return new Rectangle(208,259,67,69);
    }
    public Rectangle getB(){
        return new Rectangle(289,259,67,69);
    }
    public Rectangle getC(){
        return new Rectangle(377,259,67,69);
    }
    public Rectangle getE(){
        return new Rectangle(537,259,67,69);
    }
    public Rectangle getI(){
        return new Rectangle(289,345,67,69);
    }
    public Rectangle getL(){
        return new Rectangle(537,345,67,69);
    }
    public Rectangle getT(){
        return new Rectangle(701,431,67,69);
    }
    public ArrayList<Rectangle> getFallo(){
        ArrayList <Rectangle> fallo = new ArrayList<>();
        fallo.add(new Rectangle(206,433,480,152));//grande
        fallo.add(new Rectangle(618,259,146,148));//fgmn
        fallo.add(new Rectangle(458,259,67,147));//dk
        fallo.add(new Rectangle(376,347,67,69));//j
        fallo.add(new Rectangle(208,345,67,69));//h
        return fallo;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public void setDi(int di) {
        this.di = di;
    }

    public void setDl(int dl) {
        this.dl = dl;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    } 

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
}
