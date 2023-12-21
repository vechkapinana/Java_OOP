import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import java.util.Iterator;

public class Manager implements Kass{
    String name;
    int age;
    //int[] razgruz = new int [4];//Продукты, которые надо разгрузить за неделю
    Integer[] Hours = new Integer [7];//сколько часов в день работает за неделю
    static int count = 0;

    public Manager() {//конструктор по умолчанию
        count++;
    }

    public Manager(Integer[] Hours, String name, int age) {//конструктор с параметрами
        this.name = name;
        this.age = age;
        this.Hours = Hours;
//        for (int i = 0; i < 4; i++){
//            razgruz[i]=i+2;
//        }
        count++;
    }
    public String getname(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }

    @Override
    public int OtchetWeek() {
        int kvo=0;
        for (int i = 0; i < 7; i++) {
            kvo=kvo+Hours[i];
        }
        return kvo;
    }
    @Override
    public String toString(){
        return name+" "+age+ " "+ Arrays.toString(Hours);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return age == manager.age;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        return result;
    }

    @Override
    public void output(OutputStream out) throws IOException {
        out.write(this.toString().getBytes());
    }

    @Override
    public void write(Writer out) throws IOException {
        out.write(this.toString());
    }

    @Override
    public Iterator<Integer> iterator() {
        return new KassIterator(Hours);
    }
}