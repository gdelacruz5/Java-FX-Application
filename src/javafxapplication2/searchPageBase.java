package javafxapplication2;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class searchPageBase extends BorderPane {

	protected final VBox vBox;
	protected final Button button;
	protected final Button button0;
	protected final Button button1;
	protected final Button button2;
	protected final Button button3;
	protected final VBox vBox0;
	protected final AnchorPane anchorPane;
	protected final TextField textField;
	protected final Button button4;
	protected final Text searchTerm;
	protected final AnchorPane anchorPane0;
	protected final AnchorPane anchorPane1;
	protected final Button button5;
	protected final AnchorPane anchorPane2;
	protected final MenuButton menuButton;
	protected final MenuItem menuItem;
	protected final MenuItem menuItem0;
	protected final Label label;

	public searchPageBase() {

		vBox = new VBox();
		button = new Button();
		button0 = new Button();
		button1 = new Button();
		button2 = new Button();
		button3 = new Button();
		vBox0 = new VBox();
		anchorPane = new AnchorPane();
		textField = new TextField();
		button4 = new Button();
		searchTerm = new Text();
		anchorPane0 = new AnchorPane();
		anchorPane1 = new AnchorPane();
		button5 = new Button();
		anchorPane2 = new AnchorPane();
		menuButton = new MenuButton();
		menuItem = new MenuItem();
		menuItem0 = new MenuItem();
		label = new Label();

		setMaxHeight(USE_PREF_SIZE);
		setMaxWidth(USE_PREF_SIZE);
		setMinHeight(USE_PREF_SIZE);
		setMinWidth(USE_PREF_SIZE);
		setPrefHeight(400.0);
		setPrefWidth(600.0);

		BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
		vBox.setPrefHeight(200.0);
		vBox.setPrefWidth(100.0);

		button.setMnemonicParsing(false);
		button.setText("Home");

		button0.setMnemonicParsing(false);
		button0.setText("Favorites");

		button1.setMnemonicParsing(false);
		button1.setText("Friends");

		button2.setMnemonicParsing(false);
		button2.setText("Group");

		button3.setMnemonicParsing(false);
		button3.setText("Add Content");
		setLeft(vBox);

		BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
		vBox0.setPrefHeight(200.0);
		vBox0.setPrefWidth(100.0);

		anchorPane.setPrefWidth(200.0);

		AnchorPane.setRightAnchor(textField, 66.0);
		textField.setLayoutX(285.0);
		textField.setLayoutY(2.0);

		AnchorPane.setRightAnchor(button4, 14.0);
		button4.setLayoutX(149.0);
		button4.setLayoutY(2.0);
		button4.setMnemonicParsing(false);
		button4.setText("Search");

		AnchorPane.setLeftAnchor(searchTerm, 0.0);
		AnchorPane.setTopAnchor(searchTerm, 0.0);
		searchTerm.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
		searchTerm.setStrokeWidth(0.0);
		searchTerm.setText("Search Term");
		searchTerm.setFont(new Font(20.0));

		anchorPane0.setPrefHeight(323.0);
		anchorPane0.setPrefWidth(500.0);
		setCenter(vBox0);

		BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
		anchorPane1.setPrefWidth(200.0);

		AnchorPane.setBottomAnchor(button5, 0.0);
		AnchorPane.setLeftAnchor(button5, 0.0);
		button5.setMnemonicParsing(false);
		button5.setText("Back");
		setBottom(anchorPane1);

		BorderPane.setAlignment(anchorPane2, javafx.geometry.Pos.CENTER);
		anchorPane2.setPrefWidth(200.0);

		AnchorPane.setRightAnchor(menuButton, 14.0);
		AnchorPane.setTopAnchor(menuButton, 14.0);
		menuButton.setMnemonicParsing(false);
		menuButton.setText("userName@gmail.com");

		menuItem.setMnemonicParsing(false);
		menuItem.setText("Action 1");

		menuItem0.setMnemonicParsing(false);
		menuItem0.setText("Action 2");

		label.setText("Inspired");
		label.setTextFill(javafx.scene.paint.Color.valueOf("#f53131"));
		label.setFont(new Font("Arial Bold", 50.0));
		setTop(anchorPane2);

		vBox.getChildren().add(button);
		vBox.getChildren().add(button0);
		vBox.getChildren().add(button1);
		vBox.getChildren().add(button2);
		vBox.getChildren().add(button3);
		anchorPane.getChildren().add(textField);
		anchorPane.getChildren().add(button4);
		anchorPane.getChildren().add(searchTerm);
		vBox0.getChildren().add(anchorPane);
		vBox0.getChildren().add(anchorPane0);
		anchorPane1.getChildren().add(button5);
		menuButton.getItems().add(menuItem);
		menuButton.getItems().add(menuItem0);
		anchorPane2.getChildren().add(menuButton);
		anchorPane2.getChildren().add(label);

	}
}
