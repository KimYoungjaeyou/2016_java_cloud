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

@RestController
public class MainRestController {
	
	private MainService service;
	
	@Autowired
	public MainRestController(MainService service) {
		this.service = service;
	}
	
//	@ApiOperation(value = "공연장 대여 예약 요청")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "book_id", value = "에약 고유키", required = false, dataType = "string", paramType = "path", defaultValue = ""),
//    })

	@RequestMapping(path = "/requestbook", method=RequestMethod.POST)
	public void requestBook(@RequestBody Book book) {
		service.requestBook(book);
	}
	
	@RequestMapping(path = "/updatebook", method=RequestMethod.PUT)
	public void updateBook(@RequestBody Book book) {
		service.updateBookStatus(book);
	}
	
	@RequestMapping(path = "/payment", method=RequestMethod.PUT)
	public void UpdateBookStatus(@RequestBody Payment payment) {
		service.requestPayment(payment);
	}
	
	@GetMapping("/getbookinfo/{user_id}")
	public List<Book> getBookInfo(@PathVariable String user_id){
		return service.getBookinfo(user_id);
	}

}
