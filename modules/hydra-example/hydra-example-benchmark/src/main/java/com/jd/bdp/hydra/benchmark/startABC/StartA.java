package com.jd.bdp.hydra.benchmark.startABC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: xiangkui
 * Date: 13-4-11
 * Time: 下午2:57
 */
public class StartA {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:dubbo-service-A.xml",
        });
        context.start();
        Thread.sleep(999999999);
    }
}
