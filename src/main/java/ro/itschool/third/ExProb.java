package ro.itschool.third;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ExProb {

    public static WebView createQuestion(String text, String[] options, String correctOption) {
        WebView webViewQuestion = new WebView();
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

}
