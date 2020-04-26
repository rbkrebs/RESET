package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import br.com.cwi.tinderevolution.domain.enums.MusicStyles;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoMusica {


    MusicCollection musicCollection = new MusicCollection();

    public Music save(Music music) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(music) && verificaDataRegistro(music) && verificaEstilos(music)) {

            return this.musicCollection.save(music);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Music musicParam) {
        Optional<Music> music;
        try {

            music = Optional.of(this.musicCollection.findByName(musicParam.getNome()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (music.isPresent()) {

            throw new IllegalArgumentException("Música já cadastrada");
        }

        return true;

    }

    public boolean verificaDataRegistro(Music musicParam) {

        if (!Period.between(musicParam.getDataDeLancamento(), LocalDate.now()).isNegative()) {
            return true;
        }

        throw new IllegalArgumentException("Verifique a data de lançamento");

    }

    public boolean verificaEstilos(Music musicParam) {

        if (musicParam.getMusicSyles() instanceof MusicStyles) {
            return true;
        }

        throw new IllegalArgumentException("Estilo não contemplado no escopo");


    }


    public Music findById(Integer idMusica) {

        return this.musicCollection.findById(idMusica);
    }
}
