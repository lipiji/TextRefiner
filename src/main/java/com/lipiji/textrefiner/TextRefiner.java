package com.lipiji.textrefiner;

import org.apache.commons.lang3.StringUtils;

public class TextRefiner {
    private static final String PUNCTUATION = "[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]";

    public static String filterPunctuation(String text) {
        if (StringUtils.isBlank(text)) {
            return "";
        } else {
            return text.replaceAll(PUNCTUATION, "");
        }
    }
}
