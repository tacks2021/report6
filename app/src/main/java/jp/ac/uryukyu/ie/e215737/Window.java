package jp.ac.uryukyu.ie.e215737;

import java.awt.*;

/**
 * ウィンドウクラス。ウィンドウに関する設定を行う。
 */

public class Window extends Button {

    /**
     * コンストラクタ。ウィンドウのサイズや画面の色といった設定を行う。
     */

    public Window() {

         //ウィンドウのタイトル
        setTitle("report6");
         //ウィンドウのサイズ
        setSize(1200, 900);
         //ウィンドウを閉じるときの処理
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         //スクリーンを画面中央に表示するときの処理        
        setLocationRelativeTo(null);
         //画面の拡大（戻すときは縮小）の処理
        setResizable(false);
         //画面表示の処理
        setVisible(true);
         //画面背景の色の処理
        Container container = getContentPane();
        container.setBackground(Color.ORANGE);
        
    }
}
