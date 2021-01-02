package mp2l;

import javafx.application.Application;
import javafx.stage.Stage;
import mp2l.rmi.utils.LoadView;

public class Main extends Application {

	@Override
	public void start(Stage ecran) throws Exception {
		LoadView.showView("Projet MP2L : Gestion d'une boutique cosmétique", "loginView.fxml", 1);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
