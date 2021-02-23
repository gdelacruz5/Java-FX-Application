package javafxapplication2;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.text.*;

public class SplashPageController implements Initializable {

	/* splash page controls */
	@FXML
	private Button logInBtn;
	@FXML
	private Button signUpBtn;
	@FXML
	private TextField searchField;
	@FXML
	private Button searchBtn;

	@FXML
	private void splashPageBtns(ActionEvent event) throws IOException {
		Stage stage;
		Parent root;
		if (event.getSource() == logInBtn) {
			// get reference to the button's stage
			stage = (Stage) logInBtn.getScene().getWindow();
			// load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("logInPage.fxml"));
		} else // if (event.getSource()==signUpBtn)
		{
			stage = (Stage) signUpBtn.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("signUpPage.fxml"));
		}
		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void searchBtnClick(ActionEvent event) throws IOException {
		Stage stage;
		Parent root;

		stage = (Stage) searchBtn.getScene().getWindow();
		root = FXMLLoader.load(getClass().getResource("searchPage.fxml"));

		Scene scene = new Scene(root);
		stage.setScene(scene);

		// searchTerm.setText("testing");
		stage.show();

		searchTerm.setText("testing");

		System.out.println(searchField.getText());
	}

	/* log in page controls */
	@FXML
	private Button getLogIn;

	@FXML
	private void logInPageBtns(ActionEvent event) throws IOException {
		Stage stage;
		Parent root;
		// if(event.getSource()==logInBtn)
		// {
		// get reference to the button's stage
		stage = (Stage) getLogIn.getScene().getWindow();
		// load up OTHER FXML document
		root = FXMLLoader.load(getClass().getResource("splashPageLoggedIn.fxml"));
		// }
		// else //if (event.getSource()==signUpBtn)
		// {
		// stage=(Stage) signUpBtn.getScene().getWindow();
		// root = FXMLLoader.load(getClass().getResource("signUpPage.fxml"));
		// }
		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/* sign up controls */
	@FXML
	private Button getSignUp;

	@FXML
	private void signUpPageBtns(ActionEvent event) throws IOException {
		Stage stage;
		Parent root;
		// if(event.getSource()==logInBtn)
		// {
		// get reference to the button's stage
		stage = (Stage) getSignUp.getScene().getWindow();
		// load up OTHER FXML document
		root = FXMLLoader.load(getClass().getResource("splashPageLoggedIn.fxml"));
		// }
		// else //if (event.getSource()==signUpBtn)
		// {
		// stage=(Stage) signUpBtn.getScene().getWindow();
		// root = FXMLLoader.load(getClass().getResource("signUpPage.fxml"));
		// }
		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/* splash page logged in controls */
	@FXML
	private Button sPLISearch;

	@FXML
	private void sPLIBtns(ActionEvent event) throws IOException {
		Stage stage;
		Parent root;
		// if(event.getSource()==logInBtn)
		// {
		// get reference to the button's stage
		stage = (Stage) sPLISearch.getScene().getWindow();
		// load up OTHER FXML document
		root = FXMLLoader.load(getClass().getResource("searchPage.fxml"));
		// }
		// else //if (event.getSource()==signUpBtn)
		// {
		// stage=(Stage) signUpBtn.getScene().getWindow();
		// root = FXMLLoader.load(getClass().getResource("signUpPage.fxml"));
		// }
		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	/* search page logged in controls */
	@FXML
	private Text searchTerm;

	/*
	 * @FXML private void sPLIBtns(ActionEvent event) throws IOException { Stage
	 * stage; Parent root; //if(event.getSource()==logInBtn) //{ //get reference
	 * to the button's stage stage=(Stage) sPLISearch.getScene().getWindow();
	 * //load up OTHER FXML document root =
	 * FXMLLoader.load(getClass().getResource("searchPage.fxml")); //} //else
	 * //if (event.getSource()==signUpBtn) //{ // stage=(Stage)
	 * signUpBtn.getScene().getWindow(); // root =
	 * FXMLLoader.load(getClass().getResource("signUpPage.fxml")); //} //create
	 * a new scene with root and set the stage Scene scene = new Scene(root);
	 * stage.setScene(scene); stage.show(); }
	 */

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
		searchTerm = new Text();
	}

}
