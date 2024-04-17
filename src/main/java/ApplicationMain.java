import Entities.City;
import Entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ApplicationMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("main");
        EntityManager em = emf.createEntityManager();
        Scanner scanner = new Scanner(System.in);

        try {
            em.getTransaction().begin();

            System.out.println("Введите логин пользователя: ");
            String login = scanner.nextLine();

            System.out.println("Введите имя пользователя: ");
            String name = scanner.nextLine();

            System.out.println("Введите название города: ");
            String cityName = scanner.nextLine();

            TypedQuery<City> cityQuery = em.createQuery("select c from City c where c.name = :name", City.class);
            cityQuery.setParameter("name", cityName);
            City city = null;
            try {
                city = cityQuery.getSingleResult();
            } catch (Exception e) {
                System.out.println("Город с указанным названием не найден");
                em.getTransaction().rollback();
                return;
            }

            User user = new User();
            user.setLogin(login);
            user.setName(name);
            user.setCity(city);
            em.persist(user);

            em.getTransaction().commit();
            System.out.println("Пользователь успешно создан");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
