package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HealthController implements Initializable{
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void move_main() {
		  try {
	        	Parent main = FXMLLoader.load(getClass().getResource("/Main.fxml"));
	        	Scene sc = new Scene(main);
	            stage.setScene(sc);
	            stage.show();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	}
	
	
}
