import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.io.*;
import java.util.Iterator;

public interface Kass extends Serializable, Iterable<Integer>{
    public String getname();// Геттер для поля name
    public int getage(); // Геттер для поля age
    public void setname(String name);// Сеттер для поля name
    public void setage(int age); // Сеттер для поля age

    int OtchetWeek();// Функциональный метод
    void output(OutputStream out) throws IOException;
    void write(Writer out) throws IOException;

    public Iterator<Integer> iterator();

    //public boolean equals(int age);

}