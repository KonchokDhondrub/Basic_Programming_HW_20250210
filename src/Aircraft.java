public class Aircraft implements Flyable{
    private String name;
    private int capacity;
    private int flyDistance;

    public Aircraft(String name, int capacity, int flyDistance) {
        this.name = name;
        this.capacity = capacity;
        this.flyDistance = flyDistance;
    }

    @Override
    public String fly(){
        return String.format("%s, вместимость: %d человек, дальность полёта: %d км \n" +
                        "Самолет взлетает с полосы и поднимается в небо.",
                name, capacity, flyDistance);
    }
}
