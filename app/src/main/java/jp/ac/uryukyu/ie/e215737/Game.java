package jp.ac.uryukyu.ie.e215737;

/**
 * ゲームを大まかに設定しているクラス。このクラスを通してゲームが開始される。
 */

public class Game {
    Window window;

    /**
     * コンストラクタ。呼び出すことで実行される。
     */

    public Game() {

        initGW();

    }

    /**
     * windowにパネルを追加、ここでさまざまな画面の指示を行う。
     */

    public void initGW() {

        window = new Window();
        window.setLayout(null);

    }

}