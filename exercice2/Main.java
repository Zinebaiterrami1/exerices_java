
public class Main {
    public static void main(String[] args){

        RepertoireTelephonique test = new RepertoireTelephonique();
        test.ajouterEntree("zineb","0666523145");
        test.ajouterEntree("aicha","0526314521");
        test.ajouterEntree("aicha²","021014552");
        test.ajouterEntree("nouha","0201541654");
        test.afficherRepertoire();
        test.rechercherNumero("zineb");
        test.supprimerEntree("imane");
        test.supprimerEntree("aicha");
        test.afficherRepertoire();
        System.out.println("finish ! ");
}
}