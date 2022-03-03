package com.example.dodo.service.serviceImp;

import com.example.dodo.models.Ar;
import com.example.dodo.repository.ArRepository;
import com.example.dodo.service.ArService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArServiceImp implements ArService {

    @Autowired
    private ArRepository arRepository;

    @Override
    public List<Ar> save() {
        int[] mas = new int[5];
        mas[0] = 0;
        mas[1] = 1;
        mas[2] = 2;
        mas[3] = 3;
        mas[4] = 4;
        Arrays.sort(mas);
        return arRepository.saveAll(prepare(mas));
    }

    public List<Ar> prepare(int[] mas) {
       return Arrays.stream(mas).boxed().map(s -> new Ar(s)).collect(Collectors.toList());
    }
}
