package interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jeu2vie.Generation;

/**
 * Action lorsque l'on clique sur une des cases de cellules et change son etat si cela est encore possible
 * @author jc&Tiemoko
 */
class Click implements ActionListener {
    private int posx, posy;
    
    /**
     * Action lorsque la case cellule est clique
     * @param e 
     */
    public void actionPerformed(ActionEvent e){
            CaseVie button=(CaseVie)(e.getSource());
            System.out.println("x : "+posx+" y: "+posy);
            Generation.setGridAffiche(posx, posy, false);
            if(button.getIsConfig()){
                button.setEtat();
            }       
         } 
        
        /**
         * Initialise la position locale du bouton par rapport a la grille de cellules
         * @param x Position dans les lignes de la grille 
         * @param y Position dans les colonnes de la grille
         * @see Initialise la position du bouton cliqué dans la grille des réponses
         */
        public void position(int x, int y) {
            posx= x;
            posy= y;
        }
}
