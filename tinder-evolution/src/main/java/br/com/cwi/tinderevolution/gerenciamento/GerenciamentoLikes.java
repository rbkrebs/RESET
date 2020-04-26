package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.*;
import br.com.cwi.tinderevolution.domain.*;

public class GerenciamentoLikes {


    GerenciamentoUsuario userList = new GerenciamentoUsuario();
    GerenciamentoMusica musicList = new GerenciamentoMusica();
    GerenciamentoFilme filmList = new GerenciamentoFilme();
    GerenciamentoSeries seriesList = new GerenciamentoSeries();
    GerenciamentoGame gameList = new GerenciamentoGame();
    GerenciamentoEsporte sportList = new GerenciamentoEsporte();


    public Boolean likeMusic(Integer idMusica, Integer idUser) {

            try{

                userList.findById(idUser)
                        .setMusicasCurtidas(
                                musicList.findById(idMusica));

                return true;
            }
            catch (NullPointerException e){
                return false;
            }




    }

    public Boolean likeFilm(Integer idFilm, Integer idUser) {

        try {

            userList.findById(idUser)
                    .setFilmesCurtidos(
                            filmList.findById(idFilm));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }

    public Boolean likeSeries(Integer idSeries, Integer idUser) {

        try {

            userList.findById(idUser)
                    .setSeriesCurtidas(
                            seriesList.findById(idSeries));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }

    public Boolean likeGame(Integer idGame, Integer idUser) {

        try {

            userList.findById(idUser)
                    .setJogosCurtidos(
                            gameList.findById(idGame));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }
    public Boolean likeSport(Integer idSport, Integer idUser) {

        try {


            userList.findById(idUser)
                    .setEsportesCurtidos(
                            sportList.findById(idSport));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }

    public Boolean dislikeMusic(Integer idMusic, Integer idUser) {

        try {
            userList.findById(idUser)
                    .getMusicasCurtidas().remove(
                            musicList.findById(idMusic));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }


    }

    public Boolean dislikeFilm(Integer idFilm, Integer idUser) {

        try {
            userList.findById(idUser)
                    .getFilmesCurtidos().remove(
                    filmList.findById(idFilm));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }
    }

    public Boolean dislikeSeries(Integer idSeries, Integer idUser) {

        try {
            userList.findById(idUser)
                    .getSeriesCurtidas().remove(
                    seriesList.findById(idSeries));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }
    }

    public Boolean dislikeSport(Integer idSport, Integer idUser) {

        try {
            userList.findById(idUser)
                    .getEsportesCurtidos().remove(
                    sportList.findById(idSport));
            return true;
        }
        catch (NullPointerException e){
            return false;
        }
    }
}
