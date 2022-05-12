 package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class SampleController implements Initializable {
	@FXML
	private Label timeLabel;
	@FXML
	private Label displayUsername;
	
	@FXML
	private Text total;
	@FXML
	private Text wpm;
	@FXML
	private Text invalid;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		File newFile = new File("username.txt");
        if (newFile.length() != 0) {
            Scanner reader = null;
            try {
                reader = new Scanner(newFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String data = reader.nextLine();
            displayUsername.setText("Welcome, "+data);

        }
        Date date = new Date();
        Locale locale = new Locale("en");
        DateFormat formatter = new SimpleDateFormat("EEEE", locale);
        String strDay = formatter.format(date);

        timeLabel.setText("Today is " + strDay);
		
	}
	
	
	public void playGame(ActionEvent ddd) throws IOException{
		Main m= new Main();
		File newFile=new File("username.txt");
		if (newFile.length()==0) {
			try {
				m.changeScene("popup.fxml");
			}
			catch(IOException e) {
			e.printStackTrace();
			   }
			
			}
		else {
			m.changeScene("game.fxml");
		}
		}
	}
	


