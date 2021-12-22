public class Printer {

    private static String queue = "";
    private static int pageForPrint = 0;

    public static void append(String text) {
        append(text, "NoName", 1);
    }

    public static void append(String text, String name) {
        append(text, name, 1);
    }

    public static void append(String text, String name, int countPage) {
        queue = queue + "Название: "+ name +"\n" +text +"\n" + "Страниц в документе: " + countPage + "\n \n";
        pageForPrint = pageForPrint + countPage;
    }


    public static void clear() {
        queue = "";
    }

    public static void print() {
        System.out.println("Задачи принтера: ");
        if(queue.isEmpty()) {
            System.out.println("Принтер готов к работе");
        } else {
            System.out.println(queue);
        }
    }

    public static int getPendingPagesCount() {
        return  pageForPrint;
    }

    public static int getTotalPendingPageCount() {
        int totalPage = 0;
        totalPage = totalPage + pageForPrint;
        return totalPage;
    }
}

