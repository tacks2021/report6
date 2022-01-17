package jp.ac.uryukyu.ie.e215737;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * ボタンクラス。ボタンに関する設定を行う。
 */

public class Button extends JPanel implements ActionListener {

    /**
     * コンストラクタ。ボタンのサイズや画面の色等の設定を行う。
     */
    JPanel buttonPanel;
    JPanel panel;
    Window window;

    //行数、列数
    final int HEIGHT = 4;
    final int WIDTH = 3;
    
    boolean card_turning = true;

    //for文で用いる値の初期値
    int i = 0;

    //数字を一時的に保存
    int tmp;

    public void DealCards() {
        //ボタンをボタンパネルに貼り付け
        buttonPanel = new JPanel(new GridLayout(HEIGHT, WIDTH));
        panel = new JPanel();
        JButton[][] buttons = new JButton[HEIGHT][WIDTH]; // array of buttons used to represent cards
       
        
        for (int i = 0; i < HEIGHT * WIDTH; i++ ) {
            //ボタンを追加
            buttons[i / 4] = new JButton[4];
            buttons[i / 4][i % 4] = new JButton("-Match-"); // show face down
            buttons[i / 4][i % 4].addActionListener(this);
            buttonPanel.add(buttons[i / 4][i % 4]);
            
        
        
        //  //押下した際の表示処理
        // buttons.addActionListener(this);
        //  //ボタンを押下可能かの処理
        // buttons.setEnabled(true);
        
        }

        

        this.add(buttonPanel, BorderLayout.CENTER);
        
        Window window = new Window();
        window.getContentPane().add(panel, BorderLayout.CENTER);
        window.pack();
        
    }


    

    /**
     * コンストラクタ。ボタンを押した際に出てくる文字を設定。
     */

    public void actionPerformed(ActionEvent e) {
        
        System.out.println("pushed button");
        JOptionPane.showMessageDialog(null, "カードが開かれました");
        
    }




    
}