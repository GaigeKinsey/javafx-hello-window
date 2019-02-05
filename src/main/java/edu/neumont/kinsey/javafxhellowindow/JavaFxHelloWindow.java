package edu.neumont.kinsey.javafxhellowindow;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxHelloWindow extends Application {
	TextField textField = new TextField();

	public static void main(String[] args) {
		Application.launch(JavaFxHelloWindow.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Label label = new Label("name");
		Button button = new Button("Enter");
		HBox hbox = new HBox();
		hbox.getChildren().add(label);
		hbox.getChildren().add(textField);
		hbox.getChildren().add(button);
		stage.setTitle("Gaige Kinsey");
		Scene scene = new Scene(hbox, 800, 600);
		stage.setScene(scene);
		EventHandler<MouseEvent> clickHandler = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				Alert alert = new Alert(AlertType.INFORMATION, "Hello " + textField.getText());
				alert.show();
			}
		};
		button.setOnMouseClicked(clickHandler);
		stage.show();
	}
}
