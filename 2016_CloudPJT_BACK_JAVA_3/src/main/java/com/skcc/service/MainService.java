package com.skcc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.domain.book.Book;
import com.skcc.domain.concert.Concert;
import com.skcc.domain.payment.Payment;
import com.skcc.domain.user.User;
import com.skcc.repository.BookRepository;
import com.skcc.repository.ConcertRepository;
import com.skcc.repository.PaymentRepository;
import com.skcc.repository.UserRepository;

@Service
public class MainService {
	
	private final PaymentRepository paymentRepository;
	
	private final ConcertRepository concertRepository;
	
	private final UserRepository userRepository;
	
	private final BookRepository bookRepository;

	@Autowired
	public MainService(PaymentRepository paymentRepository,ConcertRepository concertRepository,UserRepository userRepository,BookRepository bookRepository) {
		this.paymentRepository = paymentRepository;
		this.concertRepository = concertRepository;
		this.userRepository = userRepository;
		this.bookRepository = bookRepository;
	}
	
	public List<Book> getBookinfo(String user_id) {

		
//		List<Book> books = bookRepository.findAll();
//		List<Book> rtbooks = new ArrayList<Book>();
//		for(Book book : books){
//			if(book.getUser_id()==user_id) {
//				
//				rtbooks.add(book);
//			}
//			
//		}
		return bookRepository.findByUserId(user_id);
		
	}
	
	public void requestBook(Book book) {
		bookRepository.save(book);
	}
	

	public void updateBookStatus(Book book) {
		Book updateBook = bookRepository.findOne(book.getBook_id());
		updateBook.setBook_status(book.getBook_status());
		bookRepository.save(updateBook);
		
	}
		
	public void requestPayment(Payment payment) {
		//Front에서 만들어 진 Payment정보로 book_id조회
		int book_id = payment.getBook_id();
		
		//Book_idㄹ 예약정보 조회
		Book book = bookRepository.getOne(book_id);
		
		//Book_id로 concert_id찾아서
		int concert_id = book.getConcert_id();
		
		//Concert_id로 Conert의 가격정보를 가져 온다.
		Concert concert = concertRepository.getOne(concert_id);
		int price = concert.getPrice();
		
				
		//조회해온 예약정보로  결재금액 셋팅
		Date start_dt = book.getBook_start_time();
		Date from_dt = book.getBook_end_time();
		int payment_amount = (int) (from_dt.getTime() - start_dt.getTime()) * price;
		payment.setPayment_amount(payment_amount);
		
		//결제완료
		paymentRepository.save(payment);
		
	}

}
