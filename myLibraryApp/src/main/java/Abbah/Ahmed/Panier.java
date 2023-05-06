package Abbah.Ahmed;
import java.util.ArrayList;
public class Panier {
	
	public ArrayList<Document> documents = new ArrayList<Document>();
    public String addDocument(Document document){
        if(this.documents.add(document)){
            return "document ajouté avec succés!";
        }else{
            return "Erreur!";
        }
    }
    public Panier() {
		
	}
    
	public boolean supprimerDocument(Document document){
        if(this.documents.remove(document)){
            return true;
        }else{
            return false;
        }
    }
}
