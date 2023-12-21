import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        //____________Лаба1________________________________

//        Kassir glav = new Kassir("Diana", 65);
//        System.out.println(glav.name +" : "+glav.OtchetWeek());
//        System.out.println(Arrays.toString(glav.Hours));
//
//        Manager starsh = new Manager("Marya", 37);
//        System.out.println(starsh.name +" : "+starsh.OtchetWeek());
//        System.out.println(Arrays.toString(starsh.razgruz));
//
//        //Kass[] mass1=new Kass[5];
//        ArrayList<Kass> mass1 = new ArrayList<Kass>();
//        ArrayList<Kass> mass2 = new ArrayList<Kass>();
//
//        int l=Integer.parseInt(scanner.next());
//        for (int i = 0; i < l; i++){//заполняем массив
//            System.out.println("Если закинуть в массив Kassir - 1, Manager - 2: ");
//            int h=Integer.parseInt(scanner.next());
//            if(h==1){
//                String s1=scanner.next();
//                int a=Integer.parseInt(scanner.next());
//                Kassir k = new Kassir(s1, a);
//                mass1.add(k);
//            }
//            if(h==2){
//                String s2=scanner.next();
//                int a=Integer.parseInt(scanner.next());
//                Manager m = new Manager(s2, a);
//                mass1.add(m);
//            }
//        }
//        System.out.println(mass1);
//        System.out.println(" ");
//
//        int o=0;
//        mass2.add(0,mass1.get(0));
//        mass1.remove(0);
//        for (int i = 0; i < l-1; i++){
//            o=mass1.get(i).OtchetWeek();
//            if(o==mass2.get(0).OtchetWeek()){
//                mass2.add(mass1.get(i));
//                mass1.remove(i);
//            }
//        }
//        System.out.println(mass1);
//        System.out.println(mass2);
//        System.out.println(" ");
//
//        //glav.vozrast();
//        try {
//            glav.vozrast();
//        } catch (VozrastException e) {
//            System.out.println(glav.name + " Не может работать");
//        }
//
        //___________________Лаба2________________________________________
        //Write.writem();
        //Read.Readm();

        ArrayList<Kass> mass1 = new ArrayList<Kass>();

        Integer[] Hoursk = new Integer [7];
        for(int i=0; i<7; i++){
            if(i==2 || i==3 || i==6){
                Hoursk[i]=0;
            }
            else{
                Hoursk[i]=8;
            }
        }
        //System.out.println(Hoursk);

        Integer[] Hoursm = new Integer [7];
        for(int i=0; i<7; i++){
            if(i==2 || i==3 || i==6){
                Hoursm[i]=7;
            }
            else{
                Hoursm[i]=7;
            }
        }

//        int l=Integer.parseInt(scanner.next());
//        for (int i = 0; i < l; i++){//заполняем массив
//            System.out.println("Если закинуть в массив Kassir - 1, Manager - 2: ");
//            int h=Integer.parseInt(scanner.next());
//            if(h==1){
//                String s1=scanner.next();
//                int a=Integer.parseInt(scanner.next());
//                Kassir k = new Kassir(Hoursk, s1, a);
//                mass1.add(k);
//            }
//            if(h==2){
//                String s2=scanner.next();
//                int a=Integer.parseInt(scanner.next());
//                Manager m = new Manager(Hoursm, s2, a);
//                mass1.add(m);
//            }
//        }
//        System.out.println(mass1);
//        System.out.println(" ");
//
//        Write.writeruser(mass1);
//        Write.outputuser(mass1);
//
//        Read.readuser();
//        System.out.println(" ");
//        Read.inputuser();

        //Итератор
        Kassir kk1 = new Kassir(Hoursk, "Galya", 34);
        for(Integer item: kk1)
        {
            System.out.println(item);
        }
        System.out.println(" ");

        Manager mm1 = new Manager(Hoursm, "Fedya", 44);
        for(Integer item: mm1)
        {
            System.out.println(item);
        }
        System.out.println(" ");

        //Декоратор
        System.out.println(Write.unmodifiable(mm1));

        //Фабрика
        //System.out.println(Write.createInstance(Hoursk, "gaga", 50)); //private static IFactory factory = new FactoryKassir();

        System.out.println("Создать фабрику типа: Kassir - 1, Manager - 2");
        int h=Integer.parseInt(scanner.next());
        Write.TypeFactory(h);

        Kass k4=Write.createInstance(Hoursm, "gaga", 50);

        System.out.println(k4);
        System.out.println(k4 instanceof Kassir);

    }


}