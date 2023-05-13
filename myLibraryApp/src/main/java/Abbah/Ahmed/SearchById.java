package Abbah.Ahmed;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

class SearchByID implements SearchStrategy {
    public String search(String query) {
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
        List<Document>  documents = session.createQuery("FROM Document WHERE  idDocument=:id", Document.class)
                .setParameter("id",query).list();
        
        if(documents.size() > 0){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("recherche des documents").append("\n");
            stringBuilder.append("recherche pour le document don't l'id est "+query ).append("\n");
            for(Document document : documents){
                stringBuilder.append(document.toString()).append("\n");
            }
            session.getTransaction().commit();
            return stringBuilder.toString();
        }
        session.getTransaction().commit();
    	return null;
    }
}
