package model;

import lombok.Data;

@Data
public class User {
    private String title;
    private String name;
    private String email;
    private String password;
    private DateOfBirth dateOfBirth;
    private String firstName;
    private String lastName;
    private String company;
    private Address address;
    private String mobileNumber;
}
