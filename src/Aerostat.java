public class Aerostat implements Flyable{
    private String name;
    private int capacity;
    private int flyDistance;

    public Aerostat(String name, int capacity, int flyDistance) {
        this.name = name;
        this.capacity = capacity;
        this.flyDistance = flyDistance;
    }

    @Override
    public String fly(){
        return String.format("%s, вместимость: %d человек, дальность полёта: %d км \n" +
                        "Аэростат наполняется горячим воздухом и поднимается вверх.",
                name, capacity, flyDistance);
    }
}
