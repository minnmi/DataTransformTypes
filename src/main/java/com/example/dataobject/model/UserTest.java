package com.example.dataobject.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "user_test")
public class UserTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "location_id")
    private Location location;

    // Getters and Setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserTest userTest = (UserTest) o;
        return id != null && Objects.equals(id, userTest.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


    /**
     * INSERT into LOCATION(id, lat, lng, place, description) values (1, 49.8, 24.03 ,'Lviv', 'Lviv is one of the largest and the most beautiful cities of Ukraine.');
     * INSERT into USER_TEST(id, username, first_name, last_name, password, location_id) values (1, 'Romeo', 'Romeo', 'Montagues' ,'gjt6lf2nt5os', 1);
     * INSERT into USER_TEST(id, username, first_name, last_name, password, location_id) values (2USER_TEST USER_TEST USER_TEST , 'Juliet', 'Juliet', 'Capulets' ,'s894mjg03hd0', 1);
     */
}
