package mp2l.rmi.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import commande.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import mp2l.rmi.utils.Fabrique;
import mp2l.rmi.utils.LoadView;
import mp2l.rmi.utils.Utils;

public class LoginViewController {

	@FXML
	private JFXTextField txtEmail;

	@FXML
	private JFXPasswordField txtPassword;

	@FXML
	private JFXButton btnLog;

	@FXML
	void login_user(ActionEvent event) throws Exception {
		User user = Fabrique.getiUser().findByLogin(txtEmail.getText());
		if (user != null) {
			if (user.getPassword().equals(hash(txtPassword.getText()))) {
				MainViewController controller = new MainViewController();
				controller.getUser(user);
				LoadView.showView("", "mainView.fxml", 1);
			} else
				Utils.showMessage("", "", "Email ou mot de passe incorrect");
		} else {
			Utils.showMessage("", "", "Email ou mot de passe incorrect");
		}
	}

	public static String hash(String pwd) {
		return pwd;
	}

	public void logout(User u) {
		u = null;
		LoadView.showView("", "loginView.fxml", 1);
	}
}
