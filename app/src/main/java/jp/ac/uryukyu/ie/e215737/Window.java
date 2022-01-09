package jp.ac.uryukyu.ie.e215737;

/**
 * ウィンドウクラス。ウィンドウに関する設定を行う。
 */

public class Window extends Button {

    /**
     * コンストラクタ。ウィンドウのサイズや画面の色といった設定を行う。
     */

    public Window() {
        setTitle("report6");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
