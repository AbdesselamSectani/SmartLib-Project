package sectani.empruntservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Emprunt {
    private String empruntId;
    private Date dateEmprunt;
    private Date dateRetour;
    private Boolean isReturned;
    private User user;
    private Livre livre;
}
