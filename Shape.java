public class Shape extends VillageComponent {
    private final String type;

    public Shape(String name,String type) {
        super(name);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Shape: " + type);
    }

    @Override
    public int countShapes() {
        return 1;
    }
}
