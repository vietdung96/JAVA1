package assignment5;

import java.util.ArrayList;

public class News implements INews {

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        Id = id;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
        RateList = new int[3];
    }

    int Id;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;
    int[] RateList;


    public float getAverageRate() {
        return AverageRate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public void Display() {
        System.out.println(Title);
        System.out.println(PublishDate);
        System.out.println(Author);
        System.out.println(Content);
        System.out.println(AverageRate);
    }

    public News Calculate(){
        int total =0 ;
        for( int i : RateList){

       total+=i;

        }
        AverageRate= total/ RateList.length;
        System.out.println("Số trung bình là :" + AverageRate);
        return null;
    }
}
