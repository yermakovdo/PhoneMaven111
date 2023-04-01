package project.Phone.Maven;

import java.util.Scanner;

public class PhoneMain {
    public class Main{
        public void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            String model = scanner.nextLine();
            double weight = scanner.nextDouble();
            Phone phone = new Phone(number, model, weight);
            String callerName = scanner.next();
            phone.receiveCall(callerName);
        }
    }
}
