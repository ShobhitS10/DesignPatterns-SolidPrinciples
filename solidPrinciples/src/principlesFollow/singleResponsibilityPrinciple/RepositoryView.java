package principlesFollow.singleResponsibilityPrinciple;

public class RepositoryView {
	// also not a good example as we are binding the Resume to Repository View class
	Resume resume;
	
	public RepositoryView(Resume resume) {
		this.resume = resume;
	}
	
	public void searchResume() {
		// logic to search resume goes here
	}
}