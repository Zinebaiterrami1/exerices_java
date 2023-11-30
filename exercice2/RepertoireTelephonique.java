import java.util.*;
public class RepertoireTelephonique {



    Map<String, String> repo = new HashMap<>();

   public void ajouterEntree(String nom, String numero) 
    {
        if(repo.containsKey(nom))
        {
            System.out.println("the name is already exit !");
        }
        else{
            repo.put(nom,numero);
        }
    }

    public void supprimerEntree(String nom)
    {
        if(repo.containsKey(nom))
        {
            repo.remove(nom);
        }
        else{
            System.out.println("name doesn't exist !");
        }
    }

    public String rechercherNumero(String nom) 
    {
        if(repo.containsKey(nom))
        { 
            
          System.out.println("nice");
           return repo.get(nom);
        
        }else{
       
            System.out.println("name doesn't exist !");
            return "";
        }
    }

    
    public void afficherRepertoire()
    {
       for(int i=0 ; i<1 ;i++)
       {
        System.out.println( repo.keySet());
         System.out.println(repo.values());
       }

    }
    
}