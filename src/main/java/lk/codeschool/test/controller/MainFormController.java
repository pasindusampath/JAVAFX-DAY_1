package lk.codeschool.test.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainFormController {

    public TextField txtName;
    public TextField txtAge;
    public Label lblName;
    public Label lblAge;
    public Label lblAgeAfter5Years;

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        //Collect Data From Ui Components
        String name = txtName.getText();
        String age = txtAge.getText();

        //Process(Convert String Value Of Age to Int Value)
        int ageValue = Integer.parseInt(age);
        int ageAfter5Years = ageValue + 5;

        //Convert Int Value To String
        String ageAfter5 = String.valueOf(ageAfter5Years);

        //Update Ui Components
        lblName.setText(name);
        lblAge.setText(age);
        lblAgeAfter5Years.setText(ageAfter5);

    }
}
