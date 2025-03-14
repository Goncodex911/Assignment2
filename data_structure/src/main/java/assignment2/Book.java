package assignment2;
public class Book {
    private String bcode;
    private String title;
    private int quantity;
    private int lended;
    private double price;

    public Book(String bcode, String title, int quantity, int lended, double price) {
        this.bcode = bcode;
        this.title = title;
        this.quantity = quantity;
        this.lended = lended;
        this.price = price;
    }
    public String getBcode() {
         return bcode; 
        }
    public void setBcode(String bcode) { 
        this.bcode = bcode;
    }

    public String getTitle() {
        return title; 
    }
    public void setTitle(String title) { 
        this.title = title; 
    }

    public int getQuantity() { 
        return quantity; 
    }
    public void setQuantity(int quantity) { 
        this.quantity = quantity; 
    }

    public int getLended() { 
        return lended; 
    }
    public void setLended(int lended) { 
        if (lended <= quantity) {
            this.lended = lended; 
        } else {
            System.out.println("Error: Lended cannot exceed quantity.");
        }
    }

    public double getPrice() { 
        return price; 
    }
    public void setPrice(double price) { 
        this.price = price; 
    }

    @Override
    public String toString() {
        return "Book{" +
                "bcode='" + bcode + '\'' +
                ", title='" + title + '\'' +
                ", quantity=" + quantity +
                ", lended=" + lended +
                ", price=" + price +
                '}';
    }
}
