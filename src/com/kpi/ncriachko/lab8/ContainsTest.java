package com.kpi.ncriachko.lab8;

import com.kpi.ncriachko.lab6.Airfreighter;
import com.kpi.ncriachko.lab6.Plane;
import com.kpi.ncriachko.lab6.Warplane;
import com.kpi.ncriachko.lab7.CustomList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsTest {

    @Test
    public void test() {
        CustomList<Plane> planes = new CustomList<>();
        planes.add(null);
        assertTrue(planes.contains(null));
    }

    @Test
    public void tes2() {
        CustomList<Plane> planes = new CustomList<>();
        assertFalse(planes.contains(new Warplane("Noted", 25, 77000,850,
                false, "laser", 100)));
    }

    @Test
    public void test3() {
        List<Plane> list = new CustomList<>();
        Warplane plane1 = new Warplane("f1ask0", 40, 56000,777,
                false, "machine gun", 55);
        Warplane plane2 = new Warplane("D:", 120, 99900,753,
                true, "None", 0);
        list.add(plane1);
        list.add(plane2);
        assertTrue(list.contains(plane1));
        assertTrue(list.contains(plane2));
    }

    @Test
    public void tes4() {
        List<Plane> list = new CustomList<>();
        Plane plane = new Airfreighter("peepo", 2, 500000,2000, "Ammunition",
                87464656, "side hatch");
        list.add(plane);
        assertTrue(list.contains(plane));
    }
}
