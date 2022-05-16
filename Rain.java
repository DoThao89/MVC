package jdbcapp.mvc.weatherapp;

public class Rain {
    private float onehour;

    public Rain(float onehour) {
        this.onehour = onehour;
    }

    public float getOnehour() {
        return onehour;
    }

    public void setOnehour(float onehour) {
        this.onehour = onehour;
    }
}
