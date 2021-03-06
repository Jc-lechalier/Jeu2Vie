package interfaces;

import jeu2vie.Generation;
import java.awt.GridLayout;

/**
 * Classe principale de l'interface de l'application
 * @author jc&Tiemoko
 */
public class MainFrame extends javax.swing.JFrame {
    Generation generation;
    public MainFrame() {
        initComponents();
        generation = new Generation();
        // creation grille
        this.grilleVie.removeAll();
        this.grilleVie.setLayout(new GridLayout(Generation.longX, Generation.longY));
        for (int i = 0; i < Generation.longX; i++) {
            for (int j = 0; j < Generation.longY; j++) {
                CaseVie bouton = new CaseVie();
                Click cc = new Click();
                cc.position(i, j);
                bouton.addActionListener(cc);
                this.grilleVie.add(bouton);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grilleVie = new javax.swing.JPanel();
        btn_generation = new javax.swing.JButton();
        btn_nextGen = new javax.swing.JButton();
        spin_longX = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        spin_longY = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        btn_validateSize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grilleVie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        grilleVie.setPreferredSize(new java.awt.Dimension(600, 600));
        grilleVie.setRequestFocusEnabled(false);

        javax.swing.GroupLayout grilleVieLayout = new javax.swing.GroupLayout(grilleVie);
        grilleVie.setLayout(grilleVieLayout);
        grilleVieLayout.setHorizontalGroup(
            grilleVieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        grilleVieLayout.setVerticalGroup(
            grilleVieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        btn_generation.setText("Generation");
        btn_generation.setToolTipText("");
        btn_generation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generationActionPerformed(evt);
            }
        });

        btn_nextGen.setText("Suivant");
        btn_nextGen.setEnabled(false);
        btn_nextGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextGenActionPerformed(evt);
            }
        });

        spin_longX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        spin_longX.setModel(new javax.swing.SpinnerNumberModel(10, 5, 100, 1));
        spin_longX.setMaximumSize(new java.awt.Dimension(28, 20));
        spin_longX.setMinimumSize(new java.awt.Dimension(28, 20));
        spin_longX.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel1.setText("X");

        spin_longY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        spin_longY.setModel(new javax.swing.SpinnerNumberModel(10, 5, 100, 1));
        spin_longY.setMaximumSize(new java.awt.Dimension(28, 20));
        spin_longY.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel2.setText("Y");

        btn_validateSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validateSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grilleVie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_generation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_nextGen)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spin_longX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spin_longY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_validateSize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_generation)
                        .addComponent(btn_nextGen)
                        .addComponent(spin_longX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(spin_longY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(btn_validateSize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(grilleVie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generationActionPerformed
        if(Generation.isConfig){
           //disable all button
           Generation.isConfig = false;
           this.btn_generation.setText("Arret");
           this.btn_nextGen.setEnabled(true);
           //recup all Button state
           recupAllButtonState();
           Generation.doGen();
        }else{
            Generation.isConfig = true;
            this.btn_nextGen.setEnabled(false);
            this.btn_generation.setText("Generation");
        }
    }//GEN-LAST:event_btn_generationActionPerformed

    private void btn_nextGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextGenActionPerformed
        Generation.doGen();
    }//GEN-LAST:event_btn_nextGenActionPerformed

    private void btn_validateSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validateSizeActionPerformed
        //maj de la valeur de lognX et de longY
        Generation.longX= Integer.parseInt(this.spin_longX.getValue().toString());
        Generation.longY= Integer.parseInt(this.spin_longY.getValue().toString());
        Generation.reInitObjets();
        // creation grille
        this.grilleVie.removeAll();
        this.grilleVie.setLayout(new GridLayout(Generation.longX, Generation.longY));
        for (int i = 0; i < Generation.longX; i++) {
            for (int j = 0; j < Generation.longY; j++) {
                CaseVie bouton = new CaseVie();
                Click cc = new Click();
                cc.position(i, j);
                bouton.addActionListener(cc);
                this.grilleVie.add(bouton);
            }
        }
    }//GEN-LAST:event_btn_validateSizeActionPerformed

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
                new MainFrame().setVisible(true);  
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generation;
    private javax.swing.JButton btn_nextGen;
    private javax.swing.JButton btn_validateSize;
    public static javax.swing.JPanel grilleVie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner spin_longX;
    private javax.swing.JSpinner spin_longY;
    // End of variables declaration//GEN-END:variables

    /**
     * Met a jour la grille effective des cellules avec les etats de chaque bouton 
     */
    private void recupAllButtonState() {
        for (int i = 0; i < Generation.longX; i++) {
            for (int j = 0; j < Generation.longY; j++) {
                CaseVie bouton = (CaseVie)this.grilleVie.getComponent(Generation.longX*i+j);
                Generation.setGridAffiche(i, j, bouton.getEtat());
            }
        }
    }
    
    /**
     * Met a jour les boutons de la grille de cellules
     */
    public static void repaintGrille(){
        for (int i = 0; i < Generation.longX; i++) {
            for (int j = 0; j < Generation.longY; j++) {
                CaseVie btn = (CaseVie)grilleVie.getComponent(Generation.longX*i+j);
                btn.setEtat(Generation.getGridAffiche(i, j));
                btn.repaint();
            }
        }
    }
}
