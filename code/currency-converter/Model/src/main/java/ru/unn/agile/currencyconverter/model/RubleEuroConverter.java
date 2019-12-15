package ru.unn.agile.currencyconverter.model;

public class RubleEuroConverter implements CurrencyConverter {

    private final double exchange = 0.0143;

    @Override
    public double convert(final double ruble) {
        return ruble * exchange;
    }
}
