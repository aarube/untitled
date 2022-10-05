import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;


public class RouteCalculatorTest extends TestCase {
   private final StationIndex testStationIndex = new StationIndex();
    private final RouteCalculator testObject = new RouteCalculator(testStationIndex);
    List <Station> route;

    Line lineRed =   new Line(1,"red");
    Line lineBlue =  new Line(2,"blue");
    Line lineGreen = new Line(3,"green");
    Line lineOrange = new Line(4,"orange");

    Station r1 = new Station("Ветеранов",  lineRed);
    Station r2 = new Station("Классная", lineRed);
    Station r3 = new Station("Выигрыш",  lineRed);
    Station r4 = new Station("Залив",    lineRed);

    Station b1 = new Station("Купчино",      lineBlue);
    Station b2 = new Station("Пересадочная", lineBlue);
    Station b3 = new Station("Радиус",       lineBlue);
    Station b4 = new Station("Взлетная",     lineBlue);

    Station g1 = new Station("Петровская",   lineGreen);
    Station g2 = new Station("Владимирская", lineGreen);
    Station g3 = new Station("Онегин",       lineGreen);

    Station o1 = new Station("Солнечногорск", lineOrange);
    Station o2 = new Station("Деревенская", lineOrange);

    List<Station> connectionFirst = new ArrayList<>();
    List<Station> connectionSecond = new ArrayList<>();
    List<Station> connectionThird = new ArrayList<>();
    List<Station> connectionFourth = new ArrayList<>();


    @Override//метод для инициализации данных
    protected void setUp() {
        route = new ArrayList<>();
        testStationIndex.addLine(lineRed);
        testStationIndex.addLine(lineBlue);
        testStationIndex.addLine(lineGreen);
        testStationIndex.addLine(lineOrange);

        testStationIndex.addStation(r1);
        testStationIndex.addStation(r2);
        testStationIndex.addStation(r3);
        testStationIndex.addStation(r4);

        testStationIndex.addStation(b1);
        testStationIndex.addStation(b2);
        testStationIndex.addStation(b3);
        testStationIndex.addStation(b4);

        testStationIndex.addStation(g1);
        testStationIndex.addStation(g2);
        testStationIndex.addStation(g3);

        testStationIndex.addStation(o1);
        testStationIndex.addStation(o2);

        connectionFirst.add(r2);
        connectionFirst.add(b2);

        connectionSecond.add(b3);
        connectionSecond.add(g2);

        connectionThird.add(g3);
        connectionThird.add(r3);

        connectionFourth.add(o1);
        connectionFourth.add(g3);

        testStationIndex.addConnection(connectionFirst);
        testStationIndex.addConnection(connectionSecond);
        testStationIndex.addConnection(connectionThird);
        testStationIndex.addConnection(connectionFourth);

        route.add(r1);
        route.add(r2);
        route.add(b2);
        route.add(b3);
        route.add(b4);
    }

    public void testStationIndex() {
        assertTrue(testStationIndex.getLine(1).equals(lineRed)
                && testStationIndex.getLine(2).equals(lineBlue)
                && testStationIndex.getLine(3).equals(lineGreen)
                && testStationIndex.getStation("Ветеранов").equals(r1)
                && testStationIndex.getStation("Пересадочная").equals(b2)
                && testStationIndex.getStation("Владимирская", 3).equals(g2)
                && !testStationIndex.getConnectedStations(r2).isEmpty());
    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        assertEquals(11.0,actual);
    }

    public void testGetShortestRoute() {
        assertNotNull(testObject.getShortestRoute(r1, r4));
        assertNotNull(testObject.getShortestRoute(r1, b3));
        assertNotNull(testObject.getShortestRoute(r1, o2));
    }

    public void testGetRouteOnTheLine() {
        int actual = testObject.getShortestRoute(r1,r4).size();
        assertEquals(0,actual);
    }

    public void testGetRouteWithOneConnection() {
        double actual = testObject.getShortestRoute(r1,b1).size();
        assertEquals(0.0,actual);
    }

    public void testGetRouteWithTwoConnections() {
        double actual = testObject.getShortestRoute(r1,o2).size();
        assertEquals(0.0,actual);
    }
}