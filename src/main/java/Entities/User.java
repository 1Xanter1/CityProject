package Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "login")
    private String login;

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
}

