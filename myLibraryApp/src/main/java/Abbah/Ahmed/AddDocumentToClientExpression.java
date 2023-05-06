package Abbah.Ahmed;
public class AddDocumentToClientExpression implements Expression {
	public Stock stock;
    public ClientListe clientListe ;
	public AddDocumentToClientExpression(stock document,Client client){
		this.stock=stock;
		this.clientListe=clientListe;
	}
	public String ajouterDocument(Document document){	
        if(this.stock.documents.add(document)){
            return "Stock : Document "+document.nom+" ajouté.";
        }
        return null;
    }
	public String interpret(int idDocument,int idClient,Stock stock,ClientListe clientListe) {
        Document document = stock.getDocument(idDocument);
        if (document == null) {
            return "Le produit " + idDocument + " n'existe pas.";
        }
        Client client = clientListe.getClient(idClient);
        if (client == null) {
          
            return "Le client dont son id est" + idClient + " n'existe pas.";
        }
        client.panier.addDocument(document);
        return "Document " + idDocument + " ajouté au " + idClient + ".";
    }
}
