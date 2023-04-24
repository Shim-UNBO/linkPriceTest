package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/board")
    public String getBoardList(Model model) throws IOException {
        List<String> boardList = new ArrayList<>();

        // Jsoup을 사용하여 게시판 목록 가져오기
//        Document doc = Jsoup.connect("https://search.shopping.naver.com/allmall").get();
//        Elements boardElements = doc.select("a.mall_filter_item_link");
//
//        for (Element element : boardElements) {
//            String boardName = element.text();
//            boardList.add(boardName);
//        }

        model.addAttribute("boardList", boardList);

        return "board_list";
    }
}
