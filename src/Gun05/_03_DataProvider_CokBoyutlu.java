package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokBoyutlu {


    @Test(dataProvider = "UserData")
    void UserNamePasswordTest(String userName, String password){
        System.out.println(userName + " " + password);
    }

    @DataProvider
    Object[][] UserData(){
        Object[][] userPass={
                {"Merve","e2412sdfa"},
                {"Ali","fdsafsadf2"},
                {"Mehmet","safasf"}
        };
        return userPass;
    };

}
