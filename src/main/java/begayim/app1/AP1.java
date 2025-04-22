package begayim.app1;

public class AP1 {

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length-1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100){
                return true;
            }
        }
        return false;
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length-1; i++) {
            if (scores[i] < scores[i - 1]){
                return false;
            }
        }
        return true;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 1; i < words.length-1; i++) {
            if (words[i].length() == len){
                count++;
            }
        }
        return count;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length-1; i++) {
            if (   (scores[i+1] - scores[i] == 1) || (scores[i+1] - scores[i] == 2)  ){
                return true;
            }
        }
        return false;
    }
}
