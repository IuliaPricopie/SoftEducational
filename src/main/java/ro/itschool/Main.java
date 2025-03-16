package ro.itschool;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Application;
import javafx.geometry.Insets;
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
    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Bun venit în lumea matematicii!");
        label1.setFont(Font.font("Arial Black",35));
        label1.setWrapText(true);
        label1.setMaxWidth(640);

        VBox root = new VBox();
        VBox.setMargin(label1,new Insets(0,0,0,150));
        root.getChildren().add(label1);

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
        engineDef.loadContent(
                "<html>" +
                        "<head>" +
                        "  <script type='text/javascript' async " +
                        "    src='https://polyfill.io/v3/polyfill.min.js?features=es6'></script>" +
                        "  <script type='text/javascript' id='MathJax-script' async " +
                        "    src='https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js'></script>" +
                        "  <style>" +
                        "    body { font-family: Arial, sans-serif; font-size: 22px; text-align: center; padding: 20px; }" +
                        "    h1 { font-size: 36px; margin-bottom: 20px; }" +
                        "    .center { font-size: 40px; font-weight: bold; margin-top: 30px; }" +
                        "    .subtext { font-size: 24px; margin-top: 10px; font-style: italic; }" +
                        "    .container { display: flex; justify-content: center; flex-wrap: wrap; gap: 100px; margin-top: 20px; }" + // Am redus margin-top la 20px
                        "    .box { width: 320px; padding: 15px; font-size: 22px; text-align: center; border-radius: 10px; box-shadow: 3px 3px 10px rgba(0, 0, 0, 0.1); }" +
                        "    .box1 { background-color: #88C3CF; }" +
                        "    .box2 { background-color: #FBDCDA; }" +
                        "    .box3 { background-color: #F3EFAF; margin-top: 20px; }" + // Am scăzut margin-top-ul
                        "  </style>" +
                        "</head>" +
                        "<body>" +
                        "  <h1>Să aflăm ce este un număr complex!</h1>" +
                        "  <p><b>DEFINIȚIE:</b> Un număr complex este o extensie a numerelor reale, definit ca o pereche ordonată de numere reale \\((a, b)\\).</p>" +
                        "  <div class='center'> \\( z = a + b i \\) </div>" +
                        "  <p class='subtext'>unde \\( a, b \\in \\mathbb{R} \\) și \\( i^2 = -1 \\).</p>" +
                        "  <p class='subtext'>Această formă se numește <b>forma algebrică</b> a unui număr complex.</p>" +
                        "  <div class='container'>" +
                        "    <div class='box box1'> \\( a \\) → Partea reală: notată \\( \\operatorname{Re}(z) \\) </div>" +
                        "    <div class='box box2'> \\( b \\) → Partea imaginară: notată \\( \\operatorname{Im}(z) \\) </div>" +
                        "  </div>" +
                        "  <div class='container'>" +
                        "    <div class='box box3'> \\( i \\) → Unitatea imaginară, definită prin relația \\( i^2 = -1 \\) </div>" +
                        "  </div>" +
                        "</body></html>"
        );
        webViewDef.setPrefHeight(1200);
        VBox.setMargin(webViewDef, new Insets(10, 0, 0, 0));
        root2.getChildren().add(webViewDef);

        Scene sceneInfo=new Scene(root2,900,650);

        Label lb=new Label(" \n \n  \n");
        root2.getChildren().add(lb);


        FontAwesomeIconView homeIcon =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon.setGlyphSize(40);
        Button homeButton = new Button();
        homeButton.setGraphic(homeIcon);
        homeButton.setPrefSize(100,60);
        VBox.setMargin(homeButton,new Insets(-40,0,0,50));
        homeButton.setLayoutX(10);
        homeButton.setLayoutY(10);
        root2.getChildren().add(homeButton);
//        FontAwesomeIconView test =new FontAwesomeIconView(FontAwesomeIcon.HOME);
//        test.setGlyphSize(40);
//        Button test2 = new Button();
//        test2.setGraphic(test);
//        test2.setPrefSize(100,60);
//        VBox.setMargin(test2,new Insets(-40,0,0,50));
//        test2.setLayoutX(10);
//        test2.setLayoutY(10);
//        root2.getChildren().add(test2);


        FontAwesomeIconView nextIcon =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon.setGlyphSize(40);
        Button nextButton=new Button();
        nextButton.setGraphic(nextIcon);
        nextButton.setPrefSize(100, 60);
