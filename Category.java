package Books;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

public class Category {

    public String CatName, BookName;
    public int BookId;
    public String deadline, submission;

    public Category(String CatName, String BookName, int BookId, String deadline, String submission) {
        this.CatName = CatName;
        this.BookName = BookName;
        this.BookId = BookId;
        this.deadline = deadline;
        this.submission = submission;
    }

    public LocalDate localdate1(String date) {
        DateTimeFormatter dateformat1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date1 = LocalDate.parse(date, dateformat1);
        return date1;
    }

    public long calc() {
        LocalDate deadline1 = localdate1(deadline);
        LocalDate submission1 = localdate1(submission);
        long daysinBetween, fine;
        daysinBetween = DAYS.between(deadline1, submission1);

        if (daysinBetween < 11) {
            fine = 10;
            return fine;
        } else if (daysinBetween > 10 && daysinBetween < 16) {
            fine = 10 + 2 * (daysinBetween);
            return fine;
        } else if (daysinBetween < 30 && daysinBetween > 15) {
            fine = 10 + 5 * 2 + 5 * (daysinBetween);
            return fine;
        } else {
            fine = 10 + 5 * 2 + 15 * 5 + 100 * (daysinBetween);
            return fine;
        }
    }

    public void printDetails() {
        long fine = calc();
        System.out.println("Category Name: " + CatName);
        System.out.println("Book Name: " + BookName);
        System.out.println("Book Id: " + BookId);
        System.out.println("Deadline: " + deadline);
        System.out.println("Submission: " + submission);
        System.out.println("Fine: " + fine);

    }



//class Category1{

    public static void main(String args[]){

        Category c = new Category("Science","Java for beginners", 2324,"9/10/2018","6/6/2019");
        c.printDetails();

        }
    }


