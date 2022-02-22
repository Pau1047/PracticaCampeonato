import java.time.LocalDate;
import java.time.Period;

public class Athlete {

    public enum gender {Male, Female}

    private String name;
    private gender gender;
    private LocalDate birth;
    private LocalDate startRace;
    private LocalDate endRace;


    public Athlete(String name, gender genderAth, LocalDate birth) {
        this.name = name;
        this.gender = genderAth;
        this.birth = birth;
    }

    public int age() {
        Period live = Period.between(birth, LocalDate.now());

        return live.getYears();
    }

    public boolean debut() {
        
            return false;
    }

    public boolean remove() {

        return false;
    }

    public boolean isActive() {

        return false;
    }

    public int daysActive() {

        return 0;
    }


}
