import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ParseHTML {
    private static Document getPage() throws Exception {
        return Jsoup.connect("https://skillbox-java.github.io/").get();
    }
    public List<Line> getLines() throws Exception {
        Document doc = getPage();
        Elements docE = doc.getElementsByClass("js-metro-line");
        List<Line> lines = new ArrayList<>();
        for (org.jsoup.nodes.Element el : docE) {
            lines.add(new Line(el.text(), el.dataset().toString()));
        }
        return lines;
    }
    public List<Station> getStation() throws Exception{
        Document doc = getPage();
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