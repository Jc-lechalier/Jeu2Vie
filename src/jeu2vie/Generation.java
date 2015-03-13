package jeu2vie;

import interfaces.MainFrame;

/**
 * Classe outils qui enregistre l'ensemble des parametres de la grille de cellules
 * @author jc&Tiemoko
 */
public class Generation {
    // ensemble des variables pour le fonctionnement de l'app
    private static Boolean[] gridAffiche;   //grille a partir laquelle on va afficher les cellules vivantes
    private static Boolean[] gridNextGen;   //grille temporaire de la prochaine generation
    public static int longX=10, longY=10;   //taille de la grille pour la simulation
    public static Boolean isConfig = true;  //Vrai si la generation automatique des cellules n'est pas demarre
    private static Regles rules;
    
    /**
     * Construteur
     */
    public Generation(){
        initObjets();
        rules = new Regles();
    }
    /**
     * Generation d'une generation de cellule suivante
     */
    public static void doGen(){
            rules.doNextGeneration();
            //repaint toute la grille
            MainFrame.repaintGrille();
    }
    
    /**
     * Reinitialise les matrices de generations (visible et suivante)
     */
    public static void reInitObjets() {
        Generation.gridAffiche= new Boolean[Generation.longX*Generation.longY];
        Generation.gridNextGen= new Boolean[Generation.longX*Generation.longY];
    }
    
    /**
     * Initialise les matrices de generations (visible et suivante)
     */
    private void initObjets() {
        Generation.gridAffiche= new Boolean[Generation.longX*Generation.longY];
        Generation.gridNextGen= new Boolean[Generation.longX*Generation.longY];
    }
    
    /**
     * Met a jour la valeur de la cellule pour la case donnee en parametre
     * @param x position x dans la grille
     * @param y position y dans la grille
     * @param b valeur de la cellule (vrai -> cellule faux -> pas de cellule)
     */
    public static void setGridAffiche(int x, int y, Boolean b){
       Generation.gridAffiche[(Generation.longX*x+y)]=b;
    }
    
    /**
     * Met a jour la matrice temporaire pour la generation suivante
     * @param x Position x dans la grille
     * @param y Position y dans la grille
     * @param b valeur de la cellule (vrai -> cellule faux -> pas de cellule)
     */
    public static void setGridNextGen(int x, int y, Boolean b){
       Generation.gridNextGen[(Generation.longX*x+y)]=b;
    }
    
    /**
     * Donne la valeur de la cellule pour la case donnee
     * @param x Position x dans la grille
     * @param y Position y dans la grille
     * @return 
     */
    public static Boolean getGridAffiche(int x, int y){
        return Generation.gridAffiche[(Generation.longX*x+y)];
    }
    
    /**
     * Donne la valeur de la cellule pour la case donnee de la generation suivante
     * @param x Position x dans la grille
     * @param y Position y dans la grille
     * @return 
     */
    public static Boolean getGridNextGen(int x, int y){
        return Generation.gridNextGen[(Generation.longX*x+y)];
    }
    
    /**
     * Met a jour la grille visible avec la grille construite temporairement
     * La generation suivante devient la generation courante
     */
    public static void validateNextGen(){
        Generation.gridAffiche= Generation.gridNextGen;
    }
}
