package ro.itschool;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import ro.itschool.buttons.Buttons;
import ro.itschool.fifth.AplicatiiGeo;
import ro.itschool.first.*;
import ro.itschool.second.ProbRez;
import ro.itschool.sixth.Exam;
import ro.itschool.sixth.Recap;
import ro.itschool.third.ExProb;


public class Main extends Application {
    private double latime;
    private double inaltime;

    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Bun venit în lumea matematicii!");
        label1.setFont(Font.font("Arial Black",35));
        label1.setWrapText(true);
        label1.setMaxWidth(640);

        VBox root = new VBox();
        VBox.setMargin(label1,new Insets(0,0,0,150));
        root.getChildren().add(label1);

        primaryStage.widthProperty().addListener((obs, oldVal, newVal) -> {
            latime = newVal.doubleValue();
            System.out.println("Lățime actualizată: " + latime + " px");
        });

        primaryStage.heightProperty().addListener((obs, oldVal, newVal) -> {
            inaltime = newVal.doubleValue();
            System.out.println("Înălțime actualizată: " + inaltime + " px");
        });

        Image image1 = new Image("file:/C:/Users/iulica/Desktop/homeimage.jpeg");
        BackgroundSize backgroundSize = new BackgroundSize(100,100,true,true,true,true);
        BackgroundImage backgroundImage = new BackgroundImage(image1, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        root.setBackground(new Background(backgroundImage));

        Scene scene = new Scene(root, 900, 650);

        //Def (introducere)
        VBox root2 = new VBox();
        Scene sceneInfo=new Scene(root2,primaryStage.getWidth(), primaryStage.getHeight());

        WebView webViewDef= Def.createWebViewDef();
        root2.getChildren().add(webViewDef);

        Button nextButton=Buttons.createNextButton();
        VBox.setMargin(nextButton,new Insets(-200,0,0,0));
        root2.getChildren().add(nextButton);

        Button homeButton=Buttons.createHomeButton();
        VBox.setMargin(homeButton,new Insets(-630,0,0,0));
        root2.getChildren().add(homeButton);
        //Def (introducere)/

        //repr geo
        VBox rootReprGeo=new VBox();
        Scene reprezentareGeometrica=new Scene(rootReprGeo,900, 650);
        nextButton.setOnAction(e -> primaryStage.setScene(reprezentareGeometrica));

        WebView webViewReprGeo = ReprGeo.createWebViewReprGeo();
        rootReprGeo.getChildren().add(webViewReprGeo);

        Button nextButton2=Buttons.createNextButton();
        VBox.setMargin(nextButton2,new Insets(-170,0,0,85));
        rootReprGeo.getChildren().add(nextButton2);

        Button backButton2=Buttons.createBackButton();
        VBox.setMargin(backButton2,new Insets(-50,0,0,0));
        rootReprGeo.getChildren().add(backButton2);
        backButton2.setOnAction(e->primaryStage.setScene(sceneInfo));

        Button homeButton2=Buttons.createHomeButton();
        VBox.setMargin(homeButton2,new Insets(-640,0,0,0));
        rootReprGeo.getChildren().add(homeButton2);
        homeButton2.setOnAction(e -> primaryStage.setScene(scene));
        //repr geo/

        //modul si conjugat
        VBox rootModulConj=new VBox();
        Scene modulConj=new Scene(rootModulConj,900, 650);
        nextButton2.setOnAction(e -> primaryStage.setScene(modulConj));

        WebView webViewModulConjugat= ModulConjugat.createWebViewModulConjugat();
        rootModulConj.getChildren().add(webViewModulConjugat);

        Button nextButton3=Buttons.createNextButton();
        VBox.setMargin(nextButton3,new Insets(-170,0,0,85));
        rootModulConj.getChildren().add(nextButton3);

        Button backButton3=Buttons.createBackButton();
        VBox.setMargin(backButton3,new Insets(-50,0,0,0));
        rootModulConj.getChildren().add(backButton3);
        backButton3.setOnAction(e -> primaryStage.setScene(reprezentareGeometrica));

        Button homeButton3=Buttons.createHomeButton();
        VBox.setMargin(homeButton3,new Insets(-640,0,0,0));
        rootModulConj.getChildren().add(homeButton3);
        homeButton3.setOnAction(e -> primaryStage.setScene(scene));
        //modul si conjugat/

        //adunare & scadere - operatii 1
        VBox rootOperatii=new VBox();
        Scene operatii=new Scene(rootOperatii,900, 650);
        nextButton3.setOnAction(e -> primaryStage.setScene(operatii));

        WebView webViewAdunareScadere = AdunareScadere.createWebViewAdunareScadere();
        rootOperatii.getChildren().add(webViewAdunareScadere);

        Button nextButton4=Buttons.createNextButton();
        VBox.setMargin(nextButton4,new Insets(-170,0,0,85));
        rootOperatii.getChildren().add(nextButton4);

        Button backButton4=Buttons.createBackButton();
        VBox.setMargin(backButton4,new Insets(-50,0,0,0));
        rootOperatii.getChildren().add(backButton4);
        backButton4.setOnAction(e -> primaryStage.setScene(modulConj));

        Button homeButton4=Buttons.createHomeButton();
        VBox.setMargin(homeButton4,new Insets(-640,0,0,0));
        rootOperatii.getChildren().add(homeButton4);
        homeButton4.setOnAction(e -> primaryStage.setScene(scene));
        //adunare & scadere - operatii 1

        //inmultirea & impartire - operatii2
        VBox rootOperatii2 =new VBox();
        Scene operatii2 =new Scene(rootOperatii2,900, 650);
        nextButton4.setOnAction(e -> primaryStage.setScene(operatii2));

        WebView webViewInmImp = InmImp.createWebViewInmImp();
        rootOperatii2.getChildren().add(webViewInmImp);

        Button nextButton5=Buttons.createNextButton();
        VBox.setMargin(nextButton5,new Insets(-170,0,0,85));
        rootOperatii2.getChildren().add(nextButton5);

        Button backButton5=Buttons.createBackButton();
        VBox.setMargin(backButton5,new Insets(-50,0,0,0));
        rootOperatii2.getChildren().add(backButton5);
        backButton5.setOnAction(e -> primaryStage.setScene(operatii));

        Button homeButton5=Buttons.createHomeButton();
        VBox.setMargin(homeButton5,new Insets(-640,0,0,0));
        rootOperatii2.getChildren().add(homeButton5);
        homeButton5.setOnAction(e -> primaryStage.setScene(scene));
        //inmultirea - operatii2/

        //forma trigonometrică
        VBox rootFormaTrig =new VBox();
        Scene formaTrig=new Scene(rootFormaTrig,900,650);
        nextButton5.setOnAction(e->primaryStage.setScene(formaTrig));

        WebView webViewFormaTrig = FormaTrig.createWebViewFormaTrig();
        rootFormaTrig.getChildren().add(webViewFormaTrig);

        Button nextButtonForFormaTrig2=Buttons.createNextButton();
        VBox.setMargin(nextButtonForFormaTrig2,new Insets(-240,0,0,85));
        rootFormaTrig.getChildren().add(nextButtonForFormaTrig2);

        Button backButton6=Buttons.createBackButton();
        VBox.setMargin(backButton6,new Insets(-50,0,0,0));
        rootFormaTrig.getChildren().add(backButton6);
        backButton6.setOnAction(e -> primaryStage.setScene(operatii2));

        Button homeButton6=Buttons.createHomeButton();
        VBox.setMargin(homeButton6,new Insets(-640,0,0,0));
        rootFormaTrig.getChildren().add(homeButton6);
        homeButton6.setOnAction(e -> primaryStage.setScene(scene));
        //forma trigonometrică : la proprietati!!!!!!!!!!!!

        //forma trigonometrica2
        VBox rootFormaTrig2 =new VBox();
        Scene formaTrig2=new Scene(rootFormaTrig2,900,650);
        nextButtonForFormaTrig2.setOnAction(e->primaryStage.setScene(formaTrig2));

        WebView webViewFormaTrig2 = FormaTrig2.createWebViewFormaTrig();
        rootFormaTrig2.getChildren().add(webViewFormaTrig2);

        Button nextButtonForDelta=Buttons.createNextButton();
        VBox.setMargin(nextButtonForDelta,new Insets(-450,0,0,85));
        rootFormaTrig2.getChildren().add(nextButtonForDelta);

        Button backButton7=Buttons.createBackButton();
        VBox.setMargin(backButton7,new Insets(-50,0,0,0));
        rootFormaTrig2.getChildren().add(backButton7);
        backButton7.setOnAction(e -> primaryStage.setScene(formaTrig));

        Button homeButtonFormaTrig=Buttons.createHomeButton();
        VBox.setMargin(homeButtonFormaTrig,new Insets(-650,0,0,0));
        rootFormaTrig2.getChildren().add(homeButtonFormaTrig);
        homeButtonFormaTrig.setOnAction(e -> primaryStage.setScene(scene));
        //forma trigonometrica2

        //delta neg
        VBox rootDeltaNeg=new VBox();
        Scene deltaNeg=new Scene(rootDeltaNeg,900,650);
        nextButtonForDelta.setOnAction(e->primaryStage.setScene(deltaNeg));

        WebView webViewDeltaNeg = DeltaNeg.createWebViewDeltaNeg();
        rootDeltaNeg.getChildren().add(webViewDeltaNeg);

        Button backButtonDeltaNeg= Buttons.createBackButton();
        VBox.setMargin(backButtonDeltaNeg,new Insets(-250,0,0,0));
        rootDeltaNeg.getChildren().add(backButtonDeltaNeg);
        backButtonDeltaNeg.setOnAction(e -> primaryStage.setScene(formaTrig2));

        Button homeButtonDeltaNeg= Buttons.createHomeButton();
        VBox.setMargin(homeButtonDeltaNeg,new Insets(-590,0,0,0));
        rootDeltaNeg.getChildren().add(homeButtonDeltaNeg);
        homeButtonDeltaNeg.setOnAction(e -> primaryStage.setScene(scene));
        //delta neg

        //butoane pagina principala
        Button button1=new Button("  1) Ce este un \nnumăr complex?");
        button1.setPrefSize(100,60);
        button1.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        VBox.setMargin(button1,new Insets(250,500,0,100));
        button1.setFont(Font.font("Arial", 17));
        button1.setWrapText(true);
        button1.setMaxWidth(640);
        root.getChildren().add(button1);
        button1.setOnMouseExited(e -> button1.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button1.setOnMouseEntered(e -> button1.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        button1.setOnAction(e -> {
            double width = primaryStage.getWidth();
            double height = primaryStage.getHeight();

            primaryStage.setScene(sceneInfo);
            primaryStage.setWidth(width);
            primaryStage.setHeight(height);
        });
        homeButton.setOnAction(e -> primaryStage.setScene(scene));

        Button button2=new Button("2) Exemple rezolvate");
        button2.setPrefSize(100,60);
        button2.setMaxWidth(300);
        button2.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        button2.setFont(Font.font("Arial", 17));
        button2.setWrapText(true);
        button2.setMaxWidth(640);
        VBox.setMargin(button2,new Insets(-60,150,0,500));
        root.getChildren().add(button2);
        button2.setOnMouseExited(e -> button2.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button2.setOnMouseEntered(e -> button2.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        Button button3 =new Button("  3) Exerciții \n și probleme");
        button3.setPrefSize(100,60);
        button3.setMaxWidth(300);
        button3.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        button3.setFont(Font.font("Arial", 17));
        button3.setWrapText(true);
        button3.setMaxWidth(640);
        VBox.setMargin(button3,new Insets(50,500,0,100));
        root.getChildren().add(button3);
        button3.setOnMouseExited(e -> button3.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button3.setOnMouseEntered(e -> button3.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        Button button4 =new Button("4) Reprezentare \n        grafică");
        button4.setPrefSize(100,60);
        button4.setMaxWidth(300);
        button4.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        button4.setFont(Font.font("Arial", 17));
        button4.setWrapText(true);
        button4.setMaxWidth(640);
        VBox.setMargin(button4,new Insets(-60,150,0,500));
        root.getChildren().add(button4);
        button4.setOnMouseExited(e -> button4.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button4.setOnMouseEntered(e -> button4.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        Button button5 =new Button("   5) Aplicații \n în geometrie");
        button5.setPrefSize(100,60);
        button5.setMaxWidth(300);
        button5.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        button5.setFont(Font.font("Arial", 17));
        button5.setWrapText(true);
        button5.setMaxWidth(640);
        VBox.setMargin(button5,new Insets(50,500,0,100));
        root.getChildren().add(button5);
        button5.setOnMouseExited(e -> button5.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button5.setOnMouseEntered(e -> button5.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        Button button6 =new Button("6) Testează-ți \n  cunoștințele");
        button6.setPrefSize(100,60);
        button6.setMaxWidth(300);
        button6.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        button6.setFont(Font.font("Arial", 17));
        button6.setWrapText(true);
        button6.setMaxWidth(640);
        VBox.setMargin(button6,new Insets(-60,150,0,500));
        root.getChildren().add(button6);
        button6.setOnMouseExited(e -> button6.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button6.setOnMouseEntered(e -> button6.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));
        //butoane pagina principala

        //probleme rezolvate1
        VBox rootProbRez1 =new VBox();
        Scene probRez1=new Scene(rootProbRez1,900,650);
        button2.setOnAction(e->primaryStage.setScene(probRez1));

        WebView webViewRez1 = ProbRez.createWebViewProbRez1();
        rootProbRez1.getChildren().add(webViewRez1);

        Button nextButton7 =Buttons.createNextButton();
        rootProbRez1.getChildren().add(nextButton7);

        Button homeButton7 = Buttons.createHomeButton();
        rootProbRez1.getChildren().add(homeButton7);
        homeButton7.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate1

        //probleme rezolvate2
        VBox rootProbRez2 =new VBox();
        Scene probRez2 =new Scene(rootProbRez2,900,650);
        nextButton7.setOnAction(e->primaryStage.setScene(probRez2));

        WebView webViewRez2 = ProbRez.createWebViewProbRez2();
        rootProbRez2.getChildren().add(webViewRez2);

        Button nextButton8 = Buttons.createNextButton();
        rootProbRez2.getChildren().add(nextButton8);

        Button backButton8=Buttons.createBackButton();
        rootProbRez2.getChildren().add(backButton8);
        backButton8.setOnAction(e -> primaryStage.setScene(probRez1));

        Button homeButton8 = Buttons.createHomeButton();
        rootProbRez2.getChildren().add(homeButton8);
        homeButton8.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate2

        //probleme rezolvate3
        VBox rootProbRez3 =new VBox();
        Scene probRez3 =new Scene(rootProbRez3,900,650);
        nextButton8.setOnAction(e->primaryStage.setScene(probRez3));

        WebView webViewRez3 = ProbRez.createWebViewProbRez3();
        rootProbRez3.getChildren().add(webViewRez3);

        Button nextButton9 = Buttons.createNextButton();
        rootProbRez3.getChildren().add(nextButton9);

        Button backButton9=Buttons.createBackButton();
        rootProbRez3.getChildren().add(backButton9);
        backButton9.setOnAction(e -> primaryStage.setScene(probRez1));

        Button homeButton9Rez3 = Buttons.createHomeButton();
        rootProbRez3.getChildren().add(homeButton9Rez3);
        homeButton9Rez3.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate3

        //probleme rezolvate4
        VBox rootProbRez4 =new VBox();
        Scene probRez4 =new Scene(rootProbRez4,900,650);
        nextButton9.setOnAction(e->primaryStage.setScene(probRez4));

        WebView webViewRez4 = ProbRez.createWebViewProbRez4();
        rootProbRez4.getChildren().add(webViewRez4);

        Button backButton10Rez4=Buttons.createBackButton();
        rootProbRez4.getChildren().add(backButton10Rez4);
        VBox.setMargin(backButton10Rez4,new Insets(-250,0,0,0));
        backButton10Rez4.setOnAction(e -> primaryStage.setScene(probRez1));

        Button homeButton9Rez4 = Buttons.createHomeButton();
        rootProbRez4.getChildren().add(homeButton9Rez4);
        homeButton9Rez4.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate4

        //exercitii si probleme
        //1
        VBox rootEx=new VBox();
        Scene exercitii=new Scene(rootEx,900,650);
        button3.setOnAction(e->primaryStage.setScene(exercitii));

        WebView webViewQuestion1 = ExProb.createQuestion("Un număr complex are forma", new String[]{"a-bi", "a+b+i", "a+bi", "ab+i"},"a+bi");
        rootEx.getChildren().add(webViewQuestion1);

        Button nextButton10 = Buttons.createNextButton();
        rootEx.getChildren().add(nextButton10);

        Button homeButton10 = Buttons.createHomeButton();
        rootEx.getChildren().add(homeButton10);
        homeButton10.setOnAction(e -> primaryStage.setScene(scene));

        //2
        VBox rootEx2=new VBox();
        Scene exercitii2=new Scene(rootEx2,900,650);
        nextButton10.setOnAction(e->primaryStage.setScene(exercitii2));
        WebView webViewQuestion2 = ExProb.createQuestion("Adunați z=2+3i și w=4-i", new String[]{"4+i", "7-i", "6+2i", "6-2i"},"6+2i");
        rootEx2.getChildren().add(webViewQuestion2);

        Button nextButton11 = Buttons.createNextButton();
        rootEx2.getChildren().add(nextButton11);

        Button backButton11=Buttons.createBackButton();
        rootEx2.getChildren().add(backButton11);
        backButton11.setOnAction(e->primaryStage.setScene(exercitii));

        Button homeButton11 = Buttons.createHomeButton();
        rootEx2.getChildren().add(homeButton11);
        homeButton11.setOnAction(e -> primaryStage.setScene(scene));

        //3
        VBox rootEx3=new VBox();
        Scene exercitii3=new Scene(rootEx3,900,650);
        nextButton11.setOnAction(e->primaryStage.setScene(exercitii3));
        WebView webViewQuestion3 = ExProb.createQuestion("Scădeți z=6+3i și w=4-i", new String[]{"2+2i","2-i","2-4i","2+4i"},"2+4i");
        rootEx3.getChildren().add(webViewQuestion3);

        Button nextButton12 = Buttons.createNextButton();
        rootEx3.getChildren().add(nextButton12);

        Button backButton12=Buttons.createBackButton();
        rootEx3.getChildren().add(backButton12);
        backButton12.setOnAction(e->primaryStage.setScene(exercitii2));

        Button homeButton12 = Buttons.createHomeButton();
        rootEx3.getChildren().add(homeButton12);
        homeButton12.setOnAction(e -> primaryStage.setScene(scene));

        //4
        VBox rootEx4 =new VBox();
        Scene exercitii4 =new Scene(rootEx4,900,650);
        nextButton12.setOnAction(e->primaryStage.setScene(exercitii4));
        WebView webViewQuestion4 = ExProb.createQuestion("Modulul numărului z=-3+4i este:", new String[]{"5","√5","7","√7"},"5");
        rootEx4.getChildren().add(webViewQuestion4);

        Button nextButton13 = Buttons.createNextButton();
        rootEx4.getChildren().add(nextButton13);

        Button backButton13=Buttons.createBackButton();
        rootEx4.getChildren().add(backButton13);
        backButton13.setOnAction(e->primaryStage.setScene(exercitii3));

        Button homeButton13 = Buttons.createHomeButton();
        rootEx4.getChildren().add(homeButton13);
        homeButton13.setOnAction(e -> primaryStage.setScene(scene));

        //5
        VBox rootEx5 =new VBox();
        Scene exercitii5 =new Scene(rootEx5,900,650);
        nextButton13.setOnAction(e->primaryStage.setScene(exercitii5));
        WebView webViewQuestion5 = ExProb.createQuestion("Conjugatul numărului z=1+i este:", new String[]{"-1-i","1-i","-1+i","1+i"},"1-i");
        rootEx5.getChildren().add(webViewQuestion5);

        Button nextButton14 = Buttons.createNextButton();
        rootEx5.getChildren().add(nextButton14);

        Button backButton14=Buttons.createBackButton();
        rootEx5.getChildren().add(backButton14);
        backButton14.setOnAction(e->primaryStage.setScene(exercitii4));

        Button homeButton14 = Buttons.createHomeButton();
        rootEx5.getChildren().add(homeButton14);
        homeButton14.setOnAction(e -> primaryStage.setScene(scene));

        //6
        VBox rootEx6 =new VBox();
        Scene exercitii6 =new Scene(rootEx6,900,650);
        nextButton14.setOnAction(e->primaryStage.setScene(exercitii6));
        WebView webViewQuestion6 = ExProb.createQuestion("Înmulțește următoarele numere complexe: z=2+i; w=1+i", new String[]{"1+3i","1-3i","3-i","3+i"},"1+3i");
        rootEx6.getChildren().add(webViewQuestion6);

        Button nextButton15 = Buttons.createNextButton();
        rootEx6.getChildren().add(nextButton15);

        Button backButton15=Buttons.createBackButton();
        rootEx6.getChildren().add(backButton15);
        backButton15.setOnAction(e->primaryStage.setScene(exercitii5));

        Button homeButton15 = Buttons.createHomeButton();
        VBox.setMargin(homeButton15,new Insets(-650,0,0,0));
        rootEx6.getChildren().add(homeButton15);
        homeButton15.setOnAction(e -> primaryStage.setScene(scene));

        //7
        VBox rootEx7 =new VBox();
        Scene exercitii7 =new Scene(rootEx7,900,650);
        nextButton15.setOnAction(e->primaryStage.setScene(exercitii7));
        WebView webViewQuestion7 = ExProb.createQuestion("Împarte următoarele numere complexe: z=2+i; w=1+i", new String[]{"0,5+1,5i","1,5-0,5i","1,5+0,5i","0,5-1,5i"},"1,5+0,5i");
        rootEx7.getChildren().add(webViewQuestion7);

        Button backButton16=Buttons.createBackButton();
        VBox.setMargin(backButton16,new Insets(-250,0,0,0));
        rootEx7.getChildren().add(backButton16);
        backButton16.setOnAction(e->primaryStage.setScene(exercitii5));

        Button homeButton16 = Buttons.createHomeButton();
        VBox.setMargin(homeButton16,new Insets(-650,0,0,0));
        rootEx7.getChildren().add(homeButton16);
        homeButton16.setOnAction(e -> primaryStage.setScene(scene));
        //exercitii si probleme

        //grafic
        VBox rootGrafic=new VBox();
        Scene grafic=new Scene(rootGrafic,900,650);
        button4.setOnAction(e->primaryStage.setScene(grafic));
        Label titluGrafic=new Label("     Reprezentarea geometrică \n        a numerelor complexe");
        titluGrafic.setFont(Font.font("Arial Black",35));
        VBox.setMargin(titluGrafic,new Insets(0,0,0,100));
        rootGrafic.getChildren().add(titluGrafic);

        Label zGrafic =new Label("z=            +            *i");
        zGrafic.setFont(Font.font("Arial",30));
        VBox.setMargin(zGrafic,new Insets(25,0,0,220));
        TextField inputAGrafic =new TextField();
        TextField inputBGrafic =new TextField();
        inputAGrafic.setMaxWidth(90);
        inputAGrafic.setMinHeight(50);
        inputAGrafic.setPromptText("a");
        inputAGrafic.setStyle("-fx-font-size: 25");
        VBox.setMargin(inputAGrafic,new Insets(-45,0,0,260));
        inputBGrafic.setMaxWidth(90);
        inputBGrafic.setMinHeight(50);
        inputBGrafic.setPromptText("b");
        inputBGrafic.setStyle("-fx-font-size: 25");
        VBox.setMargin(inputBGrafic,new Insets(-52,0,0,375));

        FontAwesomeIconView inGrafic=new FontAwesomeIconView(FontAwesomeIcon.ANGLE_UP);
        inGrafic.setGlyphSize(40);
        Button transformInGrafic =new Button("");
        transformInGrafic.setGraphic(inGrafic);
        transformInGrafic.setPrefSize(50,50);
        VBox.setMargin(transformInGrafic,new Insets(-52,0,0,500));

        NumberAxis xAx=new NumberAxis(-10,10,1);
        NumberAxis yAx=new NumberAxis(-10,10,1);
        xAx.setLabel("x");
        yAx.setLabel("Y");
        rootGrafic.getChildren().add(xAx);
        rootGrafic.getChildren().add(yAx);
        ScatterChart<Number, Number> scatterChart=new ScatterChart<>(xAx,yAx);
        scatterChart.setLegendVisible(false);
        rootGrafic.getChildren().add(scatterChart);

        transformInGrafic.setOnAction(x->{
            try {
                double a = Double.parseDouble(inputAGrafic.getText());
                double b = Double.parseDouble(inputBGrafic.getText());

                XYChart.Data<Number, Number> punct = new XYChart.Data<>(a, b);
                XYChart.Series<Number, Number> serie = new XYChart.Series<>();
                serie.getData().add(punct);
                scatterChart.getData().add(serie);

                Platform.runLater(() -> {
                    Node node = punct.getNode();
                    if (node != null) {
                        Tooltip tooltip = new Tooltip("z = " + a + " + " + b + "i");
                        Tooltip.install(node, tooltip);
                    }
                });
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        rootGrafic.getChildren().add(zGrafic);
        rootGrafic.getChildren().add(inputAGrafic);
        rootGrafic.getChildren().add(inputBGrafic);
        rootGrafic.getChildren().add(transformInGrafic);

        Button homeButton9 = Buttons.createHomeButton();
        VBox.setMargin(homeButton9,new Insets(-550,0,0,800));
        rootGrafic.getChildren().add(homeButton9);
        homeButton9.setOnAction(e -> primaryStage.setScene(scene));
        //grafic

        //aplicatii in geometrie1
        VBox rootAplicatiiGeo=new VBox();
        Scene sceneAplicatiiGeo=new Scene(rootAplicatiiGeo,900,650);
        button5.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo));

        WebView webViewAplicatiiGeo = AplicatiiGeo.createWebViewAplicatiiGeo1();
        rootAplicatiiGeo.getChildren().add(webViewAplicatiiGeo);

        Button nextButtonInAplicatiiGeo=Buttons.createNextButton();
        rootAplicatiiGeo.getChildren().add(nextButtonInAplicatiiGeo);

        Button homeButtonInAplicatiiGeo=Buttons.createHomeButton();
        rootAplicatiiGeo.getChildren().add(homeButtonInAplicatiiGeo);
        homeButtonInAplicatiiGeo.setOnAction(e->primaryStage.setScene(scene));

        //aplicatii in geometrie 2
        VBox rootAplicatiiGeo2=new VBox();
        Scene sceneAplicatiiGeo2=new Scene(rootAplicatiiGeo2,900,650);
        nextButtonInAplicatiiGeo.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo2));

        WebView webViewAplicatiiGeo2 = AplicatiiGeo.createWebViewAplicatiiGeo2();
        rootAplicatiiGeo2.getChildren().add(webViewAplicatiiGeo2);

        Button nextButtonInAplicatiiGeo2=Buttons.createNextButton();
        rootAplicatiiGeo2.getChildren().add(nextButtonInAplicatiiGeo2);

        Button backButtonInAplicatiiGeo2=Buttons.createBackButton();
        rootAplicatiiGeo2.getChildren().add(backButtonInAplicatiiGeo2);
        backButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo));

        Button homeButtonInAplicatiiGeo2=Buttons.createHomeButton();
        rootAplicatiiGeo2.getChildren().add(homeButtonInAplicatiiGeo2);
        homeButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(scene));

        //aplicatii in geometrie 3
        VBox rootAplicatiiGeo3=new VBox();
        Scene sceneAplicatiiGeo3=new Scene(rootAplicatiiGeo3,900,650);
        nextButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo3));

        WebView webViewAplicatiiGeo3 = AplicatiiGeo.createWebViewAplicatiiGeo3();
        rootAplicatiiGeo3.getChildren().add(webViewAplicatiiGeo3);

        Button backButtonInAplicatiiGeo3=Buttons.createBackButton();
        VBox.setMargin(backButtonInAplicatiiGeo3,new Insets(-250,0,0,0));
        rootAplicatiiGeo3.getChildren().add(backButtonInAplicatiiGeo3);
        backButtonInAplicatiiGeo3.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo2));

        Button homeButtonInAplicatiiGeo3=Buttons.createHomeButton();
        rootAplicatiiGeo3.getChildren().add(homeButtonInAplicatiiGeo3);
        homeButtonInAplicatiiGeo3.setOnAction(e->primaryStage.setScene(scene));

        //recap
        VBox rootRecap =new VBox();
        Scene recap =new Scene(rootRecap,900,650);
        button6.setOnAction(e->primaryStage.setScene(recap));

        WebView webViewRecap = Recap.createWebViewRecap();
        rootRecap.getChildren().add(webViewRecap);

        FontAwesomeIconView goToTest =new FontAwesomeIconView(FontAwesomeIcon.LIST);
        goToTest.setGlyphSize(20);
        Button goToExamButton =new Button("Testează-ți \ncunoștințele");
        goToExamButton.setGraphic(goToTest);
        goToExamButton.setPrefSize(150,150);
        VBox.setMargin(goToExamButton,new Insets(-260,0,0,0));
        rootRecap.getChildren().add(goToExamButton);

        //exam
        VBox rootExam =new VBox();
        Scene exam =new Scene(rootExam,900,650);
        goToExamButton.setOnAction(e->primaryStage.setScene(exam));

        WebView webViewExam = Exam.createWebViewExam();
        rootExam.getChildren().add(webViewExam);

        Button homeButtonExam=Buttons.createHomeButton();
        VBox.setMargin(homeButtonExam,new Insets(-860,0,0,0));
        rootExam.getChildren().add(homeButtonExam);
        homeButtonExam.setOnAction(e -> primaryStage.setScene(scene));

        primaryStage.setTitle("Educational software");
        primaryStage.setScene(scene);
        primaryStage.show();

        latime = primaryStage.getWidth();
        inaltime = primaryStage.getHeight();
        System.out.println("Dimensiuni inițiale: " + latime + " x " + inaltime + " px");
//        primaryStage.setWidth(latime);
//        primaryStage.setHeight(inaltime);
    }

    public static void main(String[] args) {
        launch(args);
    }

}