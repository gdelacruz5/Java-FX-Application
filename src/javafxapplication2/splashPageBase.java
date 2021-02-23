package javafxapplication2;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public abstract class splashPageBase extends AnchorPane {

	protected final Button logInBtn;
	protected final Button signUpBtn;
	protected final Label label;
	protected final TextField searchField;
	protected final Button searchBtn;

	public splashPageBase() {

		logInBtn = new Button();
		signUpBtn = new Button();
		label = new Label();
		searchField = new TextField();
		searchBtn = new Button();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(400.0);
		setPrefWidth(600.0);

		AnchorPane.setRightAnchor(logInBtn, 16.0);
		AnchorPane.setTopAnchor(logInBtn, 14.0);
		logInBtn.setLayoutX(534.0);
		logInBtn.setLayoutY(14.0);
		logInBtn.setMnemonicParsing(false);
		logInBtn.setOnAction(this::splashPageBtns);
		logInBtn.setText("Log In");

		AnchorPane.setRightAnchor(signUpBtn, 16.0);
		AnchorPane.setTopAnchor(signUpBtn, 45.0);
		signUpBtn.setLayoutX(534.0);
		signUpBtn.setLayoutY(39.0);
		signUpBtn.setMnemonicParsing(false);
		signUpBtn.setOnAction(this::splashPageBtns);
		signUpBtn.setText("Sign Up");

		AnchorPane.setLeftAnchor(label, 203.0);
		AnchorPane.setRightAnchor(label, 202.0);
		AnchorPane.setTopAnchor(label, 142.0);
		label.setLayoutX(203.0);
		label.setLayoutY(142.0);
		label.setText("Inspired");
		label.setTextFill(javafx.scene.paint.Color.valueOf("#f53131"));
		label.setFont(new Font("Arial Bold", 50.0));

		AnchorPane.setBottomAnchor(searchField, 175.0);
		AnchorPane.setLeftAnchor(searchField, 203.0);
		AnchorPane.setRightAnchor(searchField, 248.0);
		AnchorPane.setTopAnchor(searchField, 200.0);
		searchField.setLayoutX(203.0);
		searchField.setLayoutY(200.0);

		searchBtn.setLayoutX(352.0);
		searchBtn.setLayoutY(200.0);
		searchBtn.setMnemonicParsing(false);
		searchBtn.setText("Search");

		getChildren().add(logInBtn);
		getChildren().add(signUpBtn);
		getChildren().add(label);
		getChildren().add(searchField);
		getChildren().add(searchBtn);

	}

	protected abstract void splashPageBtns(javafx.event.ActionEvent actionEvent);

}
