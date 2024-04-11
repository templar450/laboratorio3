package GUI;

import Logic.Client;
import Logic.CurrentAccount;
import Logic.Log;
import Logic.Log;
import Logic.SavingAccount;
import Logic.SavingAccount;

public class LogTesting {

    public LogTesting() {
    }

    public void test() {
        Client clients[] = new Client[10];
        Client client1 = new Client("7-0280-0839", "Neythan", "88501700", "Limon, Veracruz");
        Client client2 = new Client("3-0557-0126", "Diana", "89081309", "Limon, Pueblo Nuevo");

        Client client3 = new Client("7-0280-0346", "José", "88501700", "Limon, Rio Banano");
        Client client4 = new Client("5-0877-0126", "Carlos", "89081309", "Limon, Cieneguita");
        clients[0] = client1;
        clients[1] = client2;

        clients[2] = client3;
        clients[3] = client4;

        SavingAccount account1 = new SavingAccount("2024-03-15", 12, 15,
                "104560", 25000, client1);

        SavingAccount account2 = new SavingAccount("2024-03-15", 5, 12,
                "104561", 15000, client2);
        
        CurrentAccount account3 = new CurrentAccount("2023-01-12", 8, 5,
                "123456", 57654, client3);
        
        CurrentAccount account4 = new CurrentAccount("2023-05-12", 13, 9,
                "154576", 646464, client4);

        Log log[] = new Log[5];
        log[0] = new Log(1, "Saving Amount", account1, 7000);

        log[1] = new Log(2, "Saving Amount", account2, 5000);
        log[2] = new Log(3, "Current Amount", account3, 5000);
        log[3] = new Log(4, "Current Amount", account4, 5000);
        account1.deposit(500);
        log[4] = new Log(5, "Deposit Amount", account1, 0);

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        LogTesting lt = new LogTesting();
        lt.test();
    }
}
