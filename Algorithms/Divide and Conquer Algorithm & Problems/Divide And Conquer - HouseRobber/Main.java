public class Main {
    public static void main(String[] args) {
        int[] houseArray = new int[]{6, 7, 1, 30, 8, 2, 4};
        HouseRobber hb = new HouseRobber();
        System.out.print("The Max Amount Stolen : ");
        System.out.println(hb.houseRobber(houseArray));
    }
}