package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String forename;
    private String surname;
    private String schoolName;

    public Principal(String forename, String surname, String schoolName) {
        this.forename = forename;
        this.surname = surname;
        this.schoolName = schoolName;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(forename, principal.forename) && Objects.equals(surname, principal.surname) && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forename, surname, schoolName);
    }
}