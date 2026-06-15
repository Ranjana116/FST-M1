package Activities;


abstract class Books {
	String title;
	abstract void setTitle(String title);

	String getTitle() {
		return title;
	}
}

class Book1 extends Books {
	
	public void setTitle(String title) {
		this.title = title;
	}
}