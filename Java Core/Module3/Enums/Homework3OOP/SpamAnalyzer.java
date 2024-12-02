package Module3.Enums.Homework3OOP;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;

    SpamAnalyzer(String[] strings) {
        this.keywords = strings;
    }
    Label label = Label.SPAM;

    @Override
    public Label processText(String text) {
        int index = Integer.MAX_VALUE;
        boolean[] contains = new boolean[3];
        for (int i = 0; i < keywords.length; i++){
            contains[i] = text.contains(keywords[i]);
        }
        for (int i = 0; i < contains.length; i++){
            if (contains[i]){
                int negativeIndex = text.indexOf(keywords[i]);
                if (index > negativeIndex){
                    index = negativeIndex;
                }
            }
        }
        return (index == Integer.MAX_VALUE) ? Label.OK : label;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return this.label;
    }
}
