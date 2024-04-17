import Entities.City;
import Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ApplicationMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
        EntityManager em = emf.createEntityManager();
        Scanner scanner = new Scanner(System.in);

        //Изменение данных пользователя
//        try{
//            em.getTransaction().begin();
//
//            System.out.println("Введите логин пользователя: ");
//            String typedLogin = scanner.nextLine();
//
//            TypedQuery<User> userQuery = em.createQuery("select u from User u where u.login = :login", User.class);
//            userQuery.setParameter("login", typedLogin);
//            User user = null;
//            try{
//                user = userQuery.getSingleResult();
//            } catch (Exception e){
//                System.out.println("Пользователь с таким логином не найден");
//                return;
//            }
//
//            while(true) {
//                System.out.println("Хотите ли вы внести изменения в ваших данных? ");
//                String answer = scanner.nextLine();
//                if (answer.equals("Да")) {
//
//                    System.out.println("Введите новое имя: ");
//                    String newName = scanner.nextLine();
//
//                    System.out.println("Введите название города: ");
//                    String newCity = scanner.nextLine();
//                    TypedQuery<City> cityQuery = em.createQuery("select c from City c where c.name = :name", City.class);
//                    cityQuery.setParameter("name", newCity);
//                    City city = null;
//                    while (true) {
//                        try {
//                            city = cityQuery.getSingleResult();
//                            user.setName(newName);
//                            user.setCity(city);
//                        } catch (Exception e) {
//                            System.out.println("Город с указанным названием не найден. Попробуйте снова: ");
//                            em.getTransaction().rollback();
//                            return;
//                        }
//                        break;
//                    }
//                } else if (answer.equals("Нет")) {
//                    System.out.println("Выход из программы");
//                    return;
//                } else {
//                    System.out.println("Пожалуйста введите 'Да' или 'Нет': ");
//                }
//                System.out.println("Данные успешно изменены!");
//                em.getTransaction().commit();
//                return;
//            }
//
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
        //Добавление нового пользователя
//        try {
//            em.getTransaction().begin();
//
//            System.out.println("Введите логин пользователя: ");
//            String login = scanner.nextLine();
//
//            System.out.println("Введите имя пользователя: ");
//            String name = scanner.nextLine();
//
//            System.out.println("Введите название города: ");
//            String cityName = scanner.nextLine();
//
//            TypedQuery<City> cityQuery = em.createQuery("select c from City c where c.name = :name", City.class);
//            cityQuery.setParameter("name", cityName);
//            City city = null;
//            try {
//                city = cityQuery.getSingleResult();
//            } catch (Exception e) {
//                System.out.println("Город с указанным названием не найден");
//                em.getTransaction().rollback();
//                return;
//            }
//
//            User user = new User();
//            user.setLogin(login);
//            user.setName(name);
//            user.setCity(city);
//            em.persist(user);
//
//            em.getTransaction().commit();
//            System.out.println("Пользователь успешно создан");
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }


        
    }
}
