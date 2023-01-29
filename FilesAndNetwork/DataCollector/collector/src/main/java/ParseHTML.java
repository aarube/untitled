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
        
        for() {
            st.add(new Station(number,name);
        }

        Elements a2 = doc.getElementsByClass("js-metro-line");//возвращает список линий, можно получить размер
        System.out.println("a2-1: " + a2.get(0).text());//=Сокольническая линия
        System.out.println("a2-1: " + a2.size());//=17

        Elements a3 = doc.getElementsByClass("js-metro-stations t-metrostation-list-table");//выводит длинну массива линии
        System.out.println(a3.get(0).getElementsByClass("name").size());//=26

        Elements a4 = doc.getElementsByClass("name");//выводит станции в формате "Бульвар Рокоссовского"
        System.out.println(a4.get(0).text());

        Elements el = doc.getElementsByClass("js-metro-line");
        System.out.println("docE: " + ("Номер линии: ").concat(el.get(0).dataset().toString().substring(6, (el.get(0).dataset().toString()).length() - 1)));


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