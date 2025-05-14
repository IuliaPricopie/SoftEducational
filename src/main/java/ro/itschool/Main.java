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
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;


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

        // Listener pentru înălțime
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
//        root2.setAlignment(Pos.TOP_LEFT);
//
//        Label label2 = new Label("  Să aflăm ce este un număr complex!");
//        label2.setFont(Font.font("Arial Black",35));
//        root2.getChildren().add(label2);
        WebView webViewDef = new WebView();
        WebEngine engineDef = webViewDef.getEngine();
        engineDef.loadContent("""
                <html>
                        <head>
                          <script type='text/javascript' async src='https://polyfill.io/v3/polyfill.min.js?features=es6'></script>
                          <script type='text/javascript' id='MathJax-script' async src='https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js'></script>
                          <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                          <style>
                            body { font-family: Arial, sans-serif; font-size: 22px; text-align: center; padding: 20px; }
                            h1 { font-size: 36px; margin-bottom: 20px; }
                            .center { font-size: 40px; font-weight: bold; margin-top: 30px; }
                            .subtext { font-size: 24px; margin-top: 10px; font-style: italic; }
                            .container { display: flex; justify-content: center; flex-wrap: wrap; gap: 100px; margin-top: 20px; }
                            .box { width: 320px; padding: 15px; font-size: 22px; text-align: center; border-radius: 10px; box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.1); }
                            .box1 { background-color: #88C3CF; }
                            .box2 { background-color: #FBDCDA; }
                            .box3 { background-color: #F3EFAF; margin-top: 20px; }
                          </style>
                        </head>
                        <body>
                        <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                          <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                          Să aflăm ce este un număr complex!
                          <dotlottie-player
                            src="https://lottie.host/278d25f4-b96c-473c-ade9-b3f468e3d6b4/GczUYjKm0Z.lottie"
                            background="transparent"
                            speed="1"
                            style="width: 150px; height: 150px"
                            loop
                            autoplay
                          ></dotlottie-player>
                        </h1>
                        </div>
                          <p><b>DEFINIȚIE:</b> Un număr complex este o extensie a numerelor reale, definit ca o pereche ordonată de numere reale \\((a, b)\\).</p>
                          <div class='center'> \\( z = a + b i \\) </div>
                          <p class='subtext'>unde \\( a, b \\in \\mathbb{R} \\) și \\( i^2 = -1 \\).</p>
                          <p class='subtext'>Această formă se numește <b>forma algebrică</b> a unui număr complex.</p>
                          <div class='container'>
                            <div class='box box1'> \\( a \\) → Partea reală: notată \\( \\operatorname{Re}(z) \\) </div>
                            <div class='box box2'> \\( b \\) → Partea imaginară: notată \\( \\operatorname{Im}(z) \\) </div>
                          </div>
                          <div class='container'>
                            <div class='box box3'> \\( i \\) → Unitatea imaginară, \ndefinită prin relația \\( i^2 = -1 \\) </div>
                        </div>
                        </body></html>"""
        );
        webViewDef.setPrefHeight(800);
        VBox.setMargin(webViewDef, new Insets(-10, 0, 0, 0));
        root2.getChildren().add(webViewDef);

        Scene sceneInfo=new Scene(root2,900,650);

        Label lb=new Label(" \n \n  \n");
        root2.getChildren().add(lb);

        Button nextButton=createNextButton();
        VBox.setMargin(nextButton,new Insets(-270,0,0,0));
        root2.getChildren().add(nextButton);

        Button homeButton=createHomeButton();
        VBox.setMargin(homeButton,new Insets(-630,0,0,0));
        root2.getChildren().add(homeButton);

        //Def (introducere)/

        //repr geo
        VBox rootReprGeo=new VBox();

        WebView webViewReprGeo = new WebView();
        WebEngine engineReprGeo = webViewReprGeo.getEngine();
        engineReprGeo.loadContent("""
                <html>
                                <head>
                                    <script type="text/javascript" async\s
                                        src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                    <script type="text/javascript" id="MathJax-script" async\s
                                        src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                    <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                                    <style>
                                        body {
                                            font-family: Arial, sans-serif;
                                            background-color: #F6F6F6;
                                            padding: 40px;
                                        }
                                        h1 {
                                            font-size: 42px;
                                            font-weight: bold;
                                            color: #2C3E50;
                                            text-align: center;
                                            margin-bottom: 30px;
                                        }
                                        .container {
                                            display: flex;
                                            align-items: center;
                                            justify-content: space-between;
                                            gap: 50px;
                                        }
                                        .text-section {
                                            display: flex;
                                            flex-direction: column;
                                            gap: 20px;
                                            width: 50%;
                                        }
                                        .box {
                                            padding: 15px;
                                            font-size: 20px;
                                            border-radius: 15px;
                                            box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                            text-align: left;
                                            width: 90%;
                                        }
                                        .box1 { background-color: #C6D3E3; }
                                        .box2 { background-color: #AAD7D0; }
                                        .box3 { background-color: #E39E9E; }
                                        .image-container {
                                            display: flex;
                                            justify-content: center;
                                            width: 50%;
                                        }
                                        img {
                                            width: 90%;
                                            max-width: 450px;
                                            height: auto;
                                            border-radius: 10px;
                                            box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                        }
                                    </style>
                                </head>
                                <body>
                                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                  <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                  Reprezentarea Geometrică
                                  <dotlottie-player
                                    src="https://lottie.host/5c5e6553-d3e7-456c-8a0d-3aec7447f059/PWElQrErxM.lottie"
                                    background="transparent"
                                    speed="1"
                                    style="width: 200px; height: 200px"
                                    loop
                                    autoplay
                                  ></dotlottie-player>
                                </h1>
                                </div>
                                    <div class="container">
                                        <div class="text-section">
                                            <div class="box box1"><b>Axa Ox</b> reprezintă axa reală, unde se plasează partea reală a numerelor complexe.</div>
                                            <div class="box box2"><b>Axa Oy</b> reprezintă axa imaginară, unde se plasează partea imaginară.</div>
                                            <div class="box box3">Fiecărui punct (a, b) îi corespunde un număr complex numit <b>afix</b>: z = a + b i.</div>
                                        </div>
                                        <div class="image-container">
                                            <img src="file:/C:/Users/iulica/Desktop/reprgeo.jpeg" alt="Reprezentarea geometrică">
                                        </div>
                                    </div>
                                </body>
                                </html>"""

        );
        webViewReprGeo.setPrefHeight(800);
        VBox.setMargin(webViewReprGeo, new Insets(-50, 0, 0, 0));
        rootReprGeo.getChildren().add(webViewReprGeo);

        Scene reprezentareGeometrica=new Scene(rootReprGeo,900, 650);
        nextButton.setOnAction(e -> primaryStage.setScene(reprezentareGeometrica));

        Button nextButton2=createNextButton();
        VBox.setMargin(nextButton2,new Insets(-170,0,0,85));
        rootReprGeo.getChildren().add(nextButton2);

        Button backButton2=createBackButton();
        VBox.setMargin(backButton2,new Insets(-50,0,0,0));
        rootReprGeo.getChildren().add(backButton2);
        backButton2.setOnAction(e->primaryStage.setScene(sceneInfo));

        Button homeButton2=createHomeButton();
        VBox.setMargin(homeButton2,new Insets(-640,0,0,0));
        rootReprGeo.getChildren().add(homeButton2);
        homeButton2.setOnAction(e -> primaryStage.setScene(scene));

        //repr geo/

        //modul si conjugat
        VBox rootModulConj=new VBox();

        WebView webViewModulConjugat=new WebView();
        WebEngine engineModulConjugat = webViewModulConjugat.getEngine();
        engineModulConjugat.loadContent("""
                <html>
                                        <head>
                                            <script type="text/javascript" async\s
                                                src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                            <script type="text/javascript" id="MathJax-script" async\s
                                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                            <style>
                                                body {
                                                    font-family: Arial, sans-serif;
                                                    padding: 40px;
                                                    background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                                    background-size: cover;
                                                    background-position: center;
                                                    background-repeat: no-repeat;
                                                    background-attachment: fixed;
                                                }
                                                h1 {
                                                    font-size: 36px;
                                                    font-weight: bold;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 20px;
                                                }
                                                .container {
                                                    display: flex;
                                                    justify-content: space-between;
                                                    gap: 50px;
                                                }
                                                .column {
                                                    width: 48%;
                                                    padding: 20px;
                                                    border-radius: 15px;
                                                    box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                                }
                                                .modul {
                                                    background-color: #264653;
                                                }
                                                .conjugat {
                                                    background-color: #1B263B;
                                                }
                                                .title {
                                                    font-size: 26px;
                                                    font-weight: bold;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 20px;
                                                }
                                                .formula {
                                                    font-size: 22px;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-bottom: 15px;
                                                }
                                                .input-box {
                                                    width: 90%;
                                                    padding: 12px;
                                                    font-size: 18px;
                                                    border-radius: 8px;
                                                    border: 2px solid #ccc;
                                                    text-align: center;
                                                    display: block;
                                                    margin: 10px auto;
                                                }
                                                .glow-on-hover {
                                                    width: 220px;
                                                    height: 50px;
                                                    border: none;
                                                    outline: none;
                                                    color: #fff;
                                                    background: #111;
                                                    cursor: pointer;
                                                    position: relative;
                                                    z-index: 0;
                                                    border-radius: 10px;
                                                }
                
                                                .glow-on-hover:before {
                                                    content: '';
                                                    background: linear-gradient(45deg, #ff0000, #ff7300, #fffb00, #48ff00, #00ffd5, #002bff, #7a00ff, #ff00c8, #ff0000);
                                                    position: absolute;
                                                    top: -2px;
                                                    left:-2px;
                                                    background-size: 400%;
                                                    z-index: -1;
                                                    filter: blur(5px);
                                                    width: calc(100% + 4px);
                                                    height: calc(100% + 4px);
                                                    animation: glowing 20s linear infinite;
                                                    opacity: 0;
                                                    transition: opacity .3s ease-in-out;
                                                    border-radius: 10px;
                                                }
                        
                                                .glow-on-hover:active {
                                                    color: #000
                                                }
                        
                                                .glow-on-hover:active:after {
                                                    background: transparent;
                                                }
                        
                                                .glow-on-hover:hover:before {
                                                    opacity: 1;
                                                }
                        
                                                .glow-on-hover:after {
                                                    z-index: -1;
                                                    content: '';
                                                    position: absolute;
                                                    width: 100%;
                                                    height: 100%;
                                                    background: #111;
                                                    left: 0;
                                                    top: 0;
                                                    border-radius: 10px;
                                                }
                                                
                                                .result {
                                                    font-size: 25px;
                                                    font-weight: bold;
                                                    color: #FFFFFF;
                                                    text-align: center;
                                                    margin-top: 10px;
                                                    gap: 20px;
                                                }
                        
                                                @keyframes glowing {
                                                    0% { background-position: 0 0; }
                                                    50% { background-position: 400% 0; }
                                                    100% { background-position: 0 0; }
                                                }
                                            </style>
                                        </head>
                                        <body>
                                            <h1>Modulul și Conjugatul unui Număr Complex</h1>
                                           \s
                                            <div class="container">
                                                <!-- Coloana Modulului -->
                                                <div class="column modul">
                                                    <div class="title">Modulul unui număr complex</div>
                                                    <div class="formula">$$ |z| = \\sqrt{a^2 + b^2} $$</div>
                                                   \s
                                                    <input class="input-box" id="inputA" type="number" placeholder="Introduceți a">
                                                    <input class="input-box" id="inputB" type="number" placeholder="Introduceți b">
                                                    <center><button class="glow-on-hover" type="button" onclick="calculateModul()">Calculează</button>
                                                    <div class="result" id="resultModul">Modulul: </div>
                                                </div>
                
                                                <!-- Coloana Conjugatului -->
                                                <div class="column conjugat">
                                                    <div class="title">Conjugatul unui număr complex</div>
                                                    <div class="formula">$$ \\overline{z} = a - b i $$</div>
                                                   \s
                                                    <input class="input-box" id="inputAConj" type="number" placeholder="Introduceți a">
                                                    <input class="input-box" id="inputBConj" type="number" placeholder="Introduceți b">
                                                    <center><button class="glow-on-hover" type="button" onclick="calculateConjugat()">Calculează</button>
                                                    <div class="result" id="resultConjugat">Conjugatul: </div>
                                                </div>
                                            </div>
                
                                            <script>
                                                function calculateModul() {
                                                    let a = parseFloat(document.getElementById('inputA').value);
                                                    let b = parseFloat(document.getElementById('inputB').value);
                                                    if (!isNaN(a) && !isNaN(b)) {
                                                        let modul = Math.sqrt(a * a + b * b).toFixed(3);
                                                        document.getElementById('resultModul').innerText = "|z| = " + modul;
                                                    } else {
                                                        document.getElementById('resultModul').innerText = "Introduceți valori valide!";
                                                    }
                                                }
                
                                                function calculateConjugat() {
                                                    let a = parseFloat(document.getElementById('inputAConj').value);
                                                    let b = parseFloat(document.getElementById('inputBConj').value);
                                                    if (!isNaN(a) && !isNaN(b)) {
                                                        let sign = b >= 0 ? "-" : "+";
                                                        document.getElementById('resultConjugat').innerText = "Conjugatul: " + a + sign + Math.abs(b) + "i";
                                                    } else {
                                                        document.getElementById('resultConjugat').innerText = "Introduceți valori valide!";
                                                    }
                                                }
                                            </script>
                                        </body>
                                        </html>"""
        );
        webViewModulConjugat.setPrefHeight(800);
        VBox.setMargin(webViewModulConjugat, new Insets(-50, 0, 0, 0));
        rootModulConj.getChildren().add(webViewModulConjugat);

        Scene modulConj=new Scene(rootModulConj,900, 650);
        nextButton2.setOnAction(e -> primaryStage.setScene(modulConj));

        Button nextButton3=createNextButton();
        VBox.setMargin(nextButton3,new Insets(-170,0,0,85));
        rootModulConj.getChildren().add(nextButton3);

        Button backButton3=createBackButton();
        VBox.setMargin(backButton3,new Insets(-50,0,0,0));
        rootModulConj.getChildren().add(backButton3);
        backButton3.setOnAction(e -> primaryStage.setScene(reprezentareGeometrica));

        Button homeButton3=createHomeButton();
        VBox.setMargin(homeButton3,new Insets(-640,0,0,0));
        rootModulConj.getChildren().add(homeButton3);
        homeButton3.setOnAction(e -> primaryStage.setScene(scene));

        //modul si conjugat/

        //adunare & scadere - operatii 1
        VBox rootOperatii=new VBox();
        Scene operatii=new Scene(rootOperatii,900, 650);
        nextButton3.setOnAction(e -> primaryStage.setScene(operatii));

        WebView webViewAdunareScadere =new WebView();
        WebEngine engineAdunareScadere = webViewAdunareScadere.getEngine();
        engineAdunareScadere.loadContent("""
                <html>
                                 <head>
                                     <script type="text/javascript" async\s
                                         src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                     <script type="text/javascript" id="MathJax-script" async\s
                                         src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                     <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                                     <style>
                                         body {
                                             font-family: Arial, sans-serif;
                                             padding: 40px;
                                             font-size: 16px;
                                             background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                             background-size: cover;
                                             background-position: center;
                                             background-repeat: no-repeat;
                                             background-attachment: fixed;
                                         }
                                         h1 {
                                             font-size: 35px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .container {
                                             display: flex;
                                             justify-content: center;
                                             gap: 50px;
                                         }
                                         .input-container.center {
                                             display: flex;
                                             justify-content: center;
                                         }
                                         .column {
                                             flex: 1;
                                             max-width: 400px;
                                             min-width: 340px;
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #FFFFFF;
                                         }
                                         .adunare {
                                             background-color: #264653;
                                         }
                                         .scadere {
                                             background-color: #1B263B;
                                         }
                                         .title {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .formula {
                                             font-size: 35px;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 15px;
                                         }
                                         .input::placeholder {
                                            font-size:20px;
                                            text-align: center;
                                         }
                                         .input-box {
                                             width: 70px;
                                             padding: 5px;
                                             font-size: 20px;
                                             border-radius: 8px;
                                             border: 2px solid #ccc;
                                             text-align: center;
                                             display: inline-block;
                                             margin: 5px auto;
                                             vertical-align: middle;
                                         }
                                         .input-group {
                                            display: inline-flex;
                                            align-items: center;
                                            color: #FFFFFF;
                                         }
                                         .input-group span {
                                            font-size: 20px;
                                            margin: 5px;
                                            vertical-align: middle;
                                         }
                                         .input-container {
                                            display: flex;
                                            justify-content: space-between;
                                            width: 100%;
                                         }
                                         .glow-on-hover {
                                             width: 220px;
                                             height: 50px;
                                             border: none;
                                             outline: none;
                                             color: #fff;
                                             background: #111;
                                             cursor: pointer;
                                             position: relative;
                                             z-index: 0;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:before {
                                             content: '';
                                             background: linear-gradient(45deg, #ff0000, #ff7300, #fffb00, #48ff00, #00ffd5, #002bff, #7a00ff, #ff00c8, #ff0000);
                                             position: absolute;
                                             top: -2px;
                                             left:-2px;
                                             background-size: 400%;
                                             z-index: -1;
                                             filter: blur(5px);
                                             width: calc(100% + 4px);
                                             height: calc(100% + 4px);
                                             animation: glowing 20s linear infinite;
                                             opacity: 0;
                                             transition: opacity .3s ease-in-out;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:active {
                                             color: #000
                                         }
                
                                         .glow-on-hover:active:after {
                                             background: transparent;
                                         }
                
                                         .glow-on-hover:hover:before {
                                             opacity: 1;
                                         }
                
                                         .glow-on-hover:after {
                                             z-index: -1;
                                             content: '';
                                             position: absolute;
                                             width: 100%;
                                             height: 100%;
                                             background: #111;
                                             left: 0;
                                             top: 0;
                                             border-radius: 10px;
                                         }
                                         
                                         .result {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-top: 10px;
                                             gap: 20px;
                                         }
                
                                         @keyframes glowing {
                                             0% { background-position: 0 0; }
                                             50% { background-position: 400% 0; }
                                             100% { background-position: 0 0; }
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                   <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                   Operații cu Numere Complexe
                                   <dotlottie-player
                                     src="https://lottie.host/0c052b78-ec4c-4652-a8bf-e9330bebb4ab/oHtJ3Sv8va.lottie"
                                     background="transparent"
                                     speed="1"
                                     style="width: 100px; height: 100px;"
                                     loop
                                     autoplay>
                                   </dotlottie-player>
                                 </h1>
                                 </div>
                                 <div class="container">
                                            <div class="container">
                                                <div class="column adunare">
                                                    <div class="title">Suma a două  \nnumere complexe</div>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            z_1 + z_2 = (a + bi) + (c + di) =
                                                            \\]
                                                        </p>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            = (a + c) + (b + d)i
                                                            \\]
                                                        </p>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="a" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="b" placeholder="b" class="input-box">
                                                            <span>i</span> 
                                                        </div>
                                                        </div>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="c" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="d" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <center><button class="glow-on-hover" type="button" onclick="calculateSum()">Calculează</button></center>
                                                        <div class="result" id="sumResult">Rezultat: </div>
                                                    </div>
                                                </div>
                
                                                <div class="column scadere">
                                                    <div class="title">Diferența dintre două \nnumere complexe</div>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            z_1 - z_2 = (a + bi) - (c + di) =
                                                            \\]
                                                        </p>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            = (a - c) + (b - d)i
                                                            \\]
                                                        </p>
                                                    <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="aS" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="bS" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                    </div>
                                                    <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="cS" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="dS" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                             <center><button class="glow-on-hover" type="button" onclick="calculateSub()">Calculează</button></center>
                                                             <div class="result" id="subResult">Rezultat: </div>
                                                    </div>
                                                </div>
                                            </div>
                                            </div>
                            <script>
                                function calculateSum() {
                                    let a = parseFloat(document.getElementById('a').value) || 0;
                                    let b = parseFloat(document.getElementById('b').value) || 0;
                                    let c = parseFloat(document.getElementById('c').value) || 0;
                                    let d = parseFloat(document.getElementById('d').value) || 0;
                                    document.getElementById('sumResult').innerText = `Rezultat: ${a + c} + ${b + d}i`;
                                }
                                function calculateSub() {
                                    let a = parseFloat(document.getElementById('aS').value) || 0;
                                    let b = parseFloat(document.getElementById('bS').value) || 0;
                                    let c = parseFloat(document.getElementById('cS').value) || 0;
                                    let d = parseFloat(document.getElementById('dS').value) || 0;
                                    document.getElementById('subResult').innerText = `Rezultat: ${a - c} + ${b - d}i`;
                                }
                            </script>
                        </body>
                        </html>"""
        );
        webViewAdunareScadere.setPrefHeight(800);
        VBox.setMargin(webViewAdunareScadere, new Insets(-50, 0, 0, 0));
        rootOperatii.getChildren().add(webViewAdunareScadere);

        Button nextButton4=createNextButton();
        VBox.setMargin(nextButton4,new Insets(-170,0,0,85));
        rootOperatii.getChildren().add(nextButton4);

        Button backButton4=createBackButton();
        VBox.setMargin(backButton4,new Insets(-50,0,0,0));
        rootOperatii.getChildren().add(backButton4);
        backButton4.setOnAction(e -> primaryStage.setScene(modulConj));

        Button homeButton4=createHomeButton();
        VBox.setMargin(homeButton4,new Insets(-640,0,0,0));
        rootOperatii.getChildren().add(homeButton4);
        homeButton4.setOnAction(e -> primaryStage.setScene(scene));
        //adunare & scadere - operatii 1

        //inmultirea & impartire - operatii2
        VBox rootOperatii2 =new VBox();
        Scene operatii2 =new Scene(rootOperatii2,900, 650);
        nextButton4.setOnAction(e -> primaryStage.setScene(operatii2));

        WebView webViewInmImp =new WebView();
        WebEngine engineInmImp = webViewInmImp.getEngine();
        engineInmImp.loadContent("""
                <html>
                                 <head>
                                     <script type="text/javascript" async\s
                                         src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                     <script type="text/javascript" id="MathJax-script" async\s
                                         src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                     <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                                     <style>
                                         body {
                                             font-family: Arial, sans-serif;
                                             padding: 40px;
                                             font-size: 16px;
                                             background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                             background-size: cover;
                                             background-position: center;
                                             background-repeat: no-repeat;
                                             background-attachment: fixed;
                                         }
                                         h1 {
                                             font-size: 35px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .container {
                                             display: flex;
                                             justify-content: center;
                                             gap: 50px;
                                         }
                                         .input-container.center {
                                             display: flex;
                                             justify-content: center;
                                         }
                                         .column {
                                             flex: 1;
                                             max-width: 400px;
                                             min-width: 360px;
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #FFFFFF;
                                         }
                                         .inmultire {
                                             background-color: #264653;
                                         }
                                         .impartire {
                                             background-color: #1B263B;
                                         }
                                         .title {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .formula {
                                             font-size: 28px;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-bottom: 15px;
                                         }
                                         .input::placeholder {
                                            font-size:20px;
                                            text-align: center;
                                         }
                                         .input-box {
                                             width: 70px;
                                             padding: 5px;
                                             font-size: 20px;
                                             border-radius: 8px;
                                             border: 2px solid #ccc;
                                             text-align: center;
                                             display: inline-block;
                                             margin: 5px auto;
                                             vertical-align: middle;
                                         }
                                         .input-group {
                                            display: inline-flex;
                                            align-items: center;
                                            color: #FFFFFF;
                                         }
                                         .input-group span {
                                            font-size: 20px;
                                            margin: 5px;
                                            vertical-align: middle;
                                         }
                                         .input-container {
                                            display: flex;
                                            justify-content: space-between;
                                            width: 100%;
                                         }
                                         .glow-on-hover {
                                             width: 220px;
                                             height: 50px;
                                             border: none;
                                             outline: none;
                                             color: #fff;
                                             background: #111;
                                             cursor: pointer;
                                             position: relative;
                                             z-index: 0;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:before {
                                             content: '';
                                             background: linear-gradient(45deg, #ff0000, #ff7300, #fffb00, #48ff00, #00ffd5, #002bff, #7a00ff, #ff00c8, #ff0000);
                                             position: absolute;
                                             top: -2px;
                                             left:-2px;
                                             background-size: 400%;
                                             z-index: -1;
                                             filter: blur(5px);
                                             width: calc(100% + 4px);
                                             height: calc(100% + 4px);
                                             animation: glowing 20s linear infinite;
                                             opacity: 0;
                                             transition: opacity .3s ease-in-out;
                                             border-radius: 10px;
                                         }
                
                                         .glow-on-hover:active {
                                             color: #000
                                         }
                
                                         .glow-on-hover:active:after {
                                             background: transparent;
                                         }
                
                                         .glow-on-hover:hover:before {
                                             opacity: 1;
                                         }
                
                                         .glow-on-hover:after {
                                             z-index: -1;
                                             content: '';
                                             position: absolute;
                                             width: 100%;
                                             height: 100%;
                                             background: #111;
                                             left: 0;
                                             top: 0;
                                             border-radius: 10px;
                                         }
                                         
                                         .result {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #FFFFFF;
                                             text-align: center;
                                             margin-top: 10px;
                                             gap: 20px;
                                         }
                
                                         @keyframes glowing {
                                             0% { background-position: 0 0; }
                                             50% { background-position: 400% 0; }
                                             100% { background-position: 0 0; }
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                   <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                   Operații cu Numere Complexe
                                   <dotlottie-player
                                     src="https://lottie.host/0c052b78-ec4c-4652-a8bf-e9330bebb4ab/oHtJ3Sv8va.lottie"
                                     background="transparent"
                                     speed="1"
                                     style="width: 100px; height: 100px;"
                                     loop
                                     autoplay>
                                   </dotlottie-player>
                                 </h1>
                                 </div>
                                 <div class="container">
                                            <div class="container">
                                                <div class="column inmultire">
                                                    <div class="title">Produsul a două numere complexe</div>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            z_1 \\cdot z_2 = (a + bi) \\cdot (c + di) =
                                                            \\]
                                                        </p>
                                                        <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                            \\[
                                                            = (ac - bd) + (ad + bc)i
                                                            \\]
                                                        </p>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="a" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="b" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="c" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="d" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <div class="input-container center">
                                                        <center><button class="glow-on-hover" type="button" onclick="calculateImn()"><p style="text-align: center; font-size: 16px;">Calculează</p></button></center>
                                                        </div>
                                                        <div class="input-container center">
                                                        <div class="result" id="sumResult">Rezultat: </div>
                                                        </div>
                                                        </div>
                                                    </div>
                
                                                <div class="column impartire">
                                                    <div class="title">Împărțirea a două \nnumere complexe</div>
                                                    <p style="text-align: center; font-size: 16px; color: #FFFFFF;">
                                                        \\[
                                                        \\frac{z_1}{z_2} = \\frac{(a+bi)}{(c+di)} = \\frac{(a+bi)(c-di)}{c^2 + d^2} =
                                                        \\]
                                                    </p>
                                                    <p style="text-align: center; font-size: 15px; color: #FFFFFF;">
                                                        \\[
                                                        \\frac{(ac+bd)+(bc-ad)i}{c^2 + d^2} = \\frac{ac+bd}{c^2 + d^2} + \\frac{(bc-ad)}{c^2 + d^2}i
                                                        \\]
                                                    </p>
                                                    <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="aS" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="bS" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <div class="input-container center">
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="cS" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="dS" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <div class="input-container center">
                                                             <center><button class="glow-on-hover" type="button" onclick="calculateImp()"><p>Calculează</p></button></center>
                                                        </div>
                                                        <div class="input-container center">
                                                             <div class="result" id="subResult">Rezultat: </div>
                                                        </div>
                                                    </div>
                                            </div>
                                 </div>
                            <script>
                                function calculateImn() {
                                    let a = parseFloat(document.getElementById('a').value) || 0;
                                    let b = parseFloat(document.getElementById('b').value) || 0;
                                    let c = parseFloat(document.getElementById('c').value) || 0;
                                    let d = parseFloat(document.getElementById('d').value) || 0;
                                    document.getElementById('sumResult').innerText = `Rezultat: ${(a * c - b * d)} + ${(a * d + b * c)}i`;
                                }
                                function calculateImp() {
                                    let a = parseFloat(document.getElementById('aS').value) || 0;
                                    let b = parseFloat(document.getElementById('bS').value) || 0;
                                    let c = parseFloat(document.getElementById('cS').value) || 0;
                                    let d = parseFloat(document.getElementById('dS').value) || 0;
                                    let denominator = c * c + d * d;
                                    document.getElementById('subResult').innerText = `Rezultat: ${(a * c + b * d) / denominator} + ${(b * c - a * d) / denominator}i`;
                                }
                            </script>
                        </body>
                        </html>"""
        );
        webViewInmImp.setPrefHeight(800);
        VBox.setMargin(webViewInmImp, new Insets(-50, 0, 0, 0));
        rootOperatii2.getChildren().add(webViewInmImp);

        Button nextButton5=createNextButton();
        VBox.setMargin(nextButton5,new Insets(-170,0,0,85));
        rootOperatii2.getChildren().add(nextButton5);

        Button backButton5=createBackButton();
        VBox.setMargin(backButton5,new Insets(-50,0,0,0));
        rootOperatii2.getChildren().add(backButton5);
        backButton5.setOnAction(e -> primaryStage.setScene(operatii));

        Button homeButton5=createHomeButton();
        VBox.setMargin(homeButton5,new Insets(-640,0,0,0));
        rootOperatii2.getChildren().add(homeButton5);
        homeButton5.setOnAction(e -> primaryStage.setScene(scene));
        //inmultirea - operatii2 - asezate butoanele & trebuie facuta impartirea!!!!!!!!!!!!!!!!!!!!!!!!!

        //forma trigonometrică : la proprietati!!!!!!!!!!!!
        VBox rootFormaTrig =new VBox();
        Scene formaTrig=new Scene(rootFormaTrig,900,650);
        nextButton5.setOnAction(e->primaryStage.setScene(formaTrig));
