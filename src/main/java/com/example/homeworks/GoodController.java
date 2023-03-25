package com.example.homeworks;

import com.example.homeworks.Dto.GoodDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import java.util.ArrayList;

@RestController
@RequestMapping("/goods")
@Log4j2
public class GoodController {
    private ArrayList<GoodDto> goods = new ArrayList<>();

    /**
     * Вызывает кастомное исключение со статусом 502 (BAD_GATEWAY)
     * */
    @GetMapping("/getBadGateway")
    public ResponseEntity<?> getBadGateway() {
        throw new HttpServerErrorException(HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<?> handleBadGatewayException(Exception e) {
        log.warn(e.getLocalizedMessage());
        return new ResponseEntity<>("Something's gone wrong, but I don't know what.\nCome back later!", HttpStatus.BAD_GATEWAY);
    }

    /**
     * Принимает JSON-объект, добавляет случайный ID (0 - 1000) и возваращает его обратно
     * */
    @PostMapping()
    @ResponseBody
    public GoodDto addGood(@RequestBody GoodDto good) {
        good.getInfoDto().setId(Math.round(Math.random() * 1000));
        goods.add(good);
        return good;
    }
}
