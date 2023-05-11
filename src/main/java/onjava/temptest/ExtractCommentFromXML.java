package temptest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCommentFromXML {
    public static void main(String[] args) {
        String html = "<html><body><h1>Hello World!</h1><s3 comment>Tsuyoshi.</s3 comment><h1>This is a paragraph.</h1></body></html>";
        String regex = "<s3 comment\\s*\\b(.*?)\\b\\s*>(.*?)</s3 comment>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        if (matcher.find()) {
            String originComment = matcher.group(0);
            String substring = originComment.substring(12, originComment.length()-13);
            System.out.println(substring);
        } else {
            System.out.println("No match!");
        }
    }
//            System.out.println(matcher.group(0));


    // 输出：
    //<s3 comment>Tsuyoshi.</s3 comment>
    //Tsuyoshi.
}
