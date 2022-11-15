package ru.pfr.szvk.scheduler;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.pfr.szvk.DbHandler;
import ru.pfr.szvk.WraperM;


import java.io.File;

@Component
public class DbReconnectScheduler {
    @Scheduled(cron = "0 0 5 * * MON",zone = "Europe/Moscow")
//    @Scheduled(fixedRate = 100)
    public void trackOverduePayments() {
        PropertyConfigurator.configure(String.join("",new File("").getAbsolutePath(),String.join(File.separator,File.separator,"src","main","resources","log4j.properties")));

        this.dbHandler = this.wraperM.getModel().getConnectDb();

        log.info("Начат процесс переподключение к  Базе");
        if (this.dbHandler.getConnection() == null) {
            this.dbHandler.setConnection();
            log.info("Переподключение к  Базе выполнено, т.к. ранее было разорвано соединение с Базой.");
        }else{
            log.info("Переподключение к  Базе не потребовалось т.к. соединение с базой установлено ранее и не разрывалось");
        }

        log.info("Процесс переподключения к БД завершон");

        log.info("Scheduled task running");
    }
    private WraperM wraperM = new WraperM();;
    private DbHandler dbHandler;
    private static final Logger log = Logger.getLogger(DbReconnectScheduler.class);
}