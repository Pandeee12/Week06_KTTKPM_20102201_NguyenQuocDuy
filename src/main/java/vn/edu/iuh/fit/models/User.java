package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Data
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long id;
    @Column(name="user_name")
    private String name;

    public User(String name) {
        this.name = name;
    }
}
