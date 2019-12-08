package application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WaterController extends Thread {
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao2 = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	public ObservableList<String> nameList = FXCollections.observableArrayList("DMZ 평창수","강원평창수","백산수","볼빅","삼다수","석수","스파","아이시스","아이시스 8.0", "에비앙", "이로하스","천연수","풀무원 샘물");                                                            
	private float max_ingred[]= new float[8];
	private float sum_ingred[]= new float[8];
	
	@FXML
	private AnchorPane Lank_pane;
	@FXML
	private Button btn_OIinformation;
	private boolean visible_OI = false;
	
	@FXML
	private ComboBox<String> nameBOX;
	
	@FXML
	private Text Mg;
	@FXML
	private Text Ca;
	@FXML
	private Text K;
	@FXML
	private Text Na;
	@FXML
	private Text SiO2;
	@FXML
	private Text Mo;
	@FXML
	private Text V;
	@FXML
	private Text Ge;
	@FXML
	private Text OI;
	
	@FXML
	private Slider slider_Mg;
	@FXML
	private Slider slider_Ca;
	@FXML
	private Slider slider_K;
	@FXML
	private Slider slider_Na;
	@FXML
	private Slider slider_SiO2;
	@FXML
	private Slider slider_Mo;
	@FXML
	private Slider slider_V;
	@FXML
	private Slider slider_Ge;
	
	@FXML
	public void initialize() throws SQLException, IOException {
		
		nameBOX.setItems(nameList); 
		
		waterList.clear();
		waterList = dao2.loadProduct("NAME","");
		
		for(int i=0; i<13; i++) {
			sum_ingred[0]+=waterList.get(i).getMg();
			sum_ingred[1]+=waterList.get(i).getCa();
			sum_ingred[2]+=waterList.get(i).getK();
			sum_ingred[3]+=waterList.get(i).getNa();
			sum_ingred[4]+=waterList.get(i).getSiO2();
			sum_ingred[5]+=waterList.get(i).getMo();
			sum_ingred[6]+=waterList.get(i).getV();
			sum_ingred[7]+=waterList.get(i).getGe();
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
		}
		slider_Mg.setMin(0);
		slider_Mg.setMax(max_ingred[0]);
		
		slider_Ca.setMin(0);
		slider_Ca.setMax(max_ingred[1]);
		
		slider_K.setMin(0);
		slider_K.setMax(5.9);//?????
		
		slider_Na.setMin(0);
		slider_Na.setMax(max_ingred[3]);
		
		slider_SiO2.setMin(0);
		slider_SiO2.setMax(max_ingred[4]);
		
		slider_Mo.setMin(0);
		slider_Mo.setMax(max_ingred[5]);
		
		slider_V.setMin(0);
		slider_V.setMax(max_ingred[6]);
		
		slider_Ge.setMin(0);
		slider_Ge.setMax(max_ingred[7]);
		
	}
	
	public void b_search() throws SQLException, IOException {
		waterList.clear();
		waterList = dao2.loadProduct("NAME",nameBOX.getValue());			
		try {
			Thread.sleep(100);
		}catch (Exception e) {
		}
	  
		slider_Mg.setValue(waterList.get(0).getMg());
		Mg.setText(""+(waterList.get(0).getMg()));
		
		slider_Ca.setValue(waterList.get(0).getCa());
		Ca.setText(""+(waterList.get(0).getCa()));
		
		slider_K.setValue(waterList.get(0).getK());
		K.setText(""+(waterList.get(0).getK()));
		
		slider_Na.setValue(waterList.get(0).getNa());
		Na.setText(""+(waterList.get(0).getNa()));
		
		slider_SiO2.setValue(waterList.get(0).getSiO2());
		SiO2.setText(""+(waterList.get(0).getSiO2()));
		
		slider_Mo.setValue(waterList.get(0).getMo());
		Mo.setText(""+(waterList.get(0).getMo()));
		
		slider_V.setValue(waterList.get(0).getV());
		V.setText(""+(waterList.get(0).getV()));
		
		slider_Ge.setValue(waterList.get(0).getGe());
		Ge.setText(""+(waterList.get(0).getGe()));
		
		OI.setText(""+(waterList.get(0).getOI()));
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
	public void show_OI(){
		visible_OI=true;
		btn_OIinformation.setVisible(visible_OI);
	}
	public void close_OI() {
		visible_OI=false;
		btn_OIinformation.setVisible(visible_OI);
	}
}
