package pond;

public class Pond_Object {

    public static void main(String[] args) {

        Pond pond1 = new Pond("Blue");

        System.out.println(pond1);

        Water water1 = new Water("Dirty");
        Water water2 = new Water("Normal");
        Pond pond3 = null;
        pond3.lake= water1;




       // Pond pond2 = pond1;




    }

}
