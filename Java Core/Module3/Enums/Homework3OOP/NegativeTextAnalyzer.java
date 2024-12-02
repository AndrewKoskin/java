package Module3.Enums.Homework3OOP;

import java.util.Arrays;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] negativeText = {":(", "=(", ":|"};
    Label label = Label.NEGATIVE;

    @Override
    public Label processText(String text) {
        int index = Integer.MAX_VALUE;
        boolean[] contains = new boolean[3];
        for (int i = 0; i < negativeText.length; i++){
            contains[i] = text.contains(negativeText[i]);
        }
        for (int i = 0; i < contains.length; i++){
            if (contains[i]){
                int negativeIndex = text.indexOf(negativeText[i]);
                if (index > negativeIndex){
                    index = negativeIndex;
                }
            }
        }
        return (index == Integer.MAX_VALUE) ? Label.OK : label;
    }

    @Override
    String[] getKeywords() {
        return negativeText;
    }

    @Override
    Label getLabel() {
        return this.label;
    }
}
