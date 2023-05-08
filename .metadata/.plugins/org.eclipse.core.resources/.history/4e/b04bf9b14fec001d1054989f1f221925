package Abbah.Ahmed;
import java.util.HashMap;
public class Interpreter {
	public Context context;
    public Interpreter(Context context) {
        this.context=context;
    }

    public String interpret(String input) {
        String[] parts = input.split(" ");
        
        switch (parts[0]) {
        	case "add":
        	if(parts.length == 7 || parts.length == 5) {
        		switch (parts[1]) {
            	case "document":
            		AddDocumentExpression addDocumentExpression = new AddDocumentExpression(parts[2], parts[3], parts[4], parts[5], Float.parseFloat(parts[6]));
                    return OutputStr("Document Added !",addDocumentExpression.interpret(context),"success");
                case "client":
                	AddNewClientExpression addNewClientExpression = new AddNewClientExpression(parts[2] ,parts[3], parts[4]);
                    return OutputStr("Client Added !",addNewClientExpression.interpret(context),"success");
                default:
                	return OutputStr("Syntaxe error!","Type 'help' for more infos .","error");
            	}
        	}
        	case "help":
        		HelpExpression helpExpression = new HelpExpression();

                return OutputStr("Informations !",helpExpression.interpret(context),"info");
             
        	default:
        		return OutputStr("error !","Type 'help' for more infos .","info");
        		
        }
    }
    public String OutputStr(String param1,String param2,String param3) {
    	return param1 + "\n" + param2 + "\n" + param3  ;
    }
}
//        	}else if(parts.length == 6) {
//        		switch (parts[4]) {
//            	case "client":
//            		AddDocumentToClient addDocumentToClient = new AddDocumentToClient();
//            		return addDocumentToClient.interpret(Integer.parseInt(parts[2]),Integer.parseInt(parts[5]),stock,clientListe);
//            	default:
//                    return "Commande invalide.";
//            	}
//        	}
//            case "show":
//            	switch (parts[1]){
//            	case "clients":
//                    return clientListe.toString();
//                    
//                case "documents":
//                    return stock.toString();
//            	}
//            	
//
////            case "AddProductToClient":
////                AddProductExpression AddProduct = new AddProductExpression();
////                AddProduct.interpret(parts[1], parts[2],this.stock,this.clientListe);
////                break;
////            case "RemoveProductFromClient":
////                removeProductFromClient(parts[1], parts[2]);
////                break;
////            case "ShowInventory":
////                showInventory(parts[1]);
////                break;
//            case "sortie":
//                System.out.println("Au revoir !");
//                break;
//            default:
//                return "Commande invalide.";
//        }
//        return null;
//    }
//
//    private void ajouterDocument(int idDocument,String nom) {
//        stock.ajouterDocument(new Document(idDocument,nom));
//        System.out.println("Produit " + nom + " ajouté au stock.");
//    }
//
//
//
//
//
////    private void removeProductFromClient(int idDocument, int idClient) {
////        Document document = stock.getDocument(idDocument);
////        if (document == null) {
////            System.out.println("Le Document avec id = " + idDocument + " n'existe pas.");
////            return;
////        }
////        Client client = clientListe.getClient(idClient);
////        if (client == null) {
////            System.out.println("Le client " + idClient + " n'existe pas.");
////            return;
////        }
////        boolean result = client.panier.removeProduct(document);
////        if (result) {
////            System.out.println("Produit " + idDocument + " retiré du panier de " + idClient + ".");
////        } else {
////            System.out.println("Le produit " + idDocument + " n'est pas dans le panier de " + idClient + ".");
////        }
////    }
//
////    private void showInventory(String type) {
////        switch (type) {
////            case "Stock":
////                System.out.println(stock);
////                break;
////            case "Clients":
////                System.out.println(clientListe.getClients());
////                break;
////            default:
////                System.out.println("Type d'inventaire invalide.");
//        }
//    }
//}
//}



