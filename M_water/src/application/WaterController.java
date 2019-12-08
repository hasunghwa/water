package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WaterController implements Initializable{
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	public ObservableList<String> ingredList = FXCollections.observableArrayList("Mg","Ca","K","Na","SiO2","Mo","V","Ge","OI");                                                            
	private float max_ingred[]= new float[9];
	private float sum_ingred[]= new float[9];
	
	@FXML
	private ComboBox<String> ingredBOX;
	
	@FXML
	private Text rank1_name;
	@FXML
	private Text rank2_name;
	@FXML
	private Text rank3_name;
	
	@FXML
	private Text rank1;
	@FXML
	private Text rank2;
	@FXML
	private Text rank3;
	
	@FXML
	private Slider slider_rank1;
	@FXML
	private Slider slider_rank2;
	@FXML
	private Slider slider_rank3;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ingredBOX.setItems(ingredList); 
		
		waterList.clear();

		try {
			waterList = dao.loadProduct("NAME","");
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<13; i++) { //ÃÖ´ñ°ª, ÇÕ
			sum_ingred[0]+=waterList.get(i).getMg();
			sum_ingred[1]+=waterList.get(i).getCa();
			sum_ingred[2]+=waterList.get(i).getK();
			sum_ingred[3]+=waterList.get(i).getNa();
			sum_ingred[4]+=waterList.get(i).getSiO2();
			sum_ingred[5]+=waterList.get(i).getMo();
			sum_ingred[6]+=waterList.get(i).getV();
			sum_ingred[7]+=waterList.get(i).getGe();
			sum_ingred[8]+=waterList.get(i).getOI();
			if(waterList.get(i).getMg()>max_ingred[0]) {
				max_ingred[0]=waterList.get(i).getMg();
			}
			if(waterList.get(i).getCa()>max_ingred[1]) {
				max_ingred[1]=waterList.get(i).getCa();
			}
			if(waterList.get(i).getK()>max_ingred[2]) {
				max_ingred[2]=waterList.get(i).getK();
			}
			if(waterList.get(i).getNa()>max_ingred[3]) {
				max_ingred[3]=waterList.get(i).getNa();
			}
			if(waterList.get(i).getSiO2()>max_ingred[4]) {
				max_ingred[4]=waterList.get(i).getSiO2();
			}
			if(waterList.get(i).getMo()>max_ingred[5]) {
				max_ingred[5]=waterList.get(i).getMo();
			}
			if(waterList.get(i).getV()>max_ingred[6]) {
				max_ingred[6]=waterList.get(i).getV();
			}
			if(waterList.get(i).getGe()>max_ingred[7]) {
				max_ingred[7]=waterList.get(i).getGe();
			}
			if(waterList.get(i).getOI()>max_ingred[8]) {
				max_ingred[8]=waterList.get(i).getOI();
			}
		}
		
		slider_rank1.setMin(0);
		slider_rank2.setMin(0);
		slider_rank3.setMin(0);
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
	
	public void sort() throws SQLException, IOException {
		waterList.clear();
		
		waterList = dao.loadProduct(ingredBOX.getValue()+" DESC","");
		
		rank1_name.setText(waterList.get(0).getName());
		rank2_name.setText(waterList.get(1).getName());
		rank3_name.setText(waterList.get(2).getName());
		
		if(ingredBOX.getValue().equals("Mg")) {
			slider_rank1.setMax(max_ingred[0]);
			slider_rank2.setMax(max_ingred[0]);
			slider_rank3.setMax(max_ingred[0]);
			slider_rank1.setValue(waterList.get(0).getMg());
			slider_rank2.setValue(waterList.get(1).getMg());
			slider_rank3.setValue(waterList.get(2).getMg());
			
			rank1.setText(""+waterList.get(0).getMg());
			rank2.setText(""+waterList.get(1).getMg());
			rank3.setText(""+waterList.get(2).getMg());
		}
		if(ingredBOX.getValue().equals("Ca")) {
			slider_rank1.setMax(max_ingred[1]);
			slider_rank2.setMax(max_ingred[1]);
			slider_rank3.setMax(max_ingred[1]);
			slider_rank1.setValue(waterList.get(0).getCa());
			slider_rank2.setValue(waterList.get(1).getCa());
			slider_rank3.setValue(waterList.get(2).getCa());
			
			rank1.setText(""+waterList.get(0).getCa());
			rank2.setText(""+waterList.get(1).getCa());
			rank3.setText(""+waterList.get(2).getCa());
		}
		if(ingredBOX.getValue().equals("K")) {
			slider_rank1.setMax(max_ingred[2]);
			slider_rank2.setMax(max_ingred[2]);
			slider_rank3.setMax(max_ingred[2]);
			slider_rank1.setValue(waterList.get(0).getK());
			slider_rank2.setValue(waterList.get(1).getK());
			slider_rank3.setValue(waterList.get(2).getK());
			
			rank1.setText(""+waterList.get(0).getK());
			rank2.setText(""+waterList.get(1).getK());
			rank3.setText(""+waterList.get(2).getK());
		}
		if(ingredBOX.getValue().equals("Na")) {
			slider_rank1.setMax(max_ingred[3]);
			slider_rank2.setMax(max_ingred[3]);
			slider_rank3.setMax(max_ingred[3]);
			slider_rank1.setValue(waterList.get(0).getNa());
			slider_rank2.setValue(waterList.get(1).getNa());
			slider_rank3.setValue(waterList.get(2).getNa());
			
			rank1.setText(""+waterList.get(0).getNa());
			rank2.setText(""+waterList.get(1).getNa());
			rank3.setText(""+waterList.get(2).getNa());
		}
		if(ingredBOX.getValue().equals("SiO2")) {
			slider_rank1.setMax(max_ingred[4]);
			slider_rank2.setMax(max_ingred[4]);
			slider_rank3.setMax(max_ingred[4]);
			slider_rank1.setValue(waterList.get(0).getSiO2());
			slider_rank2.setValue(waterList.get(1).getSiO2());
			slider_rank3.setValue(waterList.get(2).getSiO2());
			
			rank1.setText(""+waterList.get(0).getSiO2());
			rank2.setText(""+waterList.get(1).getSiO2());
			rank3.setText(""+waterList.get(2).getSiO2());
		}
		if(ingredBOX.getValue().equals("Mo")) {
			slider_rank1.setMax(max_ingred[5]);
			slider_rank2.setMax(max_ingred[5]);
			slider_rank3.setMax(max_ingred[5]);
			slider_rank1.setValue(waterList.get(0).getMo());
			slider_rank2.setValue(waterList.get(1).getMo());
			slider_rank3.setValue(waterList.get(2).getMo());
			
			rank1.setText(""+waterList.get(0).getMo());
			rank2.setText(""+waterList.get(1).getMo());
			rank3.setText(""+waterList.get(2).getMo());
		}
		if(ingredBOX.getValue().equals("V")) {
			slider_rank1.setMax(max_ingred[6]);
			slider_rank2.setMax(max_ingred[6]);
			slider_rank3.setMax(max_ingred[6]);
			slider_rank1.setValue(waterList.get(0).getV());
			slider_rank2.setValue(waterList.get(1).getV());
			slider_rank3.setValue(waterList.get(2).getV());
			
			rank1.setText(""+waterList.get(0).getV());
			rank2.setText(""+waterList.get(1).getV());
			rank3.setText(""+waterList.get(2).getV());
		}
		if(ingredBOX.getValue().equals("Ge")) {
			slider_rank1.setMax(max_ingred[7]);
			slider_rank2.setMax(max_ingred[7]);
			slider_rank3.setMax(max_ingred[7]);
			slider_rank1.setValue(waterList.get(0).getGe());
			slider_rank2.setValue(waterList.get(1).getGe());
			slider_rank3.setValue(waterList.get(2).getGe());
			
			rank1.setText(""+waterList.get(0).getGe());
			rank2.setText(""+waterList.get(1).getGe());
			rank3.setText(""+waterList.get(2).getGe());
		}
		if(ingredBOX.getValue().equals("OI")) {
			slider_rank1.setMax(max_ingred[8]);
			slider_rank2.setMax(max_ingred[8]);
			slider_rank3.setMax(max_ingred[8]);
			slider_rank1.setValue(waterList.get(0).getOI());
			slider_rank2.setValue(waterList.get(1).getOI());
			slider_rank3.setValue(waterList.get(2).getOI());
			
			rank1.setText(""+waterList.get(0).getOI());
			rank2.setText(""+waterList.get(1).getOI());
			rank3.setText(""+waterList.get(2).getOI());
		}
	}

	

}
	
