import java.io.*;
import java.util.Iterator;
//методы интерфейса делегирует внутреннему объекту,
// кроме методов изменения объекта
public class Unmodifiable implements Kass{
    private final Kass s;
    //полезно при создании неизменяемых объектов
    //Для класса это означает, что класс не сможет иметь подклассов, т.е. запрещено наследование.
    public Unmodifiable(Kass s) {
        this.s = s;
    }

    @Override
    public String getname() {
        return s.getname();
    }

    @Override
    public void setname(String name) {
        throw new UnsupportedOperationException("невозможно изменить");
    }

    @Override
    public int getage() {
        return s.getage();
    }

    @Override
    public void setage(int age) {
        throw new UnsupportedOperationException("невозможно изменить");
    }

    @Override
    public int OtchetWeek() {
        return s.OtchetWeek();
    }

    @Override
    public void output(OutputStream out) throws IOException {
        s.output(out);
    }

    @Override
    public void write(Writer out) throws IOException{
        s.write(out);
    }

    @Override
    public Iterator<Integer> iterator() {
        return s.iterator();
    }

    @Override
    public String toString() {
        return s.toString();
    }
}
