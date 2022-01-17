package jp.ac.uryukyu.ie.e215737;

/**
 * 参考：https: //github.com/OgasawaraRen/TETRIS.git
 */

/**
 * ゲームを大まかに設定しているクラス。このクラスを通してゲームが開始される。
 */
public class Game {
    
    /**
     * ウインドウ。
     * パネルを貼るためのウインドウ。
     * ウインドウクラスから来ている。
     */
    Window window;

    /**
     * パネル。
     * ウインドウに貼るためのパネル。
     * パネルクラスから来ている。
     */
    Panel panel;

    /**
     * コンストラクタ。呼び出すことで実行される。
     */
    public Game() {

        initWindow();
        initPanel();

    }

    /**
     * windowにパネルを追加。
     * ここでさまざまな画面の指示を行う。
     */
    public void initWindow() {
         //ウインドウを生成
        window = new Window();
         //ペインに貼るパネルのみを生成
        window.PreparePanels();
         //その他のコンポーネントを生成,起動後最初に表示すべき画面を手前に持ってきてそれに注目させる
        window.prepareComponents();
         //ウインドウを可視化
        window.setVisible(true);
        
    }

    /**
     * panelにボタンを追加。
     * ボタンのさまざまな指示をここで行う。
     */
    public void initPanel() {
         //パネルを生成
        panel = new Panel(); 

    }
}