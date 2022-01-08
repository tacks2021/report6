package jp.ac.uryukyu.ie.e215737;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * ウィンドウクラス。ウィンドウに関する設定を行う。
 */

public class Window extends JFrame  {
    /**
     * コンストラクタ。ウィンドウに関する設定を行う。
     */
    public Window() {
        super("title");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
