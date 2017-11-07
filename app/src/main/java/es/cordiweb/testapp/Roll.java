package es.cordiweb.testapp;

public class Roll implements Bread{

    @Override
    public String name() {
        return "Pan de pita";
    }

    @Override
    public String calories() {
        return " : 168 kcal";
    }
}
