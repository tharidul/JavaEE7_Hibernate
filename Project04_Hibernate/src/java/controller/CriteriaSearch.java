
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Tharidu_Lakmal
 */
@WebServlet(name = "CriteriaSearch", urlPatterns = {"/CriteriaSearch"})
public class CriteriaSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        Criteria criteria = session.createCriteria(User.class);
        
        ArrayList<User> userList = (ArrayList<User>) criteria.list();
        
        for (User user : userList) {
            System.out.println(user.getName());
        }
        
    }

    
    
}
