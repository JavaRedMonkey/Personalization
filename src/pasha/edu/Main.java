package pasha.edu;


import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, Month.APRIL , 12);
        System.out.println(date.getDayOfWeek());
        LocalDate jan = LocalDate.of(2021 , Month.JANUARY , 1);
        System.out.println(jan.plusDays(255));

        Person pasha = new Person();
        pasha.setFirstName("Pavel");
        pasha.setLastName("Vortan");
        pasha.setMidName("Olehovich");
        pasha.setCity("Chernovtsy");
        pasha.setStreet("st. Shishkarikiv");
        pasha.setHouseNumber("23");
        pasha.setPhoneNumber("+38042920472");
        pasha.setDateOfBirth(LocalDate.of(2007 , Month.AUGUST , 19));
        System.out.println(pasha);
    }
}
