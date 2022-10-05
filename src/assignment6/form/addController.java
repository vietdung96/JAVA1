package assignment6.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class addController {
    public void accept(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../list/listsubject.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Trang chủ");
        Main.rootStage.setScene(listScene);
    }
}
