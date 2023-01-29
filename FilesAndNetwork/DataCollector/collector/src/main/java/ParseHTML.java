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

    public static List<Station> getStation(Document doc) throws Exception {
        List<Station> st = new ArrayList<>();

        Elements number = doc.getElementsByClass("js-metro-stations");
        Elements stations = doc.getElementsByClass("name");

        System.out.println(number.get(0).select("data-line=").text());

        return st;
    }

    public static List<Integer> getSmth() throws Exception {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            try {
                String num = (getPage().getElementsByClass("num").get(i)).text();
                Pattern pattern = Pattern.compile("[0-9]+");
                Matcher matcher = pattern.matcher(num);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    ret.add(Integer.parseInt(num.substring(start, end)));
                }

            } catch (Exception ex) {
                ex.printStackTrace();
                break;
            }
        }
        return ret;
    }
}
