package Abbah.Ahmed;
import java.util.ArrayList; 
public class Stock {
	ArrayList<Document> documents = new ArrayList<Document>();
    public String toString(){
    	String Output;
        Output="********** Documents Liste ********<br>";
        for(int i=0;i<this.documents.size();i++){
        	Output=Output+" "+i+" : "+documents.get(i).getNom()+"<br>";
        }
        return Output+"*********************************";
    }

    public Document getDocument(int idDocument){
        for(int i=0;i<this.documents.size();i++){
            if (this.documents.get(i).getIdDocument()==idDocument){
                return this.documents.get(i);
            }
        }
        return null;
    }
}