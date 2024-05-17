package cs208.oj8;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class t2_data {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(200000) + 1;
        n=200000;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            list.add(i);
        }
        // 随机打乱List中的元素
        Collections.shuffle(list);
        try (FileWriter writer = new FileWriter("random_list.txt")) {
            writer.write(n+"\n");
            for (Integer i : list) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

