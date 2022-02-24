import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Pau", Athlete.gender.Male, LocalDate.of(2003,05,29));
        System.out.println(athlete1.age());
        System.out.println( athlete1.debut(LocalDate.of(2020,05,28)));
        System.out.println(athlete1.retire(LocalDate.of(2022, 01, 01)));
        System.out.println(athlete1.daysActive());


    }


}
