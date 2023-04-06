package fr.miage.fsgbd;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Random;

public class DataCreator {
    Faker faker = new Faker();
    ArrayList<Integer> generatedValues = new ArrayList<>();

    public String generateFirstName() {
        return faker.name().firstName();
    }

    public String generateLastName() {
        return faker.name().lastName();
    }

    public String generatePhoneNumber() {
        return faker.phoneNumber().cellPhone();
    }

    public String generateAddress() {
        return faker.address().fullAddress();
    }

    public Integer generateSocialSecurityNumber() {
        Random r = new Random();
        int ssNumber;
        ssNumber = r.nextInt(999999999);

        if (generatedValues.size() > 0) {
            while (generatedValues.contains(ssNumber)) {
                ssNumber = r.nextInt(50000);
            }
        }
        generatedValues.add(ssNumber);
        return ssNumber;
    }
}
