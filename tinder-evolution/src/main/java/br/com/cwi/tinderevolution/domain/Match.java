package br.com.cwi.tinderevolution.domain;

import java.util.ArrayList;
import java.util.Map;

public class Match {



    private Map<Users,ArrayList<Users>> listMatches;

    public Map<Users, ArrayList<Users>> getListMacthes() {
        return listMatches;
    }

    public void setListMacthes(Map<Users, ArrayList<Users>> listMacthes) {
        this.listMatches = listMacthes;
    }
}
