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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HealthController implements Initializable{
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	
	@FXML
	private ImageView image_ingred;
	@FXML
	private ImageView image_why;
	@FXML
	private Label image_num;
	@FXML
	private Label imageh_num;
	@FXML
	private ImageView image_effect;
	private FileChooser fileChooser;
	private File filepath;
	@FXML
	private Label E_name;
	@FXML
	private Pane ipane;
	@FXML
	private Pane wpane;
	@FXML
	private Pane hpane;
	@FXML
	private Button button_ipane;
	@FXML
	private Button button_wpane;
	@FXML
	private Button button_hpane;

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
	public void show_ipane() {
		E_name.setText("");
		wpane.setVisible(false);
		hpane.setVisible(false);
		ipane.setVisible(true);
		button_wpane.setUnderline(false);
		button_hpane.setUnderline(false);
		button_ipane.setUnderline(true);
		
	}
	public void show_wpane() {
		E_name.setText("");
		ipane.setVisible(false);
		hpane.setVisible(false);
		wpane.setVisible(true);
		button_ipane.setUnderline(false);
		button_hpane.setUnderline(false);
		button_wpane.setUnderline(true);
		String userDirectoryString = "C:\\git\\image\\one.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_effect.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void Prior_image() {
		int i_num = Integer.parseInt(image_num.getText());
		String fname = null;
		i_num--;
		if(i_num>0) {
			image_num.setText(Integer.toString(i_num));
			if(i_num==1) {fname="one";}
			if(i_num==2) {fname="two";}
			if(i_num==3) {fname="three";}
			if(i_num==4) {fname="four";}
			String userDirectoryString = "C:\\git\\image\\"+fname+".png";
			File userDirectory = new File(userDirectoryString);
			
			try {
				BufferedImage bufferedImage = ImageIO.read(userDirectory);
				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				image_effect.setImage(image);
				
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
	public void next_image() {
		int i_num = Integer.parseInt(image_num.getText());
		String fname = null;
		i_num++;
		if(i_num<=5) {
			image_num.setText(Integer.toString(i_num));
			if(i_num==2) {fname="two";}
			if(i_num==3) {fname="three";}
			if(i_num==4) {fname="four";}
			if(i_num==5) {fname="five";}
			String userDirectoryString = "C:\\git\\image\\"+fname+".png";
			File userDirectory = new File(userDirectoryString);
			
			try {
				BufferedImage bufferedImage = ImageIO.read(userDirectory);
				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				image_effect.setImage(image);
				
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
	public void show_hpane() {
		E_name.setText("");
		ipane.setVisible(false);
		wpane.setVisible(false);
		hpane.setVisible(true);
		button_ipane.setUnderline(false);
		button_wpane.setUnderline(false);
		button_hpane.setUnderline(true);
		
		String userDirectoryString = "C:\\git\\image\\why.png";
		File userDirectory = new File(userDirectoryString);
		
		try {
			BufferedImage bufferedImage = ImageIO.read(userDirectory);
			Image image = SwingFXUtils.toFXImage(bufferedImage, null);
			image_why.setImage(image);
			
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
	public void Prior_himage() {
		int i_num = Integer.parseInt(imageh_num.getText());
		String fname = null;
		i_num--;
		if(i_num>0) {
			imageh_num.setText(Integer.toString(i_num));
			if(i_num==1) {fname="why";}
			if(i_num==2) {fname="why2";}
			if(i_num==3) {fname="drink";}
			String userDirectoryString = "C:\\git\\image\\"+fname+".png";
			File userDirectory = new File(userDirectoryString);
			
			try {
				BufferedImage bufferedImage = ImageIO.read(userDirectory);
				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				image_why.setImage(image);
				
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
	public void next_himage() {
		int i_num = Integer.parseInt(imageh_num.getText());
		String fname = null;
		i_num++;
		if(i_num<=4) {
			imageh_num.setText(Integer.toString(i_num));
			if(i_num==2) {fname="why2";}
			if(i_num==3) {fname="drink";}
			if(i_num==4) {fname="drink2";}
			String userDirectoryString = "C:\\git\\image\\"+fname+".png";
			File userDirectory = new File(userDirectoryString);
			
			try {
				BufferedImage bufferedImage = ImageIO.read(userDirectory);
				Image image = SwingFXUtils.toFXImage(bufferedImage, null);
				image_why.setImage(image);
				
			}catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
	/*
	public void show_SiO2() {
		E_name.setText("SiO2 (ÀÌ»êÈ­ ±Ô¼Ò)");
		
	}
	public void show_Mo() {
		E_name.setText("Mo (¸ô¸®ºêµ¥³Ñ)");
		
	}
	public void show_V() {
		E_name.setText("V (¹Ù³ªµã)");
		
	}
	public void show_Ge() {
		E_name.setText("Ge (Àú¸¶´½)");
		
	}*/
	
}
