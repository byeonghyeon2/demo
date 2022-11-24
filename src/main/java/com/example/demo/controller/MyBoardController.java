package com.example.demo.controller;

import com.example.demo.entity.MyBoardEntity;
import com.example.demo.service.MyBoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MyBoardController {

      private MyBoardService myBoardService;

    @GetMapping("/")
    public String boardList(Model model) {
        System.out.println(myBoardService.boardList());
        model.addAttribute("List",myBoardService.boardList());
        return "board/list";
    }

      @GetMapping("/board/write")
      public String boardWrite() {

        return "board/write";
      }

      @PostMapping("/board/writePro")
      public String boardWritePro(MyBoardEntity myBoardEntity) {

            myBoardService.write(myBoardEntity);

            return "redirect:/";
      }

}
