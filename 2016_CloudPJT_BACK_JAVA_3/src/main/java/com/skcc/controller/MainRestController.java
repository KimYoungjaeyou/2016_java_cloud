package com.skcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.domain.book.Book;
import com.skcc.domain.payment.Payment;
import com.skcc.service.MainService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value="", description="백단 자바 서비스입니다.")
public class MainRestController {
	
	private MainService service;
	
	@Autowired
	public MainRestController(MainService service) {
		this.service = service;
	}
	
	@ApiOperation(value = "예약신청")
	@RequestMapping(path = "/requestbook", method=RequestMethod.POST)
	public void requestBook(@ApiParam(value = "예약 시간을 설정하여 예약을 요청합니다.", required = true) @RequestBody Book book) {
		service.requestBook(book);
	}

	@ApiOperation(value = "예약 상태변경")
	@RequestMapping(path = "/updatebook", method=RequestMethod.PUT)
	public void updateBook(@ApiParam(value = "예약완료 및 예약취소를 할 수 있습니다.", required = true) @RequestBody Book book) {
		service.updateBookStatus(book);
	}
	
	@ApiOperation(value = "결제 요청")
	@RequestMapping(path = "/payment", method=RequestMethod.PUT)
	public void requestPayment(@ApiParam(value = "결제 정보와 함께 결제를 요청합니다.", required = true) @RequestBody Payment payment) {
		service.requestPayment(payment);
	}
	
	@ApiOperation(value = "예약정보 가져오기", response = List.class)
	@GetMapping("/getbookinfo/{user_id}")
	public List<Book> getBookInfo(@ApiParam(value = "회원 ID로 예약 된 정보를 가져옵니다.", required = true) @PathVariable String user_id){
		return service.getBookinfo(user_id);
	}

}
