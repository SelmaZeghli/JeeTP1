public class Periodique extends Ouvrage{
    private String nom;
    private int numero;
    private String periodicite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    @Override
    public String toString(){
        return "Périodique: Nom - " + nom + ", Numéro - " + numero + ", Périodicité - " + periodicite;
    }
}
