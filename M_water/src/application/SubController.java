package application;

import java.io.IOException;
import java.sql.SQLException;

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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SubController {
	private Stage stage = StageStore.stage;
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();
	public ObservableList<String> nameList = FXCollections.observableArrayList("DMZ ��â��","������â��","����","����","��ټ�","����","����","���̽ý�","���̽ý� 8.0", "�����", "�̷��Ͻ�","õ����","Ǯ���� ����");                                                            
	public ObservableList<String> ingredList = FXCollections.observableArrayList("Mg","Ca","K","Na","SiO2","Mo","V","Ge","OI");                                                            

	@FXML
	private ObservableList<waterV> data;
	@FXML
	private TableView<waterV> waterTable;

	@FXML
	private ComboBox<String> nameBOX;
	@FXML
	private ComboBox<String> ingredBOX;
	@FXML
	private Button btn;
<<<<<<< HEAD
	@FXML
	private Button serchButton;
	@FXML
	private Button sortButtonn;

	@FXML
	private TableColumn<waterV, String> Name;

	// Integer Ÿ���� Number �� �ٲ㼭 ����.
	@FXML
	private TableColumn<waterV, Number> Mg;

	@FXML
	private TableColumn<waterV, Number> Ca;
	
	@FXML
	private TableColumn<waterV, Number> K;
	
	@FXML
	private TableColumn<waterV, Number> Na;

	@FXML
	private TableColumn<waterV, Number> SiO2;
	
	@FXML
	private TableColumn<waterV, Number> Mo;
	
	@FXML
	private TableColumn<waterV, Number> V;
	
	@FXML
	private TableColumn<waterV, Number> Ge;
	
	@FXML
	private TableColumn<waterV, Number> OI;


	@FXML
	public void initialize() throws SQLException, IOException {
		nameBOX.setItems(nameList); 
		nameBOX.getSelectionModel().selectFirst();
		
		ingredBOX.setItems(ingredList); 
		ingredBOX.getSelectionModel().selectFirst();

		waterList.clear();

		waterList = dao.loadProduct("NAME","");

		Name.setCellValueFactory(calldata -> calldata.getValue().nameProperty());
		Mg.setCellValueFactory(calldata -> calldata.getValue().MgProperty());
		Ca.setCellValueFactory(calldata -> calldata.getValue().CaProperty());
		K.setCellValueFactory(calldata -> calldata.getValue().KProperty());
		Na.setCellValueFactory(calldata -> calldata.getValue().NaProperty());
		SiO2.setCellValueFactory(calldata -> calldata.getValue().SiO2Property());
		Mo.setCellValueFactory(calldata -> calldata.getValue().MoProperty());
		V.setCellValueFactory(calldata -> calldata.getValue().VProperty());
		Ge.setCellValueFactory(calldata -> calldata.getValue().GeProperty());
		OI.setCellValueFactory(calldata -> calldata.getValue().OIProperty());
		
		waterTable.setItems(waterList);
		waterTable.getSelectionModel().selectFirst();

	}
	
	public void sort() throws SQLException, IOException {
		waterList.clear();
		
		waterList = dao.loadProduct(ingredBOX.getValue(),"");
		
		waterTable.setItems(waterList);
		
	}
	
	public void serch() throws SQLException, IOException  {
		waterList.clear();
		waterList = dao.loadProduct("NAME",nameBOX.getValue());
		
		waterTable.setItems(waterList);
	}

	public void movePage() throws IOException {
        try {
        	Parent sub = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        	Scene sc = new Scene(sub,799,489);
=======

	@FXML
	private TableColumn<waterV, String> Name;

	// Integer Ÿ���� Number �� �ٲ㼭 ����.
	@FXML
	private TableColumn<waterV, Number> Mg;

	@FXML
	private TableColumn<waterV, Number> Ca;
	
	@FXML
	private TableColumn<waterV, Number> K;
	
	@FXML
	private TableColumn<waterV, Number> Na;

	@FXML
	private TableColumn<waterV, Number> SiO2;
	
	@FXML
	private TableColumn<waterV, Number> Mo;
	
	@FXML
	private TableColumn<waterV, Number> V;
	
	@FXML
	private TableColumn<waterV, Number> Ge;
	
	@FXML
	private TableColumn<waterV, Number> OI;


	@FXML
	public void initialize() throws SQLException, IOException {
		nameBOX.setItems(nameList); 
		nameBOX.getSelectionModel().selectFirst();
		
		ingredBOX.setItems(ingredList); 
		ingredBOX.getSelectionModel().selectFirst();

		waterList.clear();

		waterList = dao.loadProduct("NAME","");

		Name.setCellValueFactory(calldata -> calldata.getValue().nameProperty());
		Mg.setCellValueFactory(calldata -> calldata.getValue().MgProperty());
		Ca.setCellValueFactory(calldata -> calldata.getValue().CaProperty());
		K.setCellValueFactory(calldata -> calldata.getValue().KProperty());
		Na.setCellValueFactory(calldata -> calldata.getValue().NaProperty());
		SiO2.setCellValueFactory(calldata -> calldata.getValue().SiO2Property());
		Mo.setCellValueFactory(calldata -> calldata.getValue().MoProperty());
		V.setCellValueFactory(calldata -> calldata.getValue().VProperty());
		Ge.setCellValueFactory(calldata -> calldata.getValue().GeProperty());
		OI.setCellValueFactory(calldata -> calldata.getValue().OIProperty());
		
		waterTable.setItems(waterList);
		waterTable.getSelectionModel().selectFirst();

	}
	
	public void sort() throws SQLException, IOException {
		waterList.clear();
		
		waterList = dao.loadProduct(ingredBOX.getValue(),"");
		
		waterTable.setItems(waterList);
		
	}
	
	public void serch() throws SQLException, IOException  {
		waterList.clear();
		waterList = dao.loadProduct("NAME",nameBOX.getValue());
		
		waterTable.setItems(waterList);
	}

	public void movePage() throws IOException {
        try {
        	Parent sub = FXMLLoader.load(getClass().getResource("/Main.fxml"));
        	Scene sc = new Scene(sub);
>>>>>>> refs/remotes/origin/master
            stage.setScene(sc);
            stage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }	
	}
}
