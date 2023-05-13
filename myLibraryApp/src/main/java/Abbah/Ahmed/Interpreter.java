package Abbah.Ahmed;

public class Interpreter {
	public Context context;
    public Interpreter(Context context) {
        this.context=context;
    }

    public String interpret(String input) {
        String[] parts = input.split(" ");
        switch (parts[0]) {
        	case "add":
        	if(parts.length == 6 || parts.length == 8){
        		switch (parts[1]) {
            	case "document":
            		AddDocumentExpression addDocumentExpression = new AddDocumentExpression(parts[2], parts[3], parts[4], parts[5]);

                    return OutputStr("Document Added !",addDocumentExpression.interpret(context),"success");
                case "client":
                	AddNewClientExpression addNewClientExpression = new AddNewClientExpression(parts[2] ,parts[3], parts[4],parts[5], parts[6],Boolean.parseBoolean(parts[7]));
                    return OutputStr("Client Added !",addNewClientExpression.interpret(context),"success");
                default:
                	return OutputStr("Syntaxe error!","Type 'help' for more infos .","error");
            	}
        	}
        	case "show":
        		if(parts.length == 2){
            		switch (parts[1]) {
                	case "clients":
                		ShowClients showClients = new ShowClients();
                		return showClients.interpret(context);
                    case "documents":
                    	AddNewClientExpression addNewClientExpression = new AddNewClientExpression(parts[2] ,parts[3], parts[4],parts[5], parts[6],Boolean.parseBoolean(parts[7]));
                        return OutputStr("Client Added !",addNewClientExpression.interpret(context),"success");
                    default:
                    	return OutputStr("Syntaxe error!","Type 'help' for more infos .","error");
                	}
            	}
        		
        	case "show documents":
        		return null;
        	case "help":
        		HelpExpression helpExpression = new HelpExpression();
                return OutputStr("Informations !",helpExpression.interpret(context),"info");
        	case "search":
        		if(parts.length == 3){
        			String[] searchParts = parts[2].split(":");
            		switch (searchParts[1]) {
                	case "author":
                		SearchByAuthor searchByAuthor = new SearchByAuthor();
                		return searchByAuthor.search(searchParts[2]);
                    case "title":
                    	SearchByTitle searchByTitle = new SearchByTitle();
                		return searchByTitle.search(searchParts[2]);
                    case "id":
                    	SearchByID searchById = new SearchByID();
                		return searchById.search(searchParts[2]);
                    default:
                    	return OutputStr("Syntaxe error!","Type 'help' for more infos .","error");
                	}
            	}
             
        	default:
        		return OutputStr("error !","Type 'help' for more infos .","info");
        }
    }
    public String OutputStr(String param1,String param2,String param3) {
    	return param1 + "\n" + param2 + "\n" + param3  ;
    }
}




