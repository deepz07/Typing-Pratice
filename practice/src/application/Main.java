package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	private static Stage stg;
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
			primaryStage.setResizable(false);
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("d.fxml"));
			Scene scene = new Scene(root,600,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Typing Practice");
			primaryStage.getIcons().add(new Image("file:///C:/Users/intel/eclipse-workspace/practice/src/myimages/icon.png"));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene(String fxml) throws IOException{
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}