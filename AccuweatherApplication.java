package jdbcapp.mvc.weatherofday;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AccuweatherApplication {
    public static void main(String[]args) throws IOException {
        List<AccuweatherRoot> accuweatherRoot = new ArrayList<>();

  Accuweather accuweather = new Accuweather("2022-05-13T15:00:00+07:00", 1652432400, 6, "Nhieu may", "false", "true");
        Temperatue temperatue = new Temperatue(28, "C", 17);
        Accuweather.add(accuweather);
        Temperatue.add(temperatue);


    }

    public static String getLink() {

        String link = "http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/353412?apikey=93Qg780lHwYM4SO58n7DFPLqHg4oKADn&language=vi-vn&metric=true\n";

        return link;
    }
}
