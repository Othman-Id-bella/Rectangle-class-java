public class Rectangle {
    
    private double longueur;
    private double largeur;

    
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double calculerAire() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    public void afficherDetails() {
        System.out.println("Longueur: " + longueur);
        System.out.println("Largeur: " + largeur);
        System.out.println("Aire: " + calculerAire());
        System.out.println("Périmètre: " + calculerPerimetre());
    }

    public static void main(String[] args) {
      
        Rectangle monRectangle = new Rectangle(5.0, 3.0);

        monRectangle.afficherDetails();
    }
}
