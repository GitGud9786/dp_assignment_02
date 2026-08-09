public class ModernVillageBuilder implements VillageBuilder{
    
    private CompositeObject village;

    @Override
    public void set(String villageName) {
        village = new CompositeObject(villageName);
    }

    @Override
    public void buildHouse() {
        CompositeObject house = new CompositeObject("Brick House");

        house.add(new Shape("Foundation", "Cuboid"));
        house.add(new Shape("Brick Walls", "Cuboid"));
        house.add(new Shape("Tiled Roof", "Pyramid"));
        village.add(house);
    }

    @Override
    public void buildTree()
    {
        CompositeObject tree = new CompositeObject("Mango Tree");

        tree.add(new Shape("Trunk", "Cylinder"));
        tree.add(new Shape("Mango", "Oval"));
        tree.add(new Shape("Leaf", "Lamina"));
        village.add(tree);
    }
    
    @Override
    public void buildWaterSource()
    {
        CompositeObject watersource = new CompositeObject("Pool");

        watersource.add(new Shape("Basin", "Cube"));
        watersource.add(new Shape("Water", "Cube"));
        village.add(watersource);
    }

    @Override
    public CompositeObject getVillage()
    {
        return village;
    }
}
