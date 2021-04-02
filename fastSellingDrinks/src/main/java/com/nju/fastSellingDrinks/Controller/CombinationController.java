package com.nju.fastSellingDrinks.Controller;

import com.github.pagehelper.PageInfo;
import com.nju.fastSellingDrinks.model.Combination;
import com.nju.fastSellingDrinks.service.CombinationService;
import com.nju.fastSellingDrinks.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/*
@Author Julin
 */
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

    @RequestMapping("selectAll/{combinationId}")
    public PageInfo<Combination> selectAll(@PathVariable Integer combinationId){
        return combinationService.selConnAll(combinationId);
    }

    @RequestMapping("search/{id}")
    public Combination search(@PathVariable Integer id){
        return combinationService.search(id);
    }

    @RequestMapping("rank")
    public List<Combination> rank(){

        return combinationService.combinationRank();
    }

}
