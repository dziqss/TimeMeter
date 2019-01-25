package trening;

import java.time.LocalDate;
import java.time.Period;

public class YourTimeMeter {

    public static void main(String[] args) {

        //set your date of birth

        int yourYearOfBirth = 1;
        int yourMonthOfBirth = 1;
        int yourDayOfBirth = 1;

        Period period = Period.between(LocalDate.of(yourYearOfBirth, yourMonthOfBirth, yourDayOfBirth), LocalDate.now());
        System.out.println("Your have " + period.getYears() + " years");
        System.out.println("You have " + period.getMonths() + " months");
        System.out.println("You have " + period.getDays() + " days");
    }
}

