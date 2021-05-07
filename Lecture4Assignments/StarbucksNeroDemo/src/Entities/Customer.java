package Entities;


import Abstract.Entity;

public class Customer implements Entity {
    private int Id;
    private String FirstName;
    private String LastName;
    private int DataOfBirth;
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

    public int getDataOfBirth() {
        return DataOfBirth;
    }

    public void setDataOfBirth(int dataOfBirth) {
        DataOfBirth = dataOfBirth;
    }

    public long getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(long nationalityId) {
        NationalityId = nationalityId;
    }
}
