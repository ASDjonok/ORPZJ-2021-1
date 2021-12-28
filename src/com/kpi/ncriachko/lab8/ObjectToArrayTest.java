package com.kpi.ncriachko.lab8;

import com.kpi.ncriachko.lab6.Plane;
import com.kpi.ncriachko.lab6.Warplane;
import com.kpi.ncriachko.lab7.CustomList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectToArrayTest {

    @Test
    public void test() {
        List<Plane> list = new CustomList<>();
        Object[] array = list.toArray();
        assertEquals(0, array.length);
    }

    @Test
    public void test2() {
        Warplane plane1 = new Warplane("f1ask0", 40, 56000,777,
                false, "machine gun", 55);
        Warplane plane2 = new Warplane("D:", 120, 99900,753,
                true, "None", 0);
        Warplane[] array = {plane1, plane2};
        List<Plane> list = new CustomList<>();
        list.add(plane1);
        list.add(plane2);
        assertArrayEquals(array, list.toArray());
    }
}
