package todoTask;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyArrayListTest {

    private MyArrayList myarrayList = new MyArrayList();

//    @BeforeEach
//   public void setUp(){
//        myarrayList = new MyArrayList();
//    }


    @Test
    public void testAdd() {
        myarrayList.add("Element 1");
        myarrayList.add("Element 2");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");
        myarrayList.add("Element 3");

        assertEquals(15, myarrayList.getListSize());
//        Assert.assertEquals(15, myarrayList.getCapacity());
    }

    @Test
    public void testGetElementAtIndex() {
        
        myarrayList.add("Element 1");
        myarrayList.add("Element 2");
        myarrayList.add("Element 3");

        
        String actual = String.valueOf(myarrayList.get(2));
        String expected = "Element 3";
        assertEquals(expected, actual);
    }



    @Test
    public void testGetCapacity() {
        assertEquals(10, myarrayList.getCapacity());
    }

    @Test
    public void testGetListSize() {
        myarrayList.add("Element 1");
        myarrayList.add("Element 2");
        myarrayList.add("Element 3");

        assertEquals(3, myarrayList.getListSize());
    }

    @Test
    public void testRemove(){

        myarrayList.add("Element 1");
        myarrayList.add("Element 2");
        myarrayList.add("Element 3");
        myarrayList.add("Element 5");
        myarrayList.add("Element 6");
        myarrayList.add("Element 7");
        myarrayList.add("Element 8");
        myarrayList.add("Element 9");
        myarrayList.add("Element 10");
        myarrayList.add("Element 10");


        myarrayList.remove(0);
        myarrayList.remove(1);
        myarrayList.remove(2);
        myarrayList.remove(3);
        myarrayList.remove(4);

        assertEquals(5, myarrayList.getListSize());






    }


}