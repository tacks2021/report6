package jp.ac.uryukyu.ie.e215737;

/**
 * 参考：https://github.com/OgasawaraRen/TETRIS.git
 */

/**
 * ゲームを大まかに設定しているクラス。このクラスを通してゲームが開始される。
 */

public class Game {
    
    Window window;
    Button button;

    /**
     * コンストラクタ。呼び出すことで実行される。
     */

    public Game() {

        initWindow();
        initButton();

    }

    /**
     * windowにパネルを追加、ここでさまざまな画面の指示を行う。
     */

    public void initWindow() {

        window = new Window();
        window.PreparePanels(); //ペインに貼るパネルのみを生成
        window.prepareComponents(); //その他のコンポーネントを生成
        //起動後最初に表示すべき画面を手前に持ってきてそれに注目させる
        window.setVisible(true); //最後にウインドウを可視化
        
    }

    /**
     * buttonにボタンを追加、ボタンのさまざまな指示をここで行う。
     */

    public void initButton() {
        
        button = new Button();

    }
}