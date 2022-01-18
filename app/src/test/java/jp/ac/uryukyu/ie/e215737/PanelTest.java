package jp.ac.uryukyu.ie.e215737;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * パネルテスト。
 * 神経衰弱を行う際に正しく混ぜられているかを確認し、その後綺麗に配列されているかをチェックする。
 * Swingでのテストは厳しいのでターミナル上でのテスト確認を行う。
 */
public class PanelTest {

    private final int HEIGHT = 4;
    private final int WIDTH = 3;

    @Test
    
    public void test() {
        List<Integer> list = new ArrayList<Integer>();
            for(int i = 0 ; i < HEIGHT * WIDTH ; i++){
                list.add(i);
                list.add(i);
            }

            System.out.println("リストを確認(シャッフル前)");
            System.out.println(list);

            Collections.shuffle(list);

            System.out.println("リストを確認(シャッフル後)");
            System.out.println(list);

            System.out.println("パネルを配置");
            int[][] panel = new int[HEIGHT][WIDTH];
            for (int x = 0; x < HEIGHT; x++) {
                for (int y = 0; y < WIDTH; y++) {
                    panel[x][y] = list.get(x * WIDTH + y);
                    System.out.printf("%2d[ %d ] ", x * HEIGHT + y, panel[x][y]);
            }
                System.out.println("");
        }
        //listとpanelが違うものであることを確認する
        assertNotSame(list, panel);
    }
}
