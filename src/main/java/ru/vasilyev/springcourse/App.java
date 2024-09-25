package ru.vasilyev.springcourse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.vasilyev.springcourse.model.Human;
import ru.vasilyev.springcourse.model.Passport;
import ru.vasilyev.springcourse.model.Person;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
//        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//
//        try {
//            session.beginTransaction();
////            Person person = session.get(Person.class, 1);
////            System.out.println(person.toString());
//
////            Person person1 = new Person("P1", 20);
////            Person person2 = new Person("P2", 30);
////            Person person3 = new Person("P3", 40);
////            System.out.println(person1);
////            session.save(person1);
////            session.save(person2);
////            session.save(person3);
//
////            Person person = session.get(Person.class, 2);
////            System.out.println(person);
////            person.setName("New name");
////
////            Person person = session.get(Person.class, 2);
////            session.remove(person);
//
////            Person person = new Person("Some name", 44);
////            session.save(person);
//            session.createMutationQuery("delete from Person WHERE age < 30").executeUpdate();
//            List<Person> list = session.createQuery("from Person ", Person.class).getResultList();
//            session.getTransaction().commit();
////            System.out.println(person.getId());
//
//            for (Person person : list) {
//                System.out.println(person);
//            }
//        } finally {
//            session.close();
//        }


        Configuration configuration = new Configuration()
                .addAnnotatedClass(Human.class)
                .addAnnotatedClass(Passport.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Human human = new Human("Test human", 44);
//            Passport passport = new Passport(123456);
//
//            human.setPassport(passport);

//            session.save(human);

//            Human h1 = session.get(Human.class, 1);
//            System.out.println(h1.getPassport().getPassportNumber());

//            Passport p1 = session.get(Passport.class, 1);
//            System.out.println(p1.getHuman().getName());

            Human h1 = session.get(Human.class, 1);
            session.remove(h1);

            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
