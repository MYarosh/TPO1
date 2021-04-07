import org.junit.Assert;
import org.junit.Test;

public class TestLeftListHeap {

    @Test
    public void testBasicFuntions() {
        LeftListHeap<Integer> h = new LeftListHeap<>();

        int initializedSize = h.size();
        boolean isEmptyAfterInit = h.isEmpty();
        Integer maxValue = h.max();
        boolean isInserted = h.insert(20);
        boolean isEmptyAfterInsert = h.isEmpty();
        int sizeAfterInsert = h.size();
        Integer maxAfterInsert = h.max();
        Integer deletedNode = h.delete();
        Integer maxAfterDelete = h.max();
        int sizeAfterDelete = h.size();
        boolean isEmptyAfterDelete = h.isEmpty();

        Assert.assertEquals(initializedSize, 0);
        Assert.assertTrue(isEmptyAfterInit);
        Assert.assertNull(maxValue);
        Assert.assertTrue(isInserted);
        Assert.assertFalse(isEmptyAfterInsert);
        Assert.assertEquals(sizeAfterInsert, 1);
        Assert.assertEquals(maxAfterInsert, Integer.valueOf(20));
        Assert.assertEquals(deletedNode, Integer.valueOf(20));
        Assert.assertNull(maxAfterDelete);
        Assert.assertEquals(sizeAfterDelete, 0);
        Assert.assertTrue(isEmptyAfterDelete);
    }

    @Test
    public void testMultipleSameKeyInsertAndDelete() {
        LeftListHeap<Integer> h = new LeftListHeap<>();

        boolean firstInsert = h.insert(2);
        boolean secondInsert = h.insert(2);
        boolean thirdInsert = h.insert(2);
        boolean fourthInsert = h.insert(2);
        boolean fifthInsert = h.insert(2);
        boolean sixthInsert = h.insert(2);
        boolean seventhInsert = h.insert(3);
        Integer maxValue = h.max();
        int firstDelete = h.delete();
        int secondDelete = h.delete();
        int thirdDelete = h.delete();
        int fourthDelete = h.delete();
        int fifthDelete = h.delete();
        Integer sixthDelete = h.delete();
        Integer seventhDelete = h.delete();

        Assert.assertTrue(firstInsert);
        Assert.assertTrue(secondInsert);
        Assert.assertTrue(thirdInsert);
        Assert.assertTrue(fourthInsert);
        Assert.assertTrue(fifthInsert);
        Assert.assertTrue(sixthInsert);
        Assert.assertTrue(seventhInsert);
        Assert.assertEquals(maxValue, Integer.valueOf(3));
        Assert.assertEquals(firstDelete, 3);
        Assert.assertEquals(secondDelete, 2);
        Assert.assertEquals(thirdDelete, 2);
        Assert.assertEquals(fourthDelete, 2);
        Assert.assertEquals(fifthDelete, 2);
        Assert.assertEquals(sixthDelete, Integer.valueOf(2));
        Assert.assertEquals(seventhDelete, Integer.valueOf(2));
    }

}
