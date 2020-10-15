public class Person {
    private String name;
    private String middleName;
    private String surname;

    Person(String name, String middleName, String surname) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
    }

    Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getName() {
        if (name!=null | surname!=null | middleName!=null) {
            return (surname + " " + name + " " + middleName);
        }
        else return "Update person's info";
    }
}
