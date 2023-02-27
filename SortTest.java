package ru.prog;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class SortTest {
    int[] a = {1, 5, 7, 2, 7, 3, 8, 4, 8, 3};
    int[] b = {1, 2, 3, 3, 4, 5, 7, 7, 8, 8};
    ru.prog.Sort sort = new ru.prog.Sort();
    @Test
    public void QuickSortTest(){
        sort.quickSort(a, 0, a.length - 1);
        assertArrayEquals(b, a);
    }
    @Test
    public void BubbleTest(){
        sort.Bubble(a);
        assertArrayEquals(b, a);
    }
}