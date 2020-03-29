package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.MusicCollection;
import br.com.cwi.tinderevolution.domain.Music;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.jackson.JsonObjectSerializer;

import java.io.IOException;

public class Gerenciamento {


    MusicCollection musicCollection = new MusicCollection();
    JSONParser jsonParser;

    public Music save( Music music) {
        System.out.println(music);


        return this.musicCollection.save(music);
    }



}
