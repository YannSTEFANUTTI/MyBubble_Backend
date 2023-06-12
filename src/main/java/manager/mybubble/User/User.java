package manager.mybubble.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import manager.mybubble.Bubble.Bubble;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private Date birthdate;
    private String country;
    private String city;
    private String adress;
    private String creditcard;
    private String validitydate;
    private Number crypto;


    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "user_id", referencedColumnName = "id") /* Clé étrangère */
    @JsonIgnoreProperties("user")
    private Set<Bubble> bookingList = new HashSet<>(); /* [] */
}
