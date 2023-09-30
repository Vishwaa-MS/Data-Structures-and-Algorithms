public class Main {
    public static void main(String[] args) {
        int[] house = new int[] {6,7,1,30,8,2,4};
        HouseRobberDP hr = new HouseRobberDP();
        System.out.println(hr.maxMoneyTopDown(house));
        System.out.println(hr.macMoneyBottomUp(house));
    }
}