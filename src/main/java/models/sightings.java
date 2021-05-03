package models;
import org.sql2o.Connection;

public class sightings {
    private double id;
    private String name;
    private String location;
    private String date;

    private DB db=new DB();
    public Sightings (double id,String name,String location,String date) {
        this.name=name;
        this.location=location;
        this.date=date;

    }
    public String getname(){
        return this.name;
    }
    public double getId(){
        return this.id;
    }
    public String getDate(){
        return this.date;
    }

    public String getLocation(){
        return this.location;
    }

    public boolean save(){
        try {
            db.getCon().createQuery("INSERT INTO sightings(name,location,date) VALUES(:name,:location,:date)")
                    .addParameter("name",name)
                    .addParameter("location",location)
                    .addParameter("date",date)

                    .executeUpdate();
            return true;
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            return false;
        }
    }

}
}
