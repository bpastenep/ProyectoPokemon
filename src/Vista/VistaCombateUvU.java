package Vista;
import Controlador.ControladorCombate;
import Controlador.ControladorPrincipal;
import Modelo.Pokemon;
import javax.swing.JOptionPane;
public class VistaCombateUvU extends javax.swing.JDialog {
    
    int op1;
    int op2;
    private ControladorCombate cc;
    private ControladorPrincipal cp;
    String[] equipoTest1;
    String[] equipoTest2;
    Pokemon[] equipoP1;
    Pokemon[] equipoP2;
    String usua1;
    String usua2;
    //Pokemones creados para la prueba
    
    /**
     * Creates new form VentanaCombate
     */
    public VistaCombateUvU(ControladorCombate cco, ControladorPrincipal op,String usu1, String usu2, Pokemon[] equipo, Pokemon[] equipo2) {
        initComponents();
        this.cp = op;
        this.cc = cco;
        this.equipoP1 = equipo;
        this.equipoP2 = equipo2;
        this.usua1=usu1;
        this.usua2=usu2;
        System.out.println(equipoP1[0].getNombre()+ " "+ equipo2[0].getNombre());
        String[] ataquesp1=cc.asignaA(equipoP1);
        String[] ataquesp2=cc.asignaA(equipoP2);
        ataques1.setModel(new javax.swing.DefaultComboBoxModel(ataquesp1));
        ataques1.setEnabled(false);
        ataques2.setModel(new javax.swing.DefaultComboBoxModel(ataquesp2));
        ataques2.setEnabled(false);
        equipoTest1 = cc.asignaP(equipoP1);
        equipoTest2 = cc.asignaP(equipoP2);
        pokemon1.setModel(new javax.swing.DefaultComboBoxModel(equipoTest1));
        pokemon1.setEnabled(false);
        pokemon2.setModel(new javax.swing.DefaultComboBoxModel(equipoTest2));
        pokemon2.setEnabled(false);
        pokemonActivo1.setText(equipoP1[0].getNombre());
        pokemonActivo2.setText(equipoP2[0].getNombre());
        usuv1.setText(usu1);
        usuv2.setText(usu2);
        Hp1.setText(Integer.toString(equipoP1[0].getPS()));
        Hp2.setText(Integer.toString(equipoP2[0].getPS()));
        barraHp1.setValue(cc.barraHp(equipoP1));
        barraHp2.setValue(100);
    }   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuv1 = new javax.swing.JLabel();
        ataques1 = new javax.swing.JComboBox();
        pokemon1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuv2 = new javax.swing.JLabel();
        ataques2 = new javax.swing.JComboBox();
        pokemon2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pokemonActivo1 = new javax.swing.JLabel();
        pokemonActivo2 = new javax.swing.JLabel();
        Hp1 = new javax.swing.JLabel();
        Hp2 = new javax.swing.JLabel();
        barraHp2 = new javax.swing.JProgressBar();
        barraHp1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        usuv1.setText("Usuario1");
        getContentPane().add(usuv1);
        usuv1.setBounds(80, 230, 42, 14);

