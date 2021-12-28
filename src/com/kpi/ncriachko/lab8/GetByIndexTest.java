package com.kpi.ncriachko.lab8;

import com.kpi.ncriachko.lab6.Plane;
import com.kpi.ncriachko.lab6.Warplane;
import com.kpi.ncriachko.lab7.CustomList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GetByIndexTest {

    @Test
    @DisplayName("trying to get() element from empty list should crash")
    public void test() {
        CustomList<Plane> list = new CustomList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    @DisplayName("trying to get() element from non-empty list with (index >= size() && index < 0) should crash")
    public void test1() {
        CustomList<Plane> list = new CustomList<>();
        list.add(new Warplane("D:", 120, 99900,753,
                true, "None", 0));
        list.add(new Warplane("D:", 120, 99900,753,
                true, "None", 0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size()));
    }

    @Test
    @DisplayName("for list{'a', 'b', 'c'} get(0) should == 'a', get(1) should == 'b', get(2) should == 'c'")
    public void test3() {
        CustomList<Warplane> list = new CustomList<>();
        list.add(new Warplane("D:", 120, 99900,753,
                true, "None", 0));
        list.add(new Warplane("Noted", 25, 77000,850,
                        false, "laser", 100));
        list.add(new Warplane("f1ask0", 40, 56000,777,
                false, "machine gun", 55));
        assertEquals( "D:", list.get(0).getName());
        assertEquals("Noted", list.get(1).getName());
        assertEquals("f1ask0", list.get(2).getName());
    }
}