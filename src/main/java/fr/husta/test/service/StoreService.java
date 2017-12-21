package fr.husta.test.service;

import fr.husta.test.dto.TrucDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StoreService {

    List<TrucDto> getListItems();

}
