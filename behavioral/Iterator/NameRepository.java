package behavioral.Iterator;

public class NameRepository implements Container {

    String[] names  = new String[]{"Mogen","Robert","Julie"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }

    }
    
}
