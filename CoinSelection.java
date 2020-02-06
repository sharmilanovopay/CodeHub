package TrainingModule;

public class CoinSelection {
    private static int amount=0;
    private static int count=0;

    public CoinSelection(int amount){
        this.amount=amount;
    }

    public static void main(String[] args) {
        CoinSelection coins = new CoinSelection(88);
        coins.Coins(new int[]{1,2,5,10,20,50,100});
        System.out.println("Coins req = "+count);
    }

    public static int Coins(int[] arr) {
       while(amount>0){
            for (int i = arr.length-1; i >=0; i--) {
                if (arr[i] <= amount) {
                    amount -= arr[i];
                    System.out.println("use one Rs." + arr[i] + " coin" + " ; remaining amount = "+amount );
                    count++;
                    break;
                }
            }
        }
       return count;
    }
}
