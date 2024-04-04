package ru.kors.springstudents.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private int age;

//    public Student() {
//
//    }
//
//    написал собственный билдер, так как билдер lombok не работал
//
//    public static Builder builder() {
//        return new Student().new Builder();
//    }
//
//    public class Builder {
//
//        private Builder() {
//        }
//
//        public Builder firstName(String firstName) {
//            Student.this.firstName = firstName;
//
//            return this;
//        }
//        public Builder lastName(String lastName) {
//            Student.this.lastName = lastName;
//
//            return this;
//        }
//        public Builder dateOfBirt(LocalDate dateOfBirth) {
//            Student.this.dateOfBirth = dateOfBirth;
//
//            return this;
//        }
//        public Builder email(String email) {
//            Student.this.email = email;
//
//            return this;
//        }
//        public Builder age(int age) {
//            Student.this.age = age;
//
//            return this;
//        }
//
//        public Student build() {
//            return Student.this;
//        }
//
//    }

}

