package Task5_4;

import java.time.LocalDate;

public abstract class Person {
    private LocalDate doB;
    private String name;
    private String placeOfBirth;


    public Person(){

    }

    public Person(int year, int month, int day, String name, String placeOfBirth) {
        this.doB =LocalDate.of(year, month, day);
        this.name = name;
        this.placeOfBirth = placeOfBirth;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }


    public String eat (){
        return "Eat at pleasure, drink with measure.";
    }

    public String sleep (){
        return "In any unclear situation, go sleep";
    }

    public abstract String spendFreeTime ();
}
