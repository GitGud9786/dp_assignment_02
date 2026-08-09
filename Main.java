public class Main {
    public static void main(String[] args)
    {
        VillageDirector director = new VillageDirector();

        CompositeObject modern = director.construct(new ModernVillageBuilder(), "Modern Village");
        modern.display("");
        System.out.println("Shapes in the modern village: " + modern.countShapes());
    
        System.out.println("==========EDITING MODERN VILLAGE==========");

        CompositeObject well = new CompositeObject("New Well");
        well.add(new Shape("Water Well", "Cylinder"));
        modern.add(well);
        System.out.println("New number of shapes in the modern village: " + modern.countShapes());
    
        System.out.println("==========REMOVE THE NEW WELL==========");
        modern.remove(well);
        System.out.println("New count after removing the added well: "+modern.countShapes());
    }
}
