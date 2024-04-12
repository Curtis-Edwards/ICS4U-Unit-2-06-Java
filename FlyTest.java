public class FlyTest {
    public static void main (String[] args) {
        Airplane biplane = new Airplane();
        biplane.setSpeed(212);
        System.out.println(biplane.getSpeed());
        Jet boeing = new Jet();
        boeing.setSpeed(422);
        System.out.println(boeing.getSpeed());
        int x = 0;
        while (x < 3) {
            boeing.setSpeed();
            System.out.println(boeing.getSpeed());
            /*if (boeing.getSpeed() > 5000) {
                boeing(___* 2);
            } else {
                ___;
            }*/
            x++;
        }
        // System.out.println(___);
    }
}
