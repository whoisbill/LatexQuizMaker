package app;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class SciolyController {

    @FXML
    private Button button;

    @FXML
    private TextArea latexText;

    @FXML
    private TextArea rawText;

    @FXML
    void buttonPressed(MouseEvent event) {
        String text = rawText.getText();
        String ret = "";
        ArrayList<String> check = new ArrayList<>(Arrays.asList(text.split("\n")));
        while(check.isEmpty() == false){
            ArrayList<String> temp = new ArrayList<>();
            String tempStr = null;
            do{
                if(check.size() == 0){
                    break;
                }
                tempStr = check.remove(0);
                if(tempStr == null){
                    break;
                }
                if(tempStr.equals("")){
                    break;
                }
                temp.add(tempStr);
            } while(tempStr.equals("") == false);
            ret = ret + "\\question[1] " + temp.remove(0) + "\n\\begin{choices}\n";
            for(String i : temp){
                ret = ret + "\\choice " + i + "\n";
            }
            ret = ret + "\\end{choices}\n\n";
        }
        latexText.setText(ret);
    }

}
