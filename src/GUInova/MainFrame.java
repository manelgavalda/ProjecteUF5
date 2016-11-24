/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUInova;

import static GUI.MainFrame.equips;
import static GUI.MainFrame.jugatPer;
import java.awt.event.WindowEvent;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ListSelectionModel;
import javax.swing.table.AbstractTableModel;
import model.Equip;
import model.Jugador;

/**
 *
 * @author manel
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        initElsMeusComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setText("CRUD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.CENTER);

        jButton2.setText("Llistar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, java.awt.BorderLayout.PAGE_START);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel3.setText("Welcome");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel3)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel3)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, "card2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, "card3");

        jLabel2.setText("Nom");

        jLabel4.setText("Email");

        jLabel5.setText("Altura");

        jLabel6.setText("Pes");

        jTextField1.setText("Pepito");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("pepito@example.com");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("1,80");

        jLabel7.setText("m");

        jTextField4.setText("80");

        jLabel8.setText("kg");

        jButton4.setText("Afegir");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");

        jButton6.setText("Cancelar");

        jButton7.setText("Borrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7)))))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            //Creo un nou objecte passant el nom de les columnes, i les dades a mostrar contingudes a un ArrayList
        ModelTaula<Jugador> mt = new ModelTaula(new String[]{"Nom", "Email","Altura","Pes"}, MainFrame.jugatPer, Jugador.class);
        //mt = new ModelTaula(JFramePrincipal.agenda, Contacte.class);
        
        //Li assigno el model a la taula
        jTable1.setModel(mt);
        
        //Si volem canviar l'ordre de visualització de les columnes, borra-les, etc...
        //TableColumnModel cm=jTable1.getColumnModel();
        //cm.moveColumn(0, 1);    //La primer columna passa a mostrar-se en 2n lloc
        //cm.removeColumn(cm.getColumn(2));


        jPanel2.removeAll();
        jPanel2.revalidate();
        jPanel2.add(jPanel4);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        //Creo un nou objecte passant el nom de les columnes, i les dades a mostrar contingudes a un ArrayList
        ModelTaula<Equip> mt = new ModelTaula<>(new String[]{"Nom", "Regio","Lliga","Posició Lliga"}, new ArrayList(MainFrame.equips), Equip.class);
        //mt = new ModelTaula<>(new ArrayList(JFramePrincipal.telefons), Telefon.class);
        
        //Li assigno el model a la taula
        jTable2.setModel(mt);
        
        //Si volem canviar l'ordre de visualització de les columnes, borra-les, etc...
        //TableColumnModel cm=jTable1.getColumnModel();
        //cm.moveColumn(0, 1);    //La primer columna passa a mostrar-se en 2n lloc
        //cm.removeColumn(cm.getColumn(2));
        
        ModelTaula<Jugador> mt2 = new ModelTaula<>(new String[]{"Nom", "Email","Altura","Pes", "Equips jugats"}, MainFrame.jugatPer, Jugador.class);
        //mt2 = new ModelTaula<>(JFramePrincipal.agenda, Contacte.class);
        
        //Li assigno el model a la taula
        //jTable3.setModel(mt2);
        
        jButton5.setEnabled(false);
        jButton7.setEnabled(false);
        

        jPanel2.removeAll();
        jPanel2.revalidate();
        jPanel2.add(jPanel5);
        jPanel2.revalidate();
        jPanel2.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Jugador c = new Jugador(jTextField1.getText(),jTextField2.getText());
        ArrayList<Equip> a=new ArrayList<>();

        //Afegim com a telèfons del contacte els seleccionats a la taula de telèfons
        ListSelectionModel lsm=jTable2.getSelectionModel();
        for(int i=lsm.getMinSelectionIndex();i<=lsm.getMaxSelectionIndex();i++)
            if(lsm.isSelectedIndex(i)) a.add((Equip)jTable2.getModel().getValueAt(i, -1));
        //Com no tenim CRUD de telèfons s'inserten quan convé en codi
        a.add(new Equip("Harlequins", "Inglaterra"));
        a.add(new Equip("Toulon", "França"));
        c.set8haJugatPer(a);
        MainFrame.jugatPer.add(c);
        
        ModelTaula<Jugador> mt2 = new ModelTaula<>(new String[]{"Nom", "Email", "Equips"}, MainFrame.jugatPer, Jugador.class);
        //mt2 = new ModelTaula<>(JFramePrincipal.agenda, Contacte.class);
        
        //Li assigno el model a la taula
        jTable3.setModel(mt2);
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void initElsMeusComponents() throws FileNotFoundException, IOException, ClassNotFoundException {
             //Vector per guardar els nostres contactes
             jugatPer =new ArrayList<>(); 
             equips= new TreeSet<>();
             
             //Santi 21-11-2016. El fitxer en les dades de l'agenda se diu "agenda.dat"
             File f= new File("jugatPer.dat");    //Si no s'especifica cap directori s'usa el del projecte
             //Si el fitxer ja existeix copiem el seu contingut al vector agenda. 
             if(f.exists()){
                ObjectInputStream entrada=new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
               
                while(true)
                {
                    try{
                        Jugador c=(Jugador)entrada.readObject();
                        jugatPer.add(c);
                        ArrayList<Equip> lt=c.get8haJugatPer();
                        equips.addAll(lt);
                    }
                    catch(Exception ex){
                        break;
                    }
                }
                entrada.close();      
             }
             //CUidao que borra el panell
             
            jPanel2.removeAll();
            jPanel2.revalidate();
            jPanel2.repaint();

    }
    
    //Col·leccions meves.
    public static ArrayList<Jugador>jugatPer;
    public static TreeSet<Equip> equips;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

class ModelTaula<T> extends AbstractTableModel {
    
    final Class<T> typeParameterClass;

    private String[] columnNames;
    private List<T> dades;

    //Constructor on passem el nom de les columnes que vulguem. Mostrarà tantes columnes com noms passem
    public ModelTaula(String[] nomColumnes, ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        
        this.columnNames = nomColumnes;
        this.dades = dades;
    }

    //Constructor on passem el nom de les dades i obté les columnes de la pròpia classe
    public ModelTaula(ArrayList<T> dades, Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
        if(dades!=null && !dades.isEmpty()){
            //Obtinc els noms de les columnes a partir de la reflexió de la classe
            //Class<?> classe = dades.get(0).getClass();
            Class<?> classe = this.typeParameterClass;

            //Anoto el nº de camps de la classe
            int ncamps = classe.getDeclaredFields().length;

            //Omplo l'array de noms de columna a partir del camps de la classe. Se suposa que el format dels noms dels camps 
            //és _xnom_camp, sent x un enter major o igual que 0, per això elimino els dígits i el _
            this.columnNames=new String[ncamps];

            for(int i=0;i<ncamps;i++){
                //Busquem el primer grup de _dígits numèrics del nom de camp
                Matcher matcher = Pattern.compile("_\\d+").matcher(classe.getDeclaredFields()[i].getName());
                matcher.find();
                //El nom que mostrarem serà a partir del següent caracter que hi ha després del _grup numèric trobat
                this.columnNames[i]=classe.getDeclaredFields()[i].getName().substring(matcher.group().length()).toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_0-9]", "").toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_\\d]", "").toUpperCase();
            }
        }
        this.dades = dades;
    }

    //Necessari per a que mostre el nom de les columnes passat al crear l'objecte
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    //Necessari per a que mostre el número correcte de files de dades
    @Override
    public int getRowCount() {
        int cont=0;
        
        if(dades!=null) cont=dades.size();
        
        return cont;
    }

    //Necessari per a que mostre el número correcte de columnes 
    @Override
    public int getColumnCount() {
        
        int cont=0;
        
        if(columnNames!=null) cont=columnNames.length;
        
        return cont;
    }

    //Necessari per a que mostre les dades passades al crear l'objecte
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Si demanen la columna -1 vol dir que hem de retornar tot l'objecte contingut a la fila
        if(columnIndex==-1) return dades.get(rowIndex);
        Class<?> classe = this.typeParameterClass;
        //Class<?> classe = dades.get(0).getClass();
        //Anotem el nº de camps de la classe
        int ncamps = classe.getDeclaredFields().length;

        Method[] methods = new Method[ncamps];
        int i = 0;
        try {
            for (PropertyDescriptor pD : Introspector.getBeanInfo(classe).getPropertyDescriptors()) {
                Method m = pD.getReadMethod();
                if (m != null & !m.getName().equals("getClass")) {
                    methods[i++] = m;
                }
            }
        } catch (java.beans.IntrospectionException ex) {
            //Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            return methods[columnIndex].invoke(dades.get(rowIndex));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
