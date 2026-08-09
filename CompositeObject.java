import java.util.ArrayList;
import java.util.List;

public class CompositeObject extends VillageComponent
{
    private final List<VillageComponent> components  = new ArrayList<>();

    public CompositeObject(String name) {
        super(name);
    }

    @Override
    public void add(VillageComponent component) {
        components.add(component);
    }

    @Override
    public void remove(VillageComponent component) {
        components.remove(component);
    }

    public List<VillageComponent> getComponents() {
        return components;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "CompositeObject: " + getName());
        for (VillageComponent component : components) {
            component.display(indent + "  ");
        }
    }

    @Override
    public int countShapes()
    {
        int count = 0;
        for (VillageComponent component : components) {
            count += component.countShapes();
        }
        return count;
    }
}