import java.io.*;
public class Stream {
    //запись в байтовый поток
    public static <Kass> void output (Kass obj, OutputStream out) throws IOException{
        ObjectOutputStream ob = new ObjectOutputStream(out);
        // write object to file
        ob.writeObject(obj);
        System.out.println("Done");
        // close
        ob.close();
    }
    //чтение из байтового потока
    public static <Kass> Kass input (InputStream in) throws IOException, ClassNotFoundException{
        ObjectInputStream ob1 = new ObjectInputStream(in);
        return (Kass) ob1.readObject();//должны сделать приведение типов, тк это экземиляр класса обджект
    }
    //запись в символьный поток
    public static <Kass> void write (Kass obj, Writer out1) throws IOException{
        // write object to file
        out1.write(obj.toString());
        System.out.println("Done");
        // close
        out1.close();
    }

    public static <Kass> Kass read (Reader in1) throws IOException{
        BufferedReader ob1 = new BufferedReader(in1);
        String line = ob1.readLine();
        return (Kass) line.toString();
    }
}

/*ObjectOutputStream в Java можно использовать для преобразования объекта в OutputStream.
Процесс преобразования объекта в поток в Java называется сериализацией .

ObjectOutputStream является частью классов Java IO , и вся его цель —
предоставить нам способ преобразования Java-объекта в поток.
Когда мы создаем экземпляр ObjectOutputStream, мы должны предоставить
выходной поток, который будет использоваться.
Этот OutputStream далее используется ObjectOutputStream для направления
потока объектов в базовый выходной поток, например FileOutputStream .*/

/*Класс Writer — это полный аналог класса OutputStream, и
снова только с одним отличием: он работает с символами, char, вместо байт.*/