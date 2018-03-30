import java.util.Date;

public class Account {
    //để lưu id cho mỗi account
    private static int id = 0;
    //để lưu số dư tài khoản
    private static double balance = 0;
    //để lưu tỉ lệ lãi xuất hiện tại
    private double annualInterestRate = 0;
    //để lưu ngày tạo tài khoản
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    //trả về tỉ lệ lãi xuất gửi theo tháng
    public double getMonthlyInterestRate() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        return monthlyInterestRate;
    }

    //trả về lãi xuất hàng tháng theo công thức
    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    //để rút một khoản tiền từ tài khoản
    public static double withDraw(double withdrawalMoney) {
        return balance -= withdrawalMoney;
    }

    //để gửi vào tài khoản một số tiền
    public static double depositMoney(double deposits) {
        return balance += deposits;
    }
}
