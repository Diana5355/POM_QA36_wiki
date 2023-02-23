package manage;

import model.User;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {
    @DataProvider
    public static Iterator<Object[]>loginData(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{User.builder().userName("juliakliot.jk").password("Misha240612").build()});
        list.add(new Object[]{User.builder().userName("julia357").password("Misha*$240613").build()});
        return list.iterator();
    }
}
