package com.example.miaprimaapplicazione;

public class Utente {
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String dataNascita;
    //costruttore
    Utente(String nome, String cognome, String username, String password, String dataNascita)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.dataNascita = dataNascita;
    }

    public String getCognome()
    {
        return cognome;
    }

    public String getNome()
    {
        return nome;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getDataNascita()
    {
        return dataNascita;
    }
}
