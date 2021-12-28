package com.kpi.ncriachko.lab8;

import com.kpi.ncriachko.lab6.Plane;
import com.kpi.ncriachko.lab6.Warplane;
import com.kpi.ncriachko.lab7.CustomList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddTest {

    @Test
    @DisplayName("adding element should increase list.size() by 1")
    public void test() {
        CustomList<Plane> planes = new CustomList<>();
        assertTrue(planes.isEmpty());
        planes.add(new Warplane("Noted", 25, 77000,850,
                false, "laser", 100));
        assertEquals(1, planes.size());
        planes.add(new Warplane("Noted", 25, 77000,850,
                false, "laser", 100));
        assertEquals(2, planes.size());
        planes.add(new Warplane("Noted", 25, 77000,850,
                false, "laser", 100));
        assertEquals(3, planes.size());
    }
}
