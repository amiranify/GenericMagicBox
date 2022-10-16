public class MagicBox<T> {
    protected T[] items;
    protected int size;

    public MagicBox(int size) {
        T[] items = (T[]) new Object[size];
        this.items = items;
        this.size = size;
    }

    public boolean add(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i] == null){
                items[i] = item;
                System.out.println(item + " добавлен в коробку.");
                return true;
            } else {
                System.out.println("Коробка полная.");
                return false;
            }
        }
        return false;
    }

}