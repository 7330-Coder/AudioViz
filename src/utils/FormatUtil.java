/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.DecimalFormat;

/**
 *
 * @author LSY
 */
public class FormatUtil {
    
    private FormatUtil() {}
    
    public static double formatDouble(double number, int decimalPoints) {
        StringBuilder pattern = new StringBuilder("#");
        if (decimalPoints > 0) {
            pattern.append(".");
            for (int i = 0; i < decimalPoints; i++) {
                pattern.append("0");
            }
        }
        DecimalFormat df = new DecimalFormat(pattern.toString());
        return Double.valueOf(df.format(number));
    }
}
