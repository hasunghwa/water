package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {

	private Stage stage = StageStore.stage;
	@FXML
	private Button btn2;
	
	public void initialize(){
	 
	}
	
	public void P()throws IOException{
		try {
        	Parent main = FXMLLoader.load(getClass().getResource("/Prious.fxml"));
        	Scene sc = new Scene(main,799,489);
        	
            stage.setScene(sc);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
}


