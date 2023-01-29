import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseHTML {

    public static void main(String[] args) throws Exception {
        getLines(getPage()).forEach(System.out::println);
        getStation(getPage()).forEach(System.out::println);
    }

    private static Document getPage() throws Exception {
        return Jsoup.connect("https://skillbox-java.github.io/").get();
    }

    public static List<Line> getLines(Document doc) {
        Elements docE = doc.getElementsByClass("js-metro-line");
        List<Line> lines = new ArrayList<>();

        for (org.jsoup.nodes.Element el : docE) {
            lines.add(new Line(el.text(),
                    el.dataset().toString().substring(6, (el.dataset().toString()).length() - 1)));
        }
        return lines;
    }

    public static List<Station> getStation(Document doc) {
        List<Station> st = new ArrayList<>();
        Elements metroLine = doc.getElementsByClass("js-metro-line");
        Elements metroStations = doc.getElementsByClass("js-metro-stations t-metrostation-list-table");
        Elements nameStations = doc.getElementsByClass("name");
        int c = 0;
        for (int a = 0; a < metroLine.size(); a++) {
            for (int b = 0; b < metroStations.get(a).getElementsByClass("name").size(); b++) {
                st.add(new Station(metroLine.get(a).dataset().toString(), nameStations.get(c).text()));
                c++;
            }
        }
        return st;
    }
}