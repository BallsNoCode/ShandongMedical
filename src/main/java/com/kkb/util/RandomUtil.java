package com.kkb.util;

import java.util.Random;

/**
 * @author APPDE
 */
public class RandomUtil {
    private Random random = new Random();
    public Integer RandomNum(){
        return random.nextInt(9000)+1000;
    }

}
