package rano.logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (!isMorning) {
            return true;
        } else if (isMom) {
            return true;
        } else {
            return false;
        }
    }
}


