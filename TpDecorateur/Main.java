package decorateur;

public class Main {
    public static void main(String[] args) {
        Assurance assurance = new DommageEtCollision(new Incendie(new AssuranceVoiture()));
        System.out.println("Le frais totale de votre assurance est "+assurance.cost()+" DH");
    }
}
