package com.streams.practicea.examples;

public class Book {

	private String author;
	private String title;
	private int pages;
	private Type type;
	private int price;
	
	public Book(String title, String author, int pages, Type type) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		this.type = type;
	}
	
	public Book(String title, String author, int pages, Type type, int price) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		this.type = type;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", pages=" + pages + ", type=" + type + ", price="
				+ price + "]";
	}
	
	// the old way to implement CompareTo method to compare // object by multiple fields, you'll learn new way as well 
	public int compareTo(Book b) { 
		int i = this.title.compareTo(b.title); 
		if (i != 0) 
			return i; 
		
		i = this.author.compareTo(b.author); 
		if (i != 0) return i;
		
		return Integer.compare(this.price, b.price); }

}
