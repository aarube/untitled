import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
public class RouteCalculatorTest extends TestCase {
    private final StationIndex testStationIndex = new StationIndex();
    private final RouteCalculator testObject = new RouteCalculator(testStationIndex);
    List<Station> route;
    Line lineRed = new Line(1, "red");
    Line lineBlue = new Line(2, "blue");
    Line lineGreen = new Line(3, "green");

    Station r1 = new Station("Ветеранов", lineRed);
    Station r2 = new Station("Техноложка", lineRed);
    Station r3 = new Station("Нарвская", lineRed);
    Station r4 = new Station("Балтийская", lineRed);
    Station r5 = new Station("Площадь Востания", lineRed);
    Station r6 = new Station("Мурино", lineRed);

    Station b1 = new Station("Купчино", lineBlue);
    Station b2 = new Station("ТехноложкаII", lineBlue);
    Station b3 = new Station("Сенная", lineBlue);
    Station b4 = new Station("Невский проспект", lineBlue);
    Station b5 = new Station("Парнас", lineBlue);

    Station g1 = new Station("Рыбыцкое", lineGreen);
    Station g2 = new Station("Пересадка", lineGreen);
    Station g3 = new Station("Беговая", lineGreen);

    List<Station> connectionFirst = new ArrayList<>();
    List<Station> connectionSecond = new ArrayList<>();
    List<Station> connectionThird = new ArrayList<>();

    @Override//метод для инициализации данных
    protected void setUp() {
        route = new ArrayList<>();
        testStationIndex.addLine(lineRed);
        testStationIndex.addLine(lineBlue);
        testStationIndex.addLine(lineGreen);

        testStationIndex.addStation(r1);
        testStationIndex.addStation(r2);
        testStationIndex.addStation(r3);
        testStationIndex.addStation(r4);
        testStationIndex.addStation(r5);
        testStationIndex.addStation(r6);

        testStationIndex.addStation(b1);
        testStationIndex.addStation(b2);
        testStationIndex.addStation(b3);
        testStationIndex.addStation(b4);
        testStationIndex.addStation(b5);

        testStationIndex.addStation(g1);
        testStationIndex.addStation(g2);
        testStationIndex.addStation(g3);

        connectionFirst.add(r2);
        connectionFirst.add(b2);

        connectionSecond.add(b3);
        connectionSecond.add(g2);

        connectionThird.add(b4);
        connectionThird.add(r5);

        testStationIndex.addConnection(connectionFirst);
        testStationIndex.addConnection(connectionSecond);
        testStationIndex.addConnection(connectionThird);

        lineRed.addStation(r1);
        lineRed.addStation(r2);
        lineRed.addStation(r3);
        lineRed.addStation(r4);
        lineRed.addStation(r5);
        lineRed.addStation(r6);

        lineGreen.addStation(g1);
        lineGreen.addStation(g2);
        lineGreen.addStation(g3);

        lineBlue.addStation(b1);
        lineBlue.addStation(b2);
        lineBlue.addStation(b3);
        lineBlue.addStation(b4);
        lineBlue.addStation(b5);

        route.add(r1);
        route.add(r2);
        route.add(b2);
        route.add(b3);
        route.add(b4);
    }

    public void testStationIndex()  {
        assertTrue(testStationIndex.getLine(1).equals(lineRed)
                && testStationIndex.getLine(2).equals(lineBlue)
                && testStationIndex.getLine(3).equals(lineGreen)
                && testStationIndex.getStation("Ветеранов").equals(r1)
                && testStationIndex.getStation("ТехноложкаII").equals(b2)
                && testStationIndex.getStation("Пересадка", 3).equals(g2)
                && !testStationIndex.getConnectedStations(r2).isEmpty());
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        assertEquals(11.0, actual);
    }

    public void testGetShortestRoute() {
        assertNotNull(testObject.getShortestRoute(r1, r4));
        assertNotNull(testObject.getShortestRoute(r1, b3));
        assertNotNull(testObject.getShortestRoute(r1, g3));
    }

    public void testGetRouteOnTheLine() {
        List<Station> actual = testObject.getShortestRoute(r1, r4);

        List<Station> expected = new ArrayList<>();
        expected.add(r1);
        expected.add(r2);
        expected.add(r3);
        expected.add(r4);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithOneConnection() {
        List<Station> actual = testObject.getShortestRoute(r1, b1);

        List<Station> expected = new ArrayList<>();
        expected.add(r1);
        expected.add(r2);
        expected.add(b2);
        expected.add(b1);
        assertEquals(expected, actual);
    }

    public void testGetRouteWithTwoConnections() {
        List<Station> actual = testObject.getShortestRoute(r1, g3);

        List<Station> expected = new ArrayList<>();
        expected.add(r1);
        expected.add(r2);
        expected.add(b2);
        expected.add(b3);
        expected.add(g2);
        expected.add(g3);
        assertEquals(expected, actual);
    }
}