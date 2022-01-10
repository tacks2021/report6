package jp.ac.uryukyu.ie.e215737;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ボタンクラス。ボタンに関する設定を行う。
 */

public class Button extends JFrame implements ActionListener {

    /**
     * コンストラクタ。ボタンのサイズや画面の色等の設定を行う。
     */

    Button() {
        
        for (int i = 0; i < 40 ; i++ ) {

        //ボタンを追加
        JButton button = new JButton( "Button" + (i + 1) );  getContentPane().add(button);
         //ボタンに表示される文字の処理
        setFont(new Font("HiraMinProN-W3", Font.ITALIC, 20));
         //押下した際の表示処理
        button.addActionListener(this);
         //ボタンを押下可能かの処理
        button.setEnabled(true);
        
        }

        // 4行10列のグリッドレイアウトを設定
        setLayout(new GridLayout(4, 10));
        
        }

    

    /**
     * コンストラクタ。ボタンを押した際に出てくる文字を設定。
     */

    public void actionPerformed(ActionEvent e) {
        
        System.out.println("pushed button");
        JOptionPane.showMessageDialog(null, "ボタンが押されました。");
        
    }

}