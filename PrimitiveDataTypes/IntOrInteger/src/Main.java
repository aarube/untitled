public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        char c1 = (char) 203;
        char c2 = (char) 235;
        System.out.println("203" + "-" + c1);
        System.out.println("253" + "-" + c2);

        for (int i = 1040; i < 1103 ;i++) {
            char c = (char) i;
            System.out.println(i + "-" + c);
        }
        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё. 203\235
        //  A1040

    }
}
