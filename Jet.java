/*
 * Jet class.
 *
 * @author Curtis Edwards
 * @version 1.0
 * @since 2024-04-13
 */

/**
* The Jet() class.
*/
public class Jet extends Airplane {
    /**
     * The multiplier of the Jet.
     */
    private static final int MULTIPLIER = 2;

    /**
     * Constructs a new Jet object.
     */
    public Jet() {
        super();
    }

    /**
     * Sets the speed of the jet.
     *
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
     * Accelerates the jet.
     */
    public void accelerate() {
        super.setSpeed(getSpeed() * 2);
    }
}
