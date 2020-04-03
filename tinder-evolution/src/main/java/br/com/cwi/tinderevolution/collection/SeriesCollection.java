package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Series;

import java.util.ArrayList;
import java.util.List;

public class SeriesCollection {

    private static int counter = 1;
    private static final List<Series> listSeries = new ArrayList<>();


    public Series save(Series series) {
        series.setId(counter++);
        listSeries.add(series);
        return series;
    }

    public List<Series> listAll() {
        return listSeries;
    }


    public Series findById(int id) {

        return this.listSeries.stream().filter(series-> series.getId() == id).findFirst().get();

    }

    public Series findByName(String nomeSeries) {

        return this.listSeries.stream().filter(series-> series.getNome().equals(nomeSeries)).findFirst().get();

    }


    public boolean delete(int id) {
        return false;
    }


    public Series update(int id, Series newSeries){

        Series series = findById(id);
        series.setCategory(newSeries.getCategory());
        series.setDataDeLancamento(newSeries.getDataDeLancamento());
        series.setDiretor(newSeries.getDiretor());
        series.setNome(newSeries.getNome());
        series.setNumeroEpisodios(newSeries.getNumeroEpisodios());
        series.setNumeroTemporadas(newSeries.getNumeroTemporadas());
        series.setSinopse(newSeries.getSinopse());


        return series;
    }
}
