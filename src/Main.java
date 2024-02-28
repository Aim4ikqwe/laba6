import java.util.*;

class Reader {
    private String Name;
    private String Surname;
    private String Otchestvo;
    private int ticketNumber;
    private String facultet;
    private String birthdayDate;
    private String Number;

    Reader(String Name, String Surname, String Otchestvo, int ticketNumber, String facultet, String birthdayDate, String Number){
        this.Name = Name;
        this.Surname = Surname;
        this.Otchestvo = Otchestvo;
        this.ticketNumber = ticketNumber;
        this.facultet = facultet;
        this.birthdayDate = birthdayDate;
        this.Number = Number;
    }

    public void takeBook(int amountTakenBooks){
        System.out.printf("%s %s %s взял(-а) %d книг(-и)\n", Surname, Name,Otchestvo, amountTakenBooks);
    }

    public void takeBook(String ... namesTakenBooks){
        System.out.printf("%s %s %s взял(-а) книги:", Surname, Name, Otchestvo);
        for(String book : namesTakenBooks)
            System.out.printf(" %s.", book);
        System.out.println();
    }

    public void returnBook(int amountReturnedBooks){
        System.out.printf("%s %s %s вернул(-а) %d книг(-и)\n", Surname, Name, Otchestvo, amountReturnedBooks);
    }

    public void returnBook(String... namesReturnedBooks){
        System.out.printf("%s %s %s вернул(-а) книги:", Surname, Name, Otchestvo);
        for(String book : namesReturnedBooks)
            System.out.printf(" %s.", book);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Даниил", "Лапицкий", "Владимирович", 2374, "Программирование", "26/11/1996", "+79998392057");
        Reader reader1 = new Reader("Алексей", "Уханов", "Александрович", 6666, "Математика", "25/08/2006", "+79053677326");
        Reader reader2 = new Reader("Дмитрий", "Ермохин", "Дмитреевич", 2228, "История", "12/11/2005", "+79666890275");
        Reader reader3 = new Reader("Елизавета", "Воронова", "Андреевна", 1234, "Футбол", "12/01/2006", "+79538492251");
        Reader reader4 = new Reader("Елизавета", "Воронова", "Андреевна", 1234, "Футбол", "12/01/2006", "+79538492251");
        Reader[] readers = {reader, reader1, reader2, reader3, reader4};

        readers[0].takeBook(2);
        readers[1].returnBook(5);

        readers[2].takeBook("Как стать богатым?", "Пеле", "Автобиография первого в списке \"Forbes\" Уханова А.А.");
        readers[3].returnBook("Успешных успех", "Пеле", "Обложка");
        readers[4].takeBook("Что то на умном", "Как не забывать где оставил телефон?");
    }
}