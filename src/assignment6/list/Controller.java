package assignment6.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import multipage.Main;

public class Controller {
    public void addSubject(ActionEvent actionEvent) throws  Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("..form/addsubject.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);

    }
}