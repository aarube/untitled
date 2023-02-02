public class Station {
    String numberOfLine;
    String name;

    public Station(String numberOfLine, String name) {
        this.numberOfLine = numberOfLine;
        this.name = name;
    }

    public String getNumberOfLine() {
        return numberOfLine;
    }

    public void setNumberOfLine(String numberOfLine) {
        this.numberOfLine = numberOfLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Station{" +
                "numberOfLine='" + numberOfLine + '\'' +
                ", name='" + name + '\'' +
                '}' + "\n";
    }
}
