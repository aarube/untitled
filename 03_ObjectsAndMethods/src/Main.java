public class Main {

    public static void main(String[] args) {
        Printer.append("How many word here?");
        Printer.append("How many word here?","HMWH?");
        Printer.append("How many word here","HMWH?",20);
        Printer.print();
        System.out.println("Всего страниц для печати: "+Printer.getPendingPagesCount());
        Printer.clear();
        Printer.print();



    }

}
