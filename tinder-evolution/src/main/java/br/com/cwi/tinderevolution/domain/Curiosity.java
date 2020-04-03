package br.com.cwi.tinderevolution.domain;

import br.com.cwi.tinderevolution.domain.enums.Category;
import br.com.cwi.tinderevolution.domain.enums.CuriosityCategory;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Curiosity {

    private int id;

    @NotNull(message = "o campo descrição é obrigatório")
    private String description;
    @NotNull(message = "o campo categoria é obrigatório")
    private CuriosityCategory curiosityCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CuriosityCategory getCuriosityCategory() {
        return curiosityCategory;
    }

    public void setCuriosityCategory(CuriosityCategory curiosityCategory) {
        this.curiosityCategory = curiosityCategory;
    }

    @Override
    public String toString() {
        return "Curiosity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", curiosityCategory=" + curiosityCategory +
                '}';
    }
}
