public class Countries {
    private String name;
    private String nameCapital;
    private int population;
    private int countryArea;
    private boolean countryAccessToTheSea;

    public Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(int countryArea) {
        this.countryArea = countryArea;
    }

    public boolean isCountryAccessToTheSea() {
        return countryAccessToTheSea;
    }

    public void setCountryAccessToTheSea(boolean countryAccessToTheSea) {
        this.countryAccessToTheSea = countryAccessToTheSea;
    }
}