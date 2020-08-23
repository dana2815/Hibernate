import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "Moviescopies")
public class Moviecopies {

        @Id
        @GeneratedValue
        private Long copyId;

        @Column
        private Long movieInfoId;

        @Column
        private Long isRented;

        @Column
        private Long rentedTimes;

        @Column
        private Long rentedTo;

    public Long getCopyId() {
        return copyId;
    }

    public void setCopyId(Long copyId) {
        this.copyId = copyId;
    }

    public Long getMovieInfoId() {
        return movieInfoId;
    }

    public void setMovieInfoId(Long movieInfoId) {
        this.movieInfoId = movieInfoId;
    }

    public Long getIsRented() {
        return isRented;
    }

    public void setIsRented(Long isRented) {
        this.isRented = isRented;
    }

    public Long getRentedTimes() {
        return rentedTimes;
    }

    public void setRentedTimes(Long rentedTimes) {
        this.rentedTimes = rentedTimes;
    }

    public Long getRentedTo() {
        return rentedTo;
    }

    public void setRentedTo(Long rentedTo) {
        this.rentedTo = rentedTo;
    }
}
