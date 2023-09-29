public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String toString(){
        String releaseDate=String.format("%d/%d/%d",day, month, year);
        return releaseDate;
    }
    // public Date latest(Date d1,Date d2){
     //   if(d1.getMonth()<d2.getMonth()){
      //      return d2;
     //   }else{
     //       return d1;
      //  }
     }






