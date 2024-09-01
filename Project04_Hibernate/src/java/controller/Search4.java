package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Country;
import model.HibernateUtil;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet(name = "Search4", urlPatterns = {"/Search4"})
public class Search4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Country country = (Country) session.load(Country.class,1);

      


//        for (User user : usersList) {
//
//            System.out.println(user.getId());
//            System.out.println(user.getName());
//            System.out.println(user.getMobile());
//            System.out.println(user.getCountry().getCountryName());
//        }

        session.close();

    }

}
