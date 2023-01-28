import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
public class ParseHTML {

    public static void main(String[] args) throws Exception {
        getLines(getPage()).forEach(System.out::println);
        getStation(getPage()).forEach(System.out::println);
    }

    private static Document getPage() throws Exception {
        return Jsoup.connect("https://skillbox-java.github.io/").get();
    }

    public static List<Line> getLines(Document doc) {
        Elements docElements = doc.getElementsByClass("js-metro-line");
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < docElements.size(); i++) {
            lines.add(new Line(docElements.get(i).text(), docElements.get(i).dataset().toString()));
        }
        return lines;
    }

    public static List<Station> getStation(Document doc) {
        Elements numberOfLine = doc.getElementsByClass("js-depend");
        return new ArrayList<>();
    }

}
