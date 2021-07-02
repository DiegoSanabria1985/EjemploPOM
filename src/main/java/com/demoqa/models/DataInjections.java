package com.demoqa.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjections {

    Faker faker = new Faker(new Locale("on US"));
    private String username, password, email, confirmpassword, search, lastname, number, addres, validacion;

    private String fileImput = "imagen.png";

    public String getUsername() {
        return username;
    }

    public String getValidacion(){return username;}

    public String getLastname(){return lastname;}

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber(){
        return number;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public String getSearch() {
        return search;
    }

    public String getFileImput(){

        return fileImput;}

    public String getAddres() {
        return addres;
    }

    public DataInjections(){
        this.username = faker.name().username();
        this.password = faker.expression("123WSDwetd");
        this.email = faker.internet().emailAddress();
        this.confirmpassword = password;
        this.search = faker.expression("laptops");
        this.lastname = faker.name().lastName();
        this.number = faker.expression("3103970950");
        this.fileImput = faker.expression("imagen.png");
        this.addres = faker.expression("carrera 24 # 45-56");
        this.validacion = faker.expression(("Thanks for submitting the form"));

    }
}
