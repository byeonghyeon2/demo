package com.example.demo.service;


import com.example.demo.entity.MyBoardEntity;
import com.example.demo.repository.MyBoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MyBoardService {

    private MyBoardRepository myBoardRepository;

    public void write(MyBoardEntity myBoardEntity) {
        myBoardRepository.save(myBoardEntity);
    }

    public List<MyBoardEntity> boardList() {
        return myBoardRepository.findAll();
    }

}
