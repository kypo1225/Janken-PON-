//XMLを読み込むための起動処理を実装します。
//JavaFXの起動は、main処理で行います。

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//javafx.applicationパッケージにあるApplicationクラスを継承する必要があります。その中で、いつものmainメソッドと、Applicationクラスのstartメソッドが呼ばれます。
public class Main extends Application {
	@Override
	//startメソッド。アプリケーションを開始する際の処理を記載します。javafx.stageパッケージのStageクラスのインスタンスが引数として渡されます。
	//Stageクラス。最上位のJavaFXコンテナです。このStageの上でアプリケーションを組み立てていきます。	「枠」のようなものです。
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("Form.fxml"));
			Scene scene = new Scene(root, 500, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();//showメソッド。ウィンドウに表示を行うメソッドです。
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//JavaFXアプリケーションを起動するためのメソッド
	public static void main(String[] args) {
		launch(args);
	}
}

//Stage(枠)>Scene(台紙)>Paneレイアウト()>部品