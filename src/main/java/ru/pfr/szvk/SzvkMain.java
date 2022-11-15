package ru.pfr.szvk;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.pfr.szvk.storage.FileStorage;


import javax.annotation.Resource;
/*


 */



@SpringBootApplication
@EnableScheduling
public class SzvkMain {
    @Resource
    FileStorage fileStorage;

    public static void main(String[] args) {
        SpringApplication.run(SzvkMain.class, args);
    }


    public void run(String... args) throws Exception {

        fileStorage.deleteAll();
        fileStorage.init();
    }
}
