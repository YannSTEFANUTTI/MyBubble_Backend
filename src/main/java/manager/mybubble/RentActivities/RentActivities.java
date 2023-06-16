package manager.mybubble.RentActivities;


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
public class RentActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long pictoId;
    private Boolean isSharedActivity;

    @ManyToOne
    @JsonIgnoreProperties("activities")
    private Bubble bubble;
}