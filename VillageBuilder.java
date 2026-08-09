public interface VillageBuilder {
    void set(String name);
    void buildHouse();
    void buildTree();
    void buildWaterSource();
    CompositeObject getVillage();
}
