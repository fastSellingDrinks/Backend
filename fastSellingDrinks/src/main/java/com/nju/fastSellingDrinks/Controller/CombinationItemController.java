package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.CombinationItem;
import com.nju.fastSellingDrinks.service.CombinationItemService;
import com.nju.fastSellingDrinks.service.CombinationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/combinationItem")
public class CombinationItemController {

    @Resource
    private CombinationItemService combinationItemService;

    @RequestMapping("list/{combinationId}")
    public List<CombinationItem> list(@PathVariable Integer combinationId){
        return combinationItemService.selectAllCombinationItem(combinationId);
    }
}
