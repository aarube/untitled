public class Printer {
    
    String queue = "";

    int pageForPrint;
    int totalPage;


    public void append(String text) {
        append(text, "NoName", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, String name, int pageCount) {
        queue = queue + "Название: "+ name + "\n" +text + "\n"
                + "Страниц в документе: " + pageCount + "\n \n";
        pageForPrint = pageForPrint+ pageCount;
    }

    public int getPendingPagesCount() {
        return  pageForPrint;
    }


    public void print() {
        totalPage = totalPage + pageForPrint;
        System.out.println("Задачи принтера: ");
        if(queue.isEmpty()) {
            System.out.println("Принтер готов к работе");
        } else {
            System.out.println(queue);
            queue = "";
            pageForPrint = 0;
        }
    }

    public int getTotalPendingPageCount() {
        return totalPage;
    }
}

