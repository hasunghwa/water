package application;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HealthController implements Initializable{
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	
	@FXML
	private ImageView image_ingred;
	private FileChooser fileChooser;
	private File filepath;
	@FXML
	private Label E_name;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public void move_main() {
		  try {
	        	Parent main = FXMLLoader.load(getClass().getResource("/Main.fxml"));
	        	Scene sc = new Scene(main);
	        	stage.setTitle("Mineral water");
	            stage.setScene(sc);
	            stage.show();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	}
	
	public void show_Mg() {
		E_name.setText("Mg");
		String userDirectoryString = "C:\\git\\image\\Mg.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_ingred.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	public void show_Ca() {
		E_name.setText("Ca");
		String userDirectoryString = "C:\\git\\image\\Ca.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_ingred.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	public void show_K() {
		E_name.setText("K");
		String userDirectoryString = "C:\\git\\image\\K.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_ingred.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	public void show_Na() {
		E_name.setText("Na");
		String userDirectoryString = "C:\\git\\image\\Na.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_ingred.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
		
	}
	/*
	public void show_SiO2() {
		E_name.setText("SiO2 (이산화 규소)");
		
	}
	public void show_Mo() {
		E_name.setText("Mo (몰리브데넘)");
		
	}
	public void show_V() {
		E_name.setText("V (바나듐)");
		
	}
	public void show_Ge() {
		E_name.setText("Ge (저마늄)");
		
	}*/
	
}
