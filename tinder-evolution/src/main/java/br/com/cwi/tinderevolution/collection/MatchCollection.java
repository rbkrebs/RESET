package br.com.cwi.tinderevolution.collection;


import br.com.cwi.tinderevolution.domain.Match;
import br.com.cwi.tinderevolution.domain.Users;

import java.util.ArrayList;
import java.util.List;

public class MatchCollection {


    private static final List<Match> listMatches = new ArrayList<>();

    UserCollection userCollection = new UserCollection();


    public Match findById(Integer id) {

        Users user = userCollection.findById(id);

        Match matchById = listMatches.stream().filter(match -> match.getListMacthes().containsKey(user)).findFirst().get();

        return matchById;

    }
}
