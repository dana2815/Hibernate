import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity (name = "Moviesinfo")
public class Movieinfo {

    @Id
    @GeneratedValue
    private Long moviesId;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private LocalDate releaseDate;

    @Column
    private String description;

    public Long getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(Long moviesId) {
        this.moviesId = moviesId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
