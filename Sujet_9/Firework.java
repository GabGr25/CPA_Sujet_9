/*
 * This software is distributed for educational purposes.
 *
 * It is provided "as is", without warranty of any kind, express or
 * implied, including but not limited to the warranties of merchantability,
 * fitness for a particular purpose and noninfringement.
 * In no event shall the authors or copyright holders be liable for any
 * claim, damages or other liability, whether in an action of contract,
 * tort or otherwise, arising from, out of or in connection with the
 * software or the use or other dealings in the Software.
 *
 * (c) 2020-2022 Romain Wallon - Université d'Artois.
 * All rights reserved.
 */
package Sujet_9;

/**
 * The Firework class represents a firework in the show.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public final class Firework {

    /**
     * The size of a small firework.
     */
    public static final int SMALL = 1;

    /**
     * The size of a medium firework.
     */
    public static final int MEDIUM = 2;

    /**
     * The size of a big firework.
     */
    public static final int BIG = 3;

    /**
     * The size of the firework.
     */
    private int size;

    /**
     * The color of the firework.
     */
    private String color;

    /**
     * Whether there is a delay before the explosion of this firework.
     */
    private boolean isDelayed;

    /**
     * Creates a new Firework.
     *
     * @param size The size of the firework.
     * @param color The color of the firework.
     * @param isDelayed Whether there is a delay before the explosion of
     *        the firework.
     */
    public Firework(int size, String color, boolean isDelayed) {
        this.size = size;
        this.color = color;
        this.isDelayed = isDelayed;
    }

    /**
     * Gives the string to display when this firework explodes.
     *
     * @return The explosion string.
     */
    public String getExplosionString() {
        // Finding the right color code for this firework.
        String colorCode = null;
        switch (color) {
            case "RED":
                colorCode = "\033[0;31m";
                break;
            case "GREEN":
                colorCode = "\033[0;32m";
                break;
            case "BLUE":
                colorCode = "\033[0;34m";
                break;
            case "YELLOW":
                colorCode = "\033[0;33m";
                break;
            default:
                // The color is white by default.
                colorCode = "\033[0;37m";
                break;
        }

        // Finding the right explosion string for this firework.
        String explosion = null;
        switch (size) {
            case SMALL:
                explosion = "boum!";
                break;
            case MEDIUM:
                explosion = "Boouum!!";
                break;
            default:
                // The firework is big by default.
                explosion = "BOOOOUUUUM!!!!";
                break;
        }

        // Creating the full explosion string.
        // The final code restores the default color of the console.
        return colorCode + explosion + "\033[0m";
    }

    /**
     * Launches this firework.
     */
    public void launchFirework() {
        try {
            // Applying a delay, if any.
            if (this.isDelayed) Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(getExplosionString());
    }

}
