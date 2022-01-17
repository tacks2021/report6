package jp.ac.uryukyu.ie.e215737;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * パネルクラス。
 * パネルとパネルに必要なボタンに関する設定を行う。
 */

public class Panel extends JPanel implements ActionListener {

    /**
     * ボタンパネル。
     * ボタンを設置するためのパネル。
     */
    JPanel buttonPanel;

    /**
     * ウインドウ。
     * パネルを貼るためのウインドウ。
     * ウインドウクラスから来ている。
     */
    Window window;

    //行数、列数
    /**
     * 列数。
     * 変えてはいけないためfinal変数で数を固定。
     */
    private final int HEIGHT = 4;

    /**
     * 行数。
     * 変えてはいけないためfinal変数で数を固定。
     */
    private final int WIDTH = 3;
    
    /**
     * ランダムリスト
     * 文字列をランダムにしたリスト。
     */
    String[] RandomList;

    /**
     * ボタン
     * ボタンを配列する。
     */
    JButton[][] buttons;

    /**
     * カードを扱うメソッド。
     * カードに関する設定を行う。
     */
    public void DealCards() {
        //ボタンパネルを生成
        buttonPanel = new JPanel(new GridLayout(HEIGHT, WIDTH));
        //カードを表示するためにボタンの配列を使用する
        buttons = new JButton[HEIGHT][WIDTH];
       
        
        for (int i = 0; i < HEIGHT * WIDTH; i++ ) {
            //ボタンを追加
            buttons[i / 4] = new JButton[4];
            buttons[i / 4][i % 4] = new JButton("-Card-" + (i + 1)); //カードを裏向きにする
            buttons[i / 4][i % 4].addActionListener(this);
            buttonPanel.add(buttons[i / 4][i % 4]);
        
        }

        
    }

    /**
     * アドパネルメソッド。
     * パネルにボタン（カード）をくっつける。
     */
    public void AddPanel() {
        //ボタンパネルをセンターに表示
        this.add(buttonPanel, BorderLayout.CENTER);
        Window window = new Window();
        window.pack();
        
    }

    /**
     * アクションパフォームメソッド。
     * ボタンを押した際に出てくる文字を設定。
     */

    public void actionPerformed(ActionEvent e) {
        
        System.out.println("pushed button");
        JOptionPane.showMessageDialog(null, "カードが開かれました");
        
    }

}