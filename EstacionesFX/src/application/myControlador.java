package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class myControlador {

	@FXML
	private Button myButton;

	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	public void mostarEstacion(ActionEvent event) {
		Date now = new Date();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
		try {
			Date date1 = df.parse("20-05-2019 11:02:00.000");
			if (now.before(date1)) {
				String x = "Es primavera";
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information Dialog");
				alert.setHeaderText("Look, an Information Dialog");
				alert.setContentText(x);

				alert.showAndWait();

			}else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information Dialog");
				alert.setHeaderText("Look, an Information Dialog");
				alert.setContentText("Es verano");

				alert.showAndWait();
				
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

