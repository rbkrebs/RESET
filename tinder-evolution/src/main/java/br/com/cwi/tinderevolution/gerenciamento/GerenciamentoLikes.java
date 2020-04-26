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
            Film likedFilm = filmList.findById(idFilm);
            Users evaluator = userList.findById(idUser);
            evaluator.setFilmesCurtidos(likedFilm);
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }

    public Boolean likeSeries(Integer idSeries, Integer idUser) {

        try {
            Series likedSeries = seriesList.findById(idSeries);
            userList.findById(idUser).setSeriesCurtidas(likedSeries);
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }

    public Boolean likeGame(Integer idGame, Integer idUser) {

        try {

            Game likedGame = gameList.findById(idGame);
            userList.findById(idUser).setJogosCurtidos(likedGame);
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }
    public Boolean likeSport(Integer idSport, Integer idUser) {

        try {

            Sport likedSport = sportList.findById(idSport);
            userList.findById(idUser).setEsportesCurtidos(likedSport);
            return true;
        }
        catch (NullPointerException e){
            return false;
        }

    }
}
