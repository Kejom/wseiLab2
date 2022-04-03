package com.example.wseiLab2.Models;

public class UserEntity {
    private int id;
    private String login;
    private String firstName;
    private String latName;

    public UserEntity(int id, String login, String firstName, String latName) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.latName = latName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }
}
