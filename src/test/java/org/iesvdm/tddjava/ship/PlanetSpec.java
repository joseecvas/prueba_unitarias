package org.iesvdm.tddjava.ship;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

@Test
public class PlanetSpec {

    private Planet planet;
    private final Point max = new Point(50, 50);
    private List<Point> obstacles;

    @BeforeMethod
    public void beforeTest() {
        obstacles = new ArrayList<Point>();
        obstacles.add(new Point(12, 13));
        obstacles.add(new Point(16, 32));
        planet = new Planet(max, obstacles);
    }

    public void whenInstantiatedThenMaxIsSet() {
        assertNotEquals ( planet.getMax (), null );
        assertEquals ( planet.getMax (), max );
    }
    public void whenInstantiatedThenObstaclesAreSet() {
        assertFalse(obstacles.isEmpty ());
    }

}
