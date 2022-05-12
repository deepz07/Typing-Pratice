package application;

import java.io.IOException;
import java.io.FileWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PopupController {
	@FXML
	private TextField username;
	public void submit(ActionEvent ae)throws IOException {
		String name=username.getText();
		FileWriter myobj=new FileWriter("username.txt");
		myobj.write(name);
		myobj.close();
		
		Main n= new Main();
		n.changeScene("d.fxml");
		
	}

}
