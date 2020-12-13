package Task5_4;

public abstract class Person {
    private String DoB;
    private String name;
    private String placeOfBirth;


    public Person(){

    }

    public Person(String doB, String name, String placeOfBirth) {
        DoB = doB;
        this.name = name;
        this.placeOfBirth = placeOfBirth;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
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
