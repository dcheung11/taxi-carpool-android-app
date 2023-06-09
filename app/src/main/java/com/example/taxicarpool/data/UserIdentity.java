package com.example.taxicarpool.data;

import androidx.room.Entity;

import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity
public class UserIdentity {
    @PrimaryKey (autoGenerate = true)
    public long uid;

    public String firstName;

    public String lastName;

    public String email;

    public String password;

    public int rating;

    public String gender;

    @Ignore
    public UserIdentity(String firstName, String lastName, String email, String password) {
        this(0L,firstName,lastName,email,password,"M");
    }

    @Ignore
    public UserIdentity(String firstName, String lastName, String email, String password, String gender) {
        this(0L,firstName,lastName,email,password,gender);
    }



    public UserIdentity(Long uid, String firstName, String lastName, String email, String password, String gender) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.rating = 5;
        this.gender =  gender;
    }



    public void setUid(long uid){
        this.uid = uid;
    }

    public long getUid() {
        return uid;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserIdentity that = (UserIdentity) o;
        return uid == that.uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserIdentity{" +
                "uid=" + uid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", rating=" + rating +
                ", gender='" + gender + '\'' +
                '}';
    }
}
