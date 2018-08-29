package com.pk.dynamic.datasource;

import java.util.Random;

/**
 * @author Created by pangkunkun on 2018/8/28.
 * 定义获取datasource的LB方法
 * */
public class DBLoadBalance {

    /**
     * 随机获取db
     * */
    public static String getDBWithRandom(String dbs){
        String[] slaves = dbs.split(",");
        int num = new Random().nextInt(slaves.length);
        return slaves[num];
    }

}
