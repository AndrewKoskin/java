package Module3.Enums.Homework3OOP;

public class TooLongTextAnalyzer extends KeywordAnalyzer{
    private final int maxLength;
    Label label = Label.TOO_LONG;

    TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return (text.length() > maxLength) ? label : Label.OK;
    }

    @Override
    String[] getKeywords() {
        String[] result = new String[1];
        result[0] = "There is no keywords. Only metric is maxLength. It is: " + maxLength;
        return result;
    }

    @Override
    Label getLabel() {
        return this.label;
    }
}
