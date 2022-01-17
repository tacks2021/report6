package jp.ac.uryukyu.ie.e215737;

import java.awt.*;

import javax.swing.JFrame;

/**
 * ウィンドウクラス。ウィンドウに関する設定を行う。
 */

public class Window extends JFrame {

    private static final long serialVersionUID = 1L;
    //ウィンドウのサイズ(固定)
    /**
     * ウインドウの幅。
     * 変えてはいけないためfinal変数で数を固定。
     */
    private final int WIDTH = 600;
    /**
     * ウインドウの高さ。
     * 変えてはいけないためfinal変数で数を固定。
     */
    private final int HEIGHT = 400;

    /**
     * レイアウト。
     * ここではサイズの設定をするために使用。
     */
    CardLayout layout = new CardLayout();
    
    /**
     * パネル。
     * パネルクラスから来ている。
     */
    Panel panel;

    /**
     * コンストラクタ。
     * ウインドウの設定を行う。
     */
    public Window() {

         //ウィンドウのタイトル
        this.setTitle("report6");
         //ウィンドウを閉じるときの処理
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         //画面の拡大（戻すときは縮小）の処理
        this.setResizable(false);
         //画面背景の色の処理
        this.getContentPane().setBackground(Color.ORANGE);
         //サイズ設定
        this.setLayout(layout);
         //ウィンドウのサイズ
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
         //自動でサイズを調整する
        this.pack();
         //起動後ウインドウの位置を中央にする
        this.setLocationRelativeTo(null);
        
    }

    /**
     * パネルを準備するメソッド。
     */
    public void PreparePanels() {
         //パネルを生成
        panel = new Panel();
        this.add(panel, "タイトル画面");
        this.pack();
    }
    /**
     * プリペアコンポーネントメソッド。
     * preparePanels()が呼ばれた後にメインメソッドからさらに手動で呼び出す。
     */
    public void prepareComponents(){
        panel.DealCards();
        panel.AddPanel();
    }

}
