package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BitcoinPriceParser {
    public static String getUSDPriceFromText(String resultLine) {
        String regEx = "\"code\":\"USD\".+?\"rate\":\".+?\"";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(resultLine);
        System.out.println("text: " + resultLine);
        System.out.println("regEx: " + regEx);
        String founded;
        if(m.find()) {
            founded = resultLine.substring(m.start(), m.end());
            String usdBitcoinRate = founded.substring(founded.lastIndexOf("rate\":\"") + 7, founded.length() - 1);
            System.out.println("Цена биткоина в долларах: " + usdBitcoinRate);
            return usdBitcoinRate;
        } else {
            return null;
        }
    }
}
