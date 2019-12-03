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
import javafx.stage.Stage;

public class MainController {
	private waterV water = new waterV();
	private waterDAO dao = new waterDAO();
	private ObservableList<waterV> waterList = FXCollections.observableArrayList();

	@FXML
	private ObservableList<waterV> data;
	@FXML
	private TableView<waterV> waterTable;

	@FXML
	private TableColumn<waterV, String> Name;

	// Integer 타입은 Number 로 바꿔서 쓸것.
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
	public void initialize() throws SQLException, IOException {

		waterList.clear();

		waterList = dao.loadProduct();

		Name.setCellValueFactory(calldata -> calldata.getValue().nameProperty());
		Mg.setCellValueFactory(calldata -> calldata.getValue().MgProperty());
		Ca.setCellValueFactory(calldata -> calldata.getValue().CaProperty());
		K.setCellValueFactory(calldata -> calldata.getValue().KProperty());
		Na.setCellValueFactory(calldata -> calldata.getValue().NaProperty());
		SiO2.setCellValueFactory(calldata -> calldata.getValue().SiO2Property());
		Mo.setCellValueFactory(calldata -> calldata.getValue().MoProperty());
		V.setCellValueFactory(calldata -> calldata.getValue().VProperty());
		
		waterList.sorted();
		waterTable.setItems(waterList);
		waterTable.getSelectionModel().selectFirst();

	}
	
	


}


