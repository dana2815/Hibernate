import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hibernate_sequence {

    @Id
    @GeneratedValue
    private Long next_val;

    public Long getNext_val() {
        return next_val;
    }

    public void setNext_val(Long next_val) {
        this.next_val = next_val;
    }
}
