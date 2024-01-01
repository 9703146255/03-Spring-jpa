package in.thiru.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOK_INFO")
public class Book 
{
	
	private String authorName;
	private Double bookPrice;
	
	@EmbeddedId
	private BookPK bookPK;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public BookPK getBookPK() {
		return bookPK;
	}

	public void setBookPK(BookPK bookPK) {
		this.bookPK = bookPK;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + ", bookPrice=" + bookPrice + ", bookPK=" + bookPK + "]";
	}

	public Book(String authorName, Double bookPrice, BookPK bookPK) {
		
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.bookPK = bookPK;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	

}
