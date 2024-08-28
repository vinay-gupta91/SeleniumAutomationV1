package TestNGday9;
import TestNGday8.DataProvider1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
    @DataProvider(name= "SearchData2")
    public Object[][] provideData(){
        Object datas[][] = {{"mumbai", "Taj Hotel"},{"Gujrat", "Porbandar"}, {"himachal", "Bhakradam"} };
        return datas;
    }

    @Test(dataProvider = "SearchData1" , dataProviderClass = DataProvider1.class)
//    @Test(dataProvider = "DataProvider")
    public void printData(String Place , String monument ){
        System.out.println(Place + " "+ monument);
//        Assert.assertEquals("a", "b");
    }
}
