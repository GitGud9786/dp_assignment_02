public abstract class VillageComponent {
    protected String name;

    protected VillageComponent(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(VillageComponent component) {
        throw new UnsupportedOperationException("Cannot add component to this type");
    }

    public void remove(VillageComponent component) {
        throw new UnsupportedOperationException("Cannot remove component from this type");
    }

    public abstract void display(String indent);
    public abstract int countShapes();
}