public class Main {
    public static void main(String[] args) {
        MagicBox<String> names = new MagicBox<>(5);
        names.add("cube");
        names.add("sphere");
        names.add("pyramid");
        names.add("cylinder");
        names.add("cone");

        System.out.println(names.pick());

        MagicBox<Integer> volume = new MagicBox<>(5);
        volume.add(10);
        volume.add(4);
        volume.add(15);
        volume.add(30);
        volume.add(55);

        System.out.println(volume.pick());


    }
}
