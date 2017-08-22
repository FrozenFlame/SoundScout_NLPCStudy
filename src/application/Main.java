package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application
{
	//just added to github!
	// Added this comment again!
	//Adding a even newer comment! Hopefully GitHub Desktop Beta would work omg
	//this is a comment from the laptop
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