//        Label titluFormaTrig=new Label("Forma trigonometrică");
//        titluFormaTrig.setFont(Font.font("Arial Black",45));
//        VBox.setMargin(titluFormaTrig,new Insets(0,0,0,180));
//        rootFormaTrig.getChildren().add(titluFormaTrig);
        WebView webView = new WebView();
        webView.setMinWidth(900);
        webView.setMinHeight(850);

        WebEngine engine = webView.getEngine();
        engine.loadContent(
                """
                        <html lang="ro">
                               <head>
                                   <script type="text/javascript" async src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                   <script type="text/javascript" id="MathJax-script" async\s
                                       src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                                   <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                                   <style>
                                       body {
                                           font-family: 'Arial', sans-serif;
                                           font-size: 18px;
                                           padding: 20px;
                                           margin: 0;
                                           background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                           text-align: center;
                                           display: flex;
                                           justify-content: center;
                                           align-items: center;
                                           height: 100vh;
                                       }
                                       .container {
                                           display: flex;
                                           max-width: 900px;
                                           width: 100%;
                                           height: 600px;
                                           margin-top: 10px;
                                       }
                                       .left {
                                           width: 75%;
                                           display: flex;
                                           flex-direction: column;
                                           gap: 20px;
                                       }
                                       .right {
                                           width: 23%;
                                           display: flex;
                                           align-items: center;
                                       }
                                       .section {
                                           background-color: rgba(255, 255, 255, 0.8);
                                           border-radius: 15px;
                                           padding: 15px;
                                           box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1);
                                           transition: transform 0.3s ease-in-out;
                                       }
                                       .section-title {
                                           font-size: 22px;
                                           font-weight: bold;
                                           color: #2C3E50;
                                           margin-bottom: 8px;
                                       }
                                       ul {
                                           list-style: none;
                                           padding: 0;
                                           text-align: left;
                                       }
                                       ul li {
                                           background-color: #E3FDFD;
                                           color: #2C3E50;
                                           margin: 5px 0;
                                           padding: 8px;
                                           border-radius: 6px;
                                           font-weight: bold;
                                       }
                                       h1 {
                                           position: absolute;
                                           top: 20px;
                                           width: 100%;
                                           font-size: 34px;
                                           font-weight: bold;
                                           color: #2C3E50;
                                           text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
                                       }
                                   </style>
                               </head>
                               <body>
                                   <h1 style="justify-content: center; margin: 0; display: flex; align-items: center; gap: 10px;">Forma Trigonometrică
                                   <dotlottie-player
                                     src="https://lottie.host/278d25f4-b96c-473c-ade9-b3f468e3d6b4/GczUYjKm0Z.lottie"
                                     background="transparent"
                                     speed="1"
                                     style="width: 200px; height: 200px;"
                                     loop
                                     autoplay>
                                   </dotlottie-player>
                                   </h1>
                                   <div class="container">
                                       <!-- Coloana din stânga -->
                                       <div class="left">
                                           <div class="section">
                                               <p class="section-title">Definiție</p>
                                               <p>Un număr complex poate fi exprimat în forma trigonometrică:</p>
                                               \\[
                                               z = |z| (\\cos \\theta + i \\sin \\theta)
                                               \\]
                                               <p>
                                                   unde \\( \\theta \\) este argumentul, adică unghiul format de vector cu axa reală, \s
                                                   notat \\( \\arg z = \\theta, \\quad \\theta \\in [0,2\\pi) \\).
                                               </p>
                                           </div>
                        
                                           <div class="section">
                                               <p class="section-title">Argumentul în diferite cadrane</p>
                                               <ul>
                                                   <li>În primul cadran: \\( \\arg z = \\arctan(\\frac{b}{a}) \\)</li>
                                                   <li>În cadranul II și III: \\( \\arg z = \\pi + \\arctan(\\frac{b}{a}) \\)</li>
                                                   <li>În cadranul IV: \\( \\arg z = 2\\pi + \\arctan(\\frac{b}{a}) \\)</li>
                                               </ul>
                                           </div>
                                       </div>
                        
                                       <div class="right">
                                           <div class="section" style="width: 90%;">
                                               <p class="section-title">Conversia între forme</p>
                                               <ul>
                                                   <li>\\( a = |z| \\cos \\theta \\)</li>
                                                   <li>\\( b = |z| \\sin \\theta \\)</li>
                                               </ul>
                                           </div>
                                       </div>
                                   </div>
                        
                               </body>
                               </html>
                        """
        );

        VBox.setMargin(webView, new Insets(-30, 0, 0, 0));
        rootFormaTrig.getChildren().add(webView);

        Button nextButtonForFormaTrig2=createNextButton();
        VBox.setMargin(nextButtonForFormaTrig2,new Insets(-240,0,0,85));
        rootFormaTrig.getChildren().add(nextButtonForFormaTrig2);

        Button backButton6=createBackButton();
        VBox.setMargin(backButton6,new Insets(-50,0,0,0));
        rootFormaTrig.getChildren().add(backButton6);
        backButton6.setOnAction(e -> primaryStage.setScene(operatii2));

        Button homeButton6=createHomeButton();
        VBox.setMargin(homeButton6,new Insets(-640,0,0,0));
        rootFormaTrig.getChildren().add(homeButton6);
        homeButton6.setOnAction(e -> primaryStage.setScene(scene));
        //forma trigonometrică : la proprietati!!!!!!!!!!!!

        //forma trigonometrica2
        VBox rootFormaTrig2 =new VBox();
        Scene formaTrig2=new Scene(rootFormaTrig2,900,650);
        nextButtonForFormaTrig2.setOnAction(e->primaryStage.setScene(formaTrig2));
