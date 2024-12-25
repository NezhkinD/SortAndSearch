import app.Collections;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import java.util.Comparator;
import java.util.List;

@RunWith(DataProviderRunner.class)
public class CollectionsTest {

    @Test
    @UseDataProvider("loadDataList")
    public <T> void binarySearchListTest(List<? extends Comparable<? super T>> list, T key, int expected) {
        int result = Collections.binarySearch(list, key);
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataList() {
        return new Object[][]{
                {List.of("apple", "banana", "cherry", "orange"), "cherry", 2},
                {List.of("apple", "banana", "cherry", "orange"), "pear", -5},
                {List.of("apple", "banana", "cherry", "orange"), "apple", 0},
                {List.of("apple", "banana", "cherry", "orange"), "rwereqw", -5},
                {List.of("apple", "banana", "cherry", "orange"), "orange", 3},
        };
    }

    @Test
    @UseDataProvider("loadDataListWithComparator")
    public <T> void binarySearchWithComparatorTest(List<T> list, T key, Comparator<T> comparator, int expected) {
        int result = Collections.binarySearch(list, key, comparator);
        Assert.assertEquals(expected, result);
    }

    @DataProvider
    public static Object[][] loadDataListWithComparator() {
        return new Object[][]{
                {List.of("apple", "banana", "cherry", "orange"), "cherry", Comparator.naturalOrder(), 2},
                {List.of("apple", "banana", "cherry", "orange"), "pear", Comparator.naturalOrder(), -5},
                {List.of("apple", "banana", "cherry", "orange"), "apple", Comparator.naturalOrder(), 0},
                {List.of("apple", "banana", "cherry", "orange"), "rwereqw", Comparator.naturalOrder(), -5},
                {List.of("orange", "cherry", "banana", "apple"), "cherry", Comparator.reverseOrder(), 1},
                {List.of("orange", "cherry", "banana", "apple"), "123", Comparator.reverseOrder(), -5}
        };
    }
}
