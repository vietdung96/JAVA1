package exam;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import library.Main;

public class HomeController {

    public void gotoList(ActionEvent actionEvent) throws Exception {
        Parent listStudent = FXMLLoader.load(getClass().getResource("student/display/list.fxml"));
        library.Main.rootStage.setTitle("List");
        Main.rootStage.setScene(new Scene(listStudent,800,600));
    }

    public void gotoAdd(ActionEvent actionEvent) throws Exception {
        Parent addStudent = FXMLLoader.load(getClass().getResource("student/add/add.fxml"));
        library.Main.rootStage.setTitle("List");
        Main.rootStage.setScene(new Scene(addStudent,800,600));
    }
}
