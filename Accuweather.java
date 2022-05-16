package jdbcapp.mvc.weatherofday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accuweather {
    private String dateTime;
    private long epochDateTime;
    private long weatherIcon;
    private String iconPhrase;
    private boolean hasPrecipitation;
    private boolean isDaylight;
    private Temperatue temperatue;
    private long precipitationProbability;
    private String mobileLink;
    private String link;

    public Accuweather(String dateTime, int epochDateTime, int weatherIcon, String iconPhrase, String mobileLink, String link) {
        this.dateTime = dateTime;
        this.epochDateTime = epochDateTime;
        this.weatherIcon = weatherIcon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.isDaylight = isDaylight;
        this.temperatue = temperatue;
        this.precipitationProbability = precipitationProbability;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    public static void add(Accuweather accuweather) {
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getEpochDateTime() {
        return (int) epochDateTime;
    }

    public void setEpochDateTime(int epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    public int getWeatherIcon() {
        return (int) weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public boolean isHasPrecipitation() {
        return hasPrecipitation;
    }

    public void setHasPrecipitation(boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    public boolean isDaylight() {
        return isDaylight;
    }

    public void setDaylight(boolean daylight) {
        isDaylight = daylight;
    }

    public Temperatue getTemperatue() {
        return temperatue;
    }

    public void setTemperatue(Temperatue temperatue) {
        this.temperatue = temperatue;
    }

    public int getPrecipitationProbability() {
        return (int) precipitationProbability;
    }

    public void setPrecipitationProbability(int precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public static String convertTime(String inputTime) throws ParseException {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        date = inFormat.parse(inputTime);
        SimpleDateFormat outFormat = new SimpleDateFormat();
        String goal = outFormat.format(date);
        return goal;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(convertTime("2022-05-13T16:00:00+07:00"));
    }
}

