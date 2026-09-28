public class Marks {
    public int Eng;
    public int Urdu;
    public int Cs;

    public Marks(){}

    public Marks(int Eng,int Urdu,int Cs){
        this.Eng=Eng;
        this.Urdu=Urdu;
        this.Cs=Cs;
    }

    public int Sum(){
        return Eng+Urdu+Cs;
    }
}