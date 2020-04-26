package br.com.cwi.tinderevolution.rest;



import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoLikes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/likes/")
@Api(value = "API REST Likes")
@CrossOrigin(origins = "*")
public class RestLikes {

    GerenciamentoLikes gerenciamento = new GerenciamentoLikes();

    @PostMapping("musica/{id-music}/avaliador/{id-user}")
    @ApiOperation(value = "Gera um registro de like para um usuário de determinada música")
    public Boolean likeMusic(@PathVariable("id-music") Integer idMusica, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.likeMusic(idMusica, idUser);

    }

    @PostMapping("filme/{id-film}/avaliador/{id-user}")
    @ApiOperation(value = "Gera um registro de like para um usuário de determinada filme")
    public Boolean likeFilm(@PathVariable("id-filme") Integer idFilm, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.likeFilm(idFilm, idUser);

    }

    @PostMapping("series/{id-series}/avaliador/{id-user}")
    @ApiOperation(value = "Gera um registro de like para um usuário de determinado filme")
    public Boolean likeSeries(@PathVariable("id-series") Integer idSeries, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.likeSeries(idSeries, idUser);

    }

    @PostMapping("sport/{id-sport}/avaliador/{id-user}")
    @ApiOperation(value = "Gera um registro de like para um usuário de determinado esporte")
    public Boolean likeSport(@PathVariable("id-sport") Integer idSport, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.likeSport(idSport, idUser);

    }

    @DeleteMapping("musica/{id-music}/avaliador/{id-user}")
    @ApiOperation(value = "Deleta um registro de like para um usuário de determinada música")
    public Boolean dislikeMusic(@PathVariable("id-music") Integer idMusica, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.dislikeMusic(idMusica, idUser);

    }

    @DeleteMapping("filme/{id-film}/avaliador/{id-user}")
    @ApiOperation(value = "Deleta um registro de like para um usuário de determinada filme")
    public Boolean dislikeFilm(@PathVariable("id-filme") Integer idFilm, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.dislikeFilm(idFilm, idUser);

    }

    @DeleteMapping("series/{id-series}/avaliador/{id-user}")
    @ApiOperation(value = "Deleta um registro de like para um usuário de determinado filme")
    public Boolean dislikeSeries(@PathVariable("id-series") Integer idSeries, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.dislikeSeries(idSeries, idUser);

    }

    @DeleteMapping("sport/{id-sport}/avaliador/{id-user}")
    @ApiOperation(value = "Deleta um registro de like para um usuário de determinado esporte")
    public Boolean dislikeSport(@PathVariable("id-sport") Integer idSport, @PathVariable("id-user") Integer idUser) {

        return this.gerenciamento.dislikeSport(idSport, idUser);

    }
}
