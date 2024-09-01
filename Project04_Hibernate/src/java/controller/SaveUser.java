
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author pathu
 */
@WebServlet(name = "SaveUser", urlPatterns = {"/SaveUser"})
public class SaveUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        
        User user = new User();
        user.setName("Amila");
        user.setMobile("0779874514");
        
        session.save(user);
        session.beginTransaction().commit();
        
        session.clear();
        
    }
}
