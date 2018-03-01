package allureExample;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



@Epic("API")
public class TrelloCards {


    @Test
    @Parameters({"name"})
    @Feature("Cards Actions")
    @Story("Create new card with name")
    public void createNewCard(){

    }
}
