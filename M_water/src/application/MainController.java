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
	private Button b_water;
	@FXML
	private Button b_lank;
	@FXML
	private Button b_health;
	
	public void initialize(){
	 
	}
	
	public void move_water()throws IOException{
		try {
        	Parent water = FXMLLoader.load(getClass().getResource("/Water.fxml"));
        	Scene sc = new Scene(water);
        	stage.setTitle("Water Ingredient");
        	stage.setScene(sc);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
	public void move_lank()throws IOException{
		try {
        	Parent lank = FXMLLoader.load(getClass().getResource("/Rank.fxml"));
        	Scene sc = new Scene(lank);
        	stage.setTitle("Mineral Water Ranking");
            stage.setScene(sc);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
	public void move_health()throws IOException{try {
    	Parent water = FXMLLoader.load(getClass().getResource("/Health.fxml"));
    	Scene sc = new Scene(water);
    	stage.setTitle("Health Information");
    	stage.setScene(sc);
        stage.show();
        
    } catch (IOException e) {
        e.printStackTrace();
    }	
	}
}

