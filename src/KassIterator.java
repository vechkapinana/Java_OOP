public class KassIterator implements java.util.Iterator<Integer> {
    private int index = 0;
    private Integer[] Hours;

    public KassIterator(Integer[] Hours) {
        this.Hours = Hours;
    }

    @Override
    public boolean hasNext() {
        return index < Hours.length;
    }//если индекс меньше чем размер

    @Override
    public Integer next() {
        return Hours[index++];
    }
}
