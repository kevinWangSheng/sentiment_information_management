package cn.kevinwang.common;

/**
 * @author wang
 * @create 2024-02-14-12:11
 */
public class Constance {
    public static class ResponseCode{
        public static final Integer SUCCESS = 200;
        public static final Integer FAIL = 500;

    }

    public static class TitleAnalyize{
        public static final Integer batchSize = 10;
    }

    public static class CommentAnalyize{
        public static final String COMMENT_ANALYIZE__WORD_KEY = "comment_analyize_word_key";
        public static final String BAIDU_URL="https://aip.baidubce.com/rest/2.0/solution/v1/text_censor/v2/user_defined";

        public static final String Access_Token_Key = "baidu_access_token";
    }
}
