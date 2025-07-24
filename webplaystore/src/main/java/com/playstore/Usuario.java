package classes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;


    public Usuario(String nome, String email, String senha, LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;




}