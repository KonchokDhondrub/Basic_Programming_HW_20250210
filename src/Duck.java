public class Duck extends Bird implements Flyable{

    public Duck(String breed, int height, int weight, int wingspan, int flyDistance) {
        super(breed, height, weight, wingspan, flyDistance);
    }

    @Override
    public String fly(){
        return String.format("%s, высота: %d см, вес: %d кг, размах крыльев: %d см, дальность полёта: %d км \n" +
                        "Утка машет крыльями и летит.",
                getBreed(), getHeight(), getWeight(), getWingspan(), getFlyDistance());
    }
}
