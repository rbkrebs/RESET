package br.com.cwi.tinderevolution.collection;


import br.com.cwi.tinderevolution.domain.Match;
import br.com.cwi.tinderevolution.domain.Users;

import java.util.ArrayList;
import java.util.List;

public class MatchCollection {


    private static final List<Match> listMatches = new ArrayList<>();

    UserCollection userCollection = new UserCollection();
    Match match = new Match();


    public Match findById(Integer id) {

        Users user = userCollection.findById(id);

        listMatches.contains(user);

        return null;

    }

    public void saveMatch(Integer Evaluator){

        Users user = userCollection.findById(Evaluator);
        for (Users users : this.userCollection.listAll()) {
            if(users.getLikes().contains(user)){
             
            }
        }


    }


}
