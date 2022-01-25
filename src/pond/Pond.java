package pond;

public class Pond {

    public Water lake ;

    public Pond(String color) {
        this.lake = new Water(color);
    }


    @Override
    public String toString() {
        return "Pond{" +
                "lake=" + lake +
                '}';
    }
}
