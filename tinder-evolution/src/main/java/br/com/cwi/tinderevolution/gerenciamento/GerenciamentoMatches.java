package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.MatchCollection;
import br.com.cwi.tinderevolution.domain.Match;

public class GerenciamentoMatches {
    
    GerenciamentoUsuario gerenciamentoUsuario = new GerenciamentoUsuario();
    MatchCollection matchCollection = new MatchCollection();


    public Boolean like(Integer idEvaluated, Integer idEvaluator) {
        
        try{
            this.gerenciamentoUsuario.like(idEvaluated, idEvaluator);
            return true;
        }catch (Exception e){
            return false;
        }
        
        
    }

    public Boolean disLike(Integer idEvaluated, Integer idEvaluator) {

        try{
            this.gerenciamentoUsuario.disLike(idEvaluated, idEvaluator);
            return true;
        }catch (Exception e){
            return false;
        }


    }

    public Boolean delLike(Integer idEvaluated, Integer idEvaluator) {

        try{
            this.gerenciamentoUsuario.delLike(idEvaluated, idEvaluator);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean delDislike(Integer idEvaluated, Integer idEvaluator) {

        try{
            this.gerenciamentoUsuario.DelDislike(idEvaluated, idEvaluator);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Match findById(Integer id) {

        return this.matchCollection.findById(id);


    }
}
