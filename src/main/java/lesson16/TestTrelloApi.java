package lesson16;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestTrelloApi {

    @Test
    public void tesGetBoardList ( ) throws IOException {
        TrelloApi trelloApi = new TrelloApi();
        String boardList = trelloApi.getBoardList("BDkZLEYc");
        System.out.println(boardList);
    }





    @Test
    public void tesGetBoardLables ( ) throws IOException {
        TrelloApi trelloApi = new TrelloApi();
        String boardList = trelloApi.getBoardList("BDkZLEYc");
        System.out.println(boardList);
    }


    @Test
    public void testGetBoardLists() throws IOException {
        TrelloApiNew trelloApiNew = new TrelloApiNew();
        String boardList = trelloApiNew.getBoardLabels("JKegetyW");
        System.out.println(boardList);
    }


}
