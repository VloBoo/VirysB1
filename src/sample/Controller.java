package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;

public class Controller {
    // public Label Belarus;
    @FXML
    public Label TabelVitebsk;
    @FXML
    public Label TabelMinsk;
    @FXML
    public Label TabelBrest;
    @FXML
    public Label TabelMogilev;
    @FXML
    public Label TabelGomel;
    @FXML
    public Label TabelGrodno;
    HashMap<String, cRegions> region_RB = new HashMap<>();

    //public void initialize() {
    //    CreatObl("Vitebsk", 1000000);
    //    CreatObl("Minsk", 4000000);
    //    CreatObl("Grodno", 2000000);
    //    CreatObl("Mogilev", 1000000);
     //   CreatObl("Gomel", 1000000);
    //    CreatObl("Brest", 1000000);
    //    renameR();
 //   }

    void CreatObl(String name, int people) {
        region_RB.put("key_" + name, new cRegions(name, people));
    }

    public void renameR() {
        TabelBrest.setText("H:" + region_RB.get("key_Brest").peshH.toString() + " I:" + region_RB.get("key_Brest").peshI.toString() + " D:" + region_RB.get("key_Brest").peshD.toString());
        TabelMinsk.setText("H:" + region_RB.get("key_Minsk").peshH.toString() + " I:" + region_RB.get("key_Minsk").peshI.toString() + " D:" + region_RB.get("key_Minsk").peshD.toString());
        TabelGrodno.setText("H:" + region_RB.get("key_Grodno").peshH.toString() + " I:" + region_RB.get("key_Grodno").peshI.toString() + " D:" + region_RB.get("key_Grodno").peshD.toString());
        TabelMogilev.setText("H:" + region_RB.get("key_Mogilev").peshH.toString() + " I:" + region_RB.get("key_Mogilev").peshI.toString() + " D:" + region_RB.get("key_Mogilev").peshD.toString());
        TabelGomel.setText("H:" + region_RB.get("key_Gomel").peshH.toString() + " I:" + region_RB.get("key_Gomel").peshI.toString() + " D:" + region_RB.get("key_Gomel").peshD.toString());
        TabelVitebsk.setText("H:" + region_RB.get("key_Vitebsk").peshH.toString() + " I:" + region_RB.get("key_Vitebsk").peshI.toString() + " D:" + region_RB.get("key_Vitebsk").peshD.toString());


    }

}
