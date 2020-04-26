package br.com.cwi.tinderevolution.domain;

import java.util.ArrayList;
import java.util.Map;

public class Match {


    private Users evaluated;
    private Users evaluator;

    public Users getEvaluated() {
        return evaluated;
    }

    public void setEvaluated(Users evaluated) {
        this.evaluated = evaluated;
    }

    public Users getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Users evaluator) {
        this.evaluator = evaluator;
    }
}
