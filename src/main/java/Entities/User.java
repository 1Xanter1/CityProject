package Entities;


import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "city")
    private City city;

    public long getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public City getCity() {
        return city;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

