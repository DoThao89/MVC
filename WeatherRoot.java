package jdbcapp.mvc.weatherapp;

public class WeatherRoot {
    private Coord coord;
    private Weather[] weather;
    private Main main;
    private Clouds clouds;
    private Rain rain;
    private Sys sys;
    private Wind wind;
    private String base;
    private int visibility;
    private int timezone;
    private int id;
    private int cod;
    private String name;

    public WeatherRoot(Coord coord, Weather[] weathers, Main main, Clouds clouds, Rain rain, Sys sys, Wind wind, String base, int visibility, int timezone, int id, int cod, String name) {
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.clouds = clouds;
        this.rain = rain;
        this.sys = sys;
        this.wind = wind;
        this.base = base;
        this.visibility = visibility;
        this.timezone = timezone;
        this.id = id;
        this.cod = cod;
        this.name = name;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeathers() {
        return weather;
    }

    public void setWeathers(Weather[] weathers) {
        this.weather = weathers;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
