package Module3.Enums.Homework3OOP;

public class CommentValidatorRunner {

    public String checkLabels(TextAnalyzer[] analyzers, String text) {
        Label[] result = new Label[analyzers.length];
        StringBuilder finalstring = new StringBuilder();
        for (int i = 0; i < analyzers.length; i++) {
            result[i] = analyzers[i].processText(text);
        }
        for (Label label : result) {
            finalstring.append(" ").append(label.toString());
        }
        return finalstring.toString();
    }


    public static void main(String[] args) {
        String[] spamKeywords = {"spam", "bad"};
        int commentMaxLength = 40;
        TextAnalyzer[] textAnalyzers = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spamKeywords),
                new TooLongTextAnalyzer(commentMaxLength)
        };
        // тестовые комментарии
        String[] tests = new String[8];
        tests[0] = "This comment is so good.";                            // OK
        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
        tests[4] = "This comment is so bad....";                          // SPAM
        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
        CommentValidatorRunner commentValidatorRunner = new CommentValidatorRunner();
        for (String test : tests) {
            System.out.println(commentValidatorRunner.checkLabels(textAnalyzers, test));
        }
    }
}