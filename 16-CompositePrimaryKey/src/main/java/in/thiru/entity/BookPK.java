package in.thiru.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPK {

	private Integer bookId;
	private String bookName;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public BookPK(Integer bookId, String bookName) {

		this.bookId = bookId;
		this.bookName = bookName;
	}

	public BookPK() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookPK [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

}
