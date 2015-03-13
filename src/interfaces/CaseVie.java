package interfaces;

/**
 *
 * @author Jc&Tiemoko
 * @see représente une case dans la grille de jeu
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;
import jeu2vie.Generation;

/**
 * Bouton qui represente la cellule du jeu de la vie
 * @author jc&Tiemoko
 */
public class CaseVie extends JButton {
    /**
     * Etat du bouton (si la cellule est vivante sur la case ou pas)
     */
    private Boolean etat;
   
   /**
    * Initialise le bouton sans cellule vivante (etat=false)
    */
   public CaseVie() {
      etat=false;
   }
    
/**
 * Recoloris le bouton pour que visuellement de on voit si il est clique (etat=false) 
 * ou si il ne l'ai pas (etat=true)
 * @param g 
 * @see etat =0 -> pas de cellule
 * @see etat =1 -> cellule
 */  
    @Override
   public void paint(Graphics g) {
        super.paint(g);
        this.setMaximumSize(new Dimension(20,20));
        this.setMinimumSize(new Dimension(20,20));
        
        if(etat==false) {
           this.setBackground(Color.WHITE);
        }
        else if(etat==true) {
             this.setBackground(Color.BLACK);
        }
       this.repaint();
    }
   
   /**
    * Permet de changer l'etat du bouton (clique ou non) 
    * @see Change l'etat du bouton en !etat actuel
    * 
    */
   public void setEtat() {
      this.etat= (!this.etat);
  }
   /**
    * Permet de mettre a jour l'etat du bouton
    * @param b Boolean que l'on veut mettre a la place de la valeur actuelle
    */
  public void setEtat(Boolean b) {
      this.etat= b;
  } 
 /**
  * Retourne l'etat du bouton
  * @return l'indice de l'état du bouton
  */
  public Boolean getEtat()
  {
      return this.etat;
  }
  /**
   * Retourne vrai si le bouton est cliquable
   * @return vrai si le bouton est cliquable
   */
  public Boolean getIsConfig(){
      return Generation.isConfig;
  }
}