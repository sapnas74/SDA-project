/*
package sdaakademija.namudarbai.nd19012020.deliveries;

import sdaakademija.namudarbai.nd16112019.Car;
import sdaakademija.namudarbai.nd16112019.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveriesMain {
    public static void main(String[] args) throws IOException {

        List<String> sortedDataList = new ArrayList<>();
        List<Person> personsList = new ArrayList<>();
        List<Distributor> distirbutorList = new ArrayList<>();

        sortedDataList = massiveSorting();

        int clientsVolume = Integer.parseInt(sortedDataList.get(0));
        int companiesVolume = Integer.parseInt(sortedDataList.get(1));

        System.out.println("Klientu skaicius : " + clientsVolume);
        System.out.println("Kompaniju skaicius : " + companiesVolume);
        System.out.println(sortedDataList.size());

        personsList = sortedPerson(sortedDataList, companiesVolume);
        distirbutorList = sortedDistributor(sortedDataList, companiesVolume);


        for (Person person : personsList) {
            System.out.println("Kliento vardas : " + person.getName());
            System.out.println("Kliento adresas : " + person.getDeliveryAddress());
            System.out.println("Kliento pirkinis : " + person.getGadgetType());
            System.out.println("Pristatymo data : " + person.getDeliverUntil());
            System.out.println("=======================================");
        }

        for (Distributor distributor : distirbutorList) {
            System.out.println("Pardavejo vardas :" + distributor.getName());
            System.out.println("Pardavejo adresas :" + distributor.getDeliveredFrom());
            System.out.println("Pristatymo data :" + distributor.getDeliveryDate());
            System.out.println("=======================================");
        }

    }

    private static List<String> massiveSorting() throws IOException {
        List<String> sortedDataList = new ArrayList<>();

        FileInputStream stream = new FileInputStream("C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\namudarbai\\nd19012020\\deliveries\\Deliveries");
        int deliveriesDataLength = stream.available();
        byte[] deliveriesData = new byte[deliveriesDataLength];
        stream.read(deliveriesData);

        String text = new String(deliveriesData);

        String[] deliveriesLines = text.split("\n");

        for (String line : deliveriesLines) {
            line = line.replace("\r", "");
            sortedDataList.add(line);
        }
        return sortedDataList;
    }


    private static List<Person> sortedPerson(List<String> sortedDataList, int companiesVolume) {
        List<Person> personsList = new ArrayList<>();
        for (int i = 2; i < sortedDataList.size() - companiesVolume; i++) {
            personsList.add(mapPersonToObject(sortedDataList.get(i).split(",")));
        }
        return personsList;
    }

    private static List<Distributor> sortedDistributor(List<String> sortedDataList, int companiesVolume) {
        List<Distributor> distirbutorList = new ArrayList<>();
        for (int i = sortedDataList.size() - companiesVolume; i < sortedDataList.size(); i++) {
            distirbutorList.add(mapDistributorToObject(sortedDataList.get(i).split(",")));
        }
        return distirbutorList;
    }
    
    private static List<Gadget> sortedGadget(List<G>) {
        for (int i = sortedGadget.size() - companiesVolume; i < sortedDataList.size(); i++) {
            sortedDataList.add(mapDistributorToObject(sortedDataList.get(i).split(",")));
    }


    private static Person mapPersonToObject(String[] personsData) {
        return new Person(personsData[0], personsData[1], personsData[2], personsData[3]);
    }

    private static Distributor mapDistributorToObject(String[] distributorData) {
        return new Distributor(distributorData[0], distributorData[1], distributorData[2]);
    }

    private static Gadget mapGadgetToObject(List<String> sortedDataList, Distributor distributor, int companiesVolume) {

        }
    }
}
*/
