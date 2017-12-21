package fr.husta.test.service;

import fr.husta.test.dto.TrucDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl
        implements StoreService {

    private static List<TrucDto> trucDtos;

    static {
        trucDtos = new ArrayList<>();
        trucDtos.add(new TrucDto(1, "Toto", "toto@cie.org"));
        trucDtos.add(new TrucDto(2, "Tutu"));
        trucDtos.add(new TrucDto(3, "Tata"));
        trucDtos.add(new TrucDto(4, "Bob", "bob@cie.org"));
        trucDtos.add(new TrucDto(5, "Yolande"));
    }

    @Override
    public List<TrucDto> getListItems() {
        return trucDtos;
    }

}
