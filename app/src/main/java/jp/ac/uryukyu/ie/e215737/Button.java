package jp.ac.uryukyu.ie.e215737;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ボタンクラス。ボタンに関する設定を行う。
 */

public class Button extends JFrame implements ActionListener {

    /**
     * コンストラクタ。ボタンのサイズや画面の色といった設定を行う。
     */

    Button() {
        
        getContentPane().setLayout(null);
        JButton btn = new JButton("button");
        btn.setBounds(130,130,420,200);
        btn.setFont(new Font("HiraMinProN-W3", Font.ITALIC, 20));
        btn.addActionListener(this);
        getContentPane().add(btn);

    }

    /**
     * コンストラクタ。ボタンを押した際に出てくる文字を設定。
     */

    public void actionPerformed(ActionEvent e) {
        System.out.println("pushed button");
    }
    
}