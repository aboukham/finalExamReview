package FinalExam.finalExamReview;

public class Account {
        private static final double MIN_START_BAL = 20;
        private double balance;
        public void setStartBalance(double b) throws Exception {
            if (b < MIN_START_BAL) {
                //System.out.println("Starting balance is too low");
                throw new Exception("Starting balance is too low");
            } else {
                balance = b;
                System.out.println("The balance is modified");
            }
        }
    }
    class Test {
        public static void main(String[] args) {
            Account t = new Account();
            try {
                t.setStartBalance(30);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Finally");
            }
        }
}