//        Label titluFormaTrig2=new Label("Forma trigonometrică");
//        titluFormaTrig2.setFont(Font.font("Arial Black",45));
//        VBox.setMargin(titluFormaTrig2,new Insets(0,0,0,180));
//        rootFormaTrig2.getChildren().add(titluFormaTrig);
        WebView webView2 = new WebView();
        webView2.setMinWidth(900);
        webView2.setMinHeight(1150);

        WebEngine engine2 = webView2.getEngine();
        engine2.loadContent(
                """
                        <html>
                        <head>
                            <script type="text/javascript" async src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                            <script type="text/javascript" id="MathJax-script" async\s
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                            <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                            <style>
                                body {
                                    font-family: 'Arial', sans-serif;
                                    font-size: 18px;
                                    padding: 20px;
                                    margin: 0;
                                    background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                    text-align: center;
                                    display: flex;
                                    flex-direction: column;
                                    justify-content: center;
                                    align-items: center;
                                    height: 100vh;
                                }
                        
                                .container {
                                    width: 90%;
                                    max-width: 800px;
                                }
                        
                                .section {
                                    background-color: rgba(255, 255, 255, 0.8);
                                    border-radius: 15px;
                                    padding: 15px;
                                    margin-bottom: 15px;
                                    box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1);
                                    transition: transform 0.3s ease-in-out;
                                }
                        
                                .section-title {
                                    font-size: 22px;
                                    font-weight: bold;
                                    color: #2C3E50;
                                    margin-bottom: 8px;
                                }
                        
                                h1 {
                                    font-size: 34px;
                                    font-weight: bold;
                                    color: #2C3E50;
                                    text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
                                    margin-bottom: 20px;
                                }
                            </style>
                        </head>
                        <body>
                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                            <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                              <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                              Proprietăți ale Formei Trigonometrice
                              <dotlottie-player
                              src="https://lottie.host/6dea93cd-c8e3-4ac2-a14b-d5017787f6e8/06WhqxGGCS.lottie"
                              background="transparent"
                              speed="1"
                              style="width: 300px; height: 300px"
                              loop
                              autoplay
                              ></dotlottie-player>
                            </h1>
                            </div>
                            <div class="container">
                                <div class="section">
                                    <p class="section-title">✨ Înmulțirea</p>
                                    <p>
                                        \\[
                                        z_1 \\cdot z_2 = |z_1| |z_2| [\\cos(\\theta_1 + \\theta_2) + i \\sin(\\theta_1 + \\theta_2)]
                                        \\]
                                    </p>
                                </div>
                        
                                <div class="section">
                                    <p class="section-title">✨ Împărțirea</p>
                                    <p>
                                        \\[
                                        \\frac{|z_1|}{|z_2|} =\s
                                        \\frac{|z_1| ( \\cos \\theta_1 + i \\sin \\theta_1 )}{ |z_2| ( \\cos \\theta_2 + i \\sin \\theta_2 )} = \\frac{|z_1|}{|z_2|} [\\cos( \\theta_1 - \\theta_2) + i \\sin(\\theta_1 - \\theta_2)]
                                        \\]
                                    </p>
                                </div>
                        
                                <div class="section">
                                    <p class="section-title">✨ Ridicarea la putere</p>
                                    <p>
                                        \\[
                                        z^n = |z|^n ( \\cos \\theta + i \\sin \\theta )^n = |z|^n [\\cos(n\\theta) + i \\sin(n\\theta)]
                                        \\]
                                    </p>
                                </div>
                            </div>
                        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                        </body>
                        </html>"""
        );
        VBox.setMargin(webView2, new Insets(-100, 0, 0, 0));//-35
        rootFormaTrig2.getChildren().add(webView2);

        Button nextButtonForDelta=createNextButton();
        VBox.setMargin(nextButtonForDelta,new Insets(-450,0,0,85));
        rootFormaTrig2.getChildren().add(nextButtonForDelta);

        Button backButton7=createBackButton();
        VBox.setMargin(backButton7,new Insets(-50,0,0,0));
        rootFormaTrig2.getChildren().add(backButton7);
        backButton7.setOnAction(e -> primaryStage.setScene(formaTrig));

        Button homeButtonFormaTrig=createHomeButton();
        VBox.setMargin(homeButtonFormaTrig,new Insets(-650,0,0,0));
        rootFormaTrig2.getChildren().add(homeButtonFormaTrig);
        homeButtonFormaTrig.setOnAction(e -> primaryStage.setScene(scene));

        //forma trigonometrica2

        //butoane pagina principala
        Button button1=new Button("  1) Ce este un \nnumăr complex?");
        button1.setPrefSize(100,60);
        button1.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;");
        VBox.setMargin(button1,new Insets(250,500,0,100));
        button1.setFont(Font.font("Arial", 17));
        button1.setWrapText(true);
        button1.setMaxWidth(640);
        root.getChildren().add(button1);//...
        button1.setOnMouseExited(e -> button1.setStyle("-fx-background-color: transparent; -fx-border-color:transparent; -fx-text-fill: white;"));
        button1.setOnMouseEntered(e -> button1.setStyle("-fx-background-color: #1F7831; -fx-text-fill: white;"));

        button1.setOnAction(e -> primaryStage.setScene(sceneInfo));
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

        WebView webViewRez1 = new WebView();
        WebEngine webEngineRez1 = webViewRez1.getEngine();
        webViewRez1.setMinWidth(900);
        webViewRez1.setMinHeight(850);
        String htmlContentRez1 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare1.jpg" alt="Rezolvare 1" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez1.loadContent(htmlContentRez1);
        rootProbRez1.getChildren().add(webViewRez1);

        Button nextButton7 =createNextButton();
        rootProbRez1.getChildren().add(nextButton7);

        Button homeButton7 = createHomeButton();
