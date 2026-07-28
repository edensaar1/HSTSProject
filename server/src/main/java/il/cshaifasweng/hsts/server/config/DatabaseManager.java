package il.cshaifasweng.hsts.server.config;

import il.cshaifasweng.hsts.entities.AuthorizedUser;
import il.cshaifasweng.hsts.entities.Course;
import il.cshaifasweng.hsts.entities.Question;
import il.cshaifasweng.hsts.entities.Subject;
import il.cshaifasweng.hsts.entities.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DatabaseManager {

    private static SessionFactory sessionFactory;

    public static void initialize(){
        if(sessionFactory == null){
            sessionFactory = new Configuration().configure()
                    .addAnnotatedClass(AuthorizedUser.class)
                    .addAnnotatedClass(Teacher.class)
                    .addAnnotatedClass(Subject.class)
                    .addAnnotatedClass(Course.class)
                    .addAnnotatedClass(Question.class)
                    .buildSessionFactory();
        }
    }

    public static Session getSession(){
        if(sessionFactory == null){
            initialize();
        }
        return sessionFactory.openSession();
    }

    public static void close(){
        if(sessionFactory != null){
            sessionFactory.close();
            sessionFactory = null;
        }
    }

}
