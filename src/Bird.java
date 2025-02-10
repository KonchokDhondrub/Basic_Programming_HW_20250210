public abstract class Bird {
    private String breed;
    private int height;
    private int weight;
    private int wingspan;
    private int flyDistance;

    public Bird(String breed, int height, int weight, int wingspan, int flyDistance) {
        this.breed = breed;
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
        this.flyDistance = flyDistance;
    }

    public String getBreed() {
        return breed;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public int getWingspan() {
        return wingspan;
    }
    public int getFlyDistance() {
        return flyDistance;
    }

    public String fly(){
        return "Птица машет крыльями и летит.";
    }
}
