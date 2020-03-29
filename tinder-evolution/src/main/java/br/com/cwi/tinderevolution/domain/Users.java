package br.com.cwi.tinderevolution.domain;

import br.com.cwi.tinderevolution.domain.enums.Localizacao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Users {

    private int id;

    @NotNull(message = "o campo nome é obrigatório")
    private String name;
    @NotNull(message = "o campo email é obrigatório")
    @Email
    private String email;
    @NotNull(message = "o campo telefone é obrigatório")
    private String phone;
    @NotNull(message = "o campo data de nascimento é obrigatório")
    private LocalDate dateOfBirth;
    @NotNull(message = "o campo bio é obrigatório")
    private String bio;
    @NotNull(message = "o campo localizaçãoé obrigatório")
    private Localizacao localizacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bio='" + bio + '\'' +
                ", localizacao=" + localizacao +
                '}';
    }
}
