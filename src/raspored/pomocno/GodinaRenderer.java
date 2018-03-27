/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.pomocno;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import raspored.model.Godina;
import raspored.model.Smjer;

/**
 *
 * @author FeritApostol
 */
public class GodinaRenderer extends JLabel implements ListCellRenderer<Godina> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Godina> list, Godina godina, int index,
        boolean isSelected, boolean cellHasFocus) {
        
       
        String g = godina.getBroj_godine()+ "                                                                 ";
        setOpaque(true);
          
        return this;
    }
    
}