//        nextButton.setLayoutX(600);
//        nextButton.setLayoutY(450);
        VBox.setMargin(nextButton,new Insets(-100,0,0,800));
        root2.getChildren().add(nextButton);
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
                                    <h1>Reprezentarea Geometrică</h1>
                                   \s
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
        webViewReprGeo.setPrefHeight(1200);
        VBox.setMargin(webViewReprGeo, new Insets(10, 0, 0, 0));
        rootReprGeo.getChildren().add(webViewReprGeo);

        Scene reprezentareGeometrica=new Scene(rootReprGeo,900, 650);
        nextButton.setOnAction(e -> primaryStage.setScene(reprezentareGeometrica));

        FontAwesomeIconView nextIcon2 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon2.setGlyphSize(40);
        Button nextButton2=new Button();
        nextButton2.setGraphic(nextIcon2);
        nextButton2.setPrefSize(100,60);
        VBox.setMargin(nextButton2,new Insets(150,0,0,0));
        rootReprGeo.getChildren().add(nextButton2);
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
                                                    background-color: #F6F6F6;
                                                    padding: 40px;
                                                }
                                                h1 {
                                                    font-size: 36px;
                                                    font-weight: bold;
                                                    color: #2C3E50;
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
                                                    background-color: #C6E393;
                                                }
                                                .modul {
                                                    background-color: #FFC6CE;
                                                }
                                                .conjugat {
                                                    background-color: #8FE3D6;
                                                }
                                                .title {
                                                    font-size: 26px;
                                                    font-weight: bold;
                                                    color: #2C3E50;
                                                    text-align: center;
                                                    margin-bottom: 20px;
                                                }
                                                .formula {
                                                    font-size: 22px;
                                                    color: #34495E;
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
                                                .button {
                                                    width: 120px;
                                                    padding: 10px;
                                                    font-size: 18px;
                                                    border-radius: 8px;
                                                    border: none;
                                                    background-color: #2C3E50;
                                                    color: white;
                                                    cursor: pointer;
                                                    display: block;
                                                    margin: 10px auto;
                                                }
                                                .button:hover {
                                                    background-color: #1A252F;
                                                }
                                                .result {
                                                    font-size: 20px;
                                                    font-weight: bold;
                                                    color: #2C3E50;
                                                    text-align: center;
                                                    margin-top: 10px;
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
                                                    <button class="button" onclick="calculateModul()">Calculează</button>
                                                    <div class="result" id="resultModul">Modulul: </div>
                                                </div>
                
                                                <!-- Coloana Conjugatului -->
                                                <div class="column conjugat">
                                                    <div class="title">Conjugatul unui număr complex</div>
                                                    <div class="formula">$$ \\overline{z} = a - b i $$</div>
                                                   \s
                                                    <input class="input-box" id="inputAConj" type="number" placeholder="Introduceți a">
                                                    <input class="input-box" id="inputBConj" type="number" placeholder="Introduceți b">
                                                    <button class="button" onclick="calculateConjugat()">Calculează</button>
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
        webViewModulConjugat.setPrefHeight(1200);
        VBox.setMargin(webViewModulConjugat, new Insets(10, 0, 0, 0));
        rootModulConj.getChildren().add(webViewModulConjugat);

        Scene modulConj=new Scene(rootModulConj,900, 650);
        nextButton2.setOnAction(e -> primaryStage.setScene(modulConj));

        FontAwesomeIconView homeIcon3 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon3.setGlyphSize(40);
        Button homeButton3 = new Button("");
        homeButton3.setGraphic(homeIcon3);
        homeButton3.setPrefSize(100,50);
        VBox.setMargin(homeButton3,new Insets(-1100,0,0,800));
        rootModulConj.getChildren().add(homeButton3);
        homeButton3.setOnAction(e -> primaryStage.setScene(scene));

        FontAwesomeIconView nextIcon3 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon3.setGlyphSize(40);
        Button nextButton3=new Button();
        nextButton3.setGraphic(nextIcon3);
        nextButton3.setPrefSize(100,60);
        VBox.setMargin(nextButton3,new Insets(550,0,0,800));
        rootModulConj.getChildren().add(nextButton3);
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
                                     <style>
                                         body {
                                             font-family: Arial, sans-serif;
                                             background-color: #F6F6F6;
                                             padding: 40px;
                                             font-size: 16px;
                                         }
                                         h1 {
                                             font-size: 35px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .container {
                                             display: flex;
                                             justify-content: space-between;
                                             gap: 50px;
                                         }
                                         .column {
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #C6E393;
                                         }
                                         .adunare {
                                             background-color: #FFC6CE;
                                         }
                                         .scadere {
                                             background-color: #8FE3D6;
                                         }
                                         .title {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .formula {
                                             font-size: 35px;
                                             color: #34495E;
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
                                         .button {
                                             width: 300px;
                                             padding: 18px;
                                             font-size: 28px;
                                             border-radius: 8px;
                                             border: none;
                                             background-color: #2C3E50;
                                             color: white;
                                             cursor: pointer;
                                             display: block;
                                             margin: 10px auto;
                                         }
                                         .button:hover {
                                             background-color: #1A252F;
                                         }
                                         .result {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-top: 10px;
                                             gap: 20px;
                                         }
                                         .button-container {
                                             display: flex;
                                             justify-content: center;
                                             align-items: center;
                                             gap: 20px;
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <h1>Operații cu Numere Complexe</h1>
                                           \s
                                            <div class="container">
                                                <div class="column adunare">
                                                    <div class="title">Suma a două numere complexe</div>
                                                        <p style="text-align: center; font-size: 16px;">
                                                            \\[
                                                            z_1 + z_2 = (a + bi) + (c + di) = (a + c) + (b + d)i
                                                            \\]
                                                        </p>
                                                        <div class="input-container">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="a" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="b" placeholder="b" class="input-box">
                                                            <span>i</span> 
                                                        </div>
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="c" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="d" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <center><button onclick="calculateSum()">Calculează</button></center>
                                                        <div class="result" id="sumResult">Rezultat: </div>
                                                    </div>
                                                </div>
                
                                                <div class="column scadere">
                                                    <div class="title">Diferența dintre două numere complexe</div>
                                                        <p style="text-align: center; font-size: 16px;">
                                                            \\[
                                                            z_1 - z_2 = (a + bi) - (c + di) = (a - c) + (b - d)i
                                                            \\]
                                                        </p>
                                                    <div class="input-container">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="aS" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="bS" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="cS" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="dS" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                             <center><button onclick="calculateSub()">Calculează</button></center>
                                                             <div class="result" id="subResult">Rezultat: </div>
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
        webViewAdunareScadere.setPrefHeight(1200);
        VBox.setMargin(webViewAdunareScadere, new Insets(-50, 0, 0, 0));
        rootOperatii.getChildren().add(webViewAdunareScadere);

        FontAwesomeIconView homeIcon4 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon4.setGlyphSize(40);
        Button homeButton4 = new Button("");
        homeButton4.setGraphic(homeIcon4);
        homeButton4.setPrefSize(100,50);
        VBox.setMargin(homeButton4,new Insets(-1100,0,0,800));
        rootOperatii.getChildren().add(homeButton4);
        homeButton4.setOnAction(e -> primaryStage.setScene(scene));

        FontAwesomeIconView nextIcon4 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon4.setGlyphSize(40);
        Button nextButton4 =new Button();
        nextButton4.setGraphic(nextIcon4);
        nextButton4.setPrefSize(100,60);
        VBox.setMargin(nextButton4,new Insets(550,0,0,800));
        rootOperatii.getChildren().add(nextButton4);
        //adunare & scadere - operatii 1

        //inmultirea - operatii2 - trebuie facuta impartirea!!!!!!!!!!!!!!!!!!!!!!!!!
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
                                     <style>
                                         body {
                                             font-family: Arial, sans-serif;
                                             background-color: #F6F6F6;
                                             padding: 40px;
                                             font-size: 16px;
                                         }
                                         h1 {
                                             font-size: 35px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .container {
                                             display: flex;
                                             justify-content: space-between;
                                             gap: 50px;
                                         }
                                         .column {
                                             width: 95%;
                                             padding: 20px;
                                             border-radius: 15px;
                                             box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.2);
                                             background-color: #C6E393;
                                         }
                                         .inmultire {
                                             background-color: #FFC6CE;
                                         }
                                         .impartire {
                                             background-color: #8FE3D6;
                                         }
                                         .title {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-bottom: 20px;
                                         }
                                         .formula {
                                             font-size: 35px;
                                             color: #34495E;
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
                                         .button {
                                             width: 300px;
                                             padding: 18px;
                                             font-size: 28px;
                                             border-radius: 8px;
                                             border: none;
                                             background-color: #2C3E50;
                                             color: white;
                                             cursor: pointer;
                                             display: block;
                                             margin: 10px auto;
                                         }
                                         .button:hover {
                                             background-color: #1A252F;
                                         }
                                         .result {
                                             font-size: 25px;
                                             font-weight: bold;
                                             color: #2C3E50;
                                             text-align: center;
                                             margin-top: 10px;
                                             gap: 20px;
                                         }
                                         .button-container {
                                             display: flex;
                                             justify-content: center;
                                             align-items: center;
                                             gap: 20px;
                                         }
                                     </style>
                                 </head>
                                 <body>
                                 <h1>Operații cu Numere Complexe</h1>
                                           \s
                                            <div class="container">
                                                <div class="column inmultire">
                                                    <div class="title">Produsul a două numere complexe</div>
                                                        <p style="text-align: center; font-size: 16px;">
                                                            \\[
                                                            z_1 \\cdot z_2 = (a + bi) \\cdot (c + di) = (ac - bd) + (ad + bc)i
                                                            \\]
                                                        </p>
                                                        <div class="input-container">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="a" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="b" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="c" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="d" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <div class="input-container">
                                                        <center><button onclick="calculateSum()"><p style="text-align: center; font-size: 16px;">Calculează</p></button></center>
                                                        <div class="result" id="sumResult">Rezultat: </div>
                                                        </div>
                                                    </div>
                                                </div>
                
                                                <div class="column impartire">
                                                    <div class="title">Împărțirea a două numere complexe</div>
                                                    <p style="text-align: center; font-size: 16px;">
                                                        \\[
                                                        \\frac{z_1}{z_2} = \\frac{(a+bi)}{(c+di)} = \\frac{(a+bi)(c-di)}{c^2 + d^2} = \\frac{(ac-bd)+(ad+bc)i}{c^2 + d^2} =
                                                        \\]
                                                    </p>
                                                    <p style="text-align: center; font-size: 16px;">
                                                        \\[
                                                        = \\frac{ac-bd}{c^2 + d^2} + \\frac{(ad+bc)}{c^2 + d^2}i
                                                        \\]
                                                    </p>
                                                    <div class="input-container">
                                                        <div class="input-group">
                                                            <span>\\( z_1 \\) = </span>
                                                            <input type="number" id="aS" placeholder="a" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="bS" placeholder="b" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        <div class="input-group">
                                                            <span>\\( z_2 \\) = </span>
                                                            <input type="number" id="cS" placeholder="c" class="input-box">
                                                            <span>+</span>
                                                            <input type="number" id="dS" placeholder="d" class="input-box">
                                                            <span>i</span>
                                                        </div>
                                                        </div>
                                                        <br>
                                                        <div class="input-container">
                                                             <center><button onclick="calculateSub()"><p>Calculează</p></button></center>
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
                                    document.getElementById('sumResult').innerText = `Rezultat: ${(a * c - b * d)} + ${(a * d + b * c)}i`;
                                }
                                function calculateSub() {
                                    let a = parseFloat(document.getElementById('aS').value) || 0;
                                    let b = parseFloat(document.getElementById('bS').value) || 0;
                                    let c = parseFloat(document.getElementById('cS').value) || 0;
                                    let d = parseFloat(document.getElementById('dS').value) || 0;
                                    let denominator = c * c + d * d;
                                    document.getElementById('subResult').innerText = `Rezultat: ${(a * c - b * d) / denominator} + ${(a * d + b * c) / denominator}i`;
                                }
                            </script>
                        </body>
                        </html>"""
        );
        webViewInmImp.setPrefHeight(1200);
        VBox.setMargin(webViewInmImp, new Insets(-50, 0, 0, 0));
        rootOperatii2.getChildren().add(webViewInmImp);

        FontAwesomeIconView homeIcon5=new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon5.setGlyphSize(40);
        Button homeButton5 = new Button("");
        homeButton5.setGraphic(homeIcon5);
        homeButton5.setPrefSize(100,50);
        VBox.setMargin(homeButton5,new Insets(-1100,0,0,800));
        rootOperatii2.getChildren().add(homeButton5);
        homeButton5.setOnAction(e -> primaryStage.setScene(scene));

        FontAwesomeIconView nextIcon5 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon5.setGlyphSize(40);
        Button nextButton5 =new Button();
        nextButton5.setGraphic(nextIcon5);
        nextButton5.setPrefSize(100,60);
        VBox.setMargin(nextButton5,new Insets(550,0,0,800));
        rootOperatii2.getChildren().add(nextButton5);
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
        webView.setMaxWidth(900);
        webView.setPrefHeight(850);

        WebEngine engine = webView.getEngine();
        engine.loadContent(
                """
                        <html lang="ro">
                               <head>
                                   <script type="text/javascript" async src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                                   <script type="text/javascript" id="MathJax-script" async\s
                                       src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
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
                                           gap: 15px;
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
                                       .section:hover {
                                           transform: scale(1.02);
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
                        
                                   <h1>Forma Trigonometrică</h1>
                        
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

        VBox.setMargin(webView, new Insets(-50, 0, 0, 0));
        rootFormaTrig.getChildren().add(webView);


        FontAwesomeIconView homeIcon6 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon6.setGlyphSize(40);
        Button homeButton6 = new Button("");
        homeButton6.setGraphic(homeIcon6);
        homeButton6.setPrefSize(100,50);
        VBox.setMargin(homeButton6,new Insets(-800,0,0,800));
        rootFormaTrig.getChildren().add(homeButton6);
        homeButton6.setOnAction(e -> primaryStage.setScene(scene));

        FontAwesomeIconView nextIconForFormaTrig2 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIconForFormaTrig2.setGlyphSize(40);
        Button nextButtonForFormaTrig2 =new Button();
        nextButtonForFormaTrig2.setGraphic(nextIconForFormaTrig2);
        nextButtonForFormaTrig2.setPrefSize(100,60);
        VBox.setMargin(nextButtonForFormaTrig2,new Insets(565,0,0,800));
        rootFormaTrig.getChildren().add(nextButtonForFormaTrig2);
        //forma trigonometrică : la proprietati!!!!!!!!!!!!

        //forma trigonometrica2
        VBox rootFormaTrig2 =new VBox();
        Scene formaTrig2=new Scene(rootFormaTrig2,890,650);
        nextButtonForFormaTrig2.setOnAction(e->primaryStage.setScene(formaTrig2));
//        Label titluFormaTrig2=new Label("Forma trigonometrică");
//        titluFormaTrig2.setFont(Font.font("Arial Black",45));
//        VBox.setMargin(titluFormaTrig2,new Insets(0,0,0,180));
//        rootFormaTrig2.getChildren().add(titluFormaTrig);
        WebView webView2 = new WebView();
        webView2.setMaxWidth(900);
        webView2.setPrefHeight(700);

        WebEngine engine2 = webView2.getEngine();
        engine2.loadContent(
                """
                        <html>
                        <head>
                            <script type="text/javascript" async src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
                            <script type="text/javascript" id="MathJax-script" async\s
                                src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
                            <style>
                                /* Fundal pastelat */
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
                        
                                /* Container principal */
                                .container {
                                    width: 90%;
                                    max-width: 800px;
                                }
                        
                                /* Casete stilizate */
                                .section {
                                    background-color: rgba(255, 255, 255, 0.8);
                                    border-radius: 15px;
                                    padding: 15px;
                                    margin-bottom: 15px;
                                    box-shadow: 3px 3px 8px rgba(0, 0, 0, 0.1);
                                    transition: transform 0.3s ease-in-out;
                                }
                        
                                .section:hover {
                                    transform: scale(1.02);
                                }
                        
                                /* Titluri */
                                .section-title {
                                    font-size: 22px;
                                    font-weight: bold;
                                    color: #2C3E50;
                                    margin-bottom: 8px;
                                }
                        
                                /* Titlu mare */
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
                        
                            <h1>Proprietăți ale Formei Trigonometrice</h1>
                        
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
                        
                        </body>
                        </html>"""
        );
        VBox.setMargin(webView2, new Insets(-35, 0, 0, 0));
        rootFormaTrig2.getChildren().add(webView2);

        FontAwesomeIconView homeIconFormaTrig =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIconFormaTrig.setGlyphSize(40);
        Button homeButtonFormaTrig = new Button("");
        homeButtonFormaTrig.setGraphic(homeIconFormaTrig);
        homeButtonFormaTrig.setPrefSize(100,50);
        VBox.setMargin(homeButtonFormaTrig,new Insets(-680,0,0,800));
        rootFormaTrig2.getChildren().add(homeButtonFormaTrig);
        homeButtonFormaTrig.setOnAction(e -> primaryStage.setScene(scene));

        //forma trigonometrica2

        //butoane pagina principala
        Button button1=new Button("   Ce este un \nnumăr complex?");
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

        Button button2=new Button("Exemple rezolvate");
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

        Button button3 =new Button("    Exerciții \n și probleme");
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

        Button button4 =new Button(" Reprezentare \n      grafică");
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


        //butoane pagina principala

        //probleme rezolvate1
        VBox rootProbRez1 =new VBox();
        Scene probRez1=new Scene(rootProbRez1,900,650);
        button2.setOnAction(e->primaryStage.setScene(probRez1));
        Label titluProbRez1 =new Label("Probleme rezolvate");
        titluProbRez1.setFont(Font.font("Arial Black",45));
        Image rez1Image=new Image("file:/C:/Users/iulica/Desktop/rezolvare1.jpg");
        ImageView rez1ImageView=new ImageView(rez1Image);
        rez1ImageView.setFitHeight(650);
        rez1ImageView.setFitWidth(900);
        rootProbRez1.getChildren().add(rez1ImageView);
        VBox.setMargin(titluProbRez1,new Insets(-650,0,0,230));
        rootProbRez1.getChildren().add(titluProbRez1);

        FontAwesomeIconView nextIcon7 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon7.setGlyphSize(40);
        Button nextButton7 =new Button();
        nextButton7.setGraphic(nextIcon7);
        nextButton7.setPrefSize(100,60);
        VBox.setMargin(nextButton7,new Insets(523,0,0,800));
        rootProbRez1.getChildren().add(nextButton7);

        FontAwesomeIconView homeIcon7 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon7.setGlyphSize(40);
        Button homeButton7 = new Button("");
        homeButton7.setGraphic(homeIcon7);
        homeButton7.setPrefSize(100,50);
        VBox.setMargin(homeButton7,new Insets(-650,0,0,800));
        rootProbRez1.getChildren().add(homeButton7);
        homeButton7.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate1

        //probleme rezolvate2
        VBox rootProbRez2 =new VBox();
        Scene probRez2 =new Scene(rootProbRez2,900,650);
        nextButton7.setOnAction(e->primaryStage.setScene(probRez2));
        Label titluProbRez2 =new Label("Probleme rezolvate");
        titluProbRez2.setFont(Font.font("Arial Black",45));
        Image rez2Image =new Image("file:/C:/Users/iulica/Desktop/rezolvare2.jpg");
        ImageView rez2ImageView =new ImageView(rez2Image);
        rez2ImageView.setFitHeight(650);
        rez2ImageView.setFitWidth(900);
        rootProbRez2.getChildren().add(rez2ImageView);
        VBox.setMargin(titluProbRez2,new Insets(-650,0,0,230));
        rootProbRez2.getChildren().add(titluProbRez2);

//        FontAwesomeIconView nextIcon8 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
//        nextIcon8.setGlyphSize(40);
//        Button nextButton8 =new Button();
//        nextButton8.setGraphic(nextIcon8);
//        nextButton8.setPrefSize(100,60);
//        VBox.setMargin(nextButton8,new Insets(523,0,0,800));
//        rootProbRez2.getChildren().add(nextButton8);

        FontAwesomeIconView homeIcon8 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon8.setGlyphSize(40);
        Button homeButton8 = new Button("");
        homeButton8.setGraphic(homeIcon8);
        homeButton8.setPrefSize(100,50);
        VBox.setMargin(homeButton8,new Insets(-50,0,0,800));//-650
        rootProbRez2.getChildren().add(homeButton8);
        homeButton8.setOnAction(e -> primaryStage.setScene(scene));
        //probleme rezolvate2

        //exercitii si probleme
        VBox rootEx=new VBox();
        Scene exercitii=new Scene(rootEx,900,650);
        button3.setOnAction(e->primaryStage.setScene(exercitii));

        WebView webViewQuestion1 = new WebView();
        webViewQuestion1.setMaxWidth(900);
        webViewQuestion1.setPrefHeight(700);

        WebEngine engineQuestion1 = webViewQuestion1.getEngine();
        engineQuestion1.loadContent(
                """
                        <html>
                        <head>
                            <style>
                                body {
                                    font-family: 'Arial', sans-serif;
                                    background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                    text-align: center;
                                    padding: 20px;
                                }
                                .container {
                                    width: 80%;
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
                            <div class="container">
                                <h1>Exerciții: Numere complexe</h1>
                                <p class="question" id="question-text"></p>
                                <div class="options" id="options-container">
                                </div>
                                <button class="check-btn" onclick="checkAnswer()">Verifică răspunsul</button>
                                <p id="result"></p>
                            </div>
                            <script>
                                const question = {
                                    text: "Un număr complex are forma",
                                    options: ["a-bi", "a+b+i", "a+bi", "ab+i"],
                                    correctOption: "a+bi"
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
                    """
        );
        //VBox.setMargin(webViewQuestion1, new Insets(0, 0, 0, 0));
        rootEx.getChildren().add(webViewQuestion1);

//        Question intrebare1=new Question("Un număr complex are forma",List.of("a-bi","a+b+i","a+bi","ab+i"),"a+bi");
//        createQuestion(intrebare1, rootEx);

        FontAwesomeIconView nextIcon10 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon10.setGlyphSize(40);
        Button nextButton10 =new Button();
        nextButton10.setGraphic(nextIcon10);
        nextButton10.setPrefSize(100,60);
        VBox.setMargin(nextButton10,new Insets(-125,0,0,800));
        rootEx.getChildren().add(nextButton10);

        FontAwesomeIconView homeIcon10 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon10.setGlyphSize(40);
        Button homeButton10 = new Button("");
        homeButton10.setGraphic(homeIcon10);
        homeButton10.setPrefSize(100,50);
        VBox.setMargin(homeButton10,new Insets(-620,0,0,800));
        rootEx.getChildren().add(homeButton10);
        homeButton10.setOnAction(e -> primaryStage.setScene(scene));

        VBox rootEx2=new VBox();
        Scene exercitii2=new Scene(rootEx2,900,650);
        nextButton10.setOnAction(e->primaryStage.setScene(exercitii2));
        button3.setOnAction(e->primaryStage.setScene(exercitii));

        WebView webViewQuestion2 = new WebView();
        webViewQuestion2.setMaxWidth(900);
        webViewQuestion2.setPrefHeight(700);

        WebEngine engineQuestion2 = webViewQuestion2.getEngine();
        engineQuestion2.loadContent(
                """
                        <html>
                        <head>
                            <style>
                                body {
                                    font-family: 'Arial', sans-serif;
                                    background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                    text-align: center;
                                    padding: 20px;
                                }
                                .container {
                                    width: 80%;
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
                            <div class="container">
                                <h1>Exerciții: Numere complexe</h1>
                                <p class="question" id="question-text"></p>
                                <div class="options" id="options-container">
                                </div>
                                <button class="check-btn" onclick="checkAnswer()">Verifică răspunsul</button>
                                <p id="result"></p>
                            </div>
                            <script>
                                const question = {
                                    text: "Adunați z=2+3i și w=4-i",
                                    options: ["4+i","7-i","6+2i","6-2i"],
                                    correctOption: "6+2i"
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
                    """
        );
        //VBox.setMargin(webViewQuestion2, new Insets(0, 0, 0, 0));
        rootEx2.getChildren().add(webViewQuestion2);

//        Question intrebare2=new Question("Adunați z=2+3i și w=4-i",List.of("4+i","7-i","6+2i","6-2i"),"6+2i");
//        createQuestion(intrebare2,rootEx2);

        FontAwesomeIconView nextIcon11 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon11.setGlyphSize(40);
        Button nextButton11 =new Button();
        nextButton11.setGraphic(nextIcon11);
        nextButton11.setPrefSize(100,60);
        VBox.setMargin(nextButton11,new Insets(-125,0,0,800));
        rootEx2.getChildren().add(nextButton11);

        FontAwesomeIconView homeIcon11 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon11.setGlyphSize(40);
        Button homeButton11 = new Button("");
        homeButton11.setGraphic(homeIcon11);
        homeButton11.setPrefSize(100,50);
        VBox.setMargin(homeButton11,new Insets(-620,0,0,800));
        rootEx2.getChildren().add(homeButton11);
        homeButton11.setOnAction(e -> primaryStage.setScene(scene));

        VBox rootEx3=new VBox();
        Scene exercitii3=new Scene(rootEx3,900,650);
        nextButton11.setOnAction(e->primaryStage.setScene(exercitii3));
        button3.setOnAction(e->primaryStage.setScene(exercitii));

        WebView webViewQuestion3 = new WebView();
        webViewQuestion3.setMaxWidth(900);
        webViewQuestion3.setPrefHeight(700);

        WebEngine engineQuestion3 = webViewQuestion3.getEngine();
        engineQuestion3.loadContent(
                """
                        <html>
                        <head>
                            <style>
                                body {
                                    font-family: 'Arial', sans-serif;
                                    background: linear-gradient(135deg, #FFDEE9, #B5FFFC);
                                    text-align: center;
                                    padding: 20px;
                                }
                                .container {
                                    width: 80%;
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
                            <div class="container">
                                <h1>Exerciții: Numere complexe</h1>
                                <p class="question" id="question-text"></p>
                                <div class="options" id="options-container">
                                </div>
                                <button class="check-btn" onclick="checkAnswer()">Verifică răspunsul</button>
                                <p id="result"></p>
                            </div>
                            <script>
                                const question = {
                                    text: "Scădeți z=6+3i și w=4-i",
                                    options: ["2+2i","2-i","2-4i","2+4i"],
                                    correctOption: "2+4i"
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
                    """
        );
        //VBox.setMargin(webViewQuestion3, new Insets(0, 0, 0, 0));
        rootEx3.getChildren().add(webViewQuestion3);

//        Question intrebare3=new Question("Scădeți z=6+3i și w=4-i",List.of("2+2i","2-i","2-4i","2+4i"),"2+4i");
//        createQuestion(intrebare3,rootEx3);

        FontAwesomeIconView nextIcon12 =new FontAwesomeIconView(FontAwesomeIcon.ARROW_CIRCLE_RIGHT);
        nextIcon12.setGlyphSize(40);
        Button nextButton12 =new Button();
        nextButton12.setGraphic(nextIcon12);
        nextButton12.setPrefSize(100,60);
        VBox.setMargin(nextButton12,new Insets(-125,0,0,800));
        rootEx3.getChildren().add(nextButton12);

        FontAwesomeIconView homeIcon12 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon12.setGlyphSize(40);
        Button homeButton12 = new Button("");
        homeButton12.setGraphic(homeIcon12);
        homeButton12.setPrefSize(100,50);
        VBox.setMargin(homeButton12,new Insets(-620,0,0,800));
        rootEx3.getChildren().add(homeButton12);
        homeButton12.setOnAction(e -> primaryStage.setScene(scene));




        //exercitii si probleme


        //grafic
        VBox rootGrafic=new VBox();
        Scene grafic=new Scene(rootGrafic,900,650);
        button4.setOnAction(e->primaryStage.setScene(grafic));
        Label titluGrafic=new Label("     Reprezentarea geometrică \n        a numerelor complexe");
        titluGrafic.setFont(Font.font("Arial Black",35));
        VBox.setMargin(titluGrafic,new Insets(0,0,0,100));
        rootGrafic.getChildren().add(titluGrafic);

        Label zGrafic =new Label("z=         +         *i");
        zGrafic.setFont(Font.font("Arial",30));
        VBox.setMargin(zGrafic,new Insets(25,0,0,250));
        TextField inputAGrafic =new TextField();
        TextField inputBGrafic =new TextField();
        inputAGrafic.setMaxWidth(50);
        inputAGrafic.setMinHeight(50);
        inputAGrafic.setPromptText("a");
        inputAGrafic.setStyle("-fx-font-size: 25");
        VBox.setMargin(inputAGrafic,new Insets(-45,0,0,300));
        inputBGrafic.setMaxWidth(50);
        inputBGrafic.setMinHeight(50);
        inputBGrafic.setPromptText("b");
        inputBGrafic.setStyle("-fx-font-size: 25");
        VBox.setMargin(inputBGrafic,new Insets(-52,0,0,400));

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
                XYChart.Series<Number,Number> puncte=new XYChart.Series<>();
                puncte.getData().add(new XYChart.Data<>(Integer.parseInt(inputAGrafic.getText()),Integer.parseInt(inputBGrafic.getText())));
                scatterChart.getData().add(puncte);
            } catch (Exception e){

            }
        });
        rootGrafic.getChildren().add(zGrafic);
        rootGrafic.getChildren().add(inputAGrafic);
        rootGrafic.getChildren().add(inputBGrafic);
        rootGrafic.getChildren().add(transformInGrafic);

        FontAwesomeIconView homeIcon9 =new FontAwesomeIconView(FontAwesomeIcon.HOME);
        homeIcon9.setGlyphSize(40);
        Button homeButton9 = new Button("");
        homeButton9.setGraphic(homeIcon9);
        homeButton9.setPrefSize(100,50);
        VBox.setMargin(homeButton9,new Insets(-570,0,0,800));
        rootGrafic.getChildren().add(homeButton9);
        homeButton9.setOnAction(e -> primaryStage.setScene(scene));
        //grafic

        primaryStage.setTitle("Educational software");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    private void createQuestion(Question intrebare1, VBox rootEx) {
//        Label titluEx =new Label("Exerciții");
//        titluEx.setFont(Font.font("Arial Black",50));
//        VBox.setMargin(titluEx,new Insets(0,0,0,350));
//
//        Label textIntr1 =new Label(intrebare1.getText());
//        textIntr1.setFont(Font.font("Arial",35));
//        VBox.setMargin(textIntr1,new Insets(30,0,0,100));
//
//        RadioButton option1=new RadioButton(intrebare1.getOptions().get(0));
//        RadioButton option2=new RadioButton(intrebare1.getOptions().get(1));
//        RadioButton option3=new RadioButton(intrebare1.getOptions().get(2));
//        RadioButton option4=new RadioButton(intrebare1.getOptions().get(3));
//        option1.setFont(Font.font("Arial",35));
//        VBox.setMargin(option1,new Insets(50,0,0,100));
//        option2.setFont(Font.font("Arial",35));
//        VBox.setMargin(option2,new Insets(50,0,0,100));
//        option3.setFont(Font.font("Arial",35));
//        VBox.setMargin(option3,new Insets(50,0,0,100));
//        option4.setFont(Font.font("Arial",35));
//        VBox.setMargin(option4,new Insets(50,0,0,100));
//        ToggleGroup optionsGroup=new ToggleGroup();
//        option1.setToggleGroup(optionsGroup);
//        option2.setToggleGroup(optionsGroup);
//        option3.setToggleGroup(optionsGroup);
//        option4.setToggleGroup(optionsGroup);
//        Label corectSauGresit=new Label("");
//        corectSauGresit.setFont(Font.font("Arial",35));
//        VBox.setMargin(corectSauGresit,new Insets(-50,0,0,450));
//        optionsGroup.selectToggle(null);
//
//        Button verify=new Button("Verifică!");
//        verify.setFont(Font.font("Arial",35));
//        VBox.setMargin(verify,new Insets(20,0,0,200));
//        verify.setOnAction(e->{
//            if (optionsGroup.getSelectedToggle()==null) {
//                corectSauGresit.setText("Selectează un răspuns!");
//            }else{
//                RadioButton selectOption = (RadioButton) optionsGroup.getSelectedToggle();
//                String selectText = selectOption.getText();
//                if (intrebare1.getCorrectOption() == selectText) {
//                    corectSauGresit.setText("Corect!");
//                } else corectSauGresit.setText("Mai încearcă!");
//            }
//
//        });
//
//        rootEx.getChildren().add(titluEx);
//        rootEx.getChildren().add(textIntr1);
//        rootEx.getChildren().add(option1);
//        rootEx.getChildren().add(option2);
//        rootEx.getChildren().add(option3);
//        rootEx.getChildren().add(option4);
//        rootEx.getChildren().add(verify);
//        rootEx.getChildren().add(corectSauGresit);
////        rootEx.getChildren().addAll(titluEx,textIntr1,option1,option2,option3,option4,corectSauGresit,verify);
//    }

    public static void main(String[] args) {
        launch(args);
    }

}