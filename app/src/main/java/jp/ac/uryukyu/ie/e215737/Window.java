package jp.ac.uryukyu.ie.e215737;

import java.awt.*;

import javax.swing.JFrame;

/**
 * ウィンドウクラス。ウィンドウに関する設定を行う。
 */

public class Window extends JFrame {

    /**
     * コンストラクタ。ウィンドウのサイズや画面の色といった設定を行う。
     */

    private static final long serialVersionUID = 1L;
    //ウィンドウのサイズ(固定)
    final int WIDTH = 600;
    final int HEIGHT = 400;

    CardLayout layout = new CardLayout();

    Button button;

    public Window() {

         //ウィンドウのタイトル
        this.setTitle("report6");
         //ウィンドウを閉じるときの処理
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         //画面の拡大（戻すときは縮小）の処理
        this.setResizable(false);
         //画面背景の色の処理
        this.getContentPane().setBackground(Color.ORANGE);
        this.setLayout(layout); //サイズ設定
        //ウィンドウのサイズ
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.pack(); //自動サイズ調整
        this.setLocationRelativeTo(null); //起動後のスクリーンの位置を中央にもってくる
        
    }

    public void PreparePanels() {
        //パネルの準備
        button = new Button();
        this.add(button, "タイトル画面");
        
        this.pack();
    }

    //preparePanels()が呼ばれた後メインメソッドからさらに手動で呼び出す
    public void prepareComponents(){
        button.DealCards();
    }

    public void Button() {
    }
}
