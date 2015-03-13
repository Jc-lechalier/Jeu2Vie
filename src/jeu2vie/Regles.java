package jeu2vie;

/**
 * Classe outils qui regroupe l'ensemble des regles du jeu de la vie
 * @author jc&Tiemoko
 */
public class Regles {
    public void doNextGeneration(){
        //verif de toutes les cellules 
        for(int i=0; i<Generation.longX;i++){
            for(int j=0; j<Generation.longY; j++){
                verifCellule(i, j);
            }
        }
        //maj de la gridAffiche
        Generation.validateNextGen();
    }
    
    /**
     * Met a jour la valeur de la cellule passe en parametre 
     * @param x Position x de la grille
     * @param y Position y de la grille
     */
    private void verifCellule(int x, int y){
        int nbVoisin = this.getNbVoisin(x, y);
        // Si la cellule considere est vide
        if(Generation.getGridAffiche(x, y)== false){
            //& qu'il y a exactement 3 voisins : cellule nait
            if( nbVoisin== 3){
                Generation.setGridNextGen(x, y, true);
            }else{// pas de cellule a la generation suivante
                Generation.setGridNextGen(x, y, false);
            }
        }
        else{ //cellule vivante
                // cellule meurt
                if(nbVoisin<2||nbVoisin>3){
                    Generation.setGridNextGen(x, y, false);
                } else{//cellule reste vivante
                    Generation.setGridNextGen(x, y, true);
                }
        }
    }
    
    /**
     * Donne le nombre de cellule voisine de la cellule courante
     * @param posX Position x de la grille 
     * @param posY Position y de la grille
     * @return Nombre de voisin de la cellule donnee
     */
    private int getNbVoisin(int posX, int posY){
        int nbVoisins = 0;
        //cas limitrophes
        if(posX==0){ // le plus haut
            if(posY==0){ //le plus haut à gauche
                nbVoisins = validCaseHautGauche(posX, posY);
            } else { 
                if(posY==Generation.longY-1){ //le plus haut a droite
                    nbVoisins = validCaseHautDroite(posX, posY);
                }else {// le reste des plus hauts
                    nbVoisins = validCaseHaut(posX, posY);
                }
            }
        }else {
            if(posX==Generation.longX-1){//le plus bas
                if(posY==0){//le plus bas a gauche
                    nbVoisins = validCaseBasGauche(posX, posY);
                }else{
                    if(posY==Generation.longY-1){//le plus bas a droite
                        nbVoisins = validCaseBasDroite(posX, posY);
                    }else{ // le reste des plus bas
                        nbVoisins = validCaseBas(posX, posY);
                    }
                }
            }else{
                if(posY==0){ //les plus a gauche
                    nbVoisins = validCaseGauche(posX, posY);
                }else{
                    if(posY==Generation.longY-1){//les plus a droite
                        nbVoisins = validCaseDroite(posX, posY);
                    }else{//cas normal
                        nbVoisins = validCase(posX, posY);
                    }
                }  
            }
        }
        return nbVoisins;
    }

    /**
     * Retourne de nombre de voisin pour la case haut-gauche
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseHautGauche(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y+1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour la case haut-droite
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseHautDroite(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y-1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour la case bas-gauche
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseBasGauche(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y+1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour la case bas-droite
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseBasDroite(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y-1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    } 
    
    /**
     * Retourne de nombre de voisin pour les cases les plus hautes
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseHaut(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y+1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour les cases les plus basses
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseBas(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x-1, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour les cases les plus a gauche
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseGauche(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y+1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour les plus a droite
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCaseDroite(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y-1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
    
    /**
     * Retourne de nombre de voisin pour les cases de la grille or cas limittes
     * @param x Position x de la grille
     * @param y Position y de la grille
     * @return Nombre de voisin de la case
     */
    private int validCase(int x, int y) {
        int nbVoisin = 0;
        if(Generation.getGridAffiche(x-1, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y+1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x-1, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x, y-1)==true){
            nbVoisin++;
        }
        if(Generation.getGridAffiche(x+1, y-1)==true){
            nbVoisin++;
        }
        return nbVoisin;
    }
}
