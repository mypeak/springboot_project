package com.peak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }


    //多线程
    public static void main(String[] args) {

        //
        Task Task1 = new Task();
        Thread thread1 = new Thread(Task1);

        //
        Task Task2 = new Task();
        Thread thread2 = new Thread(Task2);

        //
        Task Task3 = new Task();
        Thread thread3 = new Thread(Task3);

        thread3.start();
        thread2.start();
        thread1.start();

        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("dfefefe");

    }

}
