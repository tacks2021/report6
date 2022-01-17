package jp.ac.uryukyu.ie.e215737;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * メモリーゲームクラス
 * 神経衰弱のルールの詳細を記述
 */
public class MemoryGame {

    /**
     * パネル。
     * パネルクラスから来ている。
     */
    Panel panel;

    /**
     * ランダムリスト。
     * カードをランダムにしてリストにする
     */
    String[] RandomList;

    /**
     * カードリスト。
     * カードとして扱う数字を並べている
     */
    String[] CardList = { "1", "1", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6"};

    /**
     * ランダムカードメソッド
     * カードをランダムにするメソッド
     */
    public void RandomCards() {
        List<String> list = Arrays.asList(CardList);
        Collections.shuffle(list);
        RandomList = list.toArray(new String[list.size()]);
    }

    

    
}
