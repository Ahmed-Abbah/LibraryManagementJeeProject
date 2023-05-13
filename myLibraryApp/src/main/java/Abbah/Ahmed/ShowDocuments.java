package Abbah.Ahmed;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;
public class ShowDocuments implements Expression {

    @Override
    public String interpret(Context context) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        
        List<Document> documentlist = session.createQuery("from Document", Document.class).list();
        
        if(documentlist.size() > 0){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show documents").append("\n");
            for(Document document : documentlist){
                stringBuilder.append(document.toString()).append("\n");
            }
            session.getTransaction().commit();
            return stringBuilder.toString();
        }
        session.getTransaction().commit();
        return "No document found.";
    }
}

