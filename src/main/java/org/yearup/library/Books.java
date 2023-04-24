package org.yearup.library;

public class Books {

   public void checkOut(String personName){
       this.checkedOut = true;
       this.personName = personName;

   }

    public void checkIn(String personName){
        this.checkedOut = false;
        this.personName = null;

    }

    public Books(String isbn, String title, boolean checkedOut, String checkedOutTo) {
        this.isbn = isbn;
        this.title = title;
        this.checkedOut = checkedOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }



    public int getId() {
        return id;
    }
    private int id;
    private final String isbn;
    private final String title;
    private boolean checkedOut;

    private String checkedOutTo;

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    private String personName;

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "productID='" + isbn + '\'' +
                ", description='" + title + '\'' +
                ", inStock=" + checkedOut +
                '}';
    }
}
