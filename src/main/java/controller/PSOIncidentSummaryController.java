package controller;

import com.example.fire_brigade_system.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.summary;

public class PSOIncidentSummaryController
{

    @javafx.fxml.FXML
    private TextArea summeryTA;

    @javafx.fxml.FXML
    public void initialize() {
        public void writesummery(summeryTA ) {
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            try {
                f = new File("summary.bin");
                if(f.exists()){
                    fos = new FileOutputStream(f,true);
                    oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
                }
                else{
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }

                oos.writeObject(summeryTA);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                try {
                    if(oos != null) oos.close();
                } catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        }

    }
    }

    @javafx.fxml.FXML
    public void handleSubmitOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(com.example.demo.HelloApplication.class.getResource("pso_Dashboardfxml"));
        root = fxmlLoader.load();

        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.show();
    }
}
    }
}