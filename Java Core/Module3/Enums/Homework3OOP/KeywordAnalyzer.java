package Module3.Enums.Homework3OOP;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    abstract String[] getKeywords();
    abstract Label getLabel();

    public abstract Label processText(String text);
}
