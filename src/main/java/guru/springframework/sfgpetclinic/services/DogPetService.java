package guru.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"DOG", "default"})  //For setting this profile as default profile
@Service
public class DogPetService implements PetService {
    @Override
    public String getPetService() {
        return "Dog pet service";
    }
}
