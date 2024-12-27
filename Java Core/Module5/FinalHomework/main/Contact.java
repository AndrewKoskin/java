package Module5.FinalHomework.main;

import java.time.LocalDate;

public class Contact {
    private String name;
    private Integer number;
    private LocalDate createdDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
    Contact(String name, int number, LocalDate createdDate){
        this.name = name;
        this.number = number;
        this.createdDate = createdDate;
    }
}
