package jp.ac.uryukyu.ie.e215737;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * パネルクラス。
 * パネルとパネルに必要なボタンに関する設定を行う。
 */

public class Panel extends JPanel {

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

    /**
     * 神経衰弱の詳細。
     * メモリーゲームクラスから来ている。
     */
    MemoryGame memoryGame;

    /**
     * ボタンリスナー
     * ボタンを押した際に指示を出す。
     */
    ButtonListener buttonListener;

    /**
     * カードメソッド。
     * カードの状態を示すためのもの。
     */
    public enum Card {
        TURN_OVER,
        FLIP,
    }

    /**
     * カードの初期状態。
     */
    Card Cardcheck = Card.FLIP;

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

    int i = 0;

    /**
     * カードを扱うメソッド。
     * カードに関する設定を行う。
     */
    public void DealCards() {
        //ボタンパネルを生成
        buttonPanel = new JPanel(new GridLayout(HEIGHT, WIDTH));
        //カードを表示するためにボタンの配列を使用する
        buttons = new JButton[HEIGHT][WIDTH];
        memoryGame = new MemoryGame();
        memoryGame.RandomCards();
        for (int i = 0; i < HEIGHT * WIDTH; i++ ) {
            //ボタンを追加
            if (i % 4 == 0)
            buttons[i / 4] = new JButton[4];
            buttons[i / 4][i % 4] = new JButton("-Card-" + (i + 1)); //カードを裏向きにする
            buttonPanel.add(buttons[i / 4][i % 4]);
            
        }
        
         //ボタンサイズを調整（何故か1, 1でウインドウにピッタリサイズのボタンが作れました）
        setLayout(new GridLayout(1, 1));
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
        //ボタンにリスナーをつける
        buttonListener = new ButtonListener();
        buttons[i / 4][i % 4].addActionListener(buttonListener);
        
    }

    /**
     * コンストラクタ。
     * ボタンを押した際に出てくる文字を設定。
     */

    private class ButtonListener implements ActionListener {
        

    @Override
    public void actionPerformed(ActionEvent event) {
        if((event.getSource() == buttons[i / 4][i % 4])) {
            if(Cardcheck == Card.FLIP) {
                Cardcheck = Card.TURN_OVER;
                buttons[i / 4][i % 4].setText("CardList");
            } else {
                Cardcheck = Card.FLIP;
                buttons[i / 4][i % 4].setText("Card");
                }
            }
        
        } 

    }

}