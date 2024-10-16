package com.ilan.h2.controller.owner;

import com.ilan.h2.entity.Owner;
import com.ilan.h2.service.OwnerRepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OwnerController {

    private final OwnerRepositoryService ownerRepository;

    @GetMapping(value = "/findOwnerByName/{name}")
    public List<Owner> findOwnerByName(@PathVariable("name") String name) {
        return ownerRepository.findOwnerByName(name);
    }
}
