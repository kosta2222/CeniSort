
import java.util.Comparator;
import java.util.Date;

class Ceni{
public int id;
public String tovar;
public double cena;
public Date date;

    public Ceni(int id, String tovar, double cena, Date date) {
        this.id = id;
        this.tovar = tovar;
        this.cena = cena;
        this.date = date;
    }

    public String getTovar() {
        return tovar;
    }
    

}

class MyComp implements Comparator<Ceni>{
@Override
public int compare(Ceni c1,Ceni c2){
String s1=c1.getTovar();
String s2=c2.getTovar();
char ch1=s1.charAt(0);
char ch2=s2.charAt(0);
if((int)ch1>(int)ch2) return 1;
return -1;
}
}



