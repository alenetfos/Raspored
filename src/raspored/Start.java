/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored;

import raspored.controller.Obrada;
import raspored.model.Smjer;
import raspored.pomocno.HibernateUtil;
import raspored.view.Godine;
import raspored.view.Početna;
import raspored.view.Smjerovi;


public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HibernateUtil.getSession();
        new Početna().setVisible(true);

    }
    
}
