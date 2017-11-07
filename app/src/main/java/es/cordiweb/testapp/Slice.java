package es.cordiweb.testapp;

public class Slice implements Bread {

    @Override
    public String name() {
        return "Pan de molde";
    }

    @Override
    public String calories() {
        return " : 89 kcal";
    }
}
