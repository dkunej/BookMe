package model;

public class User {

    private String firstName, lastName, country, email;

    public User(String firstName, String lastName, String country, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
    }

//------------Getters and setters ------------------

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
