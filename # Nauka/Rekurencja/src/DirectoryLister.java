import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("D:/Downloads/");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        File[] files = file.listFiles();
        if (files != null)
            for (File f : files){
                System.out.println("folder " + f.getAbsolutePath());
                showDirectories(f);
            }else{
            System.out.println("  plik " + file.getAbsolutePath());
        }
    }
}
