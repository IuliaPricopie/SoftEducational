package ro.itschool.buttons;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class Buttons {

    public static javafx.scene.control.Button createNextButton(){
        FontAwesomeIconView nextIcon =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon.setGlyphSize(30);
        javafx.scene.control.Button nextButton =new javafx.scene.control.Button();
        nextButton.setGraphic(nextIcon);
        nextButton.setPrefSize(80,50);
        VBox.setMargin(nextButton,new Insets(-250,0,0,85));
        return nextButton;
    }

    public static javafx.scene.control.Button createBackButton(){
        FontAwesomeIconView backIcon =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_LEFT);
        backIcon.setGlyphSize(30);
        javafx.scene.control.Button backButton =new javafx.scene.control.Button();
        backButton.setGraphic(backIcon);
        backButton.setPrefSize(80,50);
        VBox.setMargin(backButton,new Insets(-50,0,0,0));
        return backButton;
    }

    public static javafx.scene.control.Button createHomeButton(){
        FontAwesomeIconView homeIcon =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon.setGlyphSize(30);
        javafx.scene.control.Button homeButton = new javafx.scene.control.Button("");
        homeButton.setGraphic(homeIcon);
        homeButton.setPrefSize(80,40);
        VBox.setMargin(homeButton,new Insets(-660,0,0,0));
        return homeButton;
    }

}
