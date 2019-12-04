package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController {
	private Stage stage = StageStore.stage;
	@FXML
	private Button btn;
	@FXML private AnchorPane subPage;
	
	public void initialize(){
	 
	}
	
	public void P()throws IOException{
		try {
        	Parent main = FXMLLoader.load(getClass().getResource("/Prious.fxml"));
        	Scene sc = new Scene(main);
            stage.setScene(sc);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
}


