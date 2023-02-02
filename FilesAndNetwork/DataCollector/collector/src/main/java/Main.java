public class Main {
    public static void main(String[] args) throws Exception {
        ParseHTML st = new ParseHTML();
        System.out.println(st.getStation().get(329).numberOfLine);
        System.out.println(st.getLines().get(3).name);
    }
}