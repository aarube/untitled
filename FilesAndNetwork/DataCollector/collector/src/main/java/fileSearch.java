import java.io.File;

public class fileSearch {

    public static void main(String[]args){
        propertiesOfFolder("/users/alex/desktop/data");
    }

    public static void propertiesOfFolder(String p) {
        File folder = new File(p);
        File[] files = folder.listFiles();
       assert files != null;
        for (File file : files) {

            if (file.isDirectory()); {
                propertiesOfFolder(file.getAbsolutePath());
            }

            if (!file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }
}