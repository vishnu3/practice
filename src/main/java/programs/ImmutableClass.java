package programs;

public final class ImmutableClass {
    private final int id;
    private final String name;

    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ImmutableClass imt = new ImmutableClass(1, "Java");
        System.out.println(imt.name == "Java");

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
