package Entities;

import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity {
    private int Id;
    private String FirstName;
    private String LastName;
    private Date DataOfBirth;
    private long NationalityId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDataOfBirth() {
        return DataOfBirth;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        DataOfBirth = dataOfBirth;
    }

    public long getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(long nationalityId) {
        NationalityId = nationalityId;
    }
}
