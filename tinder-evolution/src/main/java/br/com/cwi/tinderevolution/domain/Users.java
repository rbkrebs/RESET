package br.com.cwi.tinderevolution.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;

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
    @NotNull(message = "o campo latitude é obrigatório")
    private double latitude;
    @NotNull(message = "o campo longitude é obrigatório")
    private double longitude;

    private ArrayList<Music> musicasCurtidas = new ArrayList<>();
    private ArrayList<Film> filmesCurtidos = new ArrayList<>();
    private ArrayList<Series> seriesCurtidas = new ArrayList<>();
    private ArrayList<Game> jogosCurtidos = new ArrayList<>();
    private ArrayList<Sport> esportesCurtidos = new ArrayList<>();
    private ArrayList<Curiosity> curiosidades = new ArrayList<>();


    private String urlPicture;

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public ArrayList<Music> getMusicasCurtidas() {
        return musicasCurtidas;
    }

    public void setMusicasCurtidas(Music musicasCurtidas) {
        this.musicasCurtidas.add(musicasCurtidas);
    }

    public ArrayList<Film> getFilmesCurtidos() {
        return filmesCurtidos;
    }

    public void setFilmesCurtidos(Film filmesCurtidos) {
        this.filmesCurtidos.add(filmesCurtidos);
    }

    public ArrayList<Series> getSeriesCurtidas() {
        return seriesCurtidas;
    }

    public void setSeriesCurtidas(Series seriesCurtidas) {
        this.seriesCurtidas.add(seriesCurtidas);
    }

    public ArrayList<Game> getJogosCurtidos() {
        return jogosCurtidos;
    }

    public void setJogosCurtidos(Game jogosCurtidos) {
        this.jogosCurtidos.add(jogosCurtidos);
    }

    public ArrayList<Sport> getEsportesCurtidos() {
        return esportesCurtidos;
    }

    public void setEsportesCurtidos(Sport esportesCurtidos) {
        this.esportesCurtidos.add(esportesCurtidos);
    }

    public ArrayList<Curiosity> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(Curiosity curiosidades) {
        this.curiosidades.add(curiosidades);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", musicasCurtidas=" + musicasCurtidas +
                ", filmesCurtidos=" + filmesCurtidos +
                ", seriesCurtidas=" + seriesCurtidas +
                ", jogosCurtidos=" + jogosCurtidos +
                ", esportesCurtidos=" + esportesCurtidos +
                ", curiosidades=" + curiosidades +
                ", urlPicture='" + urlPicture + '\'' +
                '}';
    }
}
