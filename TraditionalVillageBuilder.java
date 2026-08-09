public class TraditionalVillageBuilder implements VillageBuilder {

    private CompositeObject village;

    public void set(String villageName) {
        village = new CompositeObject(villageName);
    }

    @Override
    public void buildHouse() {
        CompositeObject house = new CompositeObject("Mud House");
        house.add(new Shape("Earthen plinth", "Cuboid"));
        house.add(new Shape("Round mud wall", "Cylinder"));
        house.add(new Shape("Thatched roof", "Cone"));
        house.add(new Shape("Bamboo door", "Cuboid"));
        village.add(house);
    }

    @Override
    public void buildTree() {
        CompositeObject tree = new CompositeObject("Banana Tree");
        tree.add(new Shape("Pseudostem", "Cylinder"));
        tree.add(new Shape("Banana leaf", "Cone"));
        tree.add(new Shape("Banana bunch", "Cone"));
        village.add(tree);
    }

    @Override
    public void buildWaterSource() {
        CompositeObject pond = new CompositeObject("Pond");
        pond.add(new Shape("Dug pit", "Cylinder"));
        pond.add(new Shape("Water", "Cylinder"));
        pond.add(new Shape("Bank stone", "Sphere"));
        village.add(pond);
    }

    @Override
    public CompositeObject getVillage() {
        return village;
    }
}