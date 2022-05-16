package jdbcapp.mvc.weatherapp;

public class Main {
    private int temp;
    private float feel_like;
    private int temp_min;
    private int temp_max;
    private int pressure;
    private int humidity;
    private int sea_level;
    private int grnd_level;

    public Main(int temp, float feel_like, int temp_min, int temp_max, int pressure, int humidity, int sea_level, int grnd_level) {
        this.temp = temp;
        this.feel_like = feel_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public float getFeel_like() {
        return feel_like;
    }

    public void setFeel_like(float feel_like) {
        this.feel_like = feel_like;
    }

    public int getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSea_level() {
        return sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public int getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }
}
