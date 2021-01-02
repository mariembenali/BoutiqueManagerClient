package mp2l.rmi.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Utils {
	public static void showMessage(String title, String header, String content) {
		Alert a = new Alert(Alert.AlertType.INFORMATION);
		a.setTitle(title);
		a.setHeaderText(header);
		a.setContentText(content);
		a.showAndWait();
	}

	public static ButtonType showConfirmationMessage(String titre, String message) {
		Alert a = new Alert(Alert.AlertType.CONFIRMATION);
		a.setTitle(titre);
		a.setContentText(message);

		return a.showAndWait().get();
	}
}
