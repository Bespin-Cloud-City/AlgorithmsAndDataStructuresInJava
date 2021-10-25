package org.obiwan.algorithm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TestSortingAlgorithms {

    private Integer[] arrayToTest;
    private Integer[] anotherArrayToTest;
    private Float[]   floatArray;
    private String[]  countries;
    private static final Integer[] expectedArray        = new Integer[]{1, 2, 4, 5, 6, 8, 12, 15};
    private static final Integer[] anotherExpectedArray = new Integer[]{6, 12, 18, 42, 44, 55, 67, 94};
    private static final Float[]   expectedFloatArray   = new Float[]{1.0f, 2.0f, 4.0f, 5.0f, 6.0f, 8.0f, 12.0f, 15.0f};
    private static final String[]  sortedCountries      = new String[]{"America", "Australia", "Denmark", "France", "Germany", "India", "Italy", "Netherlands", "South-Africa", "Yugoslavia", "Zimbabwe"};

    @Before
    public void setArrayToTest() {
        arrayToTest        = new Integer[]{12, 2, 8, 5, 1, 6, 4, 15};
        anotherArrayToTest = new Integer[]{44, 55, 12, 42, 94, 18, 6, 67};
        floatArray         = new Float[]{12.0f, 2.0f, 8.0f, 5.0f, 1.0f, 6.0f, 4.0f, 15.0f};
        countries          = new String[]{"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", "Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
    }

    @Test
    public void selectionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.selectionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.selectionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void selectionSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.selectionSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void selectionSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.selectionSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void insertionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.insertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.insertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void insertionSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.insertionSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void insertionSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.insertionSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void binaryInsertionSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void binaryInsertionSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void binaryInsertionSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.binaryInsertionSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void interchangeSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.interchangeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.interchangeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void interchangeSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.interchangeSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void interchangeSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.interchangeSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void bubbleSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void bubbleSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void bubbleSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.bubbleSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void shakerSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shakerSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void shakerSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shakerSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void heapSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.heapSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.heapSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void heapSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.heapSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void heapSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.heapSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void shellSortTest() {
        Integer[] array = arrayToTest;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void shellSortFloatTest() {
        Float[] array = floatArray;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void shellSortStringTest() {
        String[] array = countries;
        int[] steps = new int[]{5, 3, 1};
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.shellSort(array, steps);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void quickSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void quickSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void quickSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.quickSort(array, 0, array.length - 1);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void mergeSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.mergeSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.mergeSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }

    @Test
    public void mergeSortFloatTest() {
        Float[] array = floatArray;
        SortingAlgorithms<Float> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.mergeSort(array);
        Assert.assertArrayEquals(expectedFloatArray, array);
    }

    @Test
    public void mergeSortStringTest() {
        String[] array = countries;
        SortingAlgorithms<String> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.mergeSort(array);
        Assert.assertEquals(Arrays.toString(sortedCountries), Arrays.toString(array));
    }

    @Test
    public void radixSortTest() {
        Integer[] array = arrayToTest;
        SortingAlgorithms<Integer> sortingAlgorithm = new SortingAlgorithms<>();

        sortingAlgorithm.radixSort(array);
        Assert.assertArrayEquals(expectedArray, array);

        array = anotherArrayToTest;
        sortingAlgorithm.radixSort(array);
        Assert.assertArrayEquals(anotherExpectedArray, anotherArrayToTest);
    }
}