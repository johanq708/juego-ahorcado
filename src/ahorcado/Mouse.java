/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Johan Quiñonez
 */
public class Mouse implements MouseListener{
    private JAhorcado ja;
    
    public Mouse(JAhorcado ja){
        this.ja=ja;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(ja.getA().contains(e.getPoint())){
            ja.setDa(0);
        }else
        if(ja.getB().contains(e.getPoint())){
            ja.setDb(0);
        }else
        if(ja.getC().contains(e.getPoint())){
            ja.setDc(0);
        }else
        if(ja.getE().contains(e.getPoint())){
            ja.setDe(0);
        }else
        if(ja.getI().contains(e.getPoint())){
            ja.setDi(0);
        }else
        if(ja.getL().contains(e.getPoint())){
            ja.setDl(0);
        }else   
        if(ja.getT().contains(e.getPoint())){
            ja.setDt(0);
        }
        for(int i=0;i<ja.getFallo().size();i++){
            if(ja.getFallo().get(i).contains(e.getPoint())){
                ja.setX(ja.getJ());
                ja.setY(ja.getK());
                ja.setJ(ja.getJ()+1);
                if(ja.getJ()==4){
                    ja.setJ(0);
                    ja.setK(1);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
