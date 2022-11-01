package ru.pfr.szvk;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import ru.pfr.szvk.controllers.ProcessingController;
import ru.pfr.szvk.readwritefiles.xlsmodel.StreamExcel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class WraperM {
   private Model model = new Model();

   public WraperM(){
       PropertyConfigurator.configure("src\\main\\resources\\log4j.properties");
   }
    public Model getModel() {

        return this.model;

    }

    public View setView(List<Employee> employees, StreamExcel xlsWriter) throws IOException {
        return new View(employees,xlsWriter);
    }

    private static final Logger log = Logger.getLogger(WraperM.class);


}
