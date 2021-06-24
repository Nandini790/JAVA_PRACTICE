import java.io.File;
import java.io.IOException;


public class JavaIO {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] argh) throws IOException {
        File file = new File("C:/Users/nandini/Documents/java/Hello.txt");

       // Methos of File class

        p("FileNAme : " + file.getName());
        p("Path : " + file.getPath());
        p("Abs Path : " + file.getAbsolutePath());
        p("Parent : " + file.getParent());
        p(file.exists() ? "File exists" : "Not exists");
        p(file.canRead() ? "File is readable" : "Not readable");
        p(file.canWrite() ? "File is writeable" : "Not writeable");
        p(file.isFile() ? "is normal file" : " might be name piped");
        p(file.isAbsolute() ? "is absolute file" : " not absolute");
        p("is"+(file.isDirectory() ? "" : " not" + " a directory"));
        p("Last Modified : " + (file.lastModified()));
        p("Length of file is : "+ file.length() + " Bytes");
    }
}
