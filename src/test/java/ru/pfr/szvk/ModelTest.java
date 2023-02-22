package ru.pfr.szvk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
      @BeforeEach
      void setDb(){
          wraperM = new WraperM();

      }
    @Test
    void getConnectDb() {
        try {
            DbHandler dbHandlerinst = wraperM.getModel().getConnectDb();
           dbHandlerinst.toString();
            dbHandlerinst.getConnection();
            dbHandlerinst.setConnection();
           dbHandlerinst.getConnection().toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private WraperM wraperM;
}