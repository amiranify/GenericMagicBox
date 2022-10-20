import java.util.Random;

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
            if (items[i] == null) {
                items[i] = item;
                System.out.println(item + " добавлен в коробку.");
                return true;
            }
        }
        System.out.println("Коробка полная.");
        return false;
    }

    public T pick() throws RuntimeException {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count++;
            }
        }

        if (count != 0) {
            throw new RuntimeException("Остались незаполненных ячеек " + count + " шт.");
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println(items[randomInt]);
        return items[randomInt];
    }
}
