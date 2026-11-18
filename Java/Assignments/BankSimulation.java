// public class OddEvenParallel extends Thread
// {
//     public Thread t1, t2, t3;

//     int oddCount = 0;
//     int evenCount = 0;
//     int fiveCount = 0;

//     public OddEvenParallel()
//     {
//         t1 = new Thread(this);
//         t2 = new Thread(this);
//         t3 = new Thread(this);

//         t1.start();
//         t2.start();
//         t3.start();
//     }

//     public static void main(String[] args)
//     {
//         OddEvenParallel obj = new OddEvenParallel();
//     }

//     public void run()
//     {
//         if(Thread.currentThread() == t1)
//         {
//             try
//             {
//                 displayOdd();
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//         }
//         else if(Thread.currentThread() == t2)
//         {
//             try
//             {
//                 displayEven();
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//         }
//         else if(Thread.currentThread() == t3)
//         {
//             try
//             {
//                 displayFive();
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//         }
//     }

//     public synchronized void displayOdd() throws Exception
//     {
//         for(int i = 1; i <= 100; i += 2)
//         {
//             while(oddCount / 5 > fiveCount)
//                 wait();

//             System.out.println("Odd Thread: " + i);
//             oddCount++;

//             notifyAll();

//             Thread.sleep(200);
//         }
//     }

//     public synchronized void displayEven() throws Exception
//     {
//         for(int i = 2; i <= 100; i += 2)
//         {
//             while(evenCount / 5 > fiveCount)
//                 wait();

//             System.out.println("Even Thread: " + i);
//             evenCount++;

//             notifyAll();

//             Thread.sleep(200);
//         }
//     }

//     public synchronized void displayFive() throws Exception
//     {
//         for(int i = 5; i <= 100; i += 5)
//         {
//             while(oddCount < fiveCount * 5 + 5 ||
//                   evenCount < fiveCount * 5 + 5)
//                 wait();

//             System.out.println("Multiple of 5 Thread: " + i);

//             fiveCount++;

//             notifyAll();

//             Thread.sleep(200);
//         }
//     }
// }


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized deposit method
    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: $" + amount);
        balance += amount;
        System.out.println("Deposit complete. New balance: $" + balance);
        
        // Notify all waiting threads (e.g., threads waiting to withdraw)
        notifyAll();
    }

    // Synchronized withdrawal method
    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw: $" + amount);

        // Use a 'while' loop (not 'if') to guard against spurious wakeups
        while (balance < amount) {
            System.out.println("Insufficient funds for " + Thread.currentThread().getName() + 
                               ". Current balance: $" + balance + ". Waiting for deposit...");
            try {
                // Releases the lock and waits until notifyAll() is called
                wait(); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted during wait.");
                return;
            }
        }

        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal of $" + amount + 
                           ". Remaining balance: $" + balance);
    }

    public synchronized double getBalance() {
        return balance;
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        // Create a shared bank account with an initial balance of $500
        BankAccount sharedAccount = new BankAccount(500.0);

        // Thread 1: Tries to withdraw $800 (will have to wait)
        Thread withdrawThread1 = new Thread(() -> {
            sharedAccount.withdraw(800.0);
        }, "Withdraw-Thread-1");

        // Thread 2: Tries to withdraw $300
        Thread withdrawThread2 = new Thread(() -> {
            sharedAccount.withdraw(300.0);
        }, "Withdraw-Thread-2");

        // Thread 3: Deposits $600 after a short delay
        Thread depositThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate processing time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedAccount.deposit(600.0);
        }, "Deposit-Thread");

        // Start all threads
        withdrawThread1.start();
        withdrawThread2.start();
        depositThread.start();
    }
}