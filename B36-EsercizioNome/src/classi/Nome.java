package classi;

public class Nome {
	public Nome(String first, String last, String title) {
		this.first = first;
		this.last = last;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}
	
	public String getIinitials() {
		char firstInitial=first.charAt(0);
		char lastInitial=last.charAt(0);
		
		String initials=String.valueOf(firstInitial) + String.valueOf(lastInitial);
		
		return initials;
	}
	
	public String toString() {
		String stringa=first+"\n"+last+"\n"+title;
		
		return stringa; 
	}

	private String first, last, title;
}
