/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raspored.view;

import raspored.pomocno.SmjerRenderer;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import raspored.controller.Obrada;
import raspored.model.Smjer;
import raspored.pomocno.HibernateUtil;

/**
 *
 * @author Admin
 */
public class Smjerovi extends javax.swing.JFrame {
    
     private Obrada<Smjer> obrada;
     
     private Border obrub;
    /**
     * Creates new form Izbornik
     */
    public Smjerovi() {
        initComponents();
       
        obrada = new Obrada<>();
        
        lista.setCellRenderer(new SmjerRenderer());
        
        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnDodajSmjer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnObrisiSmjer = new javax.swing.JButton();
        btnPromjeniSmjer = new javax.swing.JButton();
        txtDodajOpis = new javax.swing.JTextField();
        txtDodajNaziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Smjerovi"); // NOI18N

        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista);
        lista.getAccessibleContext().setAccessibleName("");

        btnDodajSmjer.setText("Dodaj");
        btnDodajSmjer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajSmjerActionPerformed(evt);
            }
        });

        jLabel2.setText("SMJEROVI");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnObrisiSmjer.setText("Obriši");
        btnObrisiSmjer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiSmjerActionPerformed(evt);
            }
        });

        btnPromjeniSmjer.setText("Promjeni");
        btnPromjeniSmjer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniSmjerActionPerformed(evt);
            }
        });

        jLabel3.setText("Opis");

        jLabel4.setText("Naziv");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPromjeniSmjer)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addComponent(btnDodajSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnObrisiSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDodajOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDodajNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDodajNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDodajOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPromjeniSmjer)
                    .addComponent(btnDodajSmjer)
                    .addComponent(btnObrisiSmjer))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajSmjerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajSmjerActionPerformed

        resetirajGreske();
        if (!kontrola()) {
            return;
        }
        
        Smjer s = new Smjer();
        s = napuniObjekt(s);
        obrada.save(s);
        ucitajPodatke();
     
        
    }//GEN-LAST:event_btnDodajSmjerActionPerformed

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged

        evt.getValueIsAdjusting();
    }//GEN-LAST:event_listaValueChanged

    private void btnPromjeniSmjerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniSmjerActionPerformed
        Smjer s = lista.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }

        if (txtDodajNaziv.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno naziv");
            return;
        }
        if (txtDodajOpis.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Obavezno opis");
            return;
        }
        
        if (!kontrola()) {
            return;
        }
        napuniObjekt(s);
        obrada.save(s);
        ucitajPodatke();
    }//GEN-LAST:event_btnPromjeniSmjerActionPerformed

    private void btnObrisiSmjerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiSmjerActionPerformed

        Smjer s = lista.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite stavku");
            return;
        }
        
        obrada.delete(s);
        ucitajPodatke();
    }//GEN-LAST:event_btnObrisiSmjerActionPerformed

    private Smjer napuniObjekt(Smjer s) {
        s.setNaziv(txtDodajNaziv.getText());
        s.setOpis(txtDodajOpis.getText());
        return s;
    }
    
    private void ucitajPodatke() {
        
        DefaultListModel<Smjer> model = new DefaultListModel<>();

        List<Smjer> lista = HibernateUtil.getSession().createQuery(
                "from Smjer").list();

        for (Smjer s : lista) {
            model.addElement(s);
        }
        this.lista.setModel(model);

    }
    
    private void oznaciGresku(JTextField polje) {
        polje.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
        polje.requestFocus();
    }
    
     private void resetirajGreske() {
         txtDodajNaziv.setBorder(obrub);
         txtDodajOpis.setBorder(obrub);
         
    }
     
      private boolean kontrola() {
        if (txtDodajNaziv.getText().trim().length() == 0) {
            oznaciGresku(txtDodajNaziv);
            return false;
        }

        if (txtDodajOpis.getText().trim().length() == 0) {
            oznaciGresku(txtDodajOpis);
            return false;
        }
        return true;
    }

    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajSmjer;
    private javax.swing.JButton btnObrisiSmjer;
    private javax.swing.JButton btnPromjeniSmjer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Smjer> lista;
    private javax.swing.JTextField txtDodajNaziv;
    private javax.swing.JTextField txtDodajOpis;
    // End of variables declaration//GEN-END:variables
}
