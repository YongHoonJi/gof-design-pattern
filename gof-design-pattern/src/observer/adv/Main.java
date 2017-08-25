package observer.adv;


public class Main {
	public static void main(String[] args) {
		News news = new News();
		InternetObserver io = new InternetObserver(news);
		PaperObserver paper = new PaperObserver(news);
		TvObserver tv = new TvObserver(news);
		news.makeHeadLine("Five tourist are killed by terror in Barcelona.");
	}
}
