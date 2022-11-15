package ru.pfr.szvk;

import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.pfr.szvk.readwritefiles.ReadDerectory;
import ru.pfr.szvk.readwritefiles.StaxStreamProcessor;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StaxStreamProcessorTest {

//    @Before
//    public static void  getStax(){
////        System.out.println("hhhh");
////        StaxStreamProcessor staxStreamProcessor = new StaxStreamProcessor();
//    }

    @Test
    public void readXml() throws IOException, XMLStreamException {

        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        String pathD = "".join("",new File("").getAbsolutePath(),"/mail/inSZVK") ;

        ReadDerectory rf= ReadDerectory.getInstance();

        StaxStreamProcessor staxStreamProcessor = new StaxStreamProcessor();



        List<Employee> employees = new ArrayList<Employee>();


        for (StringBuffer file:rf.getListFiles(pathD,"xml","XML")) {
            staxStreamProcessor.readXml(file.toString());
//            System.out.println(staxStreamProcessor.getAllEmployee());
            for (Employee employee:staxStreamProcessor.getAllEmployee()) {
                System.out.println(employee);
//                Employee employeedb =dbHandler.findHumen(employee.getSnils().toString());
//                employee.setCountry(employeedb.getCountry());
//                employee.setArea(employeedb.getArea());
//                employee.setRegion(employeedb.getRegion());
//                employee.setCity(employeedb.getCity());
//                employees.add(employee);
//                log.info(String.join(" ", "В employees добавлена запись"));
                 }
            }
//        StaxStreamProcessor staxStreamProcessor = new StaxStreamProcessor();
//        staxStreamProcessor.readXml("D:\\IdeaProject\\szvk\\mail\\inSZVK\\PFR-700-Y-2020-ORG-092-001-017951-DCK-00003-DPT-000000-DCK-00000.XML");
//        System.out.println(staxStreamProcessor.getAllEmployee());
//       assertNotEquals(staxStreamProcessor.getAllEmployee(), new ArrayList<>());
    }

//    @Test
//    public void getAllEmployee() {
//    }

    @Test
    public void read_policyholder(){
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        String pathD = "".join("",new File("").getAbsolutePath(),"/mail/inSZVK") ;
//        System.out.println(pathD);
        ReadDerectory rf= ReadDerectory.getInstance();

        StaxStreamProcessor staxStreamProcessor = new StaxStreamProcessor();



        List<Employee> employees = new ArrayList<Employee>();
        Snils snils;
        Policyholder policyholder ;
        String itog,shapka;
        Policyholders policyholders = new Policyholders();
        try (PrintWriter writer = new PrintWriter(new File("rabotodat_snils.csv"))){
            shapka = String.join(";","RegNum","Name","snils","Surname","Im","Ot\n");
            writer.write(shapka.toString());
//            writer.close();
            System.out.println("done!");
            System.out.println(shapka);



        for (StringBuffer file:rf.getListFiles(pathD,"xml","XML")) {
            try {
                System.out.println(file.toString());
                staxStreamProcessor.readXml(file.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XMLStreamException e) {
                e.printStackTrace();
                System.out.println(file.toString());
            }
            policyholder = new Policyholder();
            policyholder.setRegNum(staxStreamProcessor.getPolicyholder().get("regnumber").toString());
            policyholder.setInn(staxStreamProcessor.getPolicyholder().get("inn").toString());
            try {
                policyholder.setKpp(staxStreamProcessor.getPolicyholder().get("kpp").toString());
            }catch (NullPointerException e){
//                e.printStackTrace();
//                System.out.println(" kpp  NullPointerException");
                policyholder.setKpp("-");
            }

            try {
                policyholder.setName(staxStreamProcessor.getPolicyholder().get("namepolicyholdershort").toString());
            }catch (NullPointerException e){
                policyholder.setName("-");
            }
            policyholder.setFileName(staxStreamProcessor.getPolicyholder().get("namefile").toString());
//            policyholders.addPolicyholder(policyholder);
//            System.out.println(policyholder);

            for (Employee employee:staxStreamProcessor.getAllEmployee()) {
                snils = new Snils();
                snils.setSnils(employee.getSnils().toString());
                snils.setSurname(employee.getSurname().toString());
                snils.setIm(employee.getName().toString());
                snils.setOt(employee.getPatronymic().toString());

//                System.out.println(snils);

                itog = String.join(";",policyholder.getRegNum(),policyholder.getName(),snils.getSnils(),snils.getSurname(),snils.getIm(),snils.getOt(),"\n");
                writer.append(itog.toString());
//                        write(shapka.toString());


                System.out.println(itog);
                snils =null;

//                log.info(String.join(" ", "В employees добавлена запись"));
            }
            policyholder = null;

        }
            writer.close();
            System.out.println("done!");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

}