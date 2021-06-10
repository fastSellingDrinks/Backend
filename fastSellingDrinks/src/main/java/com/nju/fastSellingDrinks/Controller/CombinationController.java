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
    public String add(@RequestBody Combination combination){
        combinationService.add(combination);
        return "success";
    }

    @RequestMapping("del/{id}")
    public String del(@PathVariable Integer id){
        combinationService.del(id);
        return "success";
    }

    @RequestMapping("update")
    public String update(@RequestBody Combination combination){
        combinationService.update(combination);
        return "success";
    }

    @RequestMapping("selectAll/{currPage}")
    public PageInfo<Combination> selectAll(@PathVariable Integer currPage){
        return combinationService.selConnAll(currPage);
    }

    @RequestMapping("search/{id}")
    public Combination search(@PathVariable Integer id){
        return combinationService.search(id);
    }

    @RequestMapping("rankByGrade")
    public List<Combination> rankByGrade(){
        return combinationService.combinationRank();
    }

    @RequestMapping("rankByDiscount")
    public List<Combination> rankByDiscount(){
        return combinationService.combinationRankByDiscount();
    }

    @RequestMapping("rankBySaleQuantity")
    public List<Combination> rankBySaleQuantity(){
        return combinationService.combinationRankBySaleQuantity();
    }

    @RequestMapping("mayBeLike/{customerId}")
    public List<Combination> mayBeLike(@PathVariable Integer customerId){
        return combinationService.mayBeLike(customerId);
    }

    @RequestMapping("select/{currPage}")
    public PageInfo<Combination> select(@PathVariable Integer currPage, @RequestBody Combination combination){
        return combinationService.list(currPage,combination);
    }

}
