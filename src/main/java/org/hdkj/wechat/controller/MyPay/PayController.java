package org.hdkj.wechat.controller.MyPay;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;

import org.hdkj.wechat.bean.MyPay.Pay;
import org.hdkj.wechat.service.MyPay.PayService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payInfo")
public class PayController {
	@Resource
	private PayService payService;
	
	@ApiOperation(value = "查询历史缴费记录", notes = "根据户号查询") 
	@RequestMapping(value="/queryPayRecHistory/{consNo}",method=RequestMethod.GET)
	public List<Pay> getYearPayConsNo(@PathVariable String consNo){
		List<Pay> pay_list=this.payService.getPayConsNo(consNo);
		if(pay_list.size()>0){
			return pay_list;
		}
		return null;
		
	}
}
