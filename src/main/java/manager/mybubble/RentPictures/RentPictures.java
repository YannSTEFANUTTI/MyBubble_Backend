package manager.mybubble.RentPictures;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import manager.mybubble.Bubble.Bubble;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RentPictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String src;

    @ManyToOne
    @JsonIgnoreProperties("rentPictures")
    private Bubble bubble;

}