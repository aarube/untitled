public class Printer {

    private String queue = "";
    private int pageForPrint = 0;

    public void append(String text) {
        append(text, "NoName", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, String name, int countPage) {
        queue = queue + "Название: "+ name +"\n" +text +"\n" + "Страниц в документе: " + countPage + "\n \n";
        pageForPrint = pageForPrint + countPage;
    }


    public void clear() {
        queue = "";
    }

    public void print() {
        System.out.println("Задачи принтера: ");
        if(queue.isEmpty()) {
            System.out.println("Принтер готов к работе");
        } else {
            System.out.println(queue);
        }
    }

    public int getPendingPagesCount() {
        return  pageForPrint;
    }

    public int getTotalPendingPageCount() {
        int totalPage = 0;
        totalPage = totalPage + pageForPrint;
        return totalPage;
    }
}

