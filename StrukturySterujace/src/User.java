import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;

   public User(String FirstName,String LastName){
       this.firstName = FirstName;
       this.lastName = LastName;
   }
//    alt+insert -tworzenie get i set
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
