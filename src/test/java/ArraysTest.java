import app.Arrays;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import java.util.Comparator;

@RunWith(DataProviderRunner.class)
public class ArraysTest {

    @Test()
    @UseDataProvider("loadDataByte")
    public void binarySearchByteTest(byte[] input, int fromIndex, int toIndex, byte key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataByte() {
        return new Object[][]{
                // 1
                {new byte[]{1, 2, 3, 4, 5}, -1, -1, (byte) 3, 2},  // 0
                {new byte[]{1, 2, 3, 4, 5}, -1, -1, (byte) 1, 0},  // 1
                {new byte[]{1, 2, 3, 4, 5}, -1, -1, (byte) 5, 4},  // 2
                {new byte[]{1, 2, 3, 4, 5}, -1, -1, (byte) 6, -6}, // 3
                {new byte[]{1, 2, 3, 4, 5}, -1, -1, (byte) 0, -1}, // 4

                // 2
                {new byte[]{1, 2, 3, 4, 5}, 1, 4, (byte) 3, 2},  // 5
                {new byte[]{1, 2, 3, 4, 5}, 1, 4, (byte) 1, -2}, // 6
                {new byte[]{1, 2, 3, 4, 5}, 1, 4, (byte) 5, -5}, // 7
                {new byte[]{1, 2, 3, 4, 5}, 2, 3, (byte) 3, 2}   // 8
        };
    }

    @Test()
    @UseDataProvider("loadDataChar")
    public void binarySearchCharTest(char[] input, int fromIndex, int toIndex, char key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataChar() {
        return new Object[][]{
                // 1
                {new char[]{'a', 'b', 'c', 'd', 'e'}, -1, -1, 'c', 2},  // 0
                {new char[]{'a', 'b', 'c', 'd', 'e'}, -1, -1, 'f', -6}, // 1
                {new char[]{'a', 'b', 'c', 'd', 'e'}, -1, -1, 'a', 0},  // 2

                // 2
                {new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 4, 'c', 2},    // 3
                {new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 4, 'a', -2},   // 4
                {new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 4, 'e', -5},   // 5
                {new char[]{'a', 'b', 'c', 'd', 'e'}, 2, 3, 'c', 2}     // 6
        };
    }

    @Test
    @UseDataProvider("loadDataDouble")
    public void binarySearchDoubleTest(double[] input, int fromIndex, int toIndex, double key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataDouble() {
        return new Object[][]{
                // 1
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, -1, -1, 3.3, 2},  // 0
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, -1, -1, 6.6, -6}, // 1
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, -1, -1, 1.1, 0},  // 2
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, -1, -1, 0.0, -1}, // 3

                // 2
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, 1, 4, 3.3, 2},    // 4
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, 1, 4, 1.1, -2},   // 5
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, 1, 4, 5.5, -5},   // 6
                {new double[]{1.1, 2.2, 3.3, 4.4, 5.5}, 2, 3, 3.3, 2}     // 7
        };
    }

    @Test
    @UseDataProvider("loadDataFloat")
    public void binarySearchFloatTest(float[] input, int fromIndex, int toIndex, float key, int expected) {
        int result;

        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }

        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataFloat() {
        return new Object[][]{
                // 1
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, -1, -1, 3.3f, 2},  // 0
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, -1, -1, 6.6f, -6}, // 1
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, -1, -1, 1.1f, 0},  // 2
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, -1, -1, 0.0f, -1}, // 3

                // 2
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 1, 4, 3.3f, 2},    // 4
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 1, 4, 1.1f, -2},   // 5
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 1, 4, 5.5f, -5},   // 6
                {new float[]{1.1f, 2.2f, 3.3f, 4.4f, 5.5f}, 2, 3, 3.3f, 2}     // 7
        };
    }

    @Test
    @UseDataProvider("loadDataInt")
    public void binarySearchIntTest(int[] input, int fromIndex, int toIndex, int key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataInt() {
        return new Object[][]{
                // 1
                {new int[]{1, 2, 3, 4, 5}, -1, -1, 3, 2},  // 0
                {new int[]{1, 2, 3, 4, 5}, -1, -1, 6, -6}, // 1
                {new int[]{1, 2, 3, 4, 5}, -1, -1, 1, 0},  // 2
                {new int[]{1, 2, 3, 4, 5}, -1, -1, 0, -1}, // 3

                // 2
                {new int[]{1, 2, 3, 4, 5}, 1, 4, 3, 2},    // 4
                {new int[]{1, 2, 3, 4, 5}, 1, 4, 1, -2},   // 5
                {new int[]{1, 2, 3, 4, 5}, 1, 4, 5, -5},   // 6
                {new int[]{1, 2, 3, 4, 5}, 2, 3, 3, 2}     // 7
        };
    }

    @Test
    @UseDataProvider("loadDataLong")
    public void binarySearchLongTest(long[] input, int fromIndex, int toIndex, long key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataLong() {
        return new Object[][]{
                // 1
                {new long[]{10L, 20L, 30L, 40L, 50L}, -1, -1, 30L, 2},  // 0
                {new long[]{10L, 20L, 30L, 40L, 50L}, -1, -1, 60L, -6}, // 1
                {new long[]{10L, 20L, 30L, 40L, 50L}, -1, -1, 10L, 0},  // 2
                {new long[]{10L, 20L, 30L, 40L, 50L}, -1, -1, 5L, -1},  // 3

                // 2
                {new long[]{10L, 20L, 30L, 40L, 50L}, 1, 4, 30L, 2},    // 4
                {new long[]{10L, 20L, 30L, 40L, 50L}, 1, 4, 10L, -2},   // 5
                {new long[]{10L, 20L, 30L, 40L, 50L}, 1, 4, 50L, -5},   // 6
                {new long[]{10L, 20L, 30L, 40L, 50L}, 2, 3, 30L, 2}     // 7
        };
    }

    @Test
    @UseDataProvider("loadDataShort")
    public void binarySearchShortTest(short[] input, int fromIndex, int toIndex, short key, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataShort() {
        return new Object[][]{
                // 1
                {new short[]{10, 20, 30, 40, 50}, -1, -1, (short) 30, 2},  // 0
                {new short[]{10, 20, 30, 40, 50}, -1, -1, (short) 60, -6}, // 1
                {new short[]{10, 20, 30, 40, 50}, -1, -1, (short) 10, 0},  // 2
                {new short[]{10, 20, 30, 40, 50}, -1, -1, (short) 5, -1},  // 3

                // 2
                {new short[]{10, 20, 30, 40, 50}, 1, 4, (short) 30, 2},    // 4
                {new short[]{10, 20, 30, 40, 50}, 1, 4, (short) 10, -2},   // 5
                {new short[]{10, 20, 30, 40, 50}, 1, 4, (short) 50, -5},   // 6
                {new short[]{10, 20, 30, 40, 50}, 2, 3, (short) 30, 2}     // 7
        };
    }

    @Test
    @UseDataProvider("loadDataGeneric")
    public <T> void binarySearchGenericTest(T[] input, int fromIndex, int toIndex, T key, Comparator<T> comparator, int expected) {
        int result;
        if (fromIndex == -1 || toIndex == -1) {
            result = Arrays.binarySearch(input, key, comparator);
        } else {
            result = Arrays.binarySearch(input, fromIndex, toIndex, key, comparator);
        }
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataGeneric() {
        return new Object[][]{
                // 1
                {new String[]{"apple", "banana", "cherry", "orange"}, -1, -1, "cherry", Comparator.naturalOrder(), 2},  // 0
                {new String[]{"apple", "banana", "cherry", "orange"}, -1, -1, "pear", Comparator.naturalOrder(), -5},    // 1
                {new String[]{"apple", "banana", "cherry", "orange"}, -1, -1, "apple", Comparator.naturalOrder(), 0},   // 2
                {new String[]{"apple", "banana", "cherry", "orange"}, -1, -1, "vvcxdd", Comparator.naturalOrder(), -5}, // 3

                // 2
                {new String[]{"apple", "banana", "cherry", "orange"}, 1, 3, "cherry", Comparator.naturalOrder(), 2},    // 4
                {new String[]{"apple", "banana", "cherry", "orange"}, 1, 3, "apple", Comparator.naturalOrder(), -2},    // 5
                {new String[]{"apple", "banana", "cherry", "orange"}, 1, 3, "orange", Comparator.naturalOrder(), -4},     // 6
                {new String[]{"apple", "banana", "cherry", "orange"}, 2, 3, "cherry", Comparator.naturalOrder(), 2}     // 7
        };
    }
}
