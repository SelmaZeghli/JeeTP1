public class Livre extends Ouvrage{
    private String auteur;
    private String title;
    private String editeur;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public String toString(){
        return "Livre: Auteur - " + auteur + ", Titre - " + title + ", Editeur - " + editeur;
    }
}
