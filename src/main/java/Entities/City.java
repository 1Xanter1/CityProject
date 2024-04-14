package Entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cityId;

    @Column(name = "city_name")
    private String name;

    @Column(name = "index")
    private int index;

    @OneToMany(mappedBy = "cities")
    List<User> users;

    public String getName() {
        return name;
    }

    public long getCityId() {
        return cityId;
    }

    public int getIndex() {
        return index;
    }
}
