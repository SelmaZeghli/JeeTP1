public class Main {
    public static void main(String[] args) {
        BiblioList biblioList = new BiblioList();
        Livre livre = new Livre();
        livre.setAuteur("Author 1");
        livre.setTitle("Title 1");
        livre.setEditeur("Editor 1");
        biblioList.add(livre);

        System.out.println(biblioList.toString());
    }
}