public class VillageDirector {
    public CompositeObject construct(VillageBuilder builder, String villageName)
    {
        builder.set(villageName);
        builder.buildHouse();
        builder.buildTree();
        builder.buildWaterSource();
        return builder.getVillage();
    }
}