//        VBox.setMargin(homeButton7,new Insets(100,0,0,0));
        rootProbRez1.getChildren().add(homeButton7);
        homeButton7.setOnAction(e -> primaryStage.setScene(scene));
//
//        Button homeButtn7 = createHomeButton();
//        rootProbRez1.getChildren().add(homeButtn7);
//        VBox.setMargin(homeButtn7,new Insets(-300,0,0,0));
//        homeButtn7.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate1

        //probleme rezolvate2
        VBox rootProbRez2 =new VBox();
        Scene probRez2 =new Scene(rootProbRez2,900,650);
        nextButton7.setOnAction(e->primaryStage.setScene(probRez2));

        WebView webViewRez2 = new WebView();
        WebEngine webEngineRez2 = webViewRez2.getEngine();
        webViewRez2.setMinWidth(900);
        webViewRez2.setMinHeight(850);
        String htmlContentRez2 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare2.jpg" alt="Rezolvare 2" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez2.loadContent(htmlContentRez2);
        rootProbRez2.getChildren().add(webViewRez2);

        Button nextButton8 =createNextButton();
        rootProbRez2.getChildren().add(nextButton8);

        Button backButton8=createBackButton();
        rootProbRez2.getChildren().add(backButton8);
        backButton8.setOnAction(e -> primaryStage.setScene(probRez1));

        Button homeButton8 = createHomeButton();
        rootProbRez2.getChildren().add(homeButton8);
        homeButton8.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate2

        //probleme rezolvate3
        VBox rootProbRez3 =new VBox();
        Scene probRez3 =new Scene(rootProbRez3,900,650);
        nextButton8.setOnAction(e->primaryStage.setScene(probRez3));

        WebView webViewRez3 = new WebView();
        WebEngine webEngineRez3 = webViewRez3.getEngine();
        webViewRez3.setMinWidth(900);
        webViewRez3.setMinHeight(850);
        String htmlContentRez3 = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial Black', sans-serif;
                        text-align: center;
                        background-color: white;
                        margin: 0;
                        padding: 20px;
                    }
                    h1 {
                        font-size: 45px;
                        margin-bottom: 30px;
                    }
                    img {
                        width: 690px;
                        height: 650px;
                        object-fit: cover;
                    }
                </style>
            </head>
            <body>
                <h1>Probleme rezolvate</h1>
                <img src="file:/C:/Users/iulica/Desktop/rezolvare3.jpeg" alt="Rezolvare 3" style="max-width: 100%; height: auto;">
            </body>
            </html>""";

        webEngineRez3.loadContent(htmlContentRez3);
        rootProbRez3.getChildren().add(webViewRez3);

        Button nextButton9 =createNextButton();
        rootProbRez3.getChildren().add(nextButton9);

        Button backButton9=createBackButton();
        rootProbRez3.getChildren().add(backButton9);
        backButton9.setOnAction(e -> primaryStage.setScene(probRez1));

        Button homeButton9Rez3 = createHomeButton();
        rootProbRez3.getChildren().add(homeButton9Rez3);
        homeButton9Rez3.setOnAction(e -> primaryStage.setScene(scene));

        //probleme rezolvate3

        //exercitii si probleme
        //1
        VBox rootEx=new VBox();
        Scene exercitii=new Scene(rootEx,900,650);
        button3.setOnAction(e->primaryStage.setScene(exercitii));

        WebView webViewQuestion1 = createQuestion("Un număr complex are forma", new String[]{"a-bi", "a+b+i", "a+bi", "ab+i"},"a+bi");
        rootEx.getChildren().add(webViewQuestion1);

        Button nextButton10 =createNextButton();
        rootEx.getChildren().add(nextButton10);

        Button homeButton10 = createHomeButton();
        rootEx.getChildren().add(homeButton10);
        homeButton10.setOnAction(e -> primaryStage.setScene(scene));

        //2
        VBox rootEx2=new VBox();
        Scene exercitii2=new Scene(rootEx2,900,650);
        nextButton10.setOnAction(e->primaryStage.setScene(exercitii2));
        WebView webViewQuestion2 = createQuestion("Adunați z=2+3i și w=4-i", new String[]{"4+i", "7-i", "6+2i", "6-2i"},"6+2i");
        rootEx2.getChildren().add(webViewQuestion2);

        Button nextButton11 =createNextButton();
        rootEx2.getChildren().add(nextButton11);

        Button backButton11=createBackButton();
        rootEx2.getChildren().add(backButton11);
        backButton11.setOnAction(e->primaryStage.setScene(exercitii));

        Button homeButton11 = createHomeButton();
        rootEx2.getChildren().add(homeButton11);
        homeButton11.setOnAction(e -> primaryStage.setScene(scene));

        //3
        VBox rootEx3=new VBox();
        Scene exercitii3=new Scene(rootEx3,900,650);
        nextButton11.setOnAction(e->primaryStage.setScene(exercitii3));
        WebView webViewQuestion3 = createQuestion("Scădeți z=6+3i și w=4-i", new String[]{"2+2i","2-i","2-4i","2+4i"},"2+4i");
        rootEx3.getChildren().add(webViewQuestion3);

        Button nextButton12 = createNextButton();
        rootEx3.getChildren().add(nextButton12);

        Button backButton12=createBackButton();
        rootEx3.getChildren().add(backButton12);
        backButton12.setOnAction(e->primaryStage.setScene(exercitii2));

        Button homeButton12 = createHomeButton();
        rootEx3.getChildren().add(homeButton12);
        homeButton12.setOnAction(e -> primaryStage.setScene(scene));

        //4
        VBox rootEx4 =new VBox();
        Scene exercitii4 =new Scene(rootEx4,900,650);
        nextButton12.setOnAction(e->primaryStage.setScene(exercitii4));
        WebView webViewQuestion4 = createQuestion("Modulul numărului z=-3+4i este:", new String[]{"5","√5","7","√7"},"5");
        rootEx4.getChildren().add(webViewQuestion4);

        Button nextButton13 = createNextButton();
        rootEx4.getChildren().add(nextButton13);

        Button backButton13=createBackButton();
        rootEx4.getChildren().add(backButton13);
        backButton13.setOnAction(e->primaryStage.setScene(exercitii3));

        Button homeButton13 = createHomeButton();
        rootEx4.getChildren().add(homeButton13);
        homeButton13.setOnAction(e -> primaryStage.setScene(scene));

        //5
        VBox rootEx5 =new VBox();
        Scene exercitii5 =new Scene(rootEx5,900,650);
        nextButton13.setOnAction(e->primaryStage.setScene(exercitii5));
        WebView webViewQuestion5 = createQuestion("Conjugatul numărului z=1+i este:", new String[]{"-1-i","1-i","-1+i","1+i"},"1-i");
        rootEx5.getChildren().add(webViewQuestion5);

        Button nextButton14 = createNextButton();
        rootEx5.getChildren().add(nextButton14);

        Button backButton14=createBackButton();
        rootEx5.getChildren().add(backButton14);
        backButton14.setOnAction(e->primaryStage.setScene(exercitii4));

        Button homeButton14 = createHomeButton();
        rootEx5.getChildren().add(homeButton14);
        homeButton14.setOnAction(e -> primaryStage.setScene(scene));

        //6
        VBox rootEx6 =new VBox();
        Scene exercitii6 =new Scene(rootEx6,900,650);
        nextButton14.setOnAction(e->primaryStage.setScene(exercitii6));
        WebView webViewQuestion6 = createQuestion("Înmulțește următoarele numere complexe: z=2+i; w=1+i", new String[]{"1+3i","1-3i","3-i","3+i"},"1+3i");
        rootEx6.getChildren().add(webViewQuestion6);

        Button nextButton15 = createNextButton();
        rootEx6.getChildren().add(nextButton15);

        Button backButton15=createBackButton();
//        VBox.setMargin(backButton15,new Insets(-250,0,0,0));
        rootEx6.getChildren().add(backButton15);
        backButton15.setOnAction(e->primaryStage.setScene(exercitii5));

        Button homeButton15 = createHomeButton();
        VBox.setMargin(homeButton15,new Insets(-650,0,0,0));
        rootEx6.getChildren().add(homeButton15);
        homeButton15.setOnAction(e -> primaryStage.setScene(scene));

        //7
        VBox rootEx7 =new VBox();
        Scene exercitii7 =new Scene(rootEx7,900,650);
        nextButton15.setOnAction(e->primaryStage.setScene(exercitii7));
        WebView webViewQuestion7 = createQuestion("Împarte următoarele numere complexe: z=2+i; w=1+i", new String[]{"0,5+1,5i","1,5-0,5i","1,5+0,5i","0,5-1,5i"},"1,5+0,5i");
        rootEx7.getChildren().add(webViewQuestion7);

//        Button nextButton15 = createNextButton();
//        rootEx6.getChildren().add(nextButton15);
        Button backButton16=createBackButton();
        VBox.setMargin(backButton16,new Insets(-250,0,0,0));
        rootEx7.getChildren().add(backButton16);
        backButton16.setOnAction(e->primaryStage.setScene(exercitii5));

        Button homeButton16 = createHomeButton();
        VBox.setMargin(homeButton16,new Insets(-650,0,0,0));
        rootEx7.getChildren().add(homeButton16);
        homeButton16.setOnAction(e -> primaryStage.setScene(scene));
        //exercitii si probleme

        //recap
        VBox rootRecap =new VBox();
        Scene recap =new Scene(rootRecap,900,650);
        button6.setOnAction(e->primaryStage.setScene(recap));

        WebView webViewRecap = new WebView();
        webViewRecap.setMinWidth(900);
        webViewRecap.setMinHeight(850);

        WebEngine engineRecap = webViewRecap.getEngine();
        engineRecap.loadContent("""
              <html>
              <head>
                 <script type="text/javascript" async\s
                     src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                 <script type="text/javascript" id="MathJax-script" async\s
                     src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                  <style>
                      body {
                          font-family: 'Arial', sans-serif;
                          text-align: center;
                          padding: 20px;
                          background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                          background-size: cover;
                          background-position: center;
                          background-repeat: no-repeat;
                          background-attachment: fixed;
                      }
                      .container {
                          width: 80%%;
                          max-width: 600px;
                          background: white;
                          padding: 20px;
                          border-radius: 15px;
                          box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                          margin: auto;
                          margin-bottom: 30px;
                      }
                      h1 {
                          font-size: 32px;
                          color: #2C3E50;
                      }
                      h2 {
                          font-size: 28px;
                          color: #2C3E50;
                      }
                      .formule {
                          font-size: 22px;
                          font-weight: bold;
                          margin-bottom: 15px;
                      }
                      .options label {
                          display: block;
                          font-size: 20px;
                          background: #f0f8ff;
                          padding: 10px;
                          border-radius: 8px;
                          margin: 8px 0;
                          cursor: pointer;
                          transition: 0.3s;
                      }
                      .options label:hover {
                          background: #d4eaff;
                      }
                      .check-btn {
                          font-size: 20px;
                          padding: 10px 15px;
                          background: #3498db;
                          color: white;
                          border: none;
                          border-radius: 8px;
                          cursor: pointer;
                          margin-top: 15px;
                      }
                      .check-btn:hover {
                          background: #1f78b4;
                      }
                      #result {
                          font-size: 22px;
                          font-weight: bold;
                          margin-top: 15px;
                      }
                      .correct {
                          color: green;
                      }
                      .wrong {
                          color: red;
                      }
                  </style>
              </head>
              <body>
                  <h1>RECAPITULARE<h1>
                  <div class="container">
                      <h2>Modul</h2>
                      <p class="formule">$$ |z| = \\sqrt{a^2 + b^2} $$</p>
                  </div>
                  <div class="container">
                      <h2>Conjugat</h2>
                      <p class="formule">$$ \\overline{z} = a - b i $$</p>
                  </div>
                  <div class="container">
                      <h2>Suma</h2>
                      <p class="formule">
                      \\[
                      z_1 + z_2 = (a + bi) + (c + di) = (a + c) + (b + d)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Diferența</h2>
                      <p class="formule">
                      \\[
                      z_1 - z_2 = (a + bi) - (c + di) = (a - c) + (b - d)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Produsul</h2>
                      <p class="formule">
                      \\[
                      z_1 \\cdot z_2 = (a + bi) \\cdot (c + di) = (ac - bd) + (ad + bc)i
                      \\]
                      </p>
                  </div>
                  <div class="container">
                      <h2>Împărțirea</h2>
                      <p class="formule">
                          \\[
                          \\frac{z_1}{z_2} = \\frac{(a+bi)}{(c+di)} = \\frac{(a+bi)(c-di)}{c^2 + d^2} =
                          \\]
                      </p>
                      <p class="formule">
                          \\[
                          = \\frac{(ac+bd)+(bc-ad)i}{c^2 + d^2} = \\frac{ac+bd}{c^2 + d^2} + \\frac{(bc-ad)}{c^2 + d^2}i
                          \\]
                      </p>
                  </div>
                  <br><br><br><br><br><br><br><br><br>
              </body>
              </html>
              """);

        rootRecap.getChildren().add(webViewRecap);

//        Button nextButton16 = createNextButton();
//        rootRecap.getChildren().add(nextButton16);
//
//        Button homeButton16= createHomeButton();
//        VBox.setMargin(homeButton16,new Insets(-850,0,0,0));
//        rootRecap.getChildren().add(homeButton16);
//        homeButton16.setOnAction(e -> primaryStage.setScene(scene));

        //<i class="fa-solid fa-list-check"></i>

        FontAwesomeIconView goToTest =new FontAwesomeIconView(FontAwesomeIcon.LIST);
        goToTest.setGlyphSize(20);
        Button goToExamButton =new Button("Testează-ți \ncunoștințele");
        goToExamButton.setGraphic(goToTest);
        goToExamButton.setPrefSize(150,150);
        VBox.setMargin(goToExamButton,new Insets(-260,0,0,790));
        rootRecap.getChildren().add(goToExamButton);

//        Button homeButton16= createHomeButton();
//        VBox.setMargin(homeButton16,new Insets(-850,0,0,0));
//        rootRecap.getChildren().add(homeButton16);
//        homeButton16.setOnAction(e -> primaryStage.setScene(scene));

        //exam
        VBox rootExam =new VBox();
        Scene exam =new Scene(rootExam,900,650);
        goToExamButton.setOnAction(e->primaryStage.setScene(exam));

        WebView webViewExam = new WebView();
        webViewExam.setMinWidth(900);
        webViewExam.setMinHeight(850);

        WebEngine engineExam = webViewExam.getEngine();
        engineExam.loadContent("""
            <html>
            <head>
                <script type="text/javascript" async\s
                    src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                <script type="text/javascript" id="MathJax-script" async\s
                    src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                <style>
                    body {
                        font-family: 'Arial', sans-serif;
                        text-align: center;
                        padding: 20px;
                        background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                        background-size: cover;
                        background-position: center;
                        background-repeat: no-repeat;
                        background-attachment: fixed;
                    }
                    .container {
                        width: 80%%;
                        max-width: 600px;
                        background: white;
                        padding: 20px;
                        border-radius: 15px;
                        box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                        margin: auto;
                        margin-bottom: 30px;
                    }
                    h1 {
                        font-size: 28px;
                        color: #2C3E50;
                    }
                    .question {
                        font-size: 22px;
                        font-weight: bold;
                        margin-bottom: 15px;
                    }
                    .options label {
                        display: block;
                        font-size: 20px;
                        background: #f0f8ff;
                        padding: 10px;
                        border-radius: 8px;
                        margin: 8px 0;
                        cursor: pointer;
                        transition: 0.3s;
                    }
                    .button {
                           position: relative;
                           display: inline-block;
                           margin: 20px;
                         }
                    .button a {
                      color: white;
                      font-family: Helvetica, sans-serif;
                      font-weight: bold;
                      font-size: 20px;
                      text-align: center;
                      text-decoration: none;
                      background-color: #3498DB;
                      display: block;
                      position: relative;
                      padding: 10px 20px;
                      -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
                      text-shadow: 0px 1px 0px #000;
                      filter: dropshadow(color=#000, offx=0px, offy=1px);
                      -webkit-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      -moz-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                      -webkit-border-radius: 5px;
                      -moz-border-radius: 5px;
                      border-radius: 5px;
                      transition: background-color 0.3s;
                    }
                
                    .button a:hover {
                      background-color: #1f78b4;
                    }
                
                    .button a:active {
                      top: 6px;
                      background-color: #1f78b4;
                      -webkit-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                      -moz-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                      box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                    }
                
                    #result {
                        text-align: center;
                        font-size: 20px;
                        font-weight: bold;
                        margin-top: 15px;
                    }
                </style>
            </head>
            <body>
                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                  <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                  Test: Numere complexe
                  <dotlottie-player src="https://lottie.host/86eee004-f8e7-4058-ae15-be36ba8ed075/lDkQ56QcqH.lottie"
                  background="transparent"
                  speed="1"
                  style="width: 150px; height: 150px"
                  loop autoplay
                  ></dotlottie-player>
                </h1>
                </div>
                <div class="container">
                    <p class="question">Calculați (a+bi)(a-bi)</p>
                    <div class="options">
                    <label><input type="radio" name="q0" value="$$ a^2 + 2abi + b^2 $$" data-correct="false">$$ a^2 + 2abi + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 + b^2 $$" data-correct="true">$$ a^2 + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 - 2abi + b^2 $$" data-correct="false">$$ a^2 - 2abi + b^2 $$</label>
                    <label><input type="radio" name="q0" value="$$ a^2 - b^2 $$" data-correct="false">$$ a^2 - b^2 $$</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Partea reală a numărului complex z=2-4i este:</p>
                    <div class="options">
                    <label><input type="radio" name="q1" value="4" data-correct="false">4</label>
                    <label><input type="radio" name="q1" value="i" data-correct="false">i</label>
                    <label><input type="radio" name="q1" value="-4" data-correct="false">-4</label>
                    <label><input type="radio" name="q1" value="2" data-correct="true">2</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Partea imaginară a numărului complex z=-5+i este:</p>
                    <div class="options">
                    <label><input type="radio" name="q2" value="-5" data-correct="false">-5</label>
                    <label><input type="radio" name="q2" value="5" data-correct="false">5</label>
                    <label><input type="radio" name="q2" value="1" data-correct="true">1</label>
                    <label><input type="radio" name="q2" value="i" data-correct="false">i</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Care este partea imaginară a numărului z=(3+2i)+(6-2i)?</p>
                    <div class="options">
                    <label><input type="radio" name="q3" value="i" data-correct="false">i</label>
                    <label><input type="radio" name="q3" value="0" data-correct="true">0</label>
                    <label><input type="radio" name="q3" value="2i" data-correct="false">2i</label>
                    <label><input type="radio" name="q3" value="2" data-correct="false">2</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Calculeaza \\[
                              \\frac{3i+1}{2+i}
                              \\]</p>
                    <div class="options">
                    <label><input type="radio" name="q4" value="1+i" data-correct="true">1+i</label>
                    <label><input type="radio" name="q4" value="2+i" data-correct="false">2+i</label>
                    <label><input type="radio" name="q4" value="-i-2" data-correct="false">-i-2</label>
                    <label><input type="radio" name="q4" value="1-i" data-correct="false">1-i</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Dacă înmulțim un număr complex cu conjugatul său, obținem</p>
                    <div class="options">
                    <label><input type="radio" name="q5" value="0" data-correct="false">0</label>
                    <label><input type="radio" name="q5" value="Pătratul modulului său" data-correct="true">Pătratul modulului său</label>
                    <label><input type="radio" name="q5" value="Modulul său" data-correct="false">Modulul său</label>
                    <label><input type="radio" name="q5" value="Partea reală" data-correct="false">Partea reală</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Care dintre aceste propoziții este falsă?</p>
                    <div class="options">
                    <label><input type="radio" name="q6" value="Partea reală este notată cu Re(z)" data-correct="false">Partea reală este notată cu Re(z)</label>
                    <label><input type="radio" name="q6" value="$$ i^2=-1 $$" data-correct="false">$$ i^2=-1 $$</label>
                    <label><input type="radio" name="q6" value="Partea imaginară este notată cu Im(z)" data-correct="false">Partea imaginară este notată cu Im(z)</label>
                    <label><input type="radio" name="q6" value="Axa Oy este axa reală" data-correct="true">Axa Oy este axa reală</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Conversia între forme se face cu ajutorul formulei:</p>
                    <div class="options">
                    <label><input type="radio" name="q7" value="\\( a = |z| \\cos \\theta \\)" data-correct="true">\\( a = |z| \\cos \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = z \\cos \\theta \\)" data-correct="false">\\( a = z \\cos \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = |z| \\sin \\theta \\)" data-correct="false">\\( a = |z| \\sin \\theta \\)</label>
                    <label><input type="radio" name="q7" value="\\( a = z \\sin \\theta \\)" data-correct="false">\\( a = z \\sin \\theta \\)</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Rezolvă în mulțimea numerelor complexe $$5x^2+6x+2=0$$</p>
                    <div class="options">
                    <label><input type="radio" name="q8" value="1" data-correct="false">1+i</label>
                    <label><input type="radio" name="q8" value="2" data-correct="false">2/3+i</label>
                    <label><input type="radio" name="q8" value="Nu există soluții" data-correct="false">Nu există soluții</label>
                    <label><input type="radio" name="q8" value="-3/5-i/5" data-correct="true">-3/5-i/5</label>
                    </div>
                </div>
                <div class="container">
                    <p class="question">Când delta este negativă:</p>
                    <div class="options">
                    <label><input type="radio" name="q9" value="Nu există deloc soluții" data-correct="false">Nu există deloc soluții</label>
                    <label><input type="radio" name="q9" value="Nu există soluții reale" data-correct="true">Nu există soluții reale</label>
                    <label><input type="radio" name="q9" value="Nu există soluții complexe" data-correct="false">Nu există soluții complexe</label>
                    <label><input type="radio" name="q9" value="Nu putem afla soluțiile" data-correct="false">Nu putem afla soluțiile</label>
                    </div>
                </div>
                <div ontouchstart="">
                  <div class="button" onclick="checkAnswers()">
                    <a href="#">Verifică răspunsurile</a>
                  </div>
                </div>
                <p id="result"></p>
                <br><br><br><br><br><br><br><br><br><br>
                <script>
                    function checkAnswers() {
                        let correct=0;
                        for (let i = 0; i < 10; i++) {
                            const selected = document.querySelector('input[name="q' + i + '"]:checked');
                            if (selected && selected.dataset.correct === "true") {
                                correct++;
                            }
                        }
                        const resultContainer = document.getElementById("result");
                
                        if (correct === 10) {
                            resultContainer.innerHTML = `
                                <p style="font-size: 24px; color: green;">Felicitări! Ai răspuns corect la toate întrebările!</p>
                                <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                                <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                                <dotlottie-player
                                    src="https://lottie.host/b295a587-bbab-4628-af17-126f3dac5096/PZVNGSOhhw.lottie"
                                    background="transparent"
                                    speed="1"
                                    style="width: 300px; height: 300px"
                                    loop
                                    autoplay>
                                </dotlottie-player>
                                </h1></div>
                            `;
                        } else {
                            resultContainer.textContent = "Ai obținut " + correct + " / 10";
                        }
                    }
                </script>
            </body>
            </html>
            """);

        rootExam.getChildren().add(webViewExam);

        Button homeButtonExam=createHomeButton();
        VBox.setMargin(homeButtonExam,new Insets(-860,0,0,0));
        rootExam.getChildren().add(homeButtonExam);
        homeButtonExam.setOnAction(e -> primaryStage.setScene(scene));
        //\cdot
        //exam

        //delta neg
        VBox rootDeltaNeg=new VBox();
        Scene deltaNeg=new Scene(rootDeltaNeg,900,650);
        nextButtonForDelta.setOnAction(e->primaryStage.setScene(deltaNeg));

        WebView webViewDeltaNeg = new WebView();
        webViewDeltaNeg.setMinWidth(900);
        webViewDeltaNeg.setMinHeight(850);

        WebEngine engineDeltaNeg = webViewDeltaNeg.getEngine();
        engineDeltaNeg.loadContent("""
                <html>
                    <head>
                        <script type="text/javascript" async\s
                            src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                        <script type="text/javascript" id="MathJax-script" async\s
                            src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                        <script src="https://unpkg.com/@dotlottie/player-component@2.7.12/dist/dotlottie-player.mjs" type="module"></script>
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalBiblioteca.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            .container {
                                width: 80%%;
                                max-width: 600px;
                                background: white;
                                padding: 20px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                margin-bottom: 30px;
                            }
                            h1 {
                                font-size: 28px;
                                color: #FFFFFF;
                            }
                            .text {
                                font-size: 22px;
                                margin-bottom: 15px;
                            }
                        </style>
                    </head>
                    <body>
                    <h1>Te-ai întrebat vreodată ce se întâmplă atunci când delta este mai mică decât zero?</h1>
                    <div class="container">
                        <p class="text">Poate că ți s-a spus că „nu există soluții reale”... dar asta nu înseamnă că nu există soluții!\nSă luăm un exemplu</p>
                            <div style="display: flex; justify-content: center; align-items: center; gap: 10px;">
                            <h1 style="margin: 0; display: flex; align-items: center; gap: 10px;">
                        <dotlottie-player src="https://lottie.host/15f7e60f-d056-4c59-9f35-0ea007b66898/fmlLb6Lbwe.lottie"
                        background="transparent"
                        speed="1"
                        style="width: 150px; height: 150px"
                        loop autoplay
                        ></dotlottie-player>
                        </h1></div>
                    </div>
                    <div class="container">
                        <p class="text">$$2x^2+2x+5=0$$</p>
                    </div>
                    <div class="container">
                        <p class="text">$$a=2$$ \n $$b=2$$ \n $$c=5$$ \n $$Δ = b^2-4ac = 2^2 - 4 \\cdot 2 \\cdot 5 = 4 - 40 = -36$$</p>
                    </div>
                    <div class="container">
                        <p class="text">Știm că $$i^2=-1$$ deci \n $$Δ=-36=36 \\cdot i^2$$ \n $$ \\sqrt(Δ) = \\sqrt(36 \\cdot i^2) = 6 \\cdot i$$</p>
                    </div>
                    <div class="container">
                        <p class="text">$$x_1 = \\frac{-b+\\sqrt(Δ)}{2 \\cdot a}=\\frac{-2+6i}{4}=\\frac{-2}{4}+\\frac{6}{4}\\cdot i =$$ \n $$= \\frac{-1}{2}+\\frac{3}{2}\\cdot i$$</p>
                        <p class="text">$$x_2 = \\frac{-b-\\sqrt(Δ)}{2 \\cdot a}=\\frac{-2-6i}{4}=\\frac{-2}{4}+\\frac{-6}{4}\\cdot i =$$ \n $$= \\frac{-1}{2}+\\frac{-3}{2}\\cdot i$$</p>
                    </div>
                    <br><br><br><br><br><br><br><br><br><br>
                    </body>
                    </html>
        """);

        rootDeltaNeg.getChildren().add(webViewDeltaNeg);
        Button homeButtonDeltaNeg= createHomeButton();
        VBox.setMargin(homeButtonDeltaNeg,new Insets(-750,0,0,0));
        rootDeltaNeg.getChildren().add(homeButtonDeltaNeg);
        homeButtonDeltaNeg.setOnAction(e -> primaryStage.setScene(scene));

        //delta neg

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

//        Label coordonatePunctApasat=new Label("Selectează un punct pentru\n a îi vedea coordonatele");
//        coordonatePunctApasat.setFont(Font.font("Arial",14));
//        coordonatePunctApasat.setStyle(
//                "-fx-border-color: #0007D1; " +
//                        "-fx-border-width: 2; " +
//                        "-fx-border-radius: 10; " +
//                        "-fx-background-color: white; " +
//                        "-fx-background-radius: 10;"
//        );



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

//                        node.setOnMouseClicked(event -> {
//                            coordonatePunctApasat.setFont(Font.font("Arial",24));
//                            coordonatePunctApasat.setText("z = " + a + " + " + b + "i");
//                        });
                    }
                });
            } catch (Exception e){

            }
        });
        rootGrafic.getChildren().add(zGrafic);
        rootGrafic.getChildren().add(inputAGrafic);
        rootGrafic.getChildren().add(inputBGrafic);
        rootGrafic.getChildren().add(transformInGrafic);
//        VBox.setMargin(coordonatePunctApasat,new Insets(-500,0,0,700));
//        rootGrafic.getChildren().add(coordonatePunctApasat);


        FontAwesomeIconView homeIcon9 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon9.setGlyphSize(40);
        Button homeButton9 = new Button("");
        homeButton9.setGraphic(homeIcon9);
        homeButton9.setPrefSize(100,50);
        VBox.setMargin(homeButton9,new Insets(-550,0,0,800));
        rootGrafic.getChildren().add(homeButton9);
        homeButton9.setOnAction(e -> primaryStage.setScene(scene));
        //grafic

        //aplicatii in geometrie1
        VBox rootAplicatiiGeo=new VBox();
        Scene sceneAplicatiiGeo=new Scene(rootAplicatiiGeo,900,650);
        button5.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo));

        WebView webViewAplicatiiGeo = new WebView();
        webViewAplicatiiGeo.setMinWidth(900);
        webViewAplicatiiGeo.setMinHeight(850);

        WebEngine engineAplicatiiGeo = webViewAplicatiiGeo.getEngine();
        engineAplicatiiGeo.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                            <ul>
                                <li>
                                    Afixul mijlocului unui segment AB:
                                    <div class="formula-box">\\( z = \\frac{Z_A + Z_B}{2} \\)</div>
                                </li>
                                <li>
                                    Afixul centrului de greutate \\( G \\) al unui triunghi ABC:
                                    <div class="formula-box">\\( Z_G = \\frac{Z_A + Z_B + Z_C}{3} \\)</div>
                                </li>
                                <li>
                                    Punctele \\( M_1, M_2, M_3, M_4 \\) sunt vârfurile unui paralelogram dacă și numai dacă:
                                    <div class="formula-box">\\( Z_1 + Z_3 = Z_2 + Z_4 \\)</div>
                                    deoarece diagonalele \\( M_1M_3 \\) și \\( M_2M_4 \\) au același mijloc.
                                </li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        rootAplicatiiGeo.getChildren().add(webViewAplicatiiGeo);

        Button nextButtonInAplicatiiGeo=createNextButton();
        rootAplicatiiGeo.getChildren().add(nextButtonInAplicatiiGeo);

//        Button backButtonInAplicatiiGeo=createBackButton();
//        rootAplicatiiGeo.getChildren().add(backButtonInAplicatiiGeo);

        Button homeButtonInAplicatiiGeo=createHomeButton();
        rootAplicatiiGeo.getChildren().add(homeButtonInAplicatiiGeo);
        homeButtonInAplicatiiGeo.setOnAction(e->primaryStage.setScene(scene));

        //aplicatii in geometrie 2
        VBox rootAplicatiiGeo2=new VBox();
        Scene sceneAplicatiiGeo2=new Scene(rootAplicatiiGeo2,900,650);
        nextButtonInAplicatiiGeo.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo2));

        WebView webViewAplicatiiGeo2 = new WebView();
        webViewAplicatiiGeo2.setMinWidth(900);
        webViewAplicatiiGeo2.setMinHeight(850);

        WebEngine engineAplicatiiGeo2 = webViewAplicatiiGeo2.getEngine();
        engineAplicatiiGeo2.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .title {
                                font-size: 30px;
                                color: #000000;
                                margin-bottom: 20px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                        <div class="title">Distanțe</div>
                            <ul>
                                <li>Distanța dintre 2 puncte A și B: <span class="math">\\[ AB = |Z_A - Z_B| = |Z_B - Z_A| \\]</span></li>
                                <li>Mulțimea punctelor \\( M(z) \\) pentru care \\( |z - a| = r \\), unde \\( a \\in \\mathbb{C} \\) și \\( r \\in \\mathbb{R}_+^* \\), este un cerc cu centrul în \\( A(a) \\) și rază \\( r \\).</li>
                                <li>Fiind date două puncte A și B, mulțimea punctelor \\( M(z) \\) care satisfac relația \\( |z - Z_A| = |z - Z_B| \\), este mediatoarea segmentului AB.</li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        rootAplicatiiGeo2.getChildren().add(webViewAplicatiiGeo2);

        Button nextButtonInAplicatiiGeo2=createNextButton();
        rootAplicatiiGeo2.getChildren().add(nextButtonInAplicatiiGeo2);

        Button backButtonInAplicatiiGeo2=createBackButton();
        rootAplicatiiGeo2.getChildren().add(backButtonInAplicatiiGeo2);
        backButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo));

        Button homeButtonInAplicatiiGeo2=createHomeButton();
        rootAplicatiiGeo2.getChildren().add(homeButtonInAplicatiiGeo2);
        homeButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(scene));

        //aplicatii in geometrie 3
        VBox rootAplicatiiGeo3=new VBox();
        Scene sceneAplicatiiGeo3=new Scene(rootAplicatiiGeo3,900,650);
        nextButtonInAplicatiiGeo2.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo3));

        WebView webViewAplicatiiGeo3 = new WebView();
        webViewAplicatiiGeo3.setMinWidth(900);
        webViewAplicatiiGeo3.setMinHeight(850);

        WebEngine engineAplicatiiGeo3 = webViewAplicatiiGeo3.getEngine();
        engineAplicatiiGeo3.loadContent("""
                    <html lang="ro">
                    <head>
                        <meta charset="UTF-8">
                        <style>
                            body {
                                font-family: 'Arial', sans-serif;
                                text-align: center;
                                padding: 20px;
                                background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                                background-size: cover;
                                background-position: center;
                                background-repeat: no-repeat;
                                background-attachment: fixed;
                            }
                            h1 {
                                font-size: 32px;
                                margin-bottom: 25px;
                            }
                            .title {
                                font-size: 30px;
                                color: #000000;
                                margin-bottom: 20px;
                            }
                            .container {
                                width: 80%;
                                max-width: 700px;
                                background: white;
                                padding: 30px;
                                border-radius: 15px;
                                box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                                margin: auto;
                                text-align: left;
                            }
                            ul {
                                list-style-type: disc;
                                padding-left: 20px;
                            }
                            li {
                                font-size: 20px;
                                margin-bottom: 25px;
                            }
                            .formula-box {
                                margin-top: 8px;
                                padding: 10px;
                                border: 2px solid #0007D1;
                                border-radius: 8px;
                                background-color: #fff;
                                display: inline-block;
                                font-size: 22px;
                            }
                        </style>
                        <script type="text/javascript" id="MathJax-script" async
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                    </head>
                    <body>
                        <h1>Aplicații ale numerelor complexe în geometrie</h1>
                        <div class="container">
                        <div class="title">Unghiuri</div>
                            <ul>
                                <li>
                                    Fie \\( A, B, C \\) cu afixele \\( z_A, z_B, z_C \\), atunci unghiul dintre vectorii \\( \\vec{AB} \\) și \\( \\vec{AC} \\) este:
                                    <span class="math"> \\( \\measuredangle(\\vec{AB}, \\vec{AC}) = \\arg \\left( \\frac{z_C - z_A}{z_B - z_A} \\right) \\)</span>
                                </li>
                                <li>
                                    Dacă \\( \\frac{z_C - z_A}{z_B - z_A} \\in \\mathbb{R} \\), atunci punctele \\( A, B, C \\) sunt coliniare.
                                </li>
                                <li>
                                    Dacă \\( \\frac{z_A - z_B}{z_C - z_D} \\in \\mathbb{R}^* \\), atunci punctele \\( A, B, C, D \\) se află pe drepte perpendiculare: \\( AB \\perp CD \\).
                                </li>
                                <li>
                                    Dacă raportul
                                    <span class="math">\\( \\frac{z_A - z_C}{z_B - z_D} : \\frac{z_A - z_D}{z_B - z_C} \\in \\mathbb{R} \\)</span>
                                    atunci punctele \\( A, B, C, D \\) sunt conciclice sau coliniare, iar unghiurile \\( \\angle ACB \\) și \\( \\angle ADB \\) sunt egale sau suplementare.
                                </li>
                            </ul>
                        </div>
                    </body>
                    </html>
        """);
        rootAplicatiiGeo3.getChildren().add(webViewAplicatiiGeo3);

//        Button nextButtonInAplicatiiGeo3=createNextButton();
//        rootAplicatiiGeo3.getChildren().add(nextButtonInAplicatiiGeo3);

        Button backButtonInAplicatiiGeo3=createBackButton();
        VBox.setMargin(backButtonInAplicatiiGeo3,new Insets(-250,0,0,0));
        rootAplicatiiGeo3.getChildren().add(backButtonInAplicatiiGeo3);
        backButtonInAplicatiiGeo3.setOnAction(e->primaryStage.setScene(sceneAplicatiiGeo2));

        Button homeButtonInAplicatiiGeo3=createHomeButton();
        rootAplicatiiGeo3.getChildren().add(homeButtonInAplicatiiGeo3);
        homeButtonInAplicatiiGeo3.setOnAction(e->primaryStage.setScene(scene));



        //aplicatii in geometrie

        primaryStage.setTitle("Educational software");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public WebView createQuestion(String text, String[] options, String correctOption) {
        WebView webViewQuestion = new WebView();
//        webViewExam.setMinWidth(900);
//        webViewExam.setMinHeight(850);
        webViewQuestion.setMinWidth(900);
        webViewQuestion.setMinHeight(850);

        WebEngine engineQuestion = webViewQuestion.getEngine();

        StringBuilder optionsArray = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            optionsArray.append("\"").append(options[i]).append("\"");
            if (i < options.length - 1) optionsArray.append(",");
        }

        String content = """
            <html>
            <head>
                <style>
                    body {
                        font-family: 'Arial', sans-serif;
                        text-align: center;
                        padding: 20px;
                        background-image: url('file:/C:/Users/iulica/Desktop/fundalS.jpg');
                        background-size: 100%% 100%%;
                        background-position: center;
                    }
                    .container {
                        width: 80%%;
                        max-width: 600px;
                        background: white;
                        padding: 20px;
                        border-radius: 15px;
                        box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.2);
                        margin: auto;
                    }
                    h1 {
                        font-size: 28px;
                        color: #2C3E50;
                    }
                    .question {
                        font-size: 22px;
                        font-weight: bold;
                        margin-bottom: 15px;
                    }
                    .options label {
                        display: block;
                        font-size: 20px;
                        background: #f0f8ff;
                        padding: 10px;
                        border-radius: 8px;
                        margin: 8px 0;
                        cursor: pointer;
                        transition: 0.3s;
                    }
                    .options label:hover {
                        background: #d4eaff;
                    }
                    .button {
                           position: relative;
                           display: inline-block;
                           margin: 20px;
                         }
                
                         .button a {
                           color: white;
                           font-family: Helvetica, sans-serif;
                           font-weight: bold;
                           font-size: 20px;
                           text-align: center;
                           text-decoration: none;
                           background-color: #3498DB;
                           display: block;
                           position: relative;
                           padding: 10px 20px;
                           -webkit-tap-highlight-color: rgba(0, 0, 0, 0);
                           text-shadow: 0px 1px 0px #000;
                           filter: dropshadow(color=#000, offx=0px, offy=1px);
                           -webkit-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                           -moz-box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                           box-shadow: inset 0 1px 0 #FFE5C4, 0 6px 0 #1f78b4;
                           -webkit-border-radius: 5px;
                           -moz-border-radius: 5px;
                           border-radius: 5px;
                           transition: background-color 0.3s;
                         }
                
                         .button a:hover {
                           background-color: #1f78b4;
                         }
                
                         .button a:active {
                           top: 6px;
                           background-color: #1f78b4;
                           -webkit-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                           -moz-box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                           box-shadow: inset 0 1px 0 #FFE5C4, inset 0 -3px 0 #1f78b4;
                         }
                
                         .button:after {
                           content: "";
                           height: 100%%;
                           width: 100%%;
                           padding: 4px;
                           position: absolute;
                           bottom: -12px;
                           left: -4px;
                           z-index: -1;
                           background-color: #2B1800;
                           -webkit-border-radius: 5px;
                           -moz-border-radius: 5px;
                           border-radius: 5px;
                         }
                    #result {
                        font-size: 22px;
                        font-weight: bold;
                        margin-top: 15px;
                    }
                    .correct {
                        color: green;
                    }
                    .wrong {
                        color: red;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Exerciții: Numere complexe</h1>
                    <p class="question" id="question-text"></p>
                    <div class="options" id="options-container"></div>
                    <div ontouchstart="">
                      <div class="button" onclick="checkAnswer()">
                        <a href="#">Verifică răspunsul</a>
                      </div>
                    </div>
                    <p id="result"></p>
                </div>
                <script>
                    const question = {
                        text: "%s",
                        options: [%s],
                        correctOption: "%s"
                    };
                    document.getElementById("question-text").textContent = question.text;
                    const optionsContainer = document.getElementById("options-container");
                    question.options.forEach(option => {
                        const label = document.createElement("label");
                        label.innerHTML = `<input type="radio" name="answer" value="${option}"> ${option}`;
                        optionsContainer.appendChild(label);
                    });
                    function checkAnswer() {
                        const selected = document.querySelector("input[name='answer']:checked");
                        const result = document.getElementById("result");
                        if (!selected) {
                            result.textContent = "Selectează un răspuns!";
                            result.className = "wrong";
                            return;
                        }
                        if (selected.value === question.correctOption) {
                            result.textContent = "Corect!";
                            result.className = "correct";
                        } else {
                            result.textContent = "Mai încearcă!";
                            result.className = "wrong";
                        }
                    }
                </script>
            </body>
            </html>
            """.formatted(text, optionsArray.toString(), correctOption);

        engineQuestion.loadContent(content);
        return webViewQuestion;
    }

    public Button createNextButton(){
        FontAwesomeIconView nextIcon =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon.setGlyphSize(30);
        Button nextButton =new Button();
        nextButton.setGraphic(nextIcon);
        nextButton.setPrefSize(80,50);
        VBox.setMargin(nextButton,new Insets(-250,0,0,85));
        return nextButton;
    }

    public Button createBackButton(){
        FontAwesomeIconView backIcon =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_LEFT);
        backIcon.setGlyphSize(30);
        Button backButton =new Button();
        backButton.setGraphic(backIcon);
        backButton.setPrefSize(80,50);
        VBox.setMargin(backButton,new Insets(-50,0,0,0));
        return backButton;
    }

    public Button createHomeButton(){
        FontAwesomeIconView homeIcon =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon.setGlyphSize(30);
        Button homeButton = new Button("");
        homeButton.setGraphic(homeIcon);
        homeButton.setPrefSize(80,40);
        VBox.setMargin(homeButton,new Insets(-660,0,0,0));
        return homeButton;
    }
}