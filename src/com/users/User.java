package com.users;

import java.time.LocalDate;

public class User {
    private final int id;
    private static int lastId = 0;
    private String nickname;
    private String name;
    private String lastName;
    private String email;
    private LocalDate birthDate;
   
    
    public User(String nickname, String firstName, String lastName, String email, LocalDate birthdate) {
        this.nickname = nickname;
        this.name = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthdate;
       
        lastId++;
        this.id = lastId;
    }
    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
}
