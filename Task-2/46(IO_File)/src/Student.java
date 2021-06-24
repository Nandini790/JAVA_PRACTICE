import java.io.*;

public class Student implements Serializable {
    String name;
    String id;

    // To read and write the object into file we have implements Serializable interface.

    public Student(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
}

class Main{
    public static void main(String[] args){
        try
        {
            // Serializable and Deserializable
            Student s1 = new Student("Nandini","17CS");

            File newfile = new File("student.txt");
            /*
              Wrting a onject into the class throught ObjectOutputStream - serializable
              Store the state of the object intp the file student.txt.
             */

            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(newfile));
            os.writeObject(s1);
            os.close();

            /*
              Reading an object from the file using ObjectInputStream - deserializable
               store the object into the s2 objecr reference by casting in into Student type,
               now print the obj.ref s2.
             */

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(newfile));
            Student s2 = null;
            s2 = (Student)ois.readObject();
            System.out.println(s2.name+" "+s2.id);
            ois.close();

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
