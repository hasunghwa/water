package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
//import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Font.loadFont(getClass().getResourceAsStream("Helvetica.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("NotoSans-CondensedBold.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("NotoSans-CondensedMedium.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("NotoSans-Light.ttf"),20);
			Font.loadFont(getClass().getResourceAsStream("BMHANNA.ttf"),20);
			
			StageStore.stage = primaryStage;
			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			Scene scene = new Scene(root,360,640);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
