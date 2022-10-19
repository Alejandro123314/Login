package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private LoginController controller;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new LoginController(primaryStage);
		
		Scene escena = new Scene(controller.getView().getRoot(),320, 200);
		
		primaryStage.setTitle("Login.fxml");
		primaryStage.setScene(escena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
