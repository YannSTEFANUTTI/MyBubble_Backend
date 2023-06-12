package manager.mybubble.Bubble;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import manager.mybubble.RentActivities.RentActivities;
import manager.mybubble.RentBonus.RentBonus;
import manager.mybubble.RentDate.RentDate;
import manager.mybubble.RentPictures.RentPictures;
import manager.mybubble.User.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RestController
public class Bubble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Number ownerId;
    private String type;
    private String otherType;
    private Number surface;
    private Number people;
    private Number room;
    private Number price;
    private String resume;
    private String postalCode;
    private String city;
    private String adress;
    private Number longitude;
    private Number latitude;
    //private RentPictures[] pictures;
    //private RentDate[]  dates;
    //private RentActivities[] activities;
    //private RentBonus[] bonus;
    private String iban;
    private String accountFirstname;
    private String accountLastname;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "bubble_id", referencedColumnName = "id") /* Clé étrangère */
    @JsonIgnoreProperties("bubble")
    private Set<RentActivities> rentActivitiesList = new HashSet<>();

    @OneToOne
    @JsonIgnoreProperties("bubble")
    private RentBonus rentBonus;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("rentDateList")
    private Set<RentDate> rentDateList = new HashSet<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("rentPicturesList")
    private Set<RentPictures> rentPicturesList = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JsonIgnoreProperties("userList")
    private Set<User> userList = new HashSet<>();
}
