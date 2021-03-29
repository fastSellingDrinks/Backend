package com.nju.fastSellingDrinks.Controller;

import com.nju.fastSellingDrinks.model.Combination;
import com.nju.fastSellingDrinks.service.CombinationService;
import com.nju.fastSellingDrinks.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/combination")
public class CombinationController {

    @Resource
    private CombinationService combinationService;

    @RequestMapping("add")
    public ResultVO add(@RequestBody Combination combination){
        int id=combinationService.add(combination);
        ResultVO resultVO=new ResultVO(200);
        resultVO.setObject(id);
        return resultVO;
    }
}
