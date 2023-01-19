package org.example.main;

import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;

public class CsvTest {

    public static void afficher(String message) {
        System.out.println("this " + message);
    }

    public static void main(String[] args) throws CsvException, FileNotFoundException {
        String fileName = "e:\\test\\csv\\country.csv";
//        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
//        try (CSVReader reader = new CSVReaderBuilder(new FileReader(fileName))
//                .withCSVParser(csvParser)
//                .withSkipLines(1).build()) {
//            List<String[]> r = reader.readAll();
//            r.forEach(x -> System.out.println(Arrays.toString(x)));
//            for (String[] arr : r) {
//                for (String ar : arr) {
//                    System.out.print(ar + " -- ");
//                }
//                System.out.println();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<Country> beans = new CsvToBeanBuilder(new FileReader(fileName))
//                .withType(Country.class)
//                .build().parse();
//        beans.stream().forEach(System.out::println);
    }

}
