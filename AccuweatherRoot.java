package jdbcapp.mvc.weatherofday;

public class AccuweatherRoot {
private Accuweather accuweather;
private Temperatue temperatue;

    public AccuweatherRoot(Accuweather accuweather, Temperatue temperatue) {
        this.accuweather = accuweather;
        this.temperatue = temperatue;
    }

    public Accuweather getAccuweather() {
        return accuweather;
    }

    public void setAccuweather(Accuweather accuweather) {
        this.accuweather = accuweather;
    }

    public Temperatue getTemperatue() {
        return temperatue;
    }

    public void setTemperatue(Temperatue temperatue) {
        this.temperatue = temperatue;
    }
}
