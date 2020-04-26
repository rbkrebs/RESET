package br.com.cwi.tinderevolution.rest;


import br.com.cwi.tinderevolution.domain.Match;
import br.com.cwi.tinderevolution.domain.Users;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoLikes;
import br.com.cwi.tinderevolution.gerenciamento.GerenciamentoMatches;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches/")
@Api(value = "API REST Matches")
@CrossOrigin(origins = "*")
public class RestMatch {

    GerenciamentoMatches gerenciamento = new GerenciamentoMatches();


    @PostMapping("{id-evaluated}/evaluator/{id-evaluator}/like")
    @ApiOperation(value = "Gera um registro de like para um usuário de um usuário")
    public Boolean likeUser(@PathVariable("id-evaluated") Integer idEvaluated, @PathVariable("id-evaluator") Integer idEvaluator) {

        return this.gerenciamento.like(idEvaluated, idEvaluator);

    }

    @PostMapping("{id-evaluated}/evaluator/{id-evaluator}/dislike")
    @ApiOperation(value = "Gera um registro de dislike para um usuário de um usuário")
    public Boolean dislikeUser(@PathVariable("id-evaluated") Integer idEvaluated, @PathVariable("id-evaluator") Integer idEvaluator) {

        return this.gerenciamento.disLike(idEvaluated, idEvaluator);

    }


    @DeleteMapping("{id-evaluated}/evaluator/{id-evaluator}/like")
    @ApiOperation(value = "Deleta um registro de like para um usuário de um usuário")
    public Boolean delLikeUser(@PathVariable("id-evaluated") Integer idEvaluated, @PathVariable("id-evaluator") Integer idEvaluator) {

        return this.gerenciamento.delLike(idEvaluated, idEvaluator);

    }

    @DeleteMapping("{id-evaluated}/evaluator/{id-evaluator}/dislike")
    @ApiOperation(value = "Deleta um registro de dislike para um usuário de um usuário")
    public Boolean delDislikeUser(@PathVariable("id-evaluated") Integer idEvaluated, @PathVariable("id-evaluator") Integer idEvaluator) {

        return this.gerenciamento.delDislike(idEvaluated, idEvaluator);

    }

    @GetMapping("{id}")
    @ApiOperation(value = "Retorna todos os matches de um usuário")
    public Match findById(@PathVariable("id") Integer id){

        return this.gerenciamento.findById(id);

    }


    /*

    não implementado!!!

    @GetMapping("{id}/best")
    @ApiOperation(value = "Retorna todos os matches de um usuário")
    public Match findById(@PathVariable("id") Integer id){

        return this.gerenciamento.findById(id);

    }

     */



}
