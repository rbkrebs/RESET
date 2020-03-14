package exercicio3.classes;

import exercicio3.enums.Segmento;

public class Item {

    private String nome;
    private Segmento segmento;
    private Double valor;
    private Integer quantidade;

    public Item(String nome, Segmento segmento, Double valor, Integer quantidade) {
        this.nome = nome;
        this.segmento = segmento;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double valorTotal(){
        return this.getValor()*this.getQuantidade();
    }

    public void imprimir(){
        System.out.println(this);;
    }

    @Override
    public String toString() {
        return "["+getSegmento()+"] - "+getNome()+"("+getQuantidade()+") - "+getValor()+" | "+valorTotal();
    }
}
