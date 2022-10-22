public class Account {
    //instance variables
    private String username;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int age;//derived from DOB
//LocalDate? LocalDate.now() .minus etc.

    //constructor
    public Account(String username) {
        this.username = username;
    }

    //methods
    //derive age


    //getters
    public String getUsername(){
        return username;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public int getAge() {

        return age;
    }
    //setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
