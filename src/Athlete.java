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

    public boolean debut(LocalDate dateDebut) {
        if (startRace == null && endRace == null && dateDebut.isAfter(birth)) {
            startRace=dateDebut;
            return true;
        }
        return false;
    }

    public boolean retire(LocalDate dateRetire) {
        if (startRace != null && endRace == null) {
            endRace = dateRetire;
            return true;
        }
        return false;
    }

    public boolean isActive(LocalDate dayActive) {
        if (dayActive.isAfter(startRace) && dayActive.isBefore(endRace) && startRace != null && endRace == null){
            return true;
        }
        return false;
    }

    public int daysActive() {
       int days = 0;
        if (startRace != null){
            if(endRace == null){
               days= startRace.until(endRace).getDays();
            }else days= startRace.until(LocalDate.now()).getDays();
        }
        return days;
    }


}
