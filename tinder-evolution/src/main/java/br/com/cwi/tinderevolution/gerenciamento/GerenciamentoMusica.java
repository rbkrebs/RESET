package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.jackson.JsonObjectSerializer;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class GerenciamentoMusica {


    MusicCollection musicCollection = new MusicCollection();

    public Music save( Music music){

       if(!verificaRegistroDuplicado(music)){

           return this.musicCollection.save(music);
        }

        throw new IllegalArgumentException("Cadastro já inserido");



    }

    public boolean verificaRegistroDuplicado(Music musicParam){
        try{
            Optional<Music> music = Optional.of(this.musicCollection.findByName(musicParam.getNome()));
            System.out.println(music.isPresent());
            return music.isPresent();
        }catch (Exception e){
            return false;
        }




    }





}
