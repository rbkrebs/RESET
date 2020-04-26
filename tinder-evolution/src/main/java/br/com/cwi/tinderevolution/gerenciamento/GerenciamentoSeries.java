package br.com.cwi.tinderevolution.gerenciamento;

import br.com.cwi.tinderevolution.collection.SeriesCollection;
import br.com.cwi.tinderevolution.domain.Series;
import br.com.cwi.tinderevolution.domain.enums.Category;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

public class GerenciamentoSeries {

    SeriesCollection seriesCollection = new SeriesCollection();

    public Series save(Series series) throws IllegalArgumentException {

        if (verificaRegistroDuplicado(series) && verificaDataRegistro(series) && verificaEstilos(series)) {

            return this.seriesCollection.save(series);
        }

        return null;

    }

    public boolean verificaRegistroDuplicado(Series seriesParam) {
        Optional<Series> series;
        try {

            series = Optional.of(this.seriesCollection.findByName(seriesParam.getNome()));

        } catch (Exception e) {
            System.out.println(e);
            return true;
        }
        if (series.isPresent()) {

            throw new IllegalArgumentException("Série já cadastrada");
        }

        return true;

    }

    public boolean verificaDataRegistro(Series seriesParam) {

        if (!Period.between(seriesParam.getDataDeLancamento(), LocalDate.now()).isNegative()) {
            return true;
        }

        throw new IllegalArgumentException("Verifique a data de lançamento");

    }

    public boolean verificaEstilos(Series seriesParam) {

        if (seriesParam.getCategory() instanceof Category) {
            return true;
        }

        throw new IllegalArgumentException("Estilo não contemplado no escopo");


    }

    public boolean verificaNumeroEpisodios(Series seriesParam) {

        if (seriesParam.getNumeroEpisodios() > 1) {
            return true;
        }

        throw new IllegalArgumentException("Número de episódios insuficiente");


    }

    public Series findById(Integer idSeries) {

        return this.seriesCollection.findById(idSeries);
    }
/*

    uma forma de vincular o número de episódios com determinada temporada seria através de set?
    public boolean verificaNumeroTemporadas(Series seriesParam) {

        if (seriesParam.getNumeroTemporadas() > 1) {
            return true;
        }

        throw new IllegalArgumentException("Número de temporadas insuficiente");


    }
    */



}
