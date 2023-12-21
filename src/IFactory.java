public interface IFactory {
    public Kass createInstance(Integer[] Hours, String name, int age);
}

class FactoryKassir implements IFactory{
    public Kass createInstance(Integer[] Hours, String name, int age) {
       return new Kassir (Hours, name, age);
    }
}

class FactoryManager implements IFactory {
    public Kass createInstance(Integer[] Hours, String name, int age) {
        return new Manager(Hours, name, age);
    }
}