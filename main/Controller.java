package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private int page = 1;
    private String category = "";

    public static List<Image> morzeList = new ArrayList<Image>();
    public static List<Image> goryList = new ArrayList<Image>();
    public static List<Image> stolicaList = new ArrayList<Image>();
    public static List<Image> biwakList = new ArrayList<Image>();
    public static List<Image> namiotyList = new ArrayList<Image>();

    @FXML
    ImageView img;

    @FXML
    Label category_label;

    @FXML
    public void leftClick(ActionEvent event) {
        if(page == 1) page = 6;
        page-=1;
        changePage();
    }


    @FXML
    public void rightClick(ActionEvent event) {
        if(page == 5) page = 0;
        page+=1;
        changePage();
    }

    private void changePage() {
        if(category.equalsIgnoreCase("morze")) {
            img.setImage(morzeList.get(page-1));
        } else if(category.equalsIgnoreCase("gory")) {
            img.setImage(goryList.get(page-1));
        } else if(category.equalsIgnoreCase("stolica")) {
            img.setImage(stolicaList.get(page-1));
        } else if(category.equalsIgnoreCase("biwak")) {
            img.setImage(biwakList.get(page-1));
        } else if(category.equalsIgnoreCase("namioty")) {
            img.setImage(namiotyList.get(page-1));
        }
    }

    @FXML
    public void morzeClick(ActionEvent event) {
        hideLabel();
        img.setImage(morzeList.get(0));
        category = "morze";
        page = 1;
    }

    @FXML
    public void goryClick(ActionEvent event) {
        hideLabel();
        img.setImage(goryList.get(0));
        category = "gory";
        page = 1;
    }

    @FXML
    public void stolicaClick(ActionEvent event) {
        hideLabel();
        img.setImage(stolicaList.get(0));
        category = "stolica";
        page = 1;
    }

    @FXML
    public void biwakClick(ActionEvent event) {
        hideLabel();
        img.setImage(biwakList.get(0));
        category = "biwak";
        page = 1;
    }

    @FXML
    public void namiotyClick(ActionEvent event) {
        hideLabel();
        img.setImage(namiotyList.get(0));
        category = "namioty";
        page = 1;
    }

    private void hideLabel() {
        category_label.setOpacity(0);
    }
}
