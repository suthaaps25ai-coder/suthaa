/*public class day7 {
    static class Request {
        private final String name;
        private final String date;
        private final String reason;
        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }
        void approve() {
        }
        void reject() {
        }
        void displayDetails() {
            System.out.println("Name   : " + name);
            System.out.println("Date   : " + date);
            System.out.println("Reason : " + reason);
        }
    }
    static class LeaveRequest extends Request {
        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approve() {
            System.out.println("Leave request approved.");
        }
        void reject() {
            System.out.println("Leave request rejected.");
        }
    }
    static class odRequest extends Request {
        odRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approve() {
            System.out.println("od request approved.");
        }
        void reject() {
            System.out.println("od request rejected.");
        }
    }
    static void main(String[] args) {
        LeaveRequest leaveRequest =
                new LeaveRequest("abii", "1-06-2026", "Medical Leave");
        leaveRequest.displayDetails();
        leaveRequest.approve();
        System.out.println();
        odRequest odRequest =
                new odRequest("suthaa", "12-06-2026", "od");
        odRequest.displayDetails();
        odRequest.reject();
    }
}
  */
public class day7{
    static class payment{
        String amount;
        void transfer(){
            System.out.println("payment is successfull");
        }
    }
    static class Upipayment extends payment{
        @Override
        void transfer() {
            System.out.println("Upi payment done");
        }
    }
    static class Cardpayment extends payment{
        @Override
        void transfer() {
            System.out.println("Card payment done");
        }
    }
    static class Netbanking extends payment{
        @Override
        void transfer() {
            System.out.println("Net banking successfully");
        }
    }
    static void main(){
        Upipayment Upipayment=new Upipayment();
        Upipayment.transfer();

        Cardpayment Cardpayment=new Cardpayment();
        Cardpayment.transfer();

        Netbanking Netbanking=new Netbanking();
        Netbanking.transfer();
    }
}