        ataques1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataques1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataques1ActionPerformed(evt);
            }
        });
        getContentPane().add(ataques1);
        ataques1.setBounds(91, 113, 90, 20);

        pokemon1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon1ActionPerformed(evt);
            }
        });
        getContentPane().add(pokemon1);
        pokemon1.setBounds(260, 110, 100, 20);

        jLabel3.setText("HP: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(116, 155, 30, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ataque.png"))); // NOI18N
        jLabel4.setText("Ataque");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-60, 110, 160, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pokemon.png"))); // NOI18N
        jLabel5.setText("Pokémon");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 110, 150, 20);

        usuv2.setText("Usuario2");
        getContentPane().add(usuv2);
        usuv2.setBounds(280, 230, 42, 14);

        ataques2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataques2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataques2ActionPerformed(evt);
            }
        });
        getContentPane().add(ataques2);
        ataques2.setBounds(90, 320, 100, 20);

        pokemon2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(pokemon2);
        pokemon2.setBounds(266, 320, 100, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ataque.png"))); // NOI18N
        jLabel7.setText("Ataque");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-60, 320, 150, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pokemon.png"))); // NOI18N
        jLabel8.setText("Pokemon");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 320, 160, 20);

        jLabel9.setText("HP:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(114, 379, 30, 14);

        jButton1.setText("SimularTurno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(149, 428, 95, 23);

        jButton2.setText("Atacar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(91, 63, 100, 23);

        jButton3.setText("Cambiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 60, 100, 23);

        jButton4.setText("Atacar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(90, 280, 100, 23);

        jButton5.setText("Cambiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(260, 280, 110, 23);

        pokemonActivo1.setText("jLabel10");
        getContentPane().add(pokemonActivo1);
        pokemonActivo1.setBounds(10, 155, 80, 14);

        pokemonActivo2.setText("jLabel10");
        getContentPane().add(pokemonActivo2);
        pokemonActivo2.setBounds(11, 379, 80, 14);

        Hp1.setText("HP1");
        getContentPane().add(Hp1);
        Hp1.setBounds(290, 153, 80, 30);

        Hp2.setText("hp2");
        getContentPane().add(Hp2);
        Hp2.setBounds(280, 373, 30, 20);
        getContentPane().add(barraHp2);
        barraHp2.setBounds(136, 380, 140, 12);
        getContentPane().add(barraHp1);
        barraHp1.setBounds(140, 160, 146, 12);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaCombate4.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pokemon1.setEnabled(false);
        ataques1.setEnabled(true);
        op1 = 1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       pokemon1.setEnabled(true);
       ataques1.setEnabled(false);
       op1 = 2;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pokemon2.setEnabled(false);
        ataques2.setEnabled(true);
        op2 = 1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pokemon2.setEnabled(true);
        ataques2.setEnabled(false);
        op2 = 2;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon1ActionPerformed

    private void ataques1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataques1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ataques1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(op1==0 || op2==0){ // <<-- if Interviene en la ejecucion??
            JOptionPane.showMessageDialog(null, "¡Ambos jugadores deben seleccionar una opción!");
        }
        else{
            equipoP2=cc.realizarAccion(op2,pokemon2.getSelectedIndex(),equipoP2,equipoP1, ataques2.getSelectedIndex());
            equipoP1=cc.realizarAccion(op1,pokemon1.getSelectedIndex(),equipoP1,equipoP2, ataques1.getSelectedIndex());
            pokemonActivo1.setText(equipoP1[0].getNombre());
            pokemonActivo2.setText(equipoP2[0].getNombre());
            Hp1.setText(Integer.toString(equipoP1[0].getPS()));
            Hp2.setText(Integer.toString(equipoP2[0].getPS()));
            pokemon1.setModel(new javax.swing.DefaultComboBoxModel(equipoTest1));
            pokemon2.setModel(new javax.swing.DefaultComboBoxModel(equipoTest2));
            op1=0;
            op2=0;
            if(cc.hpTotal(equipoP1)){
                JOptionPane.showMessageDialog(null, "El ganador es "+usua2);
                this.setVisible(false);
            }
            if(cc.hpTotal(equipoP2)){
                JOptionPane.showMessageDialog(null, "El ganador es "+usua1);
                this.setVisible(false);
            }
            pokemon1.setEnabled(false);
            pokemon2.setEnabled(false);
            ataques1.setEnabled(false);
            ataques2.setEnabled(false);
            barraHp1.setValue(cc.barraHp(equipoP1));
            System.out.println(cc.barraHp(equipoP1));
            barraHp2.setValue(cc.barraHp(equipoP2));
            System.out.println(cc.barraHp(equipoP1));        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ataques2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataques2ActionPerformed
        
    }//GEN-LAST:event_ataques2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hp1;
    private javax.swing.JLabel Hp2;
    private javax.swing.JComboBox ataques1;
    private javax.swing.JComboBox ataques2;
    private javax.swing.JProgressBar barraHp1;
    private javax.swing.JProgressBar barraHp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox pokemon1;
    private javax.swing.JComboBox pokemon2;
    private javax.swing.JLabel pokemonActivo1;
    private javax.swing.JLabel pokemonActivo2;
    private javax.swing.JLabel usuv1;
    private javax.swing.JLabel usuv2;
    // End of variables declaration//GEN-END:variables
}
