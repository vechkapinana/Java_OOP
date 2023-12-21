import java.io.*;
import java.util.ArrayList;
public class Write {
    private static IFactory factory;

    public static void setFactory(IFactory obj) {//передаю что я хочу сохранить
        factory =obj;
    }
    // передаю пареметр типа интерфейс
    //могу закинуть либо кассирв или  менеджера и в мейне я уже решаю и смогу добраться до инстанс офф ф.инст


    public static void TypeFactory(int h) {//передаю что я хочу сохранить
        if (h==1){
            setFactory(new FactoryKassir());
        }
        else{
            setFactory(new FactoryManager());
        }
    }
    public static Kass createInstance(Integer[] Hours, String name, int age) {
        return factory.createInstance(Hours, name, age);
    }

    public static Unmodifiable unmodifiable (Kass obj){
        Unmodifiable un = new Unmodifiable(obj);
        return un;
    }
    public static void writem() throws IOException {
//        ArrayList<Kass> MassKass = new ArrayList<>();
//        FileOutputStream f = new FileOutputStream("file.bin");
//        Kassir k1 = new Kassir("Galya", 35);
//        Manager m1 = new Manager("Marya", 27);
//        Kassir k2 = new Kassir("Nikita", 49);
//        Manager m2 = new Manager("Ivan", 35);
//        MassKass.add(k1);
//        MassKass.add(k2);
//        MassKass.add(m1);
//        MassKass.add(m2);
//        Stream.output(MassKass, f);
        //Stream.output(k1, f);


        //Writer writer = new FileWriter("file1.bin");
        //Stream.write(k1, writer);
    }

    public static <Kass> void writeruser(Kass obj) throws IOException {
        Writer writer = new FileWriter("file1.bin");
        Stream.write(obj, writer);
    }

    public static <Kass> void outputuser(Kass obj) throws IOException {
        FileOutputStream f = new FileOutputStream("file.bin");
        Stream.output(obj, f);
    }


}

//Статические методы отличаются от обычных тем, что они также привязаны к классу, а не к объекту.
//Важным свойством статического метода является то, что он может обратиться только к статическим переменным/методам.
