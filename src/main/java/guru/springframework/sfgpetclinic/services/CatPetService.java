package guru.springframework.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("CAT")
@Service
public class CatPetService implements PetService {
    @Override
    public String getPetService() {
        return "cat pet service";
    }
}
