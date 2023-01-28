import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static List<Station> getStation2(Document doc) {
        Elements numberOfLine = doc.getElementsByClass("js-depend");
        return new ArrayList<>();
    }



    public static ArrayList<Station> getStation(Document doc) {
        Elements numberOfLine = doc.getElementsByClass("js-depend");

        String numberLine = "";
        String nameSt = "";
        ArrayList<Station> l = new ArrayList<>();

        numberOfLine.stream().map(a -> {
            String number = String.valueOf(a);
            String str = "data-depend-set=\"";
            int start = number.lastIndexOf(str) + str.length();
            int end = number.indexOf("\">", start);

            Document parseNumberOf = Jsoup.parse(number);
            Elements stations = parseNumberOf.getElementsByClass("name");
            stations.stream().map(b -> {
                String station = String.valueOf(b);
                String str1 = "\">";
                int start1 = station.lastIndexOf(str1) + str1.length();
                int end1 = station.indexOf("</span>", start1);
                return numberLine.concat(station.substring(start1, end1));
            }).toString().concat(numberLine);

            return nameSt.concat(number.substring(start, end).concat(" a"));
        }).toString().concat(nameSt);
        l.add(new Station(numberLine, nameSt));
        return l;
    }
}
