package main.resource;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.ListView;

import javafx.scene.control.ProgressBar;

import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

import javafx.scene.control.ChoiceBox;

public class EncryptionController {
	@FXML
	private Button logoutButton;
	@FXML
	private Button decryptButton;
	@FXML
	private TextField outputLabel;
	@FXML
	private ChoiceBox modeChoiceBox;
	@FXML
	private ChoiceBox blockSizeChoiceBox;
	@FXML
	private ListView usersList;
	@FXML
	private Button encryptButton;
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label progressLabel;
	@FXML
	private ListView receiversList;
	@FXML
	private Label add;
	@FXML
	private Label remove;

	// Event Listener on Button[#logoutButton].onAction
	@FXML
	public void logout(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#decryptButton].onAction
	@FXML
	public void decrypt(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#encryptButton].onAction
	@FXML
	public void encrypt(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Label[#add].onMouseClicked
	@FXML
	public void addReceiver(MouseEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Label[#remove].onMouseClicked
	@FXML
	public void removeReceiver(MouseEvent event) {
		// TODO Autogenerated
	}
}