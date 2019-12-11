package entity;
import javax.persistence.*;

@Entity
@Table(name = "bank-account")
public class Bank_Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private String name;
    private int money;

    public Bank_Account(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Bank_Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
