package Abbah.Ahmed;

public class HelpExpression implements Expression  {
	final String message = "To add new Document type \"add document [DocName] [DocType] [DocAuthor] [DocCategory]\""+
			"\n"+ "To add new Client type \"add client [Client First Name] [Client Last Name] [Cliet Phone Number]\"" ;

	@Override
	public String interpret(Context context) {
		return message;
	}
}
