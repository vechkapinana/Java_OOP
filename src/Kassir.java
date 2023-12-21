
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Iterator;

class VozrastException extends Exception {
    public VozrastException(String message) {
        super(message);
    }
}

class KassRuntimeException extends RuntimeException {
    public KassRuntimeException(String message) {
        super(message);
    }
}
 public class Kassir implements Kass  {
    protected String name;
    private int age;
    Integer[] Hours = new Integer [7];//сколько часов в день работает за неделю
    static int count = 0;

    public Kassir() {//конструктор по умолчанию
        count++;
    }

    public Kassir(Integer[] Hours, String name, int age) {//конструктор с параметрами
        this.name = name;
        this.age = age;
        this.Hours = Hours;
//        for(int i=0; i<7; i++){
//            if(i==2 || i==3 || i==6){
//                Hours[i]=0;
//            }
//            else{
//                Hours[i]=8;
//            }
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
        int k=0;
        for(int i=0; i<7; i++){
            if (i>7) throw new KassRuntimeException("Выход за пределы6663");
            k=k+Hours[i];
        }
        return k;
    }

    @Override
     public String toString(){
         return name+" "+age+ " "+Arrays.toString(Hours);
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Kassir kassir = (Kassir) o;
         return age == kassir.age && Objects.equals(name, kassir.name);
     }

     @Override
     public int hashCode() {
         int result = Objects.hash(name, age);
         return result;
     }

     public void vozrast() throws VozrastException {

         if (this.age<55) {
             System.out.println( this.name + " не является пенсионером");
         } else {
             throw new VozrastException(this.name + " является пенсионером");
         }
     }

     @Override
     public void output(OutputStream out) throws IOException {
         out.write(this.toString().getBytes());
     }

     @Override
     public void write(Writer out) throws IOException {
         out.write(this.toString());
     }

     //Итератор должен позволять обойти все элементы поля-массива
     @Override
     public Iterator<Integer> iterator() {
        return new KassIterator(Hours);
     }
 }


