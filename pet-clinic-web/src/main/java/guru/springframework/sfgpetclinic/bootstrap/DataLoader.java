package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetSerice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetSerice vetSerice;

    public DataLoader(OwnerService ownerService, VetSerice vetSerice) {
        this.ownerService = ownerService;
        this.vetSerice = vetSerice;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Sudhakar");
        owner1.setLastName("Sreelakshmi");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Sreelakshmi");
        owner2.setLastName("Sudhakar");
        ownerService.save(owner2);

        System.out.println("Owners list loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jessica");
        vet1.setLastName("Adams");
        vetSerice.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Angelina");
        vet2.setLastName("Joulie");
        vetSerice.save(vet2);

        System.out.println("Veterinaries list loaded...");
    }
}
