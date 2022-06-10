package deginePattern.FacadePattern;

public class Facade {

    private String Beverage_Name = "";
    private String Movie_Name = "";

    public Facade(String beverage_Name, String movie_Name) {
        Beverage_Name = beverage_Name;
        Movie_Name = movie_Name;
    }

    public void view_Movie() {
        Beverage beverage = new Beverage(Beverage_Name);
        Remote_Control remote = new Remote_Control();
        Movie movie = new Movie(Movie_Name);

        beverage.Prepare();
        remote.Turn_On();
        movie.Search_Movie();
        movie.Charge_Movie();
        movie.play_Movie();
    }
}
