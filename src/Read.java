import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Read {
    public static void Readm() throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("file.bin");
        //ArrayList<Kass> MassKass1 = new ArrayList<>();
        //MassKass1 = Stream.input(f);
        //Kassir s = Stream.input(f);
        //System.out.println(s);

        ArrayList<Kass> MassKass1 = new ArrayList<>();
        MassKass1 = Stream.input(f);
        System.out.println(MassKass1);



        /*Reader reader = new FileReader("file1.bin");
        String s = Stream.read(reader);
        System.out.println(s);*/
    }

    public static void readuser() throws IOException, ClassNotFoundException {
        Reader reader = new FileReader("file1.bin");
        String s = Stream.read(reader);
        System.out.println(s);
    }

    public static void inputuser() throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream("file.bin");
        ArrayList<Kass> MassKass1 = new ArrayList<>();
        MassKass1 = Stream.input(f);
        System.out.println(MassKass1);
    }
}
