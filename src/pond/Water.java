package pond;

public class Water {
    String color;

    public Water(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                '}';
    }
}
