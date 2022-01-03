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

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The FireworkShow simulates a firework show in the console.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public final class FireworkShow {

    /**
     * Disables instantiation, as no instance of {@link FireworkShow}
     * should be created.
     */
    private FireworkShow() {
        throw new AssertionError("No FireworkShow instances for you!");
    }

    /**
     * Launches the program.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        List<Object> fireworks = new ArrayList<>();

        fireworks.add(new Firework(Firework.SMALL, "RED", true));
        fireworks.add(new Firework(Firework.SMALL, "GREEN", true));
        fireworks.add(new Firework(Firework.SMALL, "BLUE", true));
        fireworks.add(new Firework(Firework.SMALL, "YELLOW", true));
        fireworks.add(new Firework(Firework.SMALL, "WHITE", true));

        fireworks.add(new Firework(Firework.SMALL, "RED", false));
        fireworks.add(new Firework(Firework.SMALL, "GREEN", false));
        fireworks.add(new Firework(Firework.SMALL, "BLUE", false));
        fireworks.add(new Firework(Firework.SMALL, "YELLOW", false));
        fireworks.add(new Firework(Firework.SMALL, "WHITE", false));

        fireworks.add(new Firework(Firework.MEDIUM, "RED", true));
        fireworks.add(new Firework(Firework.MEDIUM, "GREEN", true));
        fireworks.add(new Firework(Firework.MEDIUM, "BLUE", true));
        fireworks.add(new Firework(Firework.MEDIUM, "YELLOW", true));
        fireworks.add(new Firework(Firework.MEDIUM, "WHITE", true));

        fireworks.add(new Firework(Firework.MEDIUM, "RED", false));
        fireworks.add(new Firework(Firework.MEDIUM, "GREEN", false));
        fireworks.add(new Firework(Firework.MEDIUM, "BLUE", false));
        fireworks.add(new Firework(Firework.MEDIUM, "YELLOW", false));
        fireworks.add(new Firework(Firework.MEDIUM, "WHITE", false));

        fireworks.add(new Firework(Firework.BIG, "RED", true));
        fireworks.add(new Firework(Firework.BIG, "GREEN", true));
        fireworks.add(new Firework(Firework.BIG, "BLUE", true));
        fireworks.add(new Firework(Firework.BIG, "YELLOW", true));
        fireworks.add(new Firework(Firework.BIG, "WHITE", true));

        fireworks.add(new Firework(Firework.BIG, "RED", false));
        fireworks.add(new Firework(Firework.BIG, "GREEN", false));
        fireworks.add(new Firework(Firework.BIG, "BLUE", false));
        fireworks.add(new Firework(Firework.BIG, "YELLOW", false));
        fireworks.add(new Firework(Firework.BIG, "WHITE", false));

        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());

        Collections.shuffle(fireworks);

        for (Object firework : fireworks) {
            // Launching the firework.
            if (firework instanceof Firework) {
                ((Firework) firework).launchFirework();
            } else if (firework instanceof BeesFirework) {
                System.out.println(((BeesFirework) firework).getBeesExplosionString());
            }

            // Applying a delay between each firework.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